/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.AgenteBean;
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
public class AgentesDao {

    static conexion cc = new conexion();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    static ResultSet rs;

    //almacena los datos que se escribiran el los formularios
    public static int registrarAgente(AgenteBean ab) {
        int rsu = 0;
        String sql = "{CALL SP_AGE_AGREGAR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, ab.getRucAgente());
            ps.setString(2, ab.getTipo());
            ps.setString(3, ab.getNombre());
            ps.setString(4, ab.getDireccion());
            ps.setInt(5, ab.getTelefono());
            ps.setInt(6, ab.getTelefonoCell());
            ps.setInt(7, ab.getTelefonoWsp());
            ps.setString(8, ab.getRucCliente());
            ps.setString(9, ab.getFax());
            ps.setString(10, ab.getUbigeo());
            ps.setString(11, ab.getEmail());
            ps.setDouble(12, ab.getPagoTransporte());
            ps.setDouble(13, ab.getKgBasRep());
            ps.setDouble(14, ab.getKgAdicional());
            ps.setString(15, ab.getLPorcMontoCCorto());
            ps.setDouble(16, ab.getLBasicoCCorto());
            ps.setDouble(17, ab.getLAdicionalCCorto());
            ps.setString(18, ab.getLPorcMontoCLargo());
            ps.setDouble(19, ab.getLBasicoCLargo());
            ps.setDouble(20, ab.getLAdicionalCLargo());
            ps.setString(21, ab.getSPorcMontoCCorto());
            ps.setDouble(22, ab.getSBasicoCCorto());
            ps.setDouble(23, ab.getSAdicionalCCorto());
            ps.setString(24, ab.getSPorcMontoCLargo());
            ps.setDouble(25, ab.getSBasicoCLargo());
            ps.setDouble(26, ab.getSAdicionalCLargo());

            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    //almacena los datos que se escribiran el los formularios
    public static int actualizarAgente(AgenteBean uc) {
        int rsu = 0;
        String sql = "UPDATE `agente` SET `Tipo`=?,`Nombre`=?,`Direccion`=?,`TelefonoFijo`=?,`TelefonoCell`=?,`TelefonoWsp`=?,`RucCliente`=?,\n"
                + "`Fax`=?,`Ubigeo`=?,`Email`=?,`PagoTransporte`=?,`KgBasRep`=?,`KgAdicional`=?,`LPorcMontoCCorto`=?,\n"
                + "`LBasicoCCorto`=?,`LAdicionalCCorto`=?,`LPorcMontoCLargo`=?,`LBasicoCLargo`=?,`LAdicionalCLargo`=?,`SPorcMontoCCorto`=?,\n"
                + "`SBasicoCCorto`=?,`SAdicionalCCorto`=?,`SPorcMontoCLargo`=?,`SBasicoCLargo`=?,`SAdicionalCLargo`=? WHERE `RucAgente`=?";
        try {
            ps = cn.prepareStatement(sql);

            ps.setString(1, uc.getTipo());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getDireccion());
            ps.setInt(4, uc.getTelefono());
            ps.setInt(5, uc.getTelefonoCell());
            ps.setInt(6, uc.getTelefonoWsp());
            ps.setString(7, uc.getRucCliente());
            ps.setString(8, uc.getFax());
            ps.setString(9, uc.getUbigeo());
            ps.setString(10, uc.getEmail());
            ps.setDouble(11, uc.getPagoTransporte());
            ps.setDouble(12, uc.getKgBasRep());
            ps.setDouble(13, uc.getKgAdicional());
            ps.setString(14, uc.getLPorcMontoCCorto());
            ps.setDouble(15, uc.getLBasicoCCorto());
            ps.setDouble(16, uc.getLAdicionalCCorto());
            ps.setString(17, uc.getLPorcMontoCLargo());
            ps.setDouble(18, uc.getLBasicoCLargo());
            ps.setDouble(19, uc.getLAdicionalCLargo());
            ps.setString(20, uc.getSPorcMontoCCorto());
            ps.setDouble(21, uc.getSBasicoCCorto());
            ps.setDouble(22, uc.getSAdicionalCCorto());
            ps.setString(23, uc.getSPorcMontoCLargo());
            ps.setDouble(24, uc.getSBasicoCLargo());
            ps.setDouble(25, uc.getSAdicionalCLargo());
            ps.setString(26, uc.getRucAgente());
            rsu = ps.executeUpdate();

        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    //almacena los datos que se escribiran el los formularios
     public static int eliminarAgente(String id) {
        int rsu = 0;
        String sql = "DELETE FROM AGENTE WHERE `RucAgente`=?";

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
    //almacena los datos que se escribiran el los formularios
    /* public static int eliminaTodos() {
        int rsu = 0;
        String sql = AgenteBean.ELIMINAR_TODO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }*/
    public static void listarAgentes(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Aagente.tblAagentes.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM AGENTE";
        } else {
            sql = "SELECT * FROM Agente WHERE (RucAgente like'" + busca + "%' or Nombre like'" + busca + "%') "
                    + " order by RucAgente";
        }

        String datos[] = new String[26];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("RucAgente");
                datos[1] = rs.getString("Tipo");
                datos[2] = rs.getString("Nombre");
                datos[3] = rs.getString("Direccion");
                datos[4] = rs.getString("TelefonoFijo");
                datos[5] = rs.getString("TelefonoCell");
                datos[6] = rs.getString("TelefonoWsp");
                datos[7] = rs.getString("RucCliente");
                datos[8] = rs.getString("Fax");
                datos[9] = rs.getString("Ubigeo");
                datos[10] = rs.getString("Email");
                datos[11] = rs.getString("PagoTransporte");
                datos[12] = rs.getString("KgBasRep");
                datos[13] = rs.getString("KgAdicional");
                datos[14] = rs.getString("LPorcMontoCCorto");
                datos[15] = rs.getString("LBasicoCCorto");
                datos[16] = rs.getString("LAdicionalCCorto");
                datos[17] = rs.getString("LPorcMontoCLargo");
                datos[18] = rs.getString("LBasicoCLargo");
                datos[19] = rs.getString("LAdicionalCLargo");
                datos[20] = rs.getString("SPorcMontoCCorto");
                datos[21] = rs.getString("SBasicoCCorto");
                datos[22] = rs.getString("SAdicionalCCorto");
                datos[23] = rs.getString("SPorcMontoCLargo");
                datos[24] = rs.getString("SBasicoCLargo");
                datos[25] = rs.getString("SAdicionalCLargo");
                modelo.addRow(datos);
            }
            //            tamaños para la tabla tblAagentes
//            int[] anchos = {90, 7, 100, 120, 50, 50, 50, 90, 20, 50, 80, 40, 40, 40, 10, 40, 40, 10, 40, 40, 10, 40, 30, 10, 30, 30};
//            for (int i = 0; i < e_comerce.Aagente.tblAagentes.getColumnCount(); i++) {
//                e_comerce.Aagente.tblAagentes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//            }
        } catch (SQLException ex) {
            Logger.getLogger(AgentesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//////////    public static void Listar() {
//////////        try {
//////////            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Aagente.tblAagentes.getModel();
//////////            while (modelo.getRowCount() > 0) {
//////////                modelo.removeRow(0);
//////////            }
//////////
//////////            String sql = "SELECT * FROM AGENTE";
//////////            ps = cn.prepareStatement(sql);
//////////            rs = ps.executeQuery();
//////////
//////////            String datos[] = new String[26];
//////////            while (rs.next()) {
//////////                datos[0] = rs.getString("RucAgente");
//////////                datos[1] = rs.getString("Tipo");
//////////                datos[2] = rs.getString("Nombre");
//////////                datos[3] = rs.getString("Direccion");
//////////                datos[4] = rs.getString("TelefonoFijo");
//////////                datos[5] = rs.getString("TelefonoCell");
//////////                datos[6] = rs.getString("TelefonoWsp");
//////////                datos[7] = rs.getString("RucCliente");
//////////                datos[8] = rs.getString("Fax");
//////////                datos[9] = rs.getString("Ubigeo");
//////////                datos[10] = rs.getString("Email");
//////////                datos[11] = rs.getString("PagoTransporte");
//////////                datos[12] = rs.getString("KgBasRep");
//////////                datos[13] = rs.getString("KgAdicional");
//////////                datos[14] = rs.getString("LPorcMontoCCorto");
//////////                datos[15] = rs.getString("LBasicoCCorto");
//////////                datos[16] = rs.getString("LAdicionalCCorto");
//////////                datos[17] = rs.getString("LPorcMontoCLargo");
//////////                datos[18] = rs.getString("LBasicoCLargo");
//////////                datos[19] = rs.getString("LAdicionalCLargo");
//////////                datos[20] = rs.getString("SPorcMontoCCorto");
//////////                datos[21] = rs.getString("SBasicoCCorto");
//////////                datos[22] = rs.getString("SAdicionalCCorto");
//////////                datos[23] = rs.getString("SPorcMontoCLargo");
//////////                datos[24] = rs.getString("SBasicoCLargo");
//////////                datos[25] = rs.getString("SAdicionalCLargo");
//////////                modelo.addRow(datos);
//////////            }
////////////            tamaños para la tabla tblAagentes
////////////            int[] anchos = {90, 7, 100, 120, 50, 50, 50, 90, 20, 50, 80, 40, 40, 40, 10, 40, 40, 10, 40, 40, 10, 40, 30, 10, 30, 30};
////////////            for (int i = 0; i < e_comerce.Aagente.tblAagentes.getColumnCount(); i++) {
////////////                e_comerce.Aagente.tblAagentes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
////////////            }
//////////
//////////        } catch (SQLException ex) {
//////////            System.out.println(ex.toString());
//////////        }
//////////    }

    public static void ListarMantAgente() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManAgente.tblMantAgente.getModel();
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            String sql = "SELECT * FROM AGENTE";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            String datos[] = new String[26];
            while (rs.next()) {
                datos[0] = rs.getString("RucAgente");
                datos[1] = rs.getString("Tipo");
                datos[2] = rs.getString("Nombre");
                datos[3] = rs.getString("Direccion");
                datos[4] = rs.getString("TelefonoFijo");
                datos[5] = rs.getString("TelefonoCell");
                datos[6] = rs.getString("TelefonoWsp");
                datos[7] = rs.getString("RucCliente");
                datos[8] = rs.getString("Fax");
                datos[9] = rs.getString("Ubigeo");
                datos[10] = rs.getString("Email");
                datos[11] = rs.getString("PagoTransporte");
                datos[12] = rs.getString("KgBasRep");
                datos[13] = rs.getString("KgAdicional");
                datos[14] = rs.getString("LPorcMontoCCorto");
                datos[15] = rs.getString("LBasicoCCorto");
                datos[16] = rs.getString("LAdicionalCCorto");
                datos[17] = rs.getString("LPorcMontoCLargo");
                datos[18] = rs.getString("LBasicoCLargo");
                datos[19] = rs.getString("LAdicionalCLargo");
                datos[20] = rs.getString("SPorcMontoCCorto");
                datos[21] = rs.getString("SBasicoCCorto");
                datos[22] = rs.getString("SAdicionalCCorto");
                datos[23] = rs.getString("SPorcMontoCLargo");
                datos[24] = rs.getString("SBasicoCLargo");
                datos[25] = rs.getString("SAdicionalCLargo");
                modelo.addRow(datos);
            }
//            tamaños para la tabla tblMantAgente
            int[] anchos = {110, 50, 150, 150, 100, 100, 100, 150, 70, 120, 110, 100, 100, 100, 60, 100, 100, 60, 100, 100, 60, 100, 100, 60, 100, 100};
            for (int i = 0; i < e_comerce.Mantenimiento.ManAgente.tblMantAgente.getColumnCount(); i++) {
                e_comerce.Mantenimiento.ManAgente.tblMantAgente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void listarAgentesMantenimiento(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManAgente.tblMantAgente.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM AGENTE";
        } else {
            sql = "SELECT * FROM Agente WHERE (RucAgente like'" + busca + "%' or Nombre like'" + busca + "%') "
                    + " order by RucAgente";
        }

        String datos[] = new String[26];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("RucAgente");
                datos[1] = rs.getString("Tipo");
                datos[2] = rs.getString("Nombre");
                datos[3] = rs.getString("Direccion");
                datos[4] = rs.getString("TelefonoFijo");
                datos[5] = rs.getString("TelefonoCell");
                datos[6] = rs.getString("TelefonoWsp");
                datos[7] = rs.getString("RucCliente");
                datos[8] = rs.getString("Fax");
                datos[9] = rs.getString("Ubigeo");
                datos[10] = rs.getString("Email");
                datos[11] = rs.getString("PagoTransporte");
                datos[12] = rs.getString("KgBasRep");
                datos[13] = rs.getString("KgAdicional");
                datos[14] = rs.getString("LPorcMontoCCorto");
                datos[15] = rs.getString("LBasicoCCorto");
                datos[16] = rs.getString("LAdicionalCCorto");
                datos[17] = rs.getString("LPorcMontoCLargo");
                datos[18] = rs.getString("LBasicoCLargo");
                datos[19] = rs.getString("LAdicionalCLargo");
                datos[20] = rs.getString("SPorcMontoCCorto");
                datos[21] = rs.getString("SBasicoCCorto");
                datos[22] = rs.getString("SAdicionalCCorto");
                datos[23] = rs.getString("SPorcMontoCLargo");
                datos[24] = rs.getString("SBasicoCLargo");
                datos[25] = rs.getString("SAdicionalCLargo");
                modelo.addRow(datos);
            }
            //            tamaños para la tabla tblMantAgente
//            int[] anchos = {90, 7, 100, 120, 50, 50, 50, 90, 20, 50, 80, 40, 40, 40, 10, 40, 40, 10, 40, 40, 10, 40, 30, 10, 30, 30};
//            for (int i = 0; i < e_comerce.Mantenimiento.ManAgente.tblMantAgente.getColumnCount(); i++) {
//                e_comerce.Mantenimiento.ManAgente.tblMantAgente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//            }
        } catch (SQLException ex) {
            Logger.getLogger(AgentesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
