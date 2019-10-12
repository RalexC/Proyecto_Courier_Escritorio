package Dao;

import Bean.CentroCostosBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import util.conexion;

public class CentroCostosDao {

    static conexion cc = new conexion();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    static ResultSet rs;

    public static void listarCc(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.CentroCostos.tblCentroCostos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM Centrocostos";
        } else {
            sql = "SELECT * FROM Centrocostos WHERE (Nombre like'" + busca + "%' or Nemonico like'" + busca + "%') "
                    + " order by Nombre";
        }

        String datos[] = new String[5];
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
            int[] anchos = {5,100, 80, 90, 50};
            for (int i = 0; i < e_comerce.CentroCostos.tblCentroCostos.getColumnCount(); i++) {
                e_comerce.CentroCostos.tblCentroCostos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CentroCostosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Listar() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.CentroCostos.tblCentroCostos.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = "SELECT * FROM Centrocostos";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            String datos[] = new String[5];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
            int[] anchos = {5,100, 80, 90, 50};
            for (int i = 0; i < e_comerce.CentroCostos.tblCentroCostos.getColumnCount(); i++) {
                e_comerce.CentroCostos.tblCentroCostos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static int registrarCC_Upd_Ubigeo(CentroCostosBean cc) {
        int rsu = 0;

        String sql = "insert into CentroCostos (Nombre,Ubigeo,RucAgente,Nemonico) VALUES(?,?,?,?)";
        String sql2 = "UPDATE Ubicacion SET Establecimiento = 'S' WHERE Ubigeo = ?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, cc.getNombre());
            ps.setString(2, cc.getUbigeo());
            ps.setString(3, cc.getRucAgente());
            ps.setString(4, cc.getNemonico());

            rsu = ps.executeUpdate();

            PreparedStatement ps2;
            int rsu2 = 0;
            ps2 = cn.prepareStatement(sql2);
            ps2.setString(1, cc.getUbigeo());
            rsu2 = ps2.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        System.out.println(sql2);
        return rsu;
    }
    
//    public static int ActualizarCC(CentroCostosBean cc) {
//        int rsu = 0;
//        String sql0 = "UPDATE CentroCostos SET Nombre=?, Ubigeo=?, RucAgente=?, Nemonico=? WHERE CodCentroCostos=?";
//        String sql1 = "UPDATE Ubicacion SET Establecimiento = 'N' where ubigeo = ?";
//        String sql2 = "UPDATE Ubicacion SET Establecimiento = 'S' WHERE Ubigeo = ?";
//        try {
//            ps = cn.prepareStatement(sql0);
//            ps.setString(1, cc.getNombre());
//            ps.setString(2, cc.getUbigeo());
//            ps.setString(3, cc.getRucAgente());
//            ps.setString(4, cc.getNemonico());
//            ps.setInt(5, cc.getCodCentroCostos());
//
//            rsu = ps.executeUpdate();
//
//            PreparedStatement ps1;
//            int rsu1 = 0;
//            ps1 = cn.prepareStatement(sql1);
//            ps1.setString(1, cc.getUbigeo());
//            rsu1 = ps1.executeUpdate();
//
//            PreparedStatement ps2;
//            int rsu2 = 0;
//            ps2 = cn.prepareStatement(sql2);
//            ps2.setString(1, cc.getUbigeo());
//            rsu2 = ps2.executeUpdate();
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println(sql0);
//        System.out.println(sql1);
//        System.out.println(sql2);
//        return rsu;
//    }

    public static int eliminarCentroCostos(String id) {
        int rsu = 0;
        String sql1 = "UPDATE Ubicacion SET Establecimiento = 'N' where ubigeo = ?";

        String sql = "DELETE FROM CENTROCOSTOS WHERE ubigeo = ?";

        try {

            PreparedStatement ps1;
            int rsu2 = 0;
            ps1 = cn.prepareStatement(sql1);
            ps1.setString(1, id);
            rsu2 = ps1.executeUpdate();

            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        System.out.println(sql1);
        return rsu;
    }

    public static void ListarMantenimiento() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.MantCentroCostos.tblCC.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = "SELECT * FROM Centrocostos";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            String datos[] = new String[5];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
            int[] anchos = {5,100, 80, 90, 50};
            for (int i = 0; i < e_comerce.Mantenimiento.MantCentroCostos.tblCC.getColumnCount(); i++) {
                e_comerce.Mantenimiento.MantCentroCostos.tblCC.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void listarCcMantenimiento(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.MantCentroCostos.tblCC.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM Centrocostos";
        } else {
            sql = "SELECT * FROM Centrocostos WHERE (Nombre like'" + busca + "%' or Nemonico like'" + busca + "%') "
                    + " order by Nombre";
        }

        String datos[] = new String[5];
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
            int[] anchos = {5,100, 80, 90, 50};
            for (int i = 0; i < e_comerce.Mantenimiento.MantCentroCostos.tblCC.getColumnCount(); i++) {
                e_comerce.Mantenimiento.MantCentroCostos.tblCC.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CentroCostosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
