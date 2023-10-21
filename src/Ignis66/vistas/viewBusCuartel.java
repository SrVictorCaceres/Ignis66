package Ignis66.vistas;

import Ignis66.acessoADatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Víctor Cáceres
 */
public class viewBusCuartel extends javax.swing.JFrame {

    public DefaultTableModel modelo = new DefaultTableModel();

    public viewBusCuartel() {
        initComponents();
        cargarCuartel();
        disableCopyPaste(txtidCuartel);//deshabilita el copy paste en el textfield
        disableCopyPaste(txtNombre);
        disableCopyPaste(txtCiudad);
      
    }

    private void disableCopy(JComponent component) {
        component.getInputMap().put(KeyStroke.getKeyStroke("control C"), "none");
    }

    private void disablePaste(JComponent component) {
        component.getInputMap().put(KeyStroke.getKeyStroke("control V"), "none");
    }

    private void disableCopyPaste(JComponent component) {
        disableCopy(component);
        disablePaste(component);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtidCuartel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuartel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Búsqueda de cuartel por código, nombre o ciudad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 400, 27));

        txtidCuartel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtidCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidCuartelActionPerformed(evt);
            }
        });
        txtidCuartel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidCuartelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidCuartelKeyTyped(evt);
            }
        });
        getContentPane().add(txtidCuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, -1));

        tblCuartel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        tblCuartel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCuartel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuartelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuartel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 164, 716, 155));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 82, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese el ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 120, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Ingrese la Ciudad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 150, -1));

        txtCiudad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiudadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidCuartelActionPerformed


    }//GEN-LAST:event_txtidCuartelActionPerformed

    private void txtidCuartelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidCuartelKeyReleased

        buscarIDCuartel(txtidCuartel.getText());


    }//GEN-LAST:event_txtidCuartelKeyReleased

    private void tblCuartelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuartelMouseClicked

        int filaSelec = tblCuartel.getSelectedRow();
        String[] registros = new String[10];

        if (filaSelec != -1) {
            registros[0] = tblCuartel.getValueAt(filaSelec, 0).toString();
            registros[1] = tblCuartel.getValueAt(filaSelec, 1).toString();
            registros[2] = tblCuartel.getValueAt(filaSelec, 2).toString();
            registros[3] = tblCuartel.getValueAt(filaSelec, 3).toString();
            registros[4] = tblCuartel.getValueAt(filaSelec, 4).toString();
            registros[5] = tblCuartel.getValueAt(filaSelec, 5).toString();
            registros[6] = tblCuartel.getValueAt(filaSelec, 6).toString();
            registros[7] = tblCuartel.getValueAt(filaSelec, 7).toString();
            registros[8] = tblCuartel.getValueAt(filaSelec, 8).toString();
            registros[9] = tblCuartel.getValueAt(filaSelec, 9).toString();
            ABMCuartel.lblIdCuartel.setText(registros[0]);
            ABMCuartel.txtNombre.setText(registros[1]);
            ABMCuartel.txtDireccion.setText(registros[2]);
            ABMCuartel.txtCiudad.setText(registros[3]);
            ABMCuartel.txtProvincia.setText(registros[4]);
            ABMCuartel.txtNroTel.setText(registros[5]);
            ABMCuartel.txtCoordX.setText(registros[6]);
            ABMCuartel.txtCoordY.setText(registros[7]);
            ABMCuartel.txtMail.setText(registros[8]);
            ABMCuartel.rbEstado.setSelected(true);

        }


    }//GEN-LAST:event_tblCuartelMouseClicked

    private void txtidCuartelKeyTyped(java.awt.event.KeyEvent evt) {                                      
//GEN-FIRST:event_txtidCuartelKeyTyped
        // 

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);
        txtCiudad.setEditable(false);
        txtCiudad.setEnabled(false);

        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        if (!num) {
            evt.consume();
        }
        if (txtidCuartel.getText().length() >= 4) {
            evt.consume();
        } 
    }//GEN-LAST:event_txtidCuartelKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed


    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadKeyTyped

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
    
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
     
        buscarNOMCuartel(txtNombre.getText());


    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyReleased
           buscarCIUCuartel(txtCiudad.getText());
        


    }//GEN-LAST:event_txtCiudadKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {                                   
                                    
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != 32)&& (c!='\u00f1')&&(c!='\u00d1')) {
            evt.consume();
        }

        if (txtNombre.getText().length() >= 40) {
            evt.consume();
        
    }                                  
   
    }                                  

  
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
            java.util.logging.Logger.getLogger(viewBusCuartel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewBusCuartel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewBusCuartel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewBusCuartel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewBusCuartel().setVisible(true);
            }
        });
    }

    public DefaultTableModel cargarCuartel() {

        String[] nCol = {"ID", "Nombre", "Dirección", "Ciudad", "Provincia", "Telefono", "CoordenadaX", "CoordenadaY", "Correo", "Estado"};
        String[] reg = new String[10];
        tblCuartel.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel modelo = new DefaultTableModel(null, nCol) {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        tblCuartel.setModel(modelo);

        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel a";

        try {

            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
                reg[5] = rs.getString(6);
                reg[6] = rs.getString(7);
                reg[7] = rs.getString(8);
                reg[8] = rs.getString(9);
                reg[9] = rs.getString(10);

                modelo.addRow(reg);
            }
            ps.close();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
        return modelo;

    }

    public void buscarIDCuartel(String idCuartel) {

        String reg[] = new String[10];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Provincia", "Telefono", "CoordenadaX", "CoordenadaY", "Correo", "Estado"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where idCuartel LIKE'%" + idCuartel + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuartel.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
                reg[5] = rs.getString(6);
                reg[6] = rs.getString(7);
                reg[7] = rs.getString(8);
                reg[8] = rs.getString(9);
                reg[9] = rs.getString(10);

                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }

    }

    public void borrarFilas() {
        int f = tblCuartel.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
       public void buscarNOMCuartel(String nombre) {

        String reg[] = new String[10];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Provincia", "Telefono", "CoordenadaX", "CoordenadaY", "Correo", "Estado"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where nombreCuartel LIKE'%" + nombre + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuartel.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
                reg[5] = rs.getString(6);
                reg[6] = rs.getString(7);
                reg[7] = rs.getString(8);
                reg[8] = rs.getString(9);
                reg[9] = rs.getString(10);

                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
       }
 public void buscarCIUCuartel(String Ciudad) {

        String reg[] = new String[10];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Provincia", "Telefono", "CoordenadaX", "CoordenadaY", "Correo", "Estado"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where ciudad LIKE'%" + Ciudad + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuartel.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
                reg[5] = rs.getString(6);
                reg[6] = rs.getString(7);
                reg[7] = rs.getString(8);
                reg[8] = rs.getString(9);
                reg[9] = rs.getString(10);

                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCuartel;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtidCuartel;
    // End of variables declaration//GEN-END:variables
}
