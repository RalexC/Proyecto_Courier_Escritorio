/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.FacturaBean;
import static Dao.AgentesDao.ps;
import static Dao.PaqueteDao.ps;
import Util.GenerarNumero;
import static e_comerce.Facturas.tblFacturas;
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
public class FacturaDao {
    
    static conexion cc = new conexion();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    static ResultSet rs;
    
    public static void numeros() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(codfac) FROM Factura";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

//            if (c == null) {
//                e_comerce.Factura.txtFactura.setText("00001");
//            } else {
//                j = Integer.parseInt(c);
//                GenerarNumero gen = new GenerarNumero();
//                gen.generar(j);
//                e_comerce.Factura.txtFactura.setText(gen.serie());
//
//            }
            if (c == null) {
                e_comerce.Factura.txtFactura.setText("CF00001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5;
                j = Integer.parseInt(r);
                GenerarNumero gen = new GenerarNumero();
                gen.generar(j);
                e_comerce.Factura.txtFactura.setText("CF" + gen.serie());

            }

        } catch (SQLException ex) {
            Logger.getLogger(FacturaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static void extraerID() {
//        int j;
//        int cont = 1;
//        String num = "";
//        String c = "";
//        String SQL = "SELECT MAX(codigo_us) FROM usuarios";
//
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(SQL);
//            while (rs.next()) {
//                c = rs.getString(1);
//            }
//
//            if (c == null) {
//                VISTAS.usuarios.Usuarios.codigo.setText("US0001");
//            } else {
//                char r1 = c.charAt(2);
//                char r2 = c.charAt(3);
//                char r3 = c.charAt(4);
//                char r4 = c.charAt(5);
//                String r = "";
//                r = "" + r1 + r2 + r3 + r4;
//                j = Integer.parseInt(r);
//                GenerarCodigos gen = new GenerarCodigos();
//                gen.generar(j);
//                VISTAS.usuarios.Usuarios.codigo.setText("US" + gen.serie());
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
    public static int registrar(FacturaBean uc) {
        int rsu = 0;
        String sql = FacturaBean.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);  
            ps.setString(1, uc.getCodfac());
            ps.setString(2, uc.getFechfac());
            ps.setString(3, uc.getDepar());
            ps.setString(4, uc.getProv());
            ps.setString(5, uc.getDistri());
            ps.setInt(6, uc.getTelf());
            ps.setString(7, uc.getCodcliente());
            ps.setString(8, uc.getCodagente());
            ps.setString(9, uc.getCodruta());
            ps.setString(10, uc.getEstadopaquete());            
            rsu = ps.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();}
        System.out.println(sql);
        return rsu;
    }
    
     public static void listarFactura(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Facturas.tblFacturas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM VW_FACTURAS";
        } else {
//            sql = "SELECT (codfac,fechfac,departfac,provinciafac,distritofac,codcliente,codagente,codruta,codpaquete) FROM factura WHERE (codfac like'" + busca + "%' or fechfac like'" + busca + "%') "
//                    + " order by codfac "
//                    + "";
              sql = "SELECT * FROM VW_FACTURAS WHERE (codfac like'" + busca + "%' or fechfac like'" + busca + "%')";
        }
                             
        String datos[] = new String[10];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                
                modelo.addRow(datos);
            }
            tblFacturas.setModel(modelo); 
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     //MOSTRAR VISTAS
    public void ListarFactura1() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Facturas.tblFacturas.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }       
            String datos[] = new String[10];
            
            String sql = "SELECT * FROM VW_FACTURAS";                       
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery(sql);            
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);  
                modelo.addRow(datos);                
            }
            tblFacturas.setModel(modelo);            
            //tamaños para la tabla jtProductos
            int[] anchos = {45, 75, 75, 155, 55,75,75,75,85,75};
            for (int i = 0; i < e_comerce.Facturas.tblFacturas.getColumnCount(); i++) {
                e_comerce.Facturas.tblFacturas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
