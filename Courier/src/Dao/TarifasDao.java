package Dao;

import Bean.TarifasBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import util.conexion;

public class TarifasDao {

    static conexion cc = new conexion();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    static ResultSet rs;

    public static int registrar_Mant_Tarifa(TarifasBean t) {
        int rsu = 0;
        String sql = "{CALL SP_TAF_AGREGAR(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getCodigoTarifa());
            ps.setString(2, t.getTipo());
            ps.setString(3, t.getDescripcion());
            ps.setString(4, t.getRucCliente());
            ps.setString(5, t.getNombre());
            ps.setString(6, t.getCiudadOrigen());
            ps.setString(7, t.getNombreOrigen());
            ps.setString(8, t.getCiudadDestino());
            ps.setString(9, t.getNombreDestino());
            ps.setString(10, t.getPTOrigen());
            ps.setString(11, t.getPTDestino());
            ps.setDouble(12, t.getKilajeMinimo());
            ps.setDouble(13, t.getRecojo());
            ps.setDouble(14, t.getPrioridad());
            ps.setDouble(15, t.getValorado());
            ps.setDouble(16, t.getEmbalaje());
            
            ps.setDouble(17, t.getTarifaLocal());
            ps.setDouble(18, t.getZonaAlejada());
            ps.setDouble(19, t.getKgLocal());
            ps.setDouble(20, t.getTarifaBT());
            ps.setDouble(21, t.getTarifaBA());
            ps.setDouble(22, t.getSobrepesoT());
            ps.setDouble(23, t.getSobrepesoA());
            ps.setDouble(24, t.getPesoVolumenT());
            ps.setDouble(25, t.getPesoVolumenA());
            ps.setDouble(26, t.getTransbordoT());
            ps.setDouble(27, t.getTransAdicT());
            ps.setDouble(28, t.getTransbordoA());
            ps.setDouble(29, t.getTransAdicA());

            rsu = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizarTarifas(TarifasBean t) {
        int rsu = 0;
        String sql = "UPDATE `tarifas` SET`tipo`=?,`descripcion`=?,"
                + "`RucCliente`=?,`nombre`=?,`CiudadOrigen`=?,`nombreOrigen`=?,"
                + "`CiudadDestino`=?,`nombreDestino`=?,`PTOrigen`=?,`PTDestino`=?,"
                + "`KilajeMinimo`=?,`Recojo`=?,`Prioridad`=?,`Valorado`=?,`Embalaje`=?,`TarifaLocal`=?,"
                + "`ZonaAlejada`=?,`KgLocal`=?,`TarifaBT`=?,`TarifaBA`=?,"
                + "`SobrepesoT`=?,`SobrepesoA`=?,`PesoVolumenT`=?,`PesoVolumenA`=?,"
                + "`TransbordoT`=?,`TransAdicT`=?,`TransbordoA`=?,`TransAdicA`=?"
                + " WHERE `CodigoTarifa`=?";
        try {
            ps = cn.prepareStatement(sql);

            
            ps.setString(1, t.getTipo());
            ps.setString(2, t.getDescripcion());
            ps.setString(3, t.getRucCliente());
            ps.setString(4, t.getNombre());
            ps.setString(5, t.getCiudadOrigen());
            ps.setString(6, t.getNombreOrigen());
            ps.setString(7, t.getCiudadDestino());
            ps.setString(8, t.getNombreDestino());
            ps.setString(9, t.getPTOrigen());
            ps.setString(10, t.getPTDestino());
            ps.setDouble(11, t.getKilajeMinimo());
            ps.setDouble(12, t.getRecojo());
            ps.setDouble(13, t.getPrioridad());
            ps.setDouble(14, t.getValorado());
            ps.setDouble(15, t.getEmbalaje());
            
            
            ps.setDouble(16, t.getTarifaLocal());
            ps.setDouble(17, t.getZonaAlejada());
            ps.setDouble(18, t.getKgLocal());
            ps.setDouble(19, t.getTarifaBT());
            ps.setDouble(20, t.getTarifaBA());
            ps.setDouble(21, t.getSobrepesoT());
            ps.setDouble(22, t.getSobrepesoA());
            ps.setDouble(23, t.getPesoVolumenT());
            ps.setDouble(24, t.getPesoVolumenA());
            ps.setDouble(25, t.getTransbordoT());
            ps.setDouble(26, t.getTransAdicT());
            ps.setDouble(27, t.getTransbordoA());
            ps.setDouble(28, t.getTransAdicA());
            ps.setString(29, t.getCodigoTarifa());
            
            rsu = ps.executeUpdate();

        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    //almacena los datos que se escribiran el los formularios
    public static int eliminarTarifa(String id) {
        int rsu = 0;
        String sql = "DELETE FROM Tarifas WHERE `CodigoTarifa`=?";

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

    public static void listarTarifas(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Tarifas.tblTarifas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM Tarifas";
        } else {
            sql = "SELECT * FROM Tarifas WHERE (RucCliente like'" + busca + "%' or Nombre like'" + busca + "%'or CodigoTarifa like'" + busca + "%') ";
        }

        String datos[] = new String[29];
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
                datos[20] = rs.getString(21);
                datos[21] = rs.getString(22);
                datos[22] = rs.getString(23);
                datos[23] = rs.getString(24);
                datos[24] = rs.getString(25);
                datos[25] = rs.getString(26);
                datos[26] = rs.getString(27);
                datos[27] = rs.getString(28);
                datos[28] = rs.getString(29);
                modelo.addRow(datos);
            }
//            int[] anchos = {10,10,10,10,150};
//            for (int i = 0; i < e_comerce.Ruta.tblRutas.getColumnCount(); i++) {
//                e_comerce.Ruta.tblRutas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//            }
        } catch (SQLException ex) {
            Logger.getLogger(RutaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static void listarMantenimientoTarifas(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) e_comerce.Mantenimiento.ManTarifas.tblManTarifas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM Tarifas";
        } else {
            sql = "SELECT * FROM Tarifas WHERE (RucCliente like'" + busca + "%' or Nombre like'" + busca + "%'or CodigoTarifa like'" + busca + "%') ";
        }

        String datos[] = new String[29];
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
                datos[20] = rs.getString(21);
                datos[21] = rs.getString(22);
                datos[22] = rs.getString(23);
                datos[23] = rs.getString(24);
                datos[24] = rs.getString(25);
                datos[25] = rs.getString(26);
                datos[26] = rs.getString(27);
                datos[27] = rs.getString(28);
                datos[28] = rs.getString(29);
                modelo.addRow(datos);
            }
            //tamaños para la tabla Ruta
//            int[] anchos = {10,10,10,10,150};
//            for (int i = 0; i < e_comerce.Mantenimiento.ManRutas.tblMantRutas.getColumnCount(); i++) {
//                e_comerce.Mantenimiento.ManRutas.tblMantRutas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//            }

        } catch (SQLException ex) {
            Logger.getLogger(RutaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
