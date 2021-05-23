/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolineablanca;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis Montoya
 */
public class LBDesktop extends javax.swing.JFrame {

    /**
     * Creates new form LBDesktop
     */
    public LBDesktop() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Linea Blanca");
        if(InicioSesion.estadoUsuario.equals("Inactivo")){
            btnInternal2.setEnabled(false);
            btnInternal3.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated">
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("fondo2.jpg"));
        Image img = icon.getImage();
        desktopInicio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(), getHeight(),this);
            }
        };
        btnSalir = new javax.swing.JButton();
        btnInternal1 = new javax.swing.JButton();
        btnInternal2 = new javax.swing.JButton();
        btnInternal3 = new javax.swing.JButton();
        btnInternal4 = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        desktopInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSalir.setBackground(new java.awt.Color(204, 0, 51));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectolineablanca/shutdown.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnInternal1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInternal1.setForeground(new java.awt.Color(12, 38, 38));
        btnInternal1.setText("Consultar almacen");
        btnInternal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternal1ActionPerformed(evt);
            }
        });

        btnInternal2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInternal2.setForeground(new java.awt.Color(12, 38, 38));
        btnInternal2.setText("Registrar producto");
        btnInternal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternal2ActionPerformed(evt);
            }
        });

        btnInternal3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInternal3.setForeground(new java.awt.Color(12, 38, 38));
        btnInternal3.setText("Registrar pedido");
        btnInternal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternal3ActionPerformed(evt);
            }
        });

        btnInternal4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInternal4.setForeground(new java.awt.Color(12, 38, 38));
        btnInternal4.setText("Consultar pedidos");
        btnInternal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternal4ActionPerformed(evt);
            }
        });

        btnReporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(12, 38, 38));
        btnReporte.setText("Reportes");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        desktopInicio.setLayer(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopInicio.setLayer(btnInternal1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopInicio.setLayer(btnInternal2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopInicio.setLayer(btnInternal3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopInicio.setLayer(btnInternal4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopInicio.setLayer(btnReporte, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopInicioLayout = new javax.swing.GroupLayout(desktopInicio);
        desktopInicio.setLayout(desktopInicioLayout);
        desktopInicioLayout.setHorizontalGroup(
            desktopInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopInicioLayout.createSequentialGroup()
                        .addComponent(btnInternal2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInternal3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(btnInternal1)
                        .addGap(18, 18, 18)
                        .addComponent(btnInternal4))
                    .addGroup(desktopInicioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        desktopInicioLayout.setVerticalGroup(
            desktopInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addGroup(desktopInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInternal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInternal2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInternal3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInternal4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopInicio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopInicio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInternal1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInternal1ActionPerformed
        // TODO add your handling code here:
        AlmacenConAct internal1 = new AlmacenConAct();
        desktopInicio.add(internal1);
        internal1.show();
    }// GEN-LAST:event_btnInternal1ActionPerformed

    private void btnInternal2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInternal2ActionPerformed
        // TODO add your handling code here Registrar productos:
        RegistroProducto internal2 = new RegistroProducto();
        desktopInicio.add(internal2);
        internal2.show();
    }// GEN-LAST:event_btnInternal2ActionPerformed

    private void btnInternal3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInternal3ActionPerformed
        // TODO add your handling code here:
        IngresoPedido internal3 = new IngresoPedido();
        desktopInicio.add(internal3);
        internal3.show();
    }// GEN-LAST:event_btnInternal3ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new InicioSesion().setVisible(true);
    }// GEN-LAST:event_btnSalirActionPerformed

    private void btnInternal4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInternal4ActionPerformed
        // TODO add your handling code here:
        ConsultaPedido internal4 = new ConsultaPedido();
        desktopInicio.add(internal4);
        internal4.show();
    }// GEN-LAST:event_btnInternal4ActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        Reporte internal5 = new Reporte();
        desktopInicio.add(internal5);
        internal5.show();
    }// GEN-LAST:event_btnReporteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold>
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LBDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LBDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LBDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LBDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LBDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInternal1;
    private javax.swing.JButton btnInternal2;
    private javax.swing.JButton btnInternal3;
    private javax.swing.JButton btnInternal4;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JDesktopPane desktopInicio;
    // End of variables declaration//GEN-END:variables
}
