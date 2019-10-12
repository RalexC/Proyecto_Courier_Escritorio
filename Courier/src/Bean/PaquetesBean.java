/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Ralex
 */
public class PaquetesBean {
    
    String codpaquete;
    String codguiapaquete;
    String tipopaquete;
    String estadopaquete;
    String descpaquete;

    public String getCodpaquete() {
        return codpaquete;
    }

    public void setCodpaquete(String codpaquete) {
        this.codpaquete = codpaquete;
    }

    public String getCodguiapaquete() {
        return codguiapaquete;
    }

    public void setCodguiapaquete(String codguiapaquete) {
        this.codguiapaquete = codguiapaquete;
    }
    

    public String getTipopaquete() {
        return tipopaquete;
    }

    public void setTipopaquete(String tipopaquete) {
        this.tipopaquete = tipopaquete;
    }

    public String getEstadopaquete() {
        return estadopaquete;
    }

    public void setEstadopaquete(String estadopaquete) {
        this.estadopaquete = estadopaquete;
    }

    public String getDescpaquete() {
        return descpaquete;
    }

    public void setDescpaquete(String descpaquete) {
        this.descpaquete = descpaquete;
    }
    
    public static String LISTAR = "SELECT * FROM paquete";
    public static String REGISTRAR = "INSERT INTO paquete(codpaquete,codguiapaquete,tipopaquete,estadopaquete,descpaquete) values(?,?,?,?,?)";
    public static String ACTUALIZAR = "UPDATE FACTURA SET codguiapaquete=?,tipopaquete=?,estadopaquete=?,descpaquete=? where codpaquete=?";
    public static String ELIMINAR = "DELETE  FROM FACTURA WHERE codfac = ?";
    public static String ELIMINAR_TODO = "DELETE FROM FACTURA";
    
}
