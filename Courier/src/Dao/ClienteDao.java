/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.ClienteBean;
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
public class ClienteDao {

    static conexion cc = new conexion();
    static Connection cn = cc.conexion();

    public static void listarCliente(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Clientes.tblClientes.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
//        String sql = "";
//        if (busca.equals("")) {
//            sql = "SELECT * FROM CLIENTE";
//        } else {
//            sql = "SELECT * FROM Cliente WHERE (RucCliente like'" + busca + "%' or NombreRazon like'" + busca + "%') "
//                    + " order by RucCliente";
//        }
//        String datos[] = new String[17];
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                datos[0] = rs.getString(1);
//                datos[1] = rs.getString(2);
//                datos[2] = rs.getString(3);
//                datos[3] = rs.getString(4);
//                datos[4] = rs.getString(5);
//                datos[5] = rs.getString(6);
//                datos[6] = rs.getString(7);
//                datos[7] = rs.getString(8);
//                datos[8] = rs.getString(9);
//                datos[9] = rs.getString(10);
//                datos[10] = rs.getString(11);
//                datos[11] = rs.getString(12);
//                datos[12] = rs.getString(13);
//                datos[13] = rs.getString(14);
//                datos[14] = rs.getString(15);
//                datos[15] = rs.getString(16);
//                datos[16] = rs.getString(17);
//                modelo.addRow(datos);
//            }
String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM vw_cliente_mas_desc_ubigeo";
        } else {
            sql = "SELECT * FROM vw_cliente_mas_desc_ubigeo WHERE (RucCliente like'" + busca + "%' or NombreRazon like'" + busca + "%' or Ubigeo like'" + busca + "%' or Distrito like'" + busca + "%' or Provincia like'" + busca + "%' or Departamento like'" + busca + "%') "
                    + " order by RucCliente";
        }
        String datos[] = new String[20];
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
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                datos[13] = rs.getString(14);
                datos[14] = rs.getString(15);
                datos[15] = rs.getString(16);
                datos[16] = rs.getString(17);
                datos[17] = rs.getString(18);
                datos[18] = rs.getString(19);
                datos[19] = rs.getString(20);
                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
//            int[] anchos = {60, 150, 3, 100, 35, 35, 35, 3, 80, 35, 80, 35, 4, 4, 5, 5, 5};
//            for (int i = 0; i < e_comerce.Clientes.tblClientes.getColumnCount(); i++) {
//                e_comerce.Clientes.tblClientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static PreparedStatement ps;
    static ResultSet rs;

////////    public static void Listar() {
////////        try {
////////            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Clientes.tblClientes.getModel();
////////            while (modelo.getRowCount() > 0) {
////////                modelo.removeRow(0);
////////            }
////////            String sql = "SELECT * FROM CLIENTE";
////////            ps = cn.prepareStatement(sql);
////////            rs = ps.executeQuery();
////////
////////            String datos[] = new String[17];
////////            while (rs.next()) {
////////                datos[0] = rs.getString(1);
////////                datos[1] = rs.getString(2);
////////                datos[2] = rs.getString(3);
////////                datos[3] = rs.getString(4);
////////                datos[4] = rs.getString(5);
////////                datos[5] = rs.getString(6);
////////                datos[6] = rs.getString(7);
////////                datos[7] = rs.getString(8);
////////                datos[8] = rs.getString(9);
////////                datos[9] = rs.getString(10);
////////                datos[10] = rs.getString(11);
////////                datos[11] = rs.getString(12);
////////                datos[12] = rs.getString(13);
////////                datos[13] = rs.getString(14);
////////                datos[14] = rs.getString(15);
////////                datos[15] = rs.getString(16);
////////                datos[16] = rs.getString(17);
////////                modelo.addRow(datos);
////////            }
////////            //tamaños para la tabla jtProductos
////////            int[] anchos = {60, 150, 3, 100, 35, 35, 35, 3, 80, 35, 80, 35, 4, 4, 5, 5, 5};
////////            for (int i = 0; i < e_comerce.Clientes.tblClientes.getColumnCount(); i++) {
////////                e_comerce.Clientes.tblClientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
////////            }
////////
////////        } catch (SQLException ex) {
////////            System.out.println(ex.toString());
////////        }
////////    }

//////    public static void ListarMantenimiento() {
//////        try {
//////            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManCliente.tblmancliente.getModel();
//////            while (modelo.getRowCount() > 0) {
//////                modelo.removeRow(0);
//////            }
//////
//////            String sql = "SELECT * FROM CLIENTE";
//////            ps = cn.prepareStatement(sql);
//////            rs = ps.executeQuery();
//////
//////            String datos[] = new String[17];
//////            while (rs.next()) {
//////                datos[0] = rs.getString(1);
//////                datos[1] = rs.getString(2);
//////                datos[2] = rs.getString(3);
//////                datos[3] = rs.getString(4);
//////                datos[4] = rs.getString(5);
//////                datos[5] = rs.getString(6);
//////                datos[6] = rs.getString(7);
//////                datos[7] = rs.getString(8);
//////                datos[8] = rs.getString(9);
//////                datos[9] = rs.getString(10);
//////                datos[10] = rs.getString(11);
//////                datos[11] = rs.getString(12);
//////                datos[12] = rs.getString(13);
//////                datos[13] = rs.getString(14);
//////                datos[14] = rs.getString(15);
//////                datos[15] = rs.getString(16);
//////                datos[16] = rs.getString(17);
//////                modelo.addRow(datos);
//////            }
//////            //tamaños para la tabla jtProductos
//////            int[] anchos = {60, 150, 3, 100, 35, 35, 35, 3, 80, 35, 80, 35, 4, 4, 5, 5, 5};
//////            for (int i = 0; i < e_comerce.Mantenimiento.ManCliente.tblmancliente.getColumnCount(); i++) {
//////                e_comerce.Mantenimiento.ManCliente.tblmancliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//////            }
//////
//////        } catch (SQLException ex) {
//////            System.out.println(ex.toString());
//////        }
//////    }

