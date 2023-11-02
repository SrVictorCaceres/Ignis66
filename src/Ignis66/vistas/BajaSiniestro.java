
package Ignis66.vistas;

import Ignis66.acessoADatos.Conexion;
import Ignis66.acessoADatos.SiniestroData;
import Ignis66.entidades.Siniestro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BajaSiniestro extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };
   
    public BajaSiniestro() {
        initComponents();
        jCBCalif.addItem("1");
        jCBCalif.addItem("2");
        jCBCalif.addItem("3");
        jCBCalif.addItem("4");
        jCBCalif.addItem("5");
        jCBCalif.addItem("6");
        jCBCalif.addItem("7");
        jCBCalif.addItem("8");
        jCBCalif.addItem("9");
        jCBCalif.addItem("10");
        armarTabla();
        cargarTabla();
        setBounds(230, 30, 690 , 600);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBCalif = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        getContentPane().add(jCBCalif);
        jCBCalif.setBounds(200, 440, 70, 30);

        jButton1.setBackground(new java.awt.Color(153, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Siniestro Resuelto");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 540, 170, 30);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 100, 610, 330);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Cerrar Siniestro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(572, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 0);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Seleccione el puntaje:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 440, 140, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Seleccione el Siniestro que marcar como resuelto:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 50, 430, 15);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(40, 70, 610, 10);

        botonSalir.setBackground(new java.awt.Color(255, 51, 51));
        botonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonSalir.setBorderPainted(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir);
        botonSalir.setBounds(520, 540, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        LocalDateTime fechaAct = LocalDateTime.now();
        String puntuacion = jCBCalif.getSelectedItem().toString();
        int puntuacionFinal = Integer.parseInt(puntuacion);
        int idSiniestro = (int)tabla.getValueAt(tabla.getSelectedRow(), 0);
        
        if(tabla.getSelectedRow() != -1){
            String sql = "UPDATE siniestro SET fechaResolucion = ?, puntuacion = ? Where idSiniestro = ?";
            try{
                PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
                ps.setObject(1, (LocalDateTime)fechaAct);
                ps.setInt(2, puntuacionFinal);
                ps.setInt(3, idSiniestro);
                
                int check = ps.executeUpdate();
                if (check > 0) {
                    JOptionPane.showMessageDialog(null, "Siniestro actualizado");
                    modelo.removeRow(tabla.getSelectedRow());//quita el siniestro resuelto
                }
            }catch(SQLException sqle){
                JOptionPane.showMessageDialog(null, "Error al actualizar el siniestro");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Error al actualizar siniestro");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

  
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
            java.util.logging.Logger.getLogger(BajaSiniestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaSiniestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaSiniestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaSiniestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaSiniestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBCalif;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void armarTabla(){
        modelo.addColumn("Id Siniestro");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha Siniestro");
        modelo.addColumn("Id Brigada");
        tabla.setModel(modelo);
    }
    
    public void cargarTabla(){
        SiniestroData sData = new SiniestroData();
        
        for(Siniestro sin: sData.siniestrosSinResolver()){
            modelo.addRow(new Object[]{sin.getIdSiniestro(), sin.getTipo(), sin.getFechaSiniestro(), sin.getIdBrigada()});
        }
        
        tabla.setModel(modelo);
    }

}
