/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.PaquetesBean;
import static e_comerce.Facturas.tblFacturas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import util.GenerarNumeroGuiaPaquete;
import util.GenerarNumeroPaquete;
import util.conexion;

/**
 *
 * @author Ralex
 */
public class PaqueteDao {
    
     static conexion cc = new conexion();
     static Connection cn = cc.conexion();
     static PreparedStatement ps;
     static ResultSet rs;
    
    public static void listarPaquetes(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Paquete.tblPaquetes.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = PaquetesBean.LISTAR;
        } else {
            sql = "SELECT * FROM Paquete WHERE (codpaquete like'" + busca + "%' or codguiapaquete like'" + busca + "%') "
                    + " order by codpaquete";
        }
                             
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("codpaquete");
                datos[1] = rs.getString("codguiapaquete");
                datos[2] = rs.getString("tipopaquete");
                datos[3] = rs.getString("estadopaquete");
                datos[4] = rs.getString("descpaquete");                
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int registrar(PaquetesBean uc) {
        int rsu = 0;
        String sql = PaquetesBean.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);   
            ps.setString(1, uc.getCodpaquete());
            ps.setString(2, uc.getCodguiapaquete());
            ps.setString(3, uc.getTipopaquete());
            ps.setString(4, uc.getEstadopaquete());
            ps.setString(5, uc.getDescpaquete());                       
            rsu = ps.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();}
        System.out.println(sql);
        return rsu;
    }
    
    public static void numerosPaquete() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(codpaquete) FROM Paquete";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }
            if (c == null) {
                e_comerce.CrearPaquete.txtCodPaquete.setText("PQ00001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5;
                j = Integer.parseInt(r);
                GenerarNumeroPaquete gen = new GenerarNumeroPaquete();
                gen.generar(j);
                e_comerce.CrearPaquete.txtCodPaquete.setText("PQ" + gen.serie());

            }
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void numerosGuiapaquete() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(codguiapaquete) FROM Paquete";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                e_comerce.CrearPaquete.txtCodGuia.setText("PQT00001");
            } else {
                char r1 = c.charAt(3);
                char r2 = c.charAt(4);
                char r3 = c.charAt(5);
                char r4 = c.charAt(6);
                char r5 = c.charAt(7);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5;
                j = Integer.parseInt(r);
                GenerarNumeroGuiaPaquete gen = new GenerarNumeroGuiaPaquete();
                gen.generar(j);
                e_comerce.CrearPaquete.txtCodGuia.setText("PQT" + gen.serie());

            }
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public static void ListarPaquete() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Paquete.tblPaquetes.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = PaquetesBean.LISTAR;
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            String datos[] = new String[5];
            while (rs.next()) {
                datos[0] = rs.getString("codpaquete");
                datos[1] = rs.getString("codguiapaquete");
                datos[2] = rs.getString("tipopaquete");
                datos[3] = rs.getString("estadopaquete");
                datos[4] = rs.getString("descpaquete");    
                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
//            int[] anchos = {10, 100, 200, 50, 50};
//            for (int i = 0; i < Ganancia.tablaGanancias.getColumnCount(); i++) {
//                Ganancia.tablaGanancias.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
}
