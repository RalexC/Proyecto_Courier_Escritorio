/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_comerce;

import Dao.PorcionTerrestreDao;
import e_comerce.Transacciones.Ordenes;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ralex
 */
public class PorcionTerrestre extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    PorcionTerrestreDao ptDao = new PorcionTerrestreDao();

    public PorcionTerrestre() {
        initComponents();
        modelo.addColumn("Codigo");
        modelo.addColumn("Ubigeo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("RegionLocal");
        modelo.addColumn("PorcenMonto");
        modelo.addColumn("importe");
        modelo.addColumn("Observacion");
        modelo.addColumn("MontoComAGT");
        tblPorcionTerrestre.setModel(modelo);
        ptDao.Listar();
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
        tblPorcionTerrestre = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarPT = new javax.swing.JTextField();
        cbenviar = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Porcion Terrestre");
        setToolTipText("");

        tblPorcionTerrestre.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPorcionTerrestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPorcionTerrestreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPorcionTerrestre);

        jLabel1.setText("Porcion Terrestre");

        txtBuscarPT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPTKeyReleased(evt);
            }
        });

        cbenviar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Enviar a Origen PT", "Enviar a Destino PT" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarPT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cbenviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbenviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarPTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPTKeyReleased
        ptDao.listarPT(txtBuscarPT.getText());
    }//GEN-LAST:event_txtBuscarPTKeyReleased

    private void tblPorcionTerrestreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPorcionTerrestreMouseClicked
        if (isSelected == cbenviar.getSelectedItem().equals("Enviar a Origen PT")) {
            for (int i = 0; i < tblPorcionTerrestre.getRowCount(); i++) {
                int fila = tblPorcionTerrestre.getSelectedRow();
                Ordenes.lblCOrigen.setText(tblPorcionTerrestre.getValueAt(fila, 1).toString());
                Ordenes.lblNomOrigen.setText(tblPorcionTerrestre.getValueAt(fila, 2).toString());
                Ordenes.lblImporte.setText(tblPorcionTerrestre.getValueAt(fila, 5).toString());
                Ordenes.lblImporteConAgnt.setText(tblPorcionTerrestre.getValueAt(fila, 7).toString());

            }
        } else if (isSelected == cbenviar.getSelectedItem().equals("Enviar a Destino PT")) {
            for (int i = 0; i < tblPorcionTerrestre.getRowCount(); i++) {
                int fila = tblPorcionTerrestre.getSelectedRow();
                Ordenes.lblCodDestino.setText(tblPorcionTerrestre.getValueAt(fila, 1).toString());
                Ordenes.lblNomDestino.setText(tblPorcionTerrestre.getValueAt(fila, 2).toString());
                Ordenes.lblImporteDestino.setText(tblPorcionTerrestre.getValueAt(fila, 5).toString());
                Ordenes.lblImporteconAgtDestino.setText(tblPorcionTerrestre.getValueAt(fila, 7).toString());

            }
        }
    }//GEN-LAST:event_tblPorcionTerrestreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbenviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblPorcionTerrestre;
    private javax.swing.JTextField txtBuscarPT;
    // End of variables declaration//GEN-END:variables
}
