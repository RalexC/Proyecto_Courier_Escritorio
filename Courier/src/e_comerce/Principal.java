/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_comerce;

import Bean.PorcionTerrestreBean;
import e_comerce.Mantenimiento.ManAgente;
import e_comerce.Mantenimiento.ManCliente;
import e_comerce.Mantenimiento.ManPorcionTerrestre;
import e_comerce.Mantenimiento.ManRutas;
import e_comerce.Mantenimiento.ManTarifas;
import e_comerce.Mantenimiento.MantCentroCostos;
import e_comerce.Transacciones.Ordenes;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ralex
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH | JFrame.MAXIMIZED_HORIZ | JFrame.MAXIMIZED_VERT);
        txtFechaPrincipal.setText(fechaactual());
    }

    public static boolean cerra = false;
    public static boolean cerra1 = false;

    public static boolean estacerrado(Object obj) {
        JInternalFrame[] activos = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
                cerra = false;
                cerra1 = false;
            }
            i++;
        }
        return cerrado;
    }
    public static String fechaactual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss a");
        return formatofecha.format(fecha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        escritorio = new Util.Escritorio();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JLabel();
        txtFechaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario Conectado :");

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));

        txtFechaPrincipal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFechaPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFechaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/cerrarsesion.png"))); // NOI18N
        jMenuItem2.setText("Cerrar Sesion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/Salir.png"))); // NOI18N
        jMenuItem3.setText("Salir del Sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tablas");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/cliente.png"))); // NOI18N
        jMenuItem4.setText("Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/agente.png"))); // NOI18N
        jMenuItem5.setText("Agentes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/rutas.png"))); // NOI18N
        jMenuItem7.setText("Rutas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/ubicacion.png"))); // NOI18N
        jMenuItem9.setText("Ubicacion");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/Centrocosto.png"))); // NOI18N
        jMenuItem10.setText("CentroCosto");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/PorcionTerrestre.png"))); // NOI18N
        jMenuItem11.setText("PorcionTerrestre");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem18.setText("Tarifas");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem18);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Mantenimiento");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/mant1.png"))); // NOI18N
        jMenuItem12.setText("Mant.Agente");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/mant2.png"))); // NOI18N
        jMenuItem13.setText("Mant.Clientes");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/mant3.png"))); // NOI18N
        jMenuItem14.setText("Mant.Rutas");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/mant4.png"))); // NOI18N
        jMenuItem16.setText("Mant.CentroCostos");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPrincipal/mant5.png"))); // NOI18N
        jMenuItem17.setText("Mant.PorcionTerrestre");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Transacciones");

        jMenuItem6.setText("Tarifas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem8.setText("Ordenes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Login al = new Login();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    Clientes c;
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        if (estacerrado(c)) {
            c = new Clientes();
            escritorio.add(c).setLocation(50, 10);
            c.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Clientes\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    Factura f;
    Aagente a;
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if (estacerrado(a)) {
            a = new Aagente();
            escritorio.add(a).setLocation(25, 15);
            a.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Agentes\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    Ruta r;
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (estacerrado(r)) {
            r = new Ruta();
            escritorio.add(r).setLocation(250, 3);
            r.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Rutas\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    Paquete p;
    Ubicacion u;
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if (estacerrado(u)) {
            u = new Ubicacion();
            escritorio.add(u).setLocation(250, 3);
            u.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Paquete\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    CentroCostos cc;
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if (estacerrado(cc)) {
            cc = new CentroCostos();
            escritorio.add(cc).setLocation(250, 3);
            cc.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Centro de Costos\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    ManAgente ma;
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        if (estacerrado(ma)) {
            ma = new ManAgente();
            escritorio.add(ma).setLocation(-10, 3);
            ma.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Paquete\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    PorcionTerrestre pt;
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if (estacerrado(pt)) {
            pt = new PorcionTerrestre();
            escritorio.add(pt).setLocation(250, 3);
            pt.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana PorcionTerrestre\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    ManPorcionTerrestre mpt;
    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        if (estacerrado(mpt)) {
            mpt = new ManPorcionTerrestre();
            escritorio.add(mpt).setLocation(250, 3);
            mpt.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana ManPorcionTerrestre\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed
    ManCliente mc;
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        if (estacerrado(mc)) {
            mc = new ManCliente();
            escritorio.add(mc).setLocation(15, 3);
            mc.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Mantenimiento Cliente\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    ManRutas mr;
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        if (estacerrado(mr)) {
            mr = new ManRutas();
            escritorio.add(mr).setLocation(250, 3);
            mr.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana ManRutas Cliente\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    MantCentroCostos mcc;
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        if (estacerrado(mcc)) {
            mcc = new MantCentroCostos();
            escritorio.add(mcc).setLocation(250, 3);
            mcc.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Mantenimiento MantCentroCostos\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    ManTarifas tf;
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        if (estacerrado(tf)) {
            tf = new ManTarifas();
            escritorio.add(tf).setLocation(250, 3);
            tf.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Mantenimiento Tarifas\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    Tarifas t;
    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        if (estacerrado(t)) {
            t = new Tarifas();
            escritorio.add(t).setLocation(250, 3);
            t.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Mantenimiento Tarifas\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    
    Ordenes o;
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        if (estacerrado(o)) {
            o = new Ordenes();
            escritorio.add(o).setLocation(250, 3);
            o.show();
        } else {
            JOptionPane.showMessageDialog(this, "La ventana Mantenimiento Ordenes\n ya esta abierta !!!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static Util.Escritorio escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel panel;
    private javax.swing.JLabel txtFechaPrincipal;
    public static javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}
