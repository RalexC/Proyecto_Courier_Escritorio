/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_comerce.Mantenimiento;

import Bean.PorcionTerrestreBean;
import Dao.PorcionTerrestreDao;
import e_comerce.Principal;
import static e_comerce.Principal.escritorio;
import e_comerce.Ubicacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ralex
 */
public class ManPorcionTerrestre extends javax.swing.JInternalFrame {

    PorcionTerrestreBean ptBean = new PorcionTerrestreBean();
    PorcionTerrestreDao ptDao = new PorcionTerrestreDao();
    DefaultTableModel modelo = new DefaultTableModel();
    int rpt;

    public ManPorcionTerrestre() {
        initComponents();
        modelo.addColumn("Codigo");
        modelo.addColumn("Ubigeo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("RegionLocal");
        modelo.addColumn("PorcenMonto");
        modelo.addColumn("importe");
        modelo.addColumn("Observacion");
        modelo.addColumn("MontoComAGT");
        tblMantenimientoPT.setModel(modelo);
        ptDao.ListarMantenimientoPT();
        txtImporte.setText("0.0");
        txtMonComAgt.setText("0.0");
    }

    private void Limpiar() {
        lblUbigeo.setText("");
        txtDescripcion.setText("");
        cbRegionLocal.setSelectedItem("Seleccione");
        cbPorcMonto.setSelectedItem("Seleccione");
        txtImporte.setText("0.0");
        txaObservacion.setText("");
        txtMonComAgt.setText("0.0");
        lblCodigo.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMantenimientoPT = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaObservacion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        lblUbigeo = new javax.swing.JLabel();
        btnverUigeo = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        cbRegionLocal = new javax.swing.JComboBox<>();
        cbPorcMonto = new javax.swing.JComboBox<>();
        txtImporte = new javax.swing.JTextField();
        txtMonComAgt = new javax.swing.JTextField();
        lblRL = new javax.swing.JLabel();
        lblPM = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscarPorcionTerrestre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento Porcion Terrestre");

        tblMantenimientoPT.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMantenimientoPT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMantenimientoPTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMantenimientoPT);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Porcion Terrestre"));

        jLabel1.setText("Ubigeo :");

        jLabel2.setText("Descripcion :");

        jLabel3.setText("Region/ Local :");

        jLabel4.setText("Porcentaje / Monto :");

        jLabel5.setText("Importe :");

        jLabel6.setText("Observacion :");

        txaObservacion.setColumns(20);
        txaObservacion.setRows(5);
        jScrollPane2.setViewportView(txaObservacion);

        jLabel7.setText("Monto Com.Agt :");

        btnverUigeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgButton/ubicacionclara.png"))); // NOI18N
        btnverUigeo.setContentAreaFilled(false);
        btnverUigeo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgButton/ubicacion.png"))); // NOI18N
        btnverUigeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverUigeoActionPerformed(evt);
            }
        });

        cbRegionLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "R", "L" }));
        cbRegionLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRegionLocalActionPerformed(evt);
            }
        });

        cbPorcMonto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "P", "M" }));
        cbPorcMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPorcMontoActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPorcMonto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbRegionLocal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnverUigeo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(lblRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtMonComAgt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUbigeo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnverUigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbRegionLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(cbPorcMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonComAgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones"));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
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

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Busqueda"));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setText("Buscar Porcion Terrestre :");

        txtBuscarPorcionTerrestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPorcionTerrestreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarPorcionTerrestre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBuscarPorcionTerrestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        rpt = JOptionPane.showConfirmDialog(null, "Seguro que desea Registrar?");

        if (rpt == JOptionPane.YES_OPTION) {
            ptBean.setUbigeo(lblUbigeo.getText());
            ptBean.setDescripcion(txtDescripcion.getText());
            ptBean.setRegionLocal(cbRegionLocal.getSelectedItem().toString());
            ptBean.setPorcenMonto(cbPorcMonto.getSelectedItem().toString());
            ptBean.setImporte(Double.parseDouble(txtImporte.getText()));
            ptBean.setObservacion(txaObservacion.getText());
            ptBean.setMontoComAGT(Double.parseDouble(txtMonComAgt.getText()));

            ptDao.registrar_Mant_Ruta(ptBean);
            ptDao.ListarMantenimientoPT();
            Limpiar();
        } else if (rpt == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No se a realizado ningun registro.");
        } else if (rpt == JOptionPane.CANCEL_OPTION) {

        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbRegionLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRegionLocalActionPerformed
        if (isSelected == cbRegionLocal.getSelectedItem().equals("Seleccione")) {
            lblRL.setText("");
        } else if (isSelected == cbRegionLocal.getSelectedItem().equals("R")) {
            lblRL.setText("Regional");
        } else if (isSelected == cbRegionLocal.getSelectedItem().equals("L")) {
            lblRL.setText("Local");
        }
    }//GEN-LAST:event_cbRegionLocalActionPerformed

    private void cbPorcMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPorcMontoActionPerformed
        if (isSelected == cbPorcMonto.getSelectedItem().equals("Seleccione")) {
            lblPM.setText("");
        } else if (isSelected == cbPorcMonto.getSelectedItem().equals("M")) {
            lblPM.setText("Monto");
        } else if (isSelected == cbPorcMonto.getSelectedItem().equals("P")) {
            lblPM.setText("Porcentaje");
        }
    }//GEN-LAST:event_cbPorcMontoActionPerformed

    private void txtBuscarPorcionTerrestreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorcionTerrestreKeyReleased
        ptDao.listarMantenimientoPT(txtBuscarPorcionTerrestre.getText());
    }//GEN-LAST:event_txtBuscarPorcionTerrestreKeyReleased

    Ubicacion u;
    private void btnverUigeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverUigeoActionPerformed
        if (Principal.estacerrado(u)) {
            u = new Ubicacion();
            escritorio.add(u).setLocation(13, 3);
            u.toFront();
            u.setVisible(true);
            u.cbEnviar.setSelectedItem("Enviar a Porcion Terrestre");
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Ubigeo\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnverUigeoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        rpt = JOptionPane.showConfirmDialog(null, "Seguro que desea Actualizar?");

        if (rpt == JOptionPane.YES_OPTION) {
            ptBean.setUbigeo(lblUbigeo.getText());
            ptBean.setDescripcion(txtDescripcion.getText());
            ptBean.setRegionLocal(cbRegionLocal.getSelectedItem().toString());
            ptBean.setPorcenMonto(cbPorcMonto.getSelectedItem().toString());
            ptBean.setImporte(Double.parseDouble(txtImporte.getText()));
            ptBean.setObservacion(txaObservacion.getText());
            ptBean.setMontoComAGT(Double.parseDouble(txtMonComAgt.getText()));
            ptBean.setCodPorcionT(Integer.parseInt(lblCodigo.getText().toString()));
            ptDao.ActualizarPT(ptBean);
            ptDao.ListarMantenimientoPT();
            Limpiar();
        } else if (rpt == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "No sea realizado ninguna actualizacion!");
        } else if (rpt == JOptionPane.CANCEL_OPTION) {

        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        rpt = JOptionPane.showConfirmDialog(null, "Seguro que desea Eliminar?");

        if (rpt == JOptionPane.YES_OPTION) {
            ptDao.eliminarPT(lblCodigo.getText());
            ptDao.ListarMantenimientoPT();
            Limpiar();
        } else if (rpt == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No sea eliminado ningun registro!");
        } else if (rpt == JOptionPane.CANCEL_OPTION) {

        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblMantenimientoPTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMantenimientoPTMouseClicked
        for (int i = 0; i < tblMantenimientoPT.getRowCount(); i++) {
            int fila = tblMantenimientoPT.getSelectedRow();
            lblCodigo.setText(tblMantenimientoPT.getValueAt(fila, 0).toString());
            lblUbigeo.setText(tblMantenimientoPT.getValueAt(fila, 1).toString());

            txtDescripcion.setText(tblMantenimientoPT.getValueAt(fila, 2).toString());
            cbRegionLocal.setSelectedItem(tblMantenimientoPT.getValueAt(fila, 3).toString());
            cbPorcMonto.setSelectedItem(tblMantenimientoPT.getValueAt(fila, 4));
            txtImporte.setText(tblMantenimientoPT.getValueAt(fila, 5).toString());
            txaObservacion.setText(tblMantenimientoPT.getValueAt(fila, 6).toString());
            txtMonComAgt.setText(tblMantenimientoPT.getValueAt(fila, 7).toString());

        }
    }//GEN-LAST:event_tblMantenimientoPTMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnverUigeo;
    private javax.swing.JComboBox<String> cbPorcMonto;
    private javax.swing.JComboBox<String> cbRegionLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPM;
    private javax.swing.JLabel lblRL;
    public static javax.swing.JLabel lblUbigeo;
    public static javax.swing.JTable tblMantenimientoPT;
    private javax.swing.JTextArea txaObservacion;
    private javax.swing.JTextField txtBuscarPorcionTerrestre;
    public static javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtMonComAgt;
    // End of variables declaration//GEN-END:variables
}
