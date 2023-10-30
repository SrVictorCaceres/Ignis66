package Ignis66.vistas;

import Ignis66.acessoADatos.BrigadaData;
import Ignis66.acessoADatos.CuartelData;
import Ignis66.acessoADatos.SiniestroData;
import Ignis66.entidades.Brigada;
import Ignis66.entidades.Cuartel;
import Ignis66.entidades.Siniestro;
import Ignis66.acessoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class SiniestroVista extends javax.swing.JFrame {
private Connection conexion;
 private BrigadaData brigadaData; 

   
    public SiniestroVista() {
        this.conexion = Conexion.getConexion();
        
        
        initComponents();
        brigadaData = new BrigadaData();
        jCBTipoS.addItem("Siniestro Natural");
        jCBTipoS.addItem("Siniestro Accidental");
        jCBTipoS.addItem("Siniestro Intencional");
        jTDatos.getTableHeader().setReorderingAllowed(false);
        jBActualizarBrigadasActionPerformed(null);
        jTFCoordX.setTransferHandler(null);
        jTFCoordY.setTransferHandler(null);
        jTADet.setTransferHandler(null);
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
        jBDesingBrig = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBActualizarBrigadas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Cuartel", "Nombre Cuartel", "Dirección", "Ciudad", "Id Brigada", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTDatos);

        jLBrigSelec.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLBrigSelec.setText("Brigada Seleccionada");

        jBDesingBrig.setText("Designar Brigada");
        jBDesingBrig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesingBrigActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar Campos");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBActualizarBrigadas.setText("Actualizar Brigadas");
        jBActualizarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarBrigadasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("DE MAS CERCANAS A MAS LEJANAS");

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBActualizarBrigadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFCoordY, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
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
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jBDesingBrig)
                        .addGap(153, 153, 153)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLBrigSelec))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLBrigSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDesingBrig)
                    .addComponent(jBLimpiar))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfSiniActionPerformed(java.awt.event.ActionEvent evt) {
    // Lógica para confirmar el siniestro
    confirmarSiniestro();
}
    private void confirmarSiniestro() {
    // Obtener otros datos, tipo, coordenadas, detalles, etc.
    String tipoSiniestro = jCBTipoS.getSelectedItem().toString();
    String coordXText = jTFCoordX.getText().trim();
    String coordYText = jTFCoordY.getText().trim();

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
}
    private void jBActualizarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarBrigadasActionPerformed
    try {
        // Obtiene las coordenadas ingresadas por el usuario
        double latitud = Double.parseDouble(jTFCoordX.getText());
        double longitud = Double.parseDouble(jTFCoordY.getText());
        
        // Llama al método brigadasLibres para obtener las brigadas libres
      List<Brigada> brigadasLibres = brigadaData.brigadasLibres();
        
        // Actualiza el JTable con las brigadas libres
        cargarBrigadasEnJTable(brigadasLibres);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingresa coordenadas válidas (números) en los campos de latitud y longitud.");
    }
    }//GEN-LAST:event_jBActualizarBrigadasActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
                                         
    // Limpia los campos de texto
    jTFCoordX.setText("");  // Reemplaza jTFCampo1 con el nombre del campo texto
    jTFCoordY.setText("");
    jTADet.setText(""); 
    // Se pueden agregar mas campos si queremos

    DefaultTableModel modelo = (DefaultTableModel) jTDatos.getModel();
    modelo.setRowCount(0); // Elimina todas las filas del modelo

    
    jTFCoordX.requestFocus();
   
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBDesingBrigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesingBrigActionPerformed
    int filaSeleccionada = jTDatos.getSelectedRow();

    if (filaSeleccionada != -1) {
        // Obtiene ID de brigada seleccionada desde la fila JTable
        int idBrigada = (int) jTDatos.getValueAt(filaSeleccionada, 0);

        System.out.println("Valor de idBrigada: " + idBrigada); // Línea de depuración

        // Crear una instancia de BrigadaData con la conexión
        BrigadaData brigadaData = new BrigadaData(conexion);

        // Llama al método para marcar la brigada como activa
        brigadaData.marcarBrigadaActiva(idBrigada);
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una brigada de la tabla antes de designarla.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_jBDesingBrigActionPerformed

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
    private javax.swing.JButton jBDesingBrig;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCBTipoS;
    private javax.swing.JLabel jLAsigBrig;
    private javax.swing.JLabel jLBrigSelec;
    private javax.swing.JLabel jLDetalles;
    private javax.swing.JLabel jLHead;
    private javax.swing.JLabel jLTSiniestro;
    private javax.swing.JLabel jLX;
    private javax.swing.JLabel jLY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTADet;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextField jTFCoordX;
    private javax.swing.JTextField jTFCoordY;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

private List<Cuartel> obtenerCuartelesDesdeBaseDeDatos(double coordX, double coordY) {
    List<Cuartel> cuarteles = new ArrayList<>();

    // Consulta SQL para tener los cuarteles ordenados por proximidad
    String consultaSQL = "SELECT idCuartel, nombreCuartel, direccion, ciudad, provincia, telefono, coordenadaX, coordenadaY, correo, estado, " +
                        "SQRT(POW(coordenadaX - ?, 2) + POW(coordenadaY - ?, 2)) AS proximidad " +
                        "FROM Cuartel " +
                        "ORDER BY proximidad";

    try (PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL)) {
        preparedStatement.setDouble(1, coordX);
        preparedStatement.setDouble(2, coordY);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int idCuartel = resultSet.getInt("idCuartel");
                String nombreCuartel = resultSet.getString("nombreCuartel");
                // Se pueden agregar mas datos del cuartel

                // Crea un objeto Cuartel y lo agregaría a la lista
             Cuartel cuartel = new Cuartel(idCuartel, nombreCuartel, "Dirección de ejemplo", "Ciudad de ejemplo", "Provincia de ejemplo", "1234567890", "", "", "correo@ejemplo.com", "Activo");
                cuarteles.add(cuartel);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return cuarteles;
}

private void cargarBrigadasEnJTable(List<Brigada> brigada) {
    DefaultTableModel model = (DefaultTableModel) jTDatos.getModel();
    model.setRowCount(0);

    for (Brigada cuartel : brigada) {
        // Agregar cuartel al JTable
        model.addRow(new Object[]{cuartel.getIdCuartel(), cuartel.getNombreBrigada(), cuartel.getIdBrigada(), cuartel.getIdCuartel()});
    }
    
    jTDatos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    private void cargarCuartelesEnJTable(List<Cuartel> cuarteles) {
    DefaultTableModel model = (DefaultTableModel) jTDatos.getModel();
    model.setRowCount(0);

    for (Cuartel cuartel : cuarteles) {
        // Agregar cuartel al JTable
        model.addRow(new Object[]{cuartel.getIdCuartel(), cuartel.getNombreCuartel(), cuartel.getDireccion(), cuartel.getCiudad()});   
    }
     jTDatos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
}

}