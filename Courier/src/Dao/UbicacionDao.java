package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import util.conexion;

public class UbicacionDao {

    static conexion cc = new conexion();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    static ResultSet rs;

    public static void listarUbicacion(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Ubicacion.tblUbicacion.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM VW_UBIGEONORMAL";
        } else {
            sql = "SELECT * FROM VW_UBIGEONORMAL WHERE (Ubigeo like'" + busca + "%' or Distrito like'" + busca + "%' or Provincia like'" + busca + "%' or Departamento like'" + busca + "%') "
                    + " order by Ubigeo";
        }

        String datos[] = new String[5];
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString("Ubigeo");
                datos[1] = rs.getString("Distrito");
                datos[2] = rs.getString("Provincia");
                datos[3] = rs.getString("Departamento");
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            //tamaños para la tabla Ubicacion
            int[] anchos = {25, 100, 50, 50, 8};
            for (int i = 0; i < e_comerce.Ubicacion.tblUbicacion.getColumnCount(); i++) {
                e_comerce.Ubicacion.tblUbicacion.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UbicacionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Listar() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Ubicacion.tblUbicacion.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = "SELECT * FROM VW_UBIGEONORMAL";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            String datos[] = new String[5];
            while (rs.next()) {
                datos[0] = rs.getString("Ubigeo");
                datos[1] = rs.getString("Distrito");
                datos[2] = rs.getString("Provincia");
                datos[3] = rs.getString("Departamento");
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            //tamaños para la tabla Ubicacion
            int[] anchos = {25, 100, 50, 50, 8};
            for (int i = 0; i < e_comerce.Ubicacion.tblUbicacion.getColumnCount(); i++) {
                e_comerce.Ubicacion.tblUbicacion.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

}
