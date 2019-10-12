package util;

import Dao.PaqueteDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MostrarNumeroTarifa {
    
    static conexion cc = new conexion();
    static Connection cn = cc.conexion();
    
    
    public static void numerosTarifa() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(CodigoTarifa) FROM tarifas";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }
            if (c == null) {
                e_comerce.Mantenimiento.ManTarifas.lblCodigo.setText("TA00001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                char r5 = c.charAt(6);
                String r = "";
                r = "" + r1 + r2 + r3 + r4 + r5;
                j = Integer.parseInt(r);
                GenerarNumeroTarifa gen = new GenerarNumeroTarifa();
                gen.generar(j);
                e_comerce.Mantenimiento.ManTarifas.lblCodigo.setText("TA" + gen.serie());

            }
        } catch (SQLException ex) {
            Logger.getLogger(PaqueteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
