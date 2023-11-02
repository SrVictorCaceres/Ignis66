
package Ignis66.vistas;

import Ignis66.acessoADatos.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class SiniestroEntreFechas extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
 
    public SiniestroEntreFechas() {
        initComponents();
        setBounds(230, 30, 690 , 600);
        jBMostrarSini.addActionListener(new ActionListener() {
       @Override
        public void actionPerformed(ActionEvent e) {
        jBMostrarSiniActionPerformed(e);
            }
        });
      jBMostrarSini.setEnabled(false);
        
             jTSiniestros.getTableHeader().setReorderingAllowed(false) ;//no permite mover los campos de la tabla
            setDefaultCloseOperation(0); //para desactivar la X(cerrar) del formulario.
            disableCopyPaste(jDCFecha1);  //deshabilita el copy paste en el textfield jDCFecha1  
             disableCopyPaste(jDCFecha2);
            
    }

      private void disableCopy(JComponent component) {
        component.getInputMap().put(KeyStroke.getKeyStroke("control C"), "none");
        component.getInputMap().put(KeyStroke.getKeyStroke("control c"), "none");
    }

    private void disablePaste(JComponent component) {
        component.getInputMap().put(KeyStroke.getKeyStroke("control V"), "none");
         component.getInputMap().put(KeyStroke.getKeyStroke("control v"), "none");
    }

    private void disableCopyPaste(JComponent component) {
        disableCopy(component);
        disablePaste(component);

    }
    

    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBMostrarSini = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSiniestros = new javax.swing.JTable();
        jDCFecha1 = new com.toedter.calendar.JDateChooser();
        jDCFecha2 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        jBMostrarSini.setBackground(new java.awt.Color(153, 255, 51));
        jBMostrarSini.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBMostrarSini.setText("Mostrar Siniestros");
        jBMostrarSini.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBMostrarSini.setBorderPainted(false);
        jBMostrarSini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarSiniActionPerformed(evt);
            }
        });
        getContentPane().add(jBMostrarSini);
        jBMostrarSini.setBounds(510, 100, 140, 30);

        jTSiniestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Siniestro", "Tipo", "Fecha Siniestro", "Fecha Resolucion", "Puntuacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTSiniestros);
        if (jTSiniestros.getColumnModel().getColumnCount() > 0) {
            jTSiniestros.getColumnModel().getColumn(0).setResizable(false);
            jTSiniestros.getColumnModel().getColumn(1).setResizable(false);
            jTSiniestros.getColumnModel().getColumn(2).setResizable(false);
            jTSiniestros.getColumnModel().getColumn(3).setResizable(false);
            jTSiniestros.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 176, 610, 330);

        jDCFecha1.setMaxSelectableDate(new Date());
        jDCFecha1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCFecha1PropertyChange(evt);
            }
        });
        getContentPane().add(jDCFecha1);
        jDCFecha1.setBounds(110, 100, 150, 30);

        // Establecer la fecha actual como la fecha máxima permitida en jDCFecha2
        jDCFecha2.setMaxSelectableDate(new Date());
        getContentPane().add(jDCFecha2);
        jDCFecha2.setBounds(330, 100, 160, 30);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Consultar Siniestros por Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(470, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 0);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Desde:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 100, 50, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Hasta:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 100, 50, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Seleccione el rango de fechas en el que desea verificar los Siniestros:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 50, 430, 15);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(40, 70, 620, 10);

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
        botonSalir.setBounds(530, 540, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarSiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarSiniActionPerformed
     LocalDateTime fechaInicio = jDCFecha1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    LocalDateTime fechaFin = jDCFecha2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

   

 
    
    try {
        Connection conn = Conexion.getConexion();
        String sql = "SELECT idSiniestro, tipo, fechaSiniestro,fechaResolucion,puntuacion FROM siniestro WHERE fechaSiniestro BETWEEN ? AND ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setObject(1, fechaInicio);
        ps.setObject(2, fechaFin);

        ResultSet rs = ps.executeQuery();

        // Limpia la tabla antes de mostrar los resultados
        DefaultTableModel model = (DefaultTableModel) jTSiniestros.getModel();
        model.setRowCount(0);
      
        

        while (rs.next()) {
            int idSiniestro = rs.getInt("idSiniestro");
            String tipo = rs.getString("tipo");
            LocalDateTime fechaSiniestro = rs.getObject("fechaSiniestro", LocalDateTime.class);
            LocalDateTime fechaResolucion = rs.getObject("fechaResolucion", LocalDateTime.class);
            int puntuacion = rs.getInt("Puntuacion");
            model.addRow(new Object[]{idSiniestro, tipo, fechaSiniestro,fechaResolucion,puntuacion});
       
            
        }

        rs.close();
        ps.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener siniestros: " + e.getMessage());
    }
    }//GEN-LAST:event_jBMostrarSiniActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
  if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir de esta pantalla?", "Ignis - Salir de la Aplicación", JOptionPane.YES_NO_OPTION) == 0) {
            dispose();
        }

    }//GEN-LAST:event_botonSalirActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    try{    
   if(jDCFecha1.getDate().after(jDCFecha2.getDate())){
    jBMostrarSini.setEnabled(false);}else{
  
      jBMostrarSini.setEnabled(true);
   }
    }catch(NullPointerException nu){
    
    }
    }//GEN-LAST:event_formMouseMoved

    private void jDCFecha1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCFecha1PropertyChange
      if(evt.getPropertyName().equals("Date")){
      Date Fecha1=jDCFecha1.getDate();
            Date Fecha2=jDCFecha2.getDate();
      if(Fecha1!=null && Fecha2!=null && Fecha1.after(Fecha2)){
      jDCFecha2.setDate(Fecha1);
      }
      }
        

    }//GEN-LAST:event_jDCFecha1PropertyChange

 
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
            java.util.logging.Logger.getLogger(SiniestroEntreFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiniestroEntreFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiniestroEntreFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiniestroEntreFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiniestroEntreFechas().setVisible(true);
            }
        });
     
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jBMostrarSini;
    private com.toedter.calendar.JDateChooser jDCFecha1;
    private com.toedter.calendar.JDateChooser jDCFecha2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTSiniestros;
    // End of variables declaration//GEN-END:variables
}
