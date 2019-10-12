
package Dao;

import Bean.PorcionTerrestreBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import util.conexion;


public class PorcionTerrestreDao {
    
    static conexion cc = new conexion();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    static ResultSet rs;
    
    public static void listarPT(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.PorcionTerrestre.tblPorcionTerrestre.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM porcionterrestre";
        } else {
            sql = "SELECT * FROM porcionterrestre WHERE (Ubigeo like'" + busca + "%' or Descripcion like'" + busca + "%') "
                    + " order by Ubigeo";
        }

        String datos[] = new String[8];
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);             
                datos[7] = rs.getString(8);             

                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
            int[] anchos = {5,10, 100, 5, 5, 10,70,10};
            for (int i = 0; i < e_comerce.PorcionTerrestre.tblPorcionTerrestre.getColumnCount(); i++) {
               e_comerce.PorcionTerrestre.tblPorcionTerrestre.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PorcionTerrestreDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Listar() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.PorcionTerrestre.tblPorcionTerrestre.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = "SELECT * FROM porcionterrestre";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            String datos[] = new String[8];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7); 
                datos[7] = rs.getString(8); 
                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
            int[] anchos = {5,10, 100, 5, 5, 10,70,10};
            for (int i = 0; i < e_comerce.PorcionTerrestre.tblPorcionTerrestre.getColumnCount(); i++) {
                e_comerce.PorcionTerrestre.tblPorcionTerrestre.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    public static void listarMantenimientoPT(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManPorcionTerrestre.tblMantenimientoPT.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM porcionterrestre";
        } else {
            sql = "SELECT * FROM porcionterrestre WHERE (Ubigeo like'" + busca + "%' or Descripcion like'" + busca + "%') "
                    + " order by Ubigeo";
        }

        String datos[] = new String[8];
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);             
                datos[7] = rs.getString(8);             

                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
            int[] anchos = {5,10, 100, 5, 5, 10,70,10};
            for (int i = 0; i < e_comerce.Mantenimiento.ManPorcionTerrestre.tblMantenimientoPT.getColumnCount(); i++) {
                e_comerce.Mantenimiento.ManPorcionTerrestre.tblMantenimientoPT.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PorcionTerrestreDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ListarMantenimientoPT() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManPorcionTerrestre.tblMantenimientoPT.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = "SELECT * FROM porcionterrestre";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            String datos[] = new String[8];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7); 
                datos[7] = rs.getString(8); 
                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
            int[] anchos = {5,10, 100, 5, 5, 10,70,10};
            for (int i = 0; i < e_comerce.Mantenimiento.ManPorcionTerrestre.tblMantenimientoPT.getColumnCount(); i++) {
               e_comerce.Mantenimiento.ManPorcionTerrestre.tblMantenimientoPT.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    public static int registrar_Mant_Ruta(PorcionTerrestreBean  r) {
        int rsu = 0;
        String sql = "{CALL SP_POT_AGREGAR(?,?,?,?,?,?,?)}";
       try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, r.getUbigeo());
            ps.setString(2, r.getDescripcion());
            ps.setString(3, r.getRegionLocal());
            ps.setString(4, r.getPorcenMonto());        
            ps.setDouble(5, r.getImporte());        
            ps.setString(6, r.getObservacion());        
            ps.setDouble(7, r.getMontoComAGT());        
            
            rsu = ps.executeUpdate();           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);        
        return rsu;
    }
    
    public static int ActualizarPT(PorcionTerrestreBean  r) {
        int rsu = 0;
        String sql = "UPDATE porcionTerrestre set Ubigeo=?, Descripcion=?, RegionLocal=?, "
                + "PorcenMonto=?, importe=?, Observacion=?, MontoComAGT=? WHERE CodPorcionT=?";
       try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, r.getUbigeo());
            ps.setString(2, r.getDescripcion());
            ps.setString(3, r.getRegionLocal());
            ps.setString(4, r.getPorcenMonto());        
            ps.setDouble(5, r.getImporte());        
            ps.setString(6, r.getObservacion());        
            ps.setDouble(7, r.getMontoComAGT());        
            ps.setDouble(8, r.getCodPorcionT());        
            
            rsu = ps.executeUpdate();           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);        
        return rsu;
    }
    
     public static int eliminarPT(String id) {
        int rsu = 0;
        String sql = "DELETE FROM PorcionTerrestre WHERE `CodPorcionT`=?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }
        
        
    
}
