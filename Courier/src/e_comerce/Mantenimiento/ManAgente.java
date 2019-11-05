/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_comerce.Mantenimiento;

import Bean.AgenteBean;
import Dao.AgentesDao;
import PlaceHolder.TextPrompt;
import e_comerce.Clientes;
import e_comerce.Principal;
import static e_comerce.Principal.escritorio;
import e_comerce.Ubicacion;
import static e_comerce.Ubicacion.cbEnviar;
import java.util.HashSet;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ralex
 */
public class ManAgente extends javax.swing.JInternalFrame {

    AgenteBean aBean = new AgenteBean();
    AgentesDao aDao = new AgentesDao();
    DefaultTableModel modelo = new DefaultTableModel();

    public ManAgente() {
        initComponents();
        modelo.addColumn("RucAgente");
        modelo.addColumn("Tipo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Cell");
        modelo.addColumn("Whatsapp");
        modelo.addColumn("RucCliente");
        modelo.addColumn("Fax");
        modelo.addColumn("Ubigeo");
        modelo.addColumn("Distrito");
        modelo.addColumn("Provincia");
        modelo.addColumn("Departamento");
        modelo.addColumn("Email");
        modelo.addColumn("PagoTransporte");
        modelo.addColumn("KgBasRep");
        modelo.addColumn("KgAdicional");
        modelo.addColumn("LPorcMontoCCorto");
        modelo.addColumn("LBasicoCCorto");
        modelo.addColumn("LAdicionalCCorto");
        modelo.addColumn("LPorcMontoCLargo");
        modelo.addColumn("LBasicoCLargo");
        modelo.addColumn("LAdicionalCLargo");
        modelo.addColumn("SPorcMontoCCorto");
        modelo.addColumn("SBasicoCCorto");
        modelo.addColumn("SAdicionalCCorto");
        modelo.addColumn("SPorcMontoCLargo");
        modelo.addColumn("SBasicoCLargo");
        modelo.addColumn("SAdicionalCLargo");
        tblMantAgente.setModel(modelo);
        aDao.listarAgentesMantenimiento(txtBuscarAgentes.getText());
       
        placeholder();
        comboTipoAgente();
        montoPorcentaje1();
        montoPorcentaje2();
        montoPorcentaje3();
        montoPorcentaje4();
        combo();
    }

    void placeholder(){
        TextPrompt txt1 = new TextPrompt("Ejmp: 123456789101", txtRucAgente);
        TextPrompt txt2 = new TextPrompt("Ejmp: ApellidoPaterno ApellidoMaterno Nombre", txtNombreAgente);
        TextPrompt txt3 = new TextPrompt("Ejmp: San Juan de Miraflores", txtDireccion);
        TextPrompt txt4 = new TextPrompt("Ejmp: 1234567", txtTelefono);
        TextPrompt txt5 = new TextPrompt("Ejmp: 123456789", txttelefonoCell);
        TextPrompt txt6 = new TextPrompt("Ejmp: 123456789", txtTelefonoWsp);
        TextPrompt txt7 = new TextPrompt("Ejmp: Ejmplo@gamil.com", txtEmail);
        TextPrompt txt8 = new TextPrompt("Ejmp: ?????", txtFax);
        TextPrompt txt9 = new TextPrompt("0.00", txtPagoTransporte);
        TextPrompt txt10 = new TextPrompt("0.00", txtKgBasRep);
        TextPrompt txt11 = new TextPrompt("0.00", txtKgAdi);
        
        TextPrompt txt12 = new TextPrompt("Ingrese Ruc, Nombre, Ubigeo, Distrito, Provincia o Departamento", txtBuscarAgentes);
        
        TextPrompt txt13 = new TextPrompt("0.00", txtBasicoCCort);
        TextPrompt txt14 = new TextPrompt("0.00", txtAdicionalCCorto);
        TextPrompt txt15 = new TextPrompt("0.00", txtBasicoCLargo);
        TextPrompt txt16 = new TextPrompt("0.00", txtAdicionalCLargo);
        TextPrompt txt17 = new TextPrompt("0.00", txtSBasicoCCorto);
        TextPrompt txt18 = new TextPrompt("0.00", txtSAdicionalCCorto);
        TextPrompt txt19 = new TextPrompt("0.00", txtSBasicoCLargo);
        TextPrompt txt20 = new TextPrompt("0.00", txtSAdicionalCLargo);           
        
    }
    
    
    void combo(){
        if (cbClienteono.getSelectedItem().equals("Si")) {
            txtClienteono.setText("Agente Cliente");
            
        } else if (cbClienteono.getSelectedItem().equals("No")) {
            txtClienteono.setText("Agente no es Cliente");
            lblRucCliente.setText("");
        }else {
            txtClienteono.setText("Seleccione");
            lblRucCliente.setText("Verifique si el Agente es cliente ->");
        }
        
    }
    
