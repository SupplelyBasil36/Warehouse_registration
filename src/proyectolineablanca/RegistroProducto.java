/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolineablanca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Montoya
 */
public class RegistroProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroProducto
     */
    /**************************************************************
     * VARIABLES
     ***********************************************************/
    private final String conexion = "jdbc:mysql://localhost/linea_blanca";
    private final String user = "root";
    private final String pass = "";
    private String nuevo;
    private int cantidad = 0;
    float precio = 0;

    /**********************************************************************************************************************************/
    public RegistroProducto() {
        initComponents();
        txtRCantidad.setEditable(false);
        txtRPrecio.setEditable(false);
        txtRUbicacion.setEditable(false);
        btnRegistrar.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRUbicacion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        comboBModelo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR PRODUCTO EN ALMACEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Emoji", 3, 20), new java.awt.Color(0, 51, 51))); // NOI18N

        jLabel1.setText("Ingresa modelo:");

        txtRModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRModeloActionPerformed(evt);
            }
        });
        txtRModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRModeloKeyReleased(evt);
            }
        });

        jLabel2.setText("Ingresa cantidad:");

        txtRCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRCantidadActionPerformed(evt);
            }
        });
        txtRCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRCantidadKeyReleased(evt);
            }
        });

        jLabel3.setText("Ingresa precio:");

        txtRPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRPrecioActionPerformed(evt);
            }
        });
        txtRPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRPrecioKeyReleased(evt);
            }
        });

        jLabel4.setText("Ingresa ubicacion:");

        txtRUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUbicacionActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        comboBModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EST", "HOR" }));

        jLabel5.setText("Asigna un numero de modelo: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtRUbicacion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboBModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrar)
                                    .addComponent(txtRModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRModeloKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 109) {
            txtRModelo.setText("");
        }
    }//GEN-LAST:event_txtRModeloKeyReleased

    private void txtRCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRCantidadKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 109) {
            txtRCantidad.setText("");
        }
    }//GEN-LAST:event_txtRCantidadKeyReleased

    private void txtRPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRPrecioKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 109) {
            txtRPrecio.setText("");
        }
    }//GEN-LAST:event_txtRPrecioKeyReleased

    private void txtRModeloActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        nuevo = String.valueOf(comboBModelo.getSelectedItem()) + txtRModelo.getText();
        try (Connection conn = DriverManager.getConnection(conexion, user, pass)) {
            Statement sts = conn.createStatement();
            sts.execute("SELECT * FROM almacen WHERE modelo = '" + nuevo + "';");
            ResultSet rs = sts.getResultSet();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Este modelo ya existe");
            } else {
                txtRCantidad.setEditable(true);
                txtRCantidad.requestFocus();
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.getNextException());
        }
    }

    private void txtRCantidadActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            cantidad = Integer.parseInt(txtRCantidad.getText());
            txtRPrecio.setEditable(true);
            txtRPrecio.requestFocus();
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Ingrese numero por favor");
        }
    }

    private void txtRPrecioActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            precio = Float.parseFloat(txtRPrecio.getText());
            txtRUbicacion.setEditable(true);
            txtRUbicacion.requestFocus();
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Ingrese numero por favor");
        }
    }

    private void txtRUbicacionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        btnRegistrar.setEnabled(true);
        btnRegistrar.requestFocus();
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try (Connection conn = DriverManager.getConnection(conexion, user, pass)) {
            Statement sts = conn.createStatement();
            sts.addBatch("INSERT INTO almacen (modelo, cant_Exist, precio_uni, ubicacion, estado) VALUES ('"
                    + nuevo + "'," + Integer.parseInt(txtRCantidad.getText()) + ","
                    + Float.parseFloat(txtRPrecio.getText()) + ",'" + txtRUbicacion.getText() + "', 'Activo')");
            sts.executeBatch();
            conn.close();
            JOptionPane.showMessageDialog(null, "El producto se ha registrado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos por favor");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboBModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRCantidad;
    private javax.swing.JTextField txtRModelo;
    private javax.swing.JTextField txtRPrecio;
    private javax.swing.JTextField txtRUbicacion;
    // End of variables declaration//GEN-END:variables
}