    public static void listarClienteMantenimiento(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManCliente.tblmancliente.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM vw_cliente_mas_desc_ubigeo";
        } else {
            sql = "SELECT * FROM vw_cliente_mas_desc_ubigeo WHERE (RucCliente like'" + busca + "%' or NombreRazon like'" + busca + "%') "
                    + " order by RucCliente";
        }
        String datos[] = new String[20];
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
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                datos[13] = rs.getString(14);
                datos[14] = rs.getString(15);
                datos[15] = rs.getString(16);
                datos[16] = rs.getString(17);
                datos[17] = rs.getString(18);
                datos[18] = rs.getString(19);
                datos[19] = rs.getString(20);
                modelo.addRow(datos);
            }
            //tamaños para la tabla jtProductos
//            int[] anchos = {60, 150, 3, 100, 35, 35, 35, 3, 80, 35, 80, 35, 4, 4, 5, 5, 5};
//            for (int i = 0; i < e_comerce.Mantenimiento.ManCliente.tblmancliente.getColumnCount(); i++) {
//                e_comerce.Mantenimiento.ManCliente.tblmancliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int registrarAgente(ClienteBean ab) {
        int rsu = 0;
        String sql = "{CALL SP_CLI_AGREGAR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, ab.getRucCliente());
            ps.setString(2, ab.getNombreRazon());
            ps.setString(3, ab.getCreditoContado());
            ps.setString(4, ab.getDireccion());
            ps.setString(5, ab.getUbigeo());
            ps.setInt(6, ab.getTelefono());
            ps.setInt(7, ab.getTelefonoWsp());
            ps.setString(8, ab.getFax());
            ps.setString(9, ab.getContactoAdmi());
            ps.setInt(10, ab.getTelefonoAdmi());
            ps.setString(11, ab.getContactoVentas());
            ps.setInt(12, ab.getTelefonoVentas());
            ps.setString(13, ab.getRetornoDocumento());
            ps.setString(14, ab.getActivacion());
            ps.setString(15, ab.getTipoCliente());
            ps.setString(16, ab.getConfirma());
            ps.setString(17, ab.getCorp());

            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizarCliente(ClienteBean uc) {
        int rsu = 0;
        String sql = "UPDATE `cliente` SET `NombreRazon`=?,`CreditoContado`=?,`Direccion`=?,"
                + "`Ubigeo`=?,`Telefono`=?,`TelefonoWsp`=?,`Fax`=?,\n"
                + "`ContactoAdmi`=?,`TelefonoAdmi`=?,`ContactoVentas`=?,`TelefonoVentas`=?,`RetornoDocumento`=?,"
                + "`Activacion`=?,`TipoCliente`=?,`Confirma`=?,`Corp`=? WHERE `RucCliente`=?";
        try {
            ps = cn.prepareStatement(sql);

            ps.setString(1, uc.getNombreRazon());
            ps.setString(2, uc.getCreditoContado());
            ps.setString(3, uc.getDireccion());
            ps.setString(4, uc.getUbigeo());
            ps.setInt(5, uc.getTelefono());
            ps.setInt(6, uc.getTelefonoWsp());
            ps.setString(7, uc.getFax());
            ps.setString(8, uc.getContactoAdmi());
            ps.setInt(9, uc.getTelefonoAdmi());
            ps.setString(10, uc.getContactoVentas());
            ps.setDouble(11, uc.getTelefonoVentas());
            ps.setString(12, uc.getRetornoDocumento());
            ps.setString(13, uc.getActivacion());
            ps.setString(14, uc.getTipoCliente());
            ps.setString(15, uc.getConfirma());
            ps.setString(16, uc.getCorp());
            ps.setString(17, uc.getRucCliente());

            rsu = ps.executeUpdate();

        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    //almacena los datos que se escribiran el los formularios
    public static int eliminarCliente(String id) {
        int rsu = 0;
        String sql = "DELETE FROM Cliente WHERE `RucCliente`=?";

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