    void comboTipoAgente(){
        if (cbTipoAgente.getSelectedItem().equals("A")) {
            lblTipo.setText("Agente");
            
        } else if (cbTipoAgente.getSelectedItem().equals("M")){
            
            lblTipo.setText("Mensajero");
        }
    }
    
    
    void montoPorcentaje1(){
        if (cbPMCC.getSelectedItem().equals("M")) {
            lblPM.setText("Monto");
            
        } else if (cbPMCC.getSelectedItem().equals("P")){
            
            lblPM.setText("Porcentaje");
        }              
    }
    
    void montoPorcentaje2(){
    
        if (cbPMCL.getSelectedItem().equals("M")) {
            lblPM1.setText("Monto");
            
        } else if (cbPMCL.getSelectedItem().equals("P")){
            
            lblPM1.setText("Porcentaje");
        }       
    }
    
    void montoPorcentaje3(){
    
        if (cbSPMCC1.getSelectedItem().equals("M")) {
            lblPM2.setText("Monto");
            
        } else if (cbSPMCC1.getSelectedItem().equals("P")){
            
            lblPM2.setText("Porcentaje");
        }       
    }
    
    void montoPorcentaje4(){
        
        if (cbSPMCC2.getSelectedItem().equals("M")) {
            lblPM3.setText("Monto");
            
        } else if (cbSPMCC2.getSelectedItem().equals("P")){
            
            lblPM3.setText("Porcentaje");
        }
    }
    
