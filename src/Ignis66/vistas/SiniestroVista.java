
package Ignis66.vistas;

import Ignis66.acessoADatos.Conexion;
import Ignis66.entidades.Brigada;
import Ignis66.entidades.Siniestro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public class SiniestroVista extends javax.swing.JFrame {
private Connection conexion;
   
    public SiniestroVista() {
        this.conexion = Conexion.getConexion();
        initComponents();
        jCBTipoS.addItem("Siniestro Natural");
        jCBTipoS.addItem("Siniestro Accidental");
        jCBTipoS.addItem("Siniestro Intencional");
        jTDatos.getTableHeader().setReorderingAllowed(false);
        jBActualizarBrigadasActionPerformed(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLHead = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADet = new javax.swing.JTextArea();
        jLDetalles = new javax.swing.JLabel();
        jCBTipoS = new javax.swing.JComboBox<>();
        jLTSiniestro = new javax.swing.JLabel();
        jLX = new javax.swing.JLabel();
        jLY = new javax.swing.JLabel();
        jTFCoordY = new javax.swing.JTextField();
        jTFCoordX = new javax.swing.JTextField();
        jLAsigBrig = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTDatos = new javax.swing.JTable();
        jLBrigSelec = new javax.swing.JLabel();
        jBActualizarBrigadas = new javax.swing.JButton();
        jBDesingBrig = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBConfSini = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 600));

        jLHead.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLHead.setText("SINIESTRO");

        jTADet.setColumns(20);
        jTADet.setRows(5);
        jScrollPane1.setViewportView(jTADet);

        jLDetalles.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLDetalles.setText("DETALLES");

        jLTSiniestro.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLTSiniestro.setText("Tipo de Siniestro *");

        jLX.setText("Coordenada X *");

        jLY.setText("Coordenada Y *");

        jLAsigBrig.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLAsigBrig.setText("Asignación de Brigada");

        jTDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Proximidad", "IdBrigada", "Nombre Brigada", "IdCuartel", "Nombre Cuartel", "Ciudad", "Teléfono"
            }
        ));
        jScrollPane3.setViewportView(jTDatos);
        if (jTDatos.getColumnModel().getColumnCount() > 0) {
            jTDatos.getColumnModel().getColumn(1).setMinWidth(60);
            jTDatos.getColumnModel().getColumn(1).setMaxWidth(60);
            jTDatos.getColumnModel().getColumn(3).setMinWidth(60);
            jTDatos.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        jLBrigSelec.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLBrigSelec.setText("Brigada Seleccionada");

        jBActualizarBrigadas.setText("ActualizarBrigadas");
        jBActualizarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarBrigadasActionPerformed(evt);
            }
        });

        jBDesingBrig.setText("Designar Brigada");

        jBLimpiar.setText("Limpiar Campos");

        jBConfSini.setText("Confirmar Siniestro");
        jBConfSini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfSiniActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBTipoS, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLX)
                            .addComponent(jTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLY)
                            .addComponent(jTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBActualizarBrigadas))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLHead)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLAsigBrig)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTSiniestro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLDetalles)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBConfSini)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLBrigSelec)
                                .addGap(0, 264, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jBLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBDesingBrig, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLHead, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCBTipoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLX, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLY, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBActualizarBrigadas)))
                .addGap(18, 18, 18)
                .addComponent(jLAsigBrig, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLBrigSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBDesingBrig)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfSini)
                    .addComponent(jBLimpiar)
                    .addComponent(jBSalir))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfSiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfSiniActionPerformed
   // Obtener otros datos, tipo, coordenadas, detalles, etc.
        String tipoSiniestro = jCBTipoS.getSelectedItem().toString();
        String coordXText = jTFCoordX.getText();
        String coordYText = jTFCoordY.getText();

        if (!coordXText.isEmpty() && !coordYText.isEmpty()) {
            try {
                double coordenadaX = Double.parseDouble(coordXText);
                double coordenadaY = Double.parseDouble(coordYText);

                Siniestro nuevoSiniestro = new Siniestro(tipoSiniestro, coordenadaX, coordenadaY, jTADet.getText());
                LocalDateTime fechaHoraActual = LocalDateTime.now();
                nuevoSiniestro.setFechaSiniestro(fechaHoraActual);

                // acá se puede hacer lo que necesitemos con el nuevo siniestro
                // Por ejemplo, llamar a un método para guardarlo en la base de datos
                // SiniestroData siniestroData = new SiniestroData(conexion); // Hay que asegurarse de tener la conexión a la base de datos
                // siniestroData.agregarSiniestro(nuevoSiniestro);

            } catch (NumberFormatException e) {
                System.err.println("Error: Uno o ambos campos no son números válidos.");
            }
        } else {
            System.err.println("Error: Uno o ambos campos están vacíos.");
        }
    }//GEN-LAST:event_jBConfSiniActionPerformed

    private void jBActualizarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarBrigadasActionPerformed
     String coordXText = jTFCoordX.getText();
    String coordYText = jTFCoordY.getText();

    if (coordXText.isEmpty() || coordYText.isEmpty()) {
        System.err.println("Error: Uno o ambos campos están vacíos.");
       
    } else {
        try {
            double coordX = Double.parseDouble(coordXText);
            double coordY = Double.parseDouble(coordYText);

            try {
                // revisar si está el método obtenerBrigadasDesdeBaseDeDatos
                List<Brigada> brigadas = obtenerBrigadasDesdeBaseDeDatos(conexion, coordX, coordY);
                cargarBrigadasEnJTable(brigadas);
            } catch (SQLException ex) {
                ex.printStackTrace();
                
            }

        } catch (NumberFormatException e) {
            System.err.println("Error: Uno o ambos campos no son números válidos.");
            
        }
    }
    }//GEN-LAST:event_jBActualizarBrigadasActionPerformed

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
            java.util.logging.Logger.getLogger(SiniestroVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiniestroVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiniestroVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiniestroVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiniestroVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarBrigadas;
    private javax.swing.JButton jBConfSini;
    private javax.swing.JButton jBDesingBrig;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBTipoS;
    private javax.swing.JLabel jLAsigBrig;
    private javax.swing.JLabel jLBrigSelec;
    private javax.swing.JLabel jLDetalles;
    private javax.swing.JLabel jLHead;
    private javax.swing.JLabel jLTSiniestro;
    private javax.swing.JLabel jLX;
    private javax.swing.JLabel jLY;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTADet;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextField jTFCoordX;
    private javax.swing.JTextField jTFCoordY;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private List<Brigada> obtenerBrigadasDesdeBaseDeDatos(Connection conexion, double coordX, double coordY) throws SQLException {
    List<Brigada> brigadas = new ArrayList<>();
    
    // Consulta SQL para obtener las brigadas basadas en coordenadas acá está el chiquero mas grande
    String consultaSQL = "SELECT * FROM brigada WHERE coordenadaX = ? AND coordenadaY = ?";
    
    try (PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL)) {
        preparedStatement.setDouble(1, coordX);
        preparedStatement.setDouble(2, coordY);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int idBrigada = resultSet.getInt("idBrigada");
                String nombreBrigada = resultSet.getString("nombreBrigada");
                String especialidad = "Especialidad de Ejemplo";
                int idCuartel = 2; // Reemplaza con el valor real de idCuartel no funciona
              boolean libre = true; // Reemplaza con el valor real de libre no funciona
                boolean estado = true; // Reemplaza con el valor real del estado no funciona  

                // Crear un objeto Brigada con los datos obtenidos de la base de datos, no tengo idea si funciona
           Brigada brigada = new Brigada(idBrigada, nombreBrigada, especialidad, idCuartel, libre, estado);
                brigadas.add(brigada);
            }
        }
    }
    
    return brigadas;
}

private void cargarBrigadasEnJTable(List<Brigada> brigadas) {
    DefaultTableModel model = (DefaultTableModel) jTDatos.getModel();
        model.setRowCount(0);

        for (Brigada brigada : brigadas) {
            // Agregar cada brigada al JTable
            model.addRow(new Object[]{brigada.getIdBrigada(), brigada.getNombreBrigada()});
        }
    }
}
