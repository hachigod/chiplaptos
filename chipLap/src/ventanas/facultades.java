/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.control;
import clases.validar;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class facultades extends javax.swing.JDialog {

         /**
          * Creates new form facultades
          */
         public facultades(java.awt.Frame parent, boolean modal) {
                  super(parent, modal);
                  setTitle("facultad");
                  initComponents();
                  setLocationRelativeTo(null);
                  control.fillTable2(jTable1, "select * from facultad");

         }

         /**
          * This method is called from within the constructor to
          * initialize the form. WARNING: Do NOT modify this code. The
          * content of this method is always regenerated by the Form
          * Editor.
          */
         @SuppressWarnings("unchecked")
         // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
         private void initComponents() {

                  jPanel1 = new javax.swing.JPanel();
                  jTextField1 = new javax.swing.JTextField();
                  jLabel2 = new javax.swing.JLabel();
                  btn_crear = new javax.swing.JButton();
                  btn_actualizar = new javax.swing.JButton();
                  btn_borrar = new javax.swing.JButton();
                  btn_cancelar = new javax.swing.JButton();
                  btn_salir = new javax.swing.JButton();
                  jPanel2 = new javax.swing.JPanel();
                  jScrollPane1 = new javax.swing.JScrollPane();
                  jTable1 = new javax.swing.JTable();
                  jLabel1 = new javax.swing.JLabel();

                  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                  jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("datos de las  facultades"));

                  jTextField1.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jTextField1ActionPerformed(evt);
                           }
                  });
                  jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
                           public void keyPressed(java.awt.event.KeyEvent evt) {
                                    jTextField1KeyPressed(evt);
                           }
                           public void keyReleased(java.awt.event.KeyEvent evt) {
                                    jTextField1KeyReleased(evt);
                           }
                           public void keyTyped(java.awt.event.KeyEvent evt) {
                                    jTextField1KeyTyped(evt);
                           }
                  });

                  jLabel2.setText("facultad");

                  btn_crear.setText("crear");
                  btn_crear.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_crearActionPerformed(evt);
                           }
                  });

                  btn_actualizar.setText("actualizar");
                  btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_actualizarActionPerformed(evt);
                           }
                  });

                  btn_borrar.setText("eliminar");
                  btn_borrar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_borrarActionPerformed(evt);
                           }
                  });

                  btn_cancelar.setText("cancelar");
                  btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_cancelarActionPerformed(evt);
                           }
                  });

                  btn_salir.setText("salir");
                  btn_salir.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_salirActionPerformed(evt);
                           }
                  });

                  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                  jPanel1.setLayout(jPanel1Layout);
                  jPanel1Layout.setHorizontalGroup(
                           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(54, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                      .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                      .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                      .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                      .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                      .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                      .addComponent(jLabel2)
                                                      .addGap(44, 44, 44)
                                                      .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(31, 31, 31))
                  );
                  jPanel1Layout.setVerticalGroup(
                           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(btn_crear)
                                             .addComponent(btn_actualizar)
                                             .addComponent(btn_borrar)
                                             .addComponent(btn_cancelar)
                                             .addComponent(btn_salir))
                                    .addContainerGap(13, Short.MAX_VALUE))
                  );

                  jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                  jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    jTable1MouseClicked(evt);
                           }
                           public void mousePressed(java.awt.event.MouseEvent evt) {
                                    jTable1MousePressed(evt);
                           }
                  });
                  jScrollPane1.setViewportView(jTable1);

                  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                  jPanel2.setLayout(jPanel2Layout);
                  jPanel2Layout.setHorizontalGroup(
                           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1)
                                    .addContainerGap())
                  );
                  jPanel2Layout.setVerticalGroup(
                           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                  );

                  jLabel1.setText("registrar facultades");

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                  getContentPane().setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(layout.createSequentialGroup()
                                                      .addGap(308, 308, 308)
                                                      .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(layout.createSequentialGroup()
                                                      .addGap(31, 31, 31)
                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addContainerGap(19, Short.MAX_VALUE))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addContainerGap(16, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

         private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_jTextField1ActionPerformed

         private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
                  // TODO add your handling code here:
                  if (jTable1.getSelectedRowCount() != 0) {
                           String facu = jTextField1.getText().trim();
                           String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                           if (facu.length() != 0) {

                                    if (JOptionPane.showConfirmDialog(btn_actualizar, "desea actualizar la facultad "
                                            + jTable1.getValueAt(jTable1.getSelectedRow(), 1) + " por :\n " + jTextField1.getText().trim()) == 0) {
                                             String sql = String.format("call actualizar_facultad(%s,'%s')", id, facu);
                                             int resp = control.update(sql);

                                             if (resp != 0) {
                                                      control.fillTable2(jTable1, "select * from facultad");
                                                      JOptionPane.showMessageDialog(btn_crear, "se actualizo correctamente");

                                             } else {
                                                     // JOptionPane.showMessageDialog(btn_crear, "la facultad ya se encuentra registrada", "alerta", JOptionPane.WARNING_MESSAGE);
                                             }

                                    }

                           } else {
                                    JOptionPane.showMessageDialog(btn_crear, "ingrese la facultad", "alerta", JOptionPane.WARNING_MESSAGE);
                           }
                  } else {
                           JOptionPane.showMessageDialog(btn_crear, "seleccione una fila de la tabla", "alerta", JOptionPane.WARNING_MESSAGE);
                  }
         }//GEN-LAST:event_btn_actualizarActionPerformed

         private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
                  // TODO add your handling code here:
                  
                  if(JOptionPane.showConfirmDialog(btn_salir, "¿desea abandonar la aplicacion?")==0){
                           dispose();
                  }
         }//GEN-LAST:event_btn_salirActionPerformed

         private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
                  // TODO add your handling code here:

                  String facu = jTextField1.getText().trim();
                  if (facu.length() != 0) {
                           String sql = String.format("call insertar_facultad('%s')", facu);
                           int resp = control.update(sql);

                           if (resp != 0) {
                                    control.fillTable2(jTable1, "select * from facultad");
                                    JOptionPane.showMessageDialog(btn_crear, "se ingreso correctamente");

                           } else {
                                 //   JOptionPane.showMessageDialog(btn_crear, "la facultad ya se encuentra registrada", "alerta", JOptionPane.WARNING_MESSAGE);
                           }

                  } else {
                           JOptionPane.showMessageDialog(btn_crear, "ingrese  la facultad x favor");

         }//GEN-LAST:event_btn_crearActionPerformed
         }
         private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
                  // TODO add your handling code here: 

         }//GEN-LAST:event_jTextField1KeyPressed

         private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

         }//GEN-LAST:event_jTextField1KeyReleased

         private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
                  // TODO add your handling code here:
                  validar.SoloLetras(evt);
         }//GEN-LAST:event_jTextField1KeyTyped

         private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
                  // TODO add your handling code here:
         }//GEN-LAST:event_jTable1MouseClicked

         private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
                  // TODO add your handling code here:
                  jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
         }//GEN-LAST:event_jTable1MousePressed

         private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
                  // TODO add your handling code here:
                  if (jTable1.getSelectedRowCount() != 0) {
                           if (JOptionPane.showConfirmDialog(btn_borrar, "¿desea eliminar la facultad " + jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString()) == 0) {

                                    String sql = String.format("delete from facultad where idfacultad =%s", jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                                    System.out.println(sql);
                                    int res = control.update(sql);
                                    if (res != 0) {
                                             control.fillTable2(jTable1, "select * from facultad");
                                             JOptionPane.showMessageDialog(btn_borrar, "se borró correctamente");
                                    }
                           }

                  } else {
                           JOptionPane.showMessageDialog(btn_borrar, "seleccione una fila de la tabla", "alerta", JOptionPane.WARNING_MESSAGE);
                  }
         }//GEN-LAST:event_btn_borrarActionPerformed

         private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
                  // TODO add your handling code here:
                  jTable1.getSelectionModel().removeSelectionInterval(0, jTable1.getRowCount());
                  jTextField1.setText("");
         }//GEN-LAST:event_btn_cancelarActionPerformed

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
                           java.util.logging.Logger.getLogger(facultades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (InstantiationException ex) {
                           java.util.logging.Logger.getLogger(facultades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                           java.util.logging.Logger.getLogger(facultades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                           java.util.logging.Logger.getLogger(facultades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  //</editor-fold>

                  /* Create and display the dialog */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    facultades dialog = new facultades(new javax.swing.JFrame(), true);
                                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                             @Override
                                             public void windowClosing(java.awt.event.WindowEvent e) {
                                                      System.exit(0);
                                             }
                                    });
                                    dialog.setVisible(true);
                           }
                  });
         }

         // Variables declaration - do not modify//GEN-BEGIN:variables
         private javax.swing.JButton btn_actualizar;
         private javax.swing.JButton btn_borrar;
         private javax.swing.JButton btn_cancelar;
         private javax.swing.JButton btn_crear;
         private javax.swing.JButton btn_salir;
         private javax.swing.JLabel jLabel1;
         private javax.swing.JLabel jLabel2;
         private javax.swing.JPanel jPanel1;
         private javax.swing.JPanel jPanel2;
         private javax.swing.JScrollPane jScrollPane1;
         private javax.swing.JTable jTable1;
         private javax.swing.JTextField jTextField1;
         // End of variables declaration//GEN-END:variables
}