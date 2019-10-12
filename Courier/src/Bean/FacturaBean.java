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
public class FacturaBean {
    
    String codfac;
    String fechfac;
    String depar;
    String prov;
    String distri;
    int telf;
    String codcliente;
    String codagente;
    String codruta;
    String estadopaquete;

    public String getCodfac() {
        return codfac;
    }

    public void setCodfac(String codfac) {
        this.codfac = codfac;
    }

    public String getFechfac() {
        return fechfac;
    }

    public void setFechfac(String fechfac) {
        this.fechfac = fechfac;
    }

    public String getDepar() {
        return depar;
    }

    public void setDepar(String depar) {
        this.depar = depar;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getDistri() {
        return distri;
    }

    public void setDistri(String distri) {
        this.distri = distri;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }
       

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getCodagente() {
        return codagente;
    }

    public void setCodagente(String codagente) {
        this.codagente = codagente;
    }

    public String getCodruta() {
        return codruta;
    }

    public void setCodruta(String codruta) {
        this.codruta = codruta;
    }

    public String getEstadopaquete() {
        return estadopaquete;
    }

    public void setEstadopaquete(String estadopaquete) {
        this.estadopaquete = estadopaquete;
    }
    
    
    public static String LISTAR = "SELECT * FROM factura";
    public static String REGISTRAR = "INSERT INTO FACTURA(codfac,fechfac,departfac,provinciafac,distritofac,telffac,codcliente,codagente,codruta,codpaquete) values(?,?,?,?,?,?,?,?,?,?)";
    public static String ACTUALIZAR = "UPDATE FACTURA SET fechfac=?,departfac=?,provinciafac=?,distritofac=?,telffac=?,codcliente=?,codagente=?,codruta=?,codpaquete=? where codfac = ?";
    public static String ELIMINAR = "DELETE  FROM FACTURA WHERE codfac = ?";
    public static String ELIMINAR_TODO = "DELETE FROM FACTURA";
    
    


}
