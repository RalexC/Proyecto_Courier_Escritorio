/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.RutaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import util.conexion;

/**
 *
 * @author Ralex
 */
public class RutaDao {

    static conexion cc = new conexion();
    static Connection cn = cc.conexion();

    public static void listarRutas(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Ruta.tblRutas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM Rutas";
        } else {
            sql = "SELECT * FROM Rutas WHERE (tipoCircuito like'" + busca + "%' or Descripcion like'" + busca + "%') ";
        }

        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            int[] anchos = {10,10,10,10,150};
            for (int i = 0; i < e_comerce.Ruta.tblRutas.getColumnCount(); i++) {
                e_comerce.Ruta.tblRutas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RutaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static PreparedStatement ps;
    static ResultSet rs;

    public static void ListarRutas() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Ruta.tblRutas.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = "SELECT * FROM Rutas";
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
            //tamaños para la tabla Ruta
            int[] anchos = {10,10,10,10,150};
            for (int i = 0; i < e_comerce.Ruta.tblRutas.getColumnCount(); i++) {
                e_comerce.Ruta.tblRutas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    public static void listarMantenimientoRutas(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManRutas.tblMantRutas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM Rutas";
        } else {
            sql = "SELECT * FROM Rutas WHERE (tipoCircuito like'" + busca + "%' or Descripcion like'" + busca + "%') ";
        }

        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            //tamaños para la tabla Ruta
            int[] anchos = {10,10,10,10,150};
            for (int i = 0; i < e_comerce.Mantenimiento.ManRutas.tblMantRutas.getColumnCount(); i++) {
                e_comerce.Mantenimiento.ManRutas.tblMantRutas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RutaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ListarMantenimientoRutas() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManRutas.tblMantRutas.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = "SELECT * FROM Rutas";
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
            //tamaños para la tabla Ruta
            int[] anchos = {10,10,10,10,150};
            for (int i = 0; i < e_comerce.Mantenimiento.ManRutas.tblMantRutas.getColumnCount(); i++) {
                e_comerce.Mantenimiento.ManRutas.tblMantRutas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public static int registrar_Mant_Ruta(RutaBean r) {
        int rsu = 0;
        String sql = "{CALL SP_RUT_AGREGAR(?,?,?,?)}";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, r.getCiudadOrigen());
            ps.setString(2, r.getCiudadDestino());
            ps.setString(3, r.getTipoCircuito());
            ps.setString(4, r.getDescripcion());        
            
            rsu = ps.executeUpdate();                     
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);        
        return rsu;
    }
    
    
     public static int actualizarRuta(RutaBean uc) {
        int rsu = 0;
        String sql = "UPDATE `rutas` SET `CiudadOrigen`=?,`CiudadDestino`=?,"
                + "`TipoCircuito`=?,`Descripcion`=? WHERE `CodRutas`=?";
        try {
            ps = cn.prepareStatement(sql);

            ps.setString(1, uc.getCiudadOrigen());
            ps.setString(2, uc.getCiudadDestino());
            ps.setString(3, uc.getTipoCircuito());
            ps.setString(4, uc.getDescripcion());  
            ps.setInt(5, uc.getRutas());

            rsu = ps.executeUpdate();

        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    //almacena los datos que se escribiran el los formularios
    public static int eliminarRuta(String id) {
        int rsu = 0;
        String sql = "DELETE FROM Rutas WHERE `CodRutas`=?";

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
