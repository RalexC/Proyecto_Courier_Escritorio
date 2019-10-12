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
public class AgenteBean {
  
    /*Datos Especificos del Agente*/
	String RucAgente;
	String Tipo;
	String Nombre;
	String Direccion;
	int Telefono;
	int TelefonoCell;
	int TelefonoWsp;
	/*????????????????????*/
	String RucCliente;	 
	String Fax;
	String Ubigeo;
	String Email;
	double PagoTransporte;
	double KgBasRep;
	double KgAdicional;
	/*Comision por Llegada*/
	String LPorcMontoCCorto;
        double LBasicoCCorto;
	double LAdicionalCCorto;
	String LPorcMontoCLargo;
	double LBasicoCLargo;
        double LAdicionalCLargo;
	/*Comision por Salida*/
	String SPorcMontoCCorto;
	double SBasicoCCorto;
        double SAdicionalCCorto;
	String SPorcMontoCLargo;
        double SBasicoCLargo;
        double SAdicionalCLargo;

    public String getRucAgente() {
        return RucAgente;
    }

    public void setRucAgente(String RucAgente) {
        this.RucAgente = RucAgente;
    }
        

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public int getTelefonoCell() {
        return TelefonoCell;
    }

    public void setTelefonoCell(int TelefonoCell) {
        this.TelefonoCell = TelefonoCell;
    }

    public int getTelefonoWsp() {
        return TelefonoWsp;
    }

    public void setTelefonoWsp(int TelefonoWsp) {
        this.TelefonoWsp = TelefonoWsp;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getRucCliente() {
        return RucCliente;
    }

    public void setRucCliente(String RucCliente) {
        this.RucCliente = RucCliente;
    }

  
    

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getUbigeo() {
        return Ubigeo;
    }

    public void setUbigeo(String Ubigeo) {
        this.Ubigeo = Ubigeo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getPagoTransporte() {
        return PagoTransporte;
    }

    public void setPagoTransporte(double PagoTransporte) {
        this.PagoTransporte = PagoTransporte;
    }

    public double getKgBasRep() {
        return KgBasRep;
    }

    public void setKgBasRep(double KgBasRep) {
        this.KgBasRep = KgBasRep;
    }

    public double getKgAdicional() {
        return KgAdicional;
    }

    public void setKgAdicional(double KgAdicional) {
        this.KgAdicional = KgAdicional;
    }

    public String getLPorcMontoCCorto() {
        return LPorcMontoCCorto;
    }

    public void setLPorcMontoCCorto(String LPorcMontoCCorto) {
        this.LPorcMontoCCorto = LPorcMontoCCorto;
    }

    public double getLBasicoCCorto() {
        return LBasicoCCorto;
    }

    public void setLBasicoCCorto(double LBasicoCCorto) {
        this.LBasicoCCorto = LBasicoCCorto;
    }

    public double getLAdicionalCCorto() {
        return LAdicionalCCorto;
    }

    public void setLAdicionalCCorto(double LAdicionalCCorto) {
        this.LAdicionalCCorto = LAdicionalCCorto;
    }

    public String getLPorcMontoCLargo() {
        return LPorcMontoCLargo;
    }

    public void setLPorcMontoCLargo(String LPorcMontoCLargo) {
        this.LPorcMontoCLargo = LPorcMontoCLargo;
    }

    public double getLBasicoCLargo() {
        return LBasicoCLargo;
    }

    public void setLBasicoCLargo(double LBasicoCLargo) {
        this.LBasicoCLargo = LBasicoCLargo;
    }

    public String getSPorcMontoCCorto() {
        return SPorcMontoCCorto;
    }

    public void setSPorcMontoCCorto(String SPorcMontoCCorto) {
        this.SPorcMontoCCorto = SPorcMontoCCorto;
    }

    public double getSBasicoCCorto() {
        return SBasicoCCorto;
    }

    public void setSBasicoCCorto(double SBasicoCCorto) {
        this.SBasicoCCorto = SBasicoCCorto;
    }

    public double getSAdicionalCCorto() {
        return SAdicionalCCorto;
    }

    public void setSAdicionalCCorto(double SAdicionalCCorto) {
        this.SAdicionalCCorto = SAdicionalCCorto;
    }

    public String getSPorcMontoCLargo() {
        return SPorcMontoCLargo;
    }

    public void setSPorcMontoCLargo(String SPorcMontoCLargo) {
        this.SPorcMontoCLargo = SPorcMontoCLargo;
    }

    public double getSBasicoCLargo() {
        return SBasicoCLargo;
    }

    public void setSBasicoCLargo(double SBasicoCLargo) {
        this.SBasicoCLargo = SBasicoCLargo;
    }

    public double getLAdicionalCLargo() {
        return LAdicionalCLargo;
    }

    public void setLAdicionalCLargo(double LAdicionalCLargo) {
        this.LAdicionalCLargo = LAdicionalCLargo;
    }

    public double getSAdicionalCLargo() {
        return SAdicionalCLargo;
    }

    public void setSAdicionalCLargo(double SAdicionalCLargo) {
        this.SAdicionalCLargo = SAdicionalCLargo;
    }

    
        
  
}