    void Limpiar(){
        txtRucAgente.setText("");
        txtNombreAgente.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txttelefonoCell.setText("");
        txtTelefonoWsp.setText("");
        lblUbigeo.setText("Insertar dato con el boton ->");
        lblNombreUbi.setText("<- Insertar dato con el boton");
        txtEmail.setText("");
        txtFax.setText("");
        lblRucCliente.setText("Verifique si el Agente es cliente ->");
        txtClienteono.setText("");
        txtPagoTransporte.setText("");
        txtKgBasRep.setText("");
        txtKgAdi.setText("");
        cbPMCC.setSelectedIndex(0);
        lblPM.setText("");
        txtBasicoCCort.setText("");
        txtAdicionalCCorto.setText("");
        cbPMCL.setSelectedIndex(0);
        lblPM1.setText("");
        txtBasicoCLargo.setText("");
        txtAdicionalCLargo.setText("");
        lblPM2.setText("");
        txtSBasicoCCorto.setText("");
        txtSAdicionalCCorto.setText("");
        lblPM3.setText("");
        txtSBasicoCLargo.setText("");
        txtSAdicionalCLargo.setText("");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRucAgente = new javax.swing.JTextField();
        txtNombreAgente = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnverubigeo = new javax.swing.JButton();
        lblUbigeo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        txttelefonoCell = new javax.swing.JTextField();
        txtTelefonoWsp = new javax.swing.JTextField();
        cbTipoAgente = new javax.swing.JComboBox<>();
        lblNombreUbi = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPagoTransporte = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtKgBasRep = new javax.swing.JTextField();
        txtKgAdi = new javax.swing.JTextField();
        lblRucCliente = new javax.swing.JLabel();
        btnverclientes = new javax.swing.JButton();
        cbClienteono = new javax.swing.JComboBox<>();
        txtClienteono = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBasicoCCort = new javax.swing.JTextField();
        txtAdicionalCCorto = new javax.swing.JTextField();
        txtBasicoCLargo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAdicionalCLargo = new javax.swing.JTextField();
        cbPMCC = new javax.swing.JComboBox<>();
        lblPM = new javax.swing.JLabel();
        cbPMCL = new javax.swing.JComboBox<>();
        lblPM1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtSBasicoCCorto = new javax.swing.JTextField();
        txtSAdicionalCCorto = new javax.swing.JTextField();
        txtSBasicoCLargo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtSAdicionalCLargo = new javax.swing.JTextField();
        cbSPMCC1 = new javax.swing.JComboBox<>();
        lblPM2 = new javax.swing.JLabel();
        cbSPMCC2 = new javax.swing.JComboBox<>();
        lblPM3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMantAgente = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txtBuscarAgentes = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento Agentes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DatosB"));

        jLabel1.setText("Ruc :");

        jLabel2.setText("Nombre :");

        jLabel3.setText("Direccion :");

        jLabel4.setText("Telefono Fijo :");

        jLabel6.setText("Tipo :");

        txtNombreAgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAgenteActionPerformed(evt);
            }
        });

        jLabel8.setText("Ubigeo :");

        btnverubigeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgButton/ubicacionclara.png"))); // NOI18N
        btnverubigeo.setContentAreaFilled(false);
        btnverubigeo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgButton/ubicacion.png"))); // NOI18N
        btnverubigeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverubigeoActionPerformed(evt);
            }
        });

        lblUbigeo.setText("Insertar dato con el boton ->");

        jLabel9.setText("Email :");

        jLabel26.setText("Telefono Cell :");

        jLabel27.setText("Telefono Whatsapp :");

        jLabel7.setText("Fax :");

        txtFax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxActionPerformed(evt);
            }
        });

        cbTipoAgente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "M" }));
        cbTipoAgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoAgenteActionPerformed(evt);
            }
        });

        lblNombreUbi.setText("<- Insertar dato con el boton");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreAgente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDireccion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRucAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblUbigeo)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtTelefono))
                                .addGap(18, 18, 18)
                                .addComponent(btnverubigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttelefonoCell))
                                    .addComponent(lblNombreUbi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTipoAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoWsp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRucAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbTipoAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(txttelefonoCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoWsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(lblUbigeo, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(lblNombreUbi, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                    .addComponent(btnverubigeo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DatosCLI"));

        jLabel5.setText("Ruc Cliente :");

        jLabel10.setText("PagoTransporte :");

        txtPagoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoTransporteActionPerformed(evt);
            }
        });

        jLabel11.setText("Kg.Bas.Rep :");

        jLabel12.setText("S/. Kg.Adi :");

        lblRucCliente.setText("Verifique si el Agente es cliente ->");

        btnverclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgButton/clienteoscuro.png"))); // NOI18N
        btnverclientes.setContentAreaFilled(false);
        btnverclientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgButton/cliente.png"))); // NOI18N
        btnverclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverclientesActionPerformed(evt);
            }
        });

        cbClienteono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));
        cbClienteono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtPagoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblRucCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtKgBasRep, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtKgAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnverclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbClienteono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClienteono, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRucCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnverclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbClienteono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtKgBasRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtPagoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtKgAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblRucCliente.getAccessibleContext().setAccessibleDescription("Verifique si el Agente es cliente ->");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COMISIONES POR LLEGADA"));

        jLabel13.setText("Porc/Mont C.Corto :");

        jLabel14.setText("Basico C.Corto :");

        jLabel15.setText("Adicional C.Corto :");

        jLabel16.setText("Porc/Mont C.Largo :");

        jLabel17.setText("Basico C.Largo :");

        txtBasicoCCort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBasicoCCortActionPerformed(evt);
            }
        });

        jLabel18.setText("Adicional C.Largo :");

        cbPMCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "P" }));
        cbPMCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPMCCActionPerformed(evt);
            }
        });

        cbPMCL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "P" }));
        cbPMCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPMCLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAdicionalCCorto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtBasicoCCort, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(cbPMCC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAdicionalCLargo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(cbPMCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPM1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addComponent(txtBasicoCLargo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(cbPMCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBasicoCCort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtAdicionalCCorto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cbPMCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBasicoCLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtAdicionalCLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "COMISIONES POR SALIDAS"));

        jLabel20.setText("Porc/Mont C.Corto :");

        jLabel21.setText("Basico C.Corto :");

        jLabel22.setText("Adicional C.Corto :");

        jLabel23.setText("Porc/Mont C.Largo :");

        jLabel24.setText("Basico C.Largo :");

        txtSBasicoCCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSBasicoCCortoActionPerformed(evt);
            }
        });

        jLabel25.setText("Adicional C.Largo :");

        cbSPMCC1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "P" }));
        cbSPMCC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSPMCC1ActionPerformed(evt);
            }
        });

        cbSPMCC2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "P" }));
        cbSPMCC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSPMCC2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSBasicoCLargo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbSPMCC2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtSAdicionalCCorto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSBasicoCCorto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbSPMCC1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPM2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSAdicionalCLargo))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(cbSPMCC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtSBasicoCCorto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtSAdicionalCCorto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(cbSPMCC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtSBasicoCLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtSAdicionalCLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones"));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        tblMantAgente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMantAgente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblMantAgente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMantAgenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMantAgente);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Busqueda de Agentes"));

        txtBuscarAgentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarAgentesActionPerformed(evt);
            }
        });
        txtBuscarAgentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAgentesKeyReleased(evt);
            }
        });

        jLabel19.setText("Buscar Agentes :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarAgentes, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtBuscarAgentes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreAgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAgenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAgenteActionPerformed

    private void txtFaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxActionPerformed

    private void txtBasicoCCortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBasicoCCortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBasicoCCortActionPerformed

    private void txtSBasicoCCortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSBasicoCCortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSBasicoCCortoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int rpt = JOptionPane.showConfirmDialog(null, "Seguro que desea registrar?");
        if (JOptionPane.YES_OPTION == rpt) {
            aBean.setRucAgente(txtRucAgente.getText());
            aBean.setTipo(cbTipoAgente.getSelectedItem().toString());
            aBean.setNombre(txtNombreAgente.getText());
            aBean.setDireccion(txtDireccion.getText());
            aBean.setTelefono(Integer.parseInt(txtTelefono.getText()));
            aBean.setTelefonoCell(Integer.parseInt(txttelefonoCell.getText()));
            aBean.setTelefonoWsp(Integer.parseInt(txtTelefonoWsp.getText()));
            aBean.setRucCliente(cbClienteono.getSelectedItem().toString());
            aBean.setFax(txtFax.getText());
            aBean.setUbigeo(lblUbigeo.getText());
            aBean.setEmail(txtEmail.getText());
            aBean.setPagoTransporte(Double.parseDouble(txtPagoTransporte.getText()));
            aBean.setKgBasRep(Double.parseDouble(txtKgBasRep.getText()));
            aBean.setKgAdicional(Double.parseDouble(txtKgAdi.getText()));
            aBean.setLPorcMontoCCorto(cbPMCC.getSelectedItem().toString());
            aBean.setLBasicoCCorto(Double.parseDouble(txtBasicoCCort.getText()));
            aBean.setLAdicionalCCorto(Double.parseDouble(txtAdicionalCCorto.getText()));
            aBean.setLPorcMontoCLargo(cbPMCL.getSelectedItem().toString());
            aBean.setLBasicoCLargo(Double.parseDouble(txtBasicoCLargo.getText()));
            aBean.setLAdicionalCLargo(Double.parseDouble(txtAdicionalCLargo.getText()));

            aBean.setSPorcMontoCCorto(cbSPMCC1.getSelectedItem().toString());
            aBean.setSBasicoCCorto(Double.parseDouble(txtSBasicoCCorto.getText()));
            aBean.setSAdicionalCCorto(Double.parseDouble(txtSAdicionalCCorto.getText()));
            aBean.setSPorcMontoCLargo(cbSPMCC2.getSelectedItem().toString());
            aBean.setSBasicoCLargo(Double.parseDouble(txtSBasicoCLargo.getText()));
            aBean.setSAdicionalCLargo(Double.parseDouble(txtSAdicionalCLargo.getText()));

            aDao.registrarAgente(aBean);
            aDao.listarAgentesMantenimiento(txtBuscarAgentes.getText());
            Limpiar();
        } else if (JOptionPane.NO_OPTION == rpt) {
            JOptionPane.showMessageDialog(null, "No se realizaron ningun registro!");
        } else if (JOptionPane.CANCEL_OPTION == rpt) {

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbPMCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPMCCActionPerformed
        montoPorcentaje1();
    }//GEN-LAST:event_cbPMCCActionPerformed

    private void cbPMCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPMCLActionPerformed
        montoPorcentaje2();
    }//GEN-LAST:event_cbPMCLActionPerformed

    private void cbSPMCC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSPMCC1ActionPerformed
        montoPorcentaje3();
    }//GEN-LAST:event_cbSPMCC1ActionPerformed

    private void cbSPMCC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSPMCC2ActionPerformed
        montoPorcentaje4();
    }//GEN-LAST:event_cbSPMCC2ActionPerformed

    private void txtBuscarAgentesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAgentesKeyReleased
        aDao.listarAgentesMantenimiento(txtBuscarAgentes.getText().toString());
    }//GEN-LAST:event_txtBuscarAgentesKeyReleased

    Clientes c;
   
    private void btnverclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverclientesActionPerformed

        if (Principal.estacerrado(c)) {
            c = new Clientes();
            escritorio.add(c).setLocation(5, 350);
            c.cbClientes.setSelectedItem("Enviar a Agentes");
            c.toFront();
            c.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Clientes\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnverclientesActionPerformed
    Ubicacion u;
    private void btnverubigeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverubigeoActionPerformed
        if (Principal.estacerrado(u)) {
            u = new Ubicacion();
            escritorio.add(u).setLocation(750, 3);
            cbEnviar.setSelectedItem("Enviar a Agentes");
            u.toFront();
            u.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Ubicacion\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnverubigeoActionPerformed

    private void txtBuscarAgentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarAgentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarAgentesActionPerformed

    private void cbClienteonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteonoActionPerformed

        combo();
        
        
    }//GEN-LAST:event_cbClienteonoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        int rpt = JOptionPane.showConfirmDialog(null, "Seguro que desea actualizar?");
        if (rpt == JOptionPane.YES_OPTION) {
            aBean.setTipo(cbTipoAgente.getSelectedItem().toString());
            aBean.setNombre(txtNombreAgente.getText());
            aBean.setDireccion(txtDireccion.getText());
            aBean.setTelefono(Integer.parseInt(txtTelefono.getText()));
            aBean.setTelefonoCell(Integer.parseInt(txttelefonoCell.getText()));
            aBean.setTelefonoWsp(Integer.parseInt(txtTelefonoWsp.getText()));
            aBean.setRucCliente(cbClienteono.getSelectedItem().toString());
            aBean.setFax(txtFax.getText());
            aBean.setUbigeo(lblUbigeo.getText());
            aBean.setEmail(txtEmail.getText());
            aBean.setPagoTransporte(Double.parseDouble(txtPagoTransporte.getText()));
            aBean.setKgBasRep(Double.parseDouble(txtKgBasRep.getText()));
            aBean.setKgAdicional(Double.parseDouble(txtKgAdi.getText()));
            aBean.setLPorcMontoCCorto(cbPMCC.getSelectedItem().toString());
            aBean.setLBasicoCCorto(Double.parseDouble(txtBasicoCCort.getText()));
            aBean.setLAdicionalCCorto(Double.parseDouble(txtAdicionalCCorto.getText()));
            aBean.setLPorcMontoCLargo(cbPMCL.getSelectedItem().toString());
            aBean.setLBasicoCLargo(Double.parseDouble(txtBasicoCLargo.getText()));
            aBean.setLAdicionalCLargo(Double.parseDouble(txtAdicionalCLargo.getText()));

            aBean.setSPorcMontoCCorto(cbSPMCC1.getSelectedItem().toString());
            aBean.setSBasicoCCorto(Double.parseDouble(txtSBasicoCCorto.getText()));
            aBean.setSAdicionalCCorto(Double.parseDouble(txtSAdicionalCCorto.getText()));
            aBean.setSPorcMontoCLargo(cbSPMCC2.getSelectedItem().toString());
            aBean.setSBasicoCLargo(Double.parseDouble(txtSBasicoCLargo.getText()));
            aBean.setSAdicionalCLargo(Double.parseDouble(txtSAdicionalCLargo.getText()));
            aBean.setRucAgente(txtRucAgente.getText());

            aDao.actualizarAgente(aBean);
            aDao.listarAgentesMantenimiento(txtBuscarAgentes.getText());
            Limpiar();
        } else if (rpt == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No se realizaron cambios");
        } else if (rpt == JOptionPane.CANCEL_OPTION) {
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblMantAgenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantAgenteMouseClicked
        for (int i = 0; i < tblMantAgente.getRowCount(); i++) {
            int fila = tblMantAgente.getSelectedRow();

            this.txtRucAgente.setText(tblMantAgente.getValueAt(fila, 0).toString());
            this.cbTipoAgente.setSelectedItem(tblMantAgente.getValueAt(fila, 1).toString());
            this.txtNombreAgente.setText(tblMantAgente.getValueAt(fila, 2).toString());
            this.txtDireccion.setText(tblMantAgente.getValueAt(fila, 3).toString());
            this.txtTelefono.setText(tblMantAgente.getValueAt(fila, 4).toString());
            this.txttelefonoCell.setText(tblMantAgente.getValueAt(fila, 5).toString());
            this.txtTelefonoWsp.setText(tblMantAgente.getValueAt(fila, 6).toString());
            this.cbClienteono.setSelectedItem(tblMantAgente.getValueAt(fila, 7).toString());
            this.txtFax.setText(tblMantAgente.getValueAt(fila, 8).toString());
            this.lblUbigeo.setText(tblMantAgente.getValueAt(fila, 9).toString());
            
            
            String nombre = null;
                String dis = tblMantAgente.getValueAt(fila, 10).toString();
                String pro = tblMantAgente.getValueAt(fila, 11).toString();
                String dep = tblMantAgente.getValueAt(fila, 12).toString();
                nombre = dis + ' ' + pro + ' ' + dep;
                this.lblNombreUbi.setText(nombre);
            
            
            this.txtEmail.setText(tblMantAgente.getValueAt(fila, 13).toString());
            this.txtPagoTransporte.setText(tblMantAgente.getValueAt(fila, 14).toString());
            this.txtKgBasRep.setText(tblMantAgente.getValueAt(fila, 15).toString());
            this.txtKgAdi.setText(tblMantAgente.getValueAt(fila, 16).toString());
            this.cbPMCC.setSelectedItem(tblMantAgente.getValueAt(fila, 17).toString());
            this.txtBasicoCCort.setText(tblMantAgente.getValueAt(fila, 18).toString());
            this.txtAdicionalCCorto.setText(tblMantAgente.getValueAt(fila, 19).toString());
            this.cbPMCL.setSelectedItem(tblMantAgente.getValueAt(fila, 20).toString());
            this.txtBasicoCLargo.setText(tblMantAgente.getValueAt(fila, 21).toString());
            this.txtAdicionalCLargo.setText(tblMantAgente.getValueAt(fila, 22).toString());
            this.cbSPMCC1.setSelectedItem(tblMantAgente.getValueAt(fila, 23).toString());
            this.txtSBasicoCCorto.setText(tblMantAgente.getValueAt(fila, 24).toString());
            this.txtSAdicionalCCorto.setText(tblMantAgente.getValueAt(fila, 25).toString());
            this.cbSPMCC2.setSelectedItem(tblMantAgente.getValueAt(fila, 26).toString());
            this.txtSBasicoCLargo.setText(tblMantAgente.getValueAt(fila, 27).toString());
            this.txtSAdicionalCLargo.setText(tblMantAgente.getValueAt(fila, 28).toString());

        }
    }//GEN-LAST:event_tblMantAgenteMouseClicked

    private void txtPagoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoTransporteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rpt = JOptionPane.showConfirmDialog(null, "Seguro que desea elimnar este agente?");

        if (rpt == JOptionPane.YES_OPTION) {
            aDao.eliminarAgente(txtRucAgente.getText());
            aDao.listarAgentesMantenimiento(txtBuscarAgentes.getText());
            Limpiar();
        } else if (rpt == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No se han realizado cambios");
        } else if (rpt == JOptionPane.CANCEL_OPTION) {
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cbTipoAgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoAgenteActionPerformed
    
         comboTipoAgente();        
    }//GEN-LAST:event_cbTipoAgenteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnverclientes;
    private javax.swing.JButton btnverubigeo;
    public static javax.swing.JComboBox<String> cbClienteono;
    private javax.swing.JComboBox<String> cbPMCC;
    private javax.swing.JComboBox<String> cbPMCL;
    private javax.swing.JComboBox<String> cbSPMCC1;
    private javax.swing.JComboBox<String> cbSPMCC2;
    private javax.swing.JComboBox<String> cbTipoAgente;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblNombreUbi;
    private javax.swing.JLabel lblPM;
    private javax.swing.JLabel lblPM1;
    private javax.swing.JLabel lblPM2;
    private javax.swing.JLabel lblPM3;
    public static javax.swing.JLabel lblRucCliente;
    private javax.swing.JLabel lblTipo;
    public static javax.swing.JLabel lblUbigeo;
    public static javax.swing.JTable tblMantAgente;
    private javax.swing.JTextField txtAdicionalCCorto;
    private javax.swing.JTextField txtAdicionalCLargo;
    private javax.swing.JTextField txtBasicoCCort;
    private javax.swing.JTextField txtBasicoCLargo;
    private javax.swing.JTextField txtBuscarAgentes;
    public static javax.swing.JLabel txtClienteono;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtKgAdi;
    private javax.swing.JTextField txtKgBasRep;
    private javax.swing.JTextField txtNombreAgente;
    private javax.swing.JTextField txtPagoTransporte;
    private javax.swing.JTextField txtRucAgente;
    private javax.swing.JTextField txtSAdicionalCCorto;
    private javax.swing.JTextField txtSAdicionalCLargo;
    private javax.swing.JTextField txtSBasicoCCorto;
    private javax.swing.JTextField txtSBasicoCLargo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoWsp;
    private javax.swing.JTextField txttelefonoCell;
    // End of variables declaration//GEN-END:variables
}
