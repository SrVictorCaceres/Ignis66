package Ignis66.vistas;

import Ignis66.acessoADatos.BrigadaData;
import Ignis66.acessoADatos.CuartelData;
import Ignis66.entidades.Brigada;
import Ignis66.entidades.Cuartel;
import Ignis66.entidades.Siniestro;
import Ignis66.acessoADatos.Conexion;
import Ignis66.acessoADatos.SiniestroData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
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
        jTFCoordX.setTransferHandler(null);
        jTFCoordY.setTransferHandler(null);
        jTADet.setTransferHandler(null);
        setBounds(230, 30, 830, 580);
        jBAltaSini.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jPanel1 = new javax.swing.JPanel();
        jLHead = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botonSalir = new javax.swing.JButton();
        jBAltaSini = new javax.swing.JButton();

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
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jTADet.setColumns(20);
        jTADet.setRows(5);
        jScrollPane1.setViewportView(jTADet);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(389, 72, 405, 146);

        jLDetalles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLDetalles.setText("Detalles");
        getContentPane().add(jLDetalles);
        jLDetalles.setBounds(389, 45, 42, 21);

        getContentPane().add(jCBTipoS);
        jCBTipoS.setBounds(28, 72, 192, 24);

        jLTSiniestro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLTSiniestro.setText("Tipo de Siniestro *");
        getContentPane().add(jLTSiniestro);
        jLTSiniestro.setBounds(30, 50, 103, 21);

        jLX.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLX.setText("Coordenada X *");
        getContentPane().add(jLX);
        jLX.setBounds(30, 100, 87, 21);

        jLY.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLY.setText("Coordenada Y *");
        getContentPane().add(jLY);
        jLY.setBounds(30, 150, 88, 21);

        jTFCoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCoordYKeyTyped(evt);
            }
        });
        getContentPane().add(jTFCoordY);
        jTFCoordY.setBounds(30, 170, 192, 24);

        jTFCoordX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCoordXKeyTyped(evt);
            }
        });
        getContentPane().add(jTFCoordX);
        jTFCoordX.setBounds(30, 120, 192, 24);

        jLAsigBrig.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLAsigBrig.setText("Asignación de Brigada");
        getContentPane().add(jLAsigBrig);
        jLAsigBrig.setBounds(300, 270, 143, 22);

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
                "Cercanía (Km)", "Id Cuartel", "Nombre Cuartel", "Id Brigada", "Nombre Brigada", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTDatos);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 320, 780, 160);

        jLBrigSelec.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLBrigSelec.setText("Brigada Seleccionada");
        getContentPane().add(jLBrigSelec);
        jLBrigSelec.setBounds(280, 490, 140, 23);

        jBDesingBrig.setBackground(new java.awt.Color(153, 255, 51));
        jBDesingBrig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBDesingBrig.setText("Designar Brigada");
        jBDesingBrig.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBDesingBrig.setBorderPainted(false);
        jBDesingBrig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesingBrigActionPerformed(evt);
            }
        });
        getContentPane().add(jBDesingBrig);
        jBDesingBrig.setBounds(40, 530, 160, 30);

        jBLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        jBLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBLimpiar.setText("Limpiar Campos");
        jBLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBLimpiar.setBorderPainted(false);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jBLimpiar);
        jBLimpiar.setBounds(420, 530, 170, 30);

        jBActualizarBrigadas.setBackground(new java.awt.Color(153, 255, 51));
        jBActualizarBrigadas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBActualizarBrigadas.setText("Actualizar Brigadas");
        jBActualizarBrigadas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBActualizarBrigadas.setBorderPainted(false);
        jBActualizarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarBrigadasActionPerformed(evt);
            }
        });
        getContentPane().add(jBActualizarBrigadas);
        jBActualizarBrigadas.setBounds(30, 210, 192, 28);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("DE MAS CERCANAS A MAS LEJANAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 300, 204, 15);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLHead.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLHead.setForeground(new java.awt.Color(255, 255, 255));
        jLHead.setText("SINIESTROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLHead)
                .addContainerGap(729, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLHead, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 27);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 260, 790, 10);

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
        botonSalir.setBounds(610, 530, 175, 30);

        jBAltaSini.setBackground(new java.awt.Color(153, 255, 50));
        jBAltaSini.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBAltaSini.setText("Alta Siniestro");
        jBAltaSini.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBAltaSini.setBorderPainted(false);
        jBAltaSini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaSiniActionPerformed(evt);
            }
        });
        getContentPane().add(jBAltaSini);
        jBAltaSini.setBounds(230, 530, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfSiniActionPerformed(java.awt.event.ActionEvent evt) {

        confirmarSiniestro();
    }

    private void confirmarSiniestro() {

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
            // Actualiza el JTable con las brigadas libres
            cargarBrigadasEnJTable();
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
        // Desactiva el botón jBAltaSini después de limpiar los campos
        jBAltaSini.setEnabled(false);

    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBDesingBrigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesingBrigActionPerformed
        int filaSeleccionada = jTDatos.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtiene ID de brigada seleccionada desde la fila JTable
            int idBrigada = (int) jTDatos.getValueAt(filaSeleccionada, 3);

            System.out.println("Valor de idBrigada: " + idBrigada); // Línea de depuración

            // Crear una instancia de BrigadaData con la conexión
            BrigadaData brigadaData = new BrigadaData(conexion);

            // Llama al método para marcar la brigada como activa
            brigadaData.marcarBrigadaActiva(idBrigada);
            JOptionPane.showMessageDialog(null, "Brigada asingada al siniestro correctamente.");

            // Activa el botón jBAltaSini después de asignar la brigada
            jBAltaSini.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una brigada de la tabla antes de designarla.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBDesingBrigActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir de esta pantalla?", "Ignis - Salir de Siniestro", JOptionPane.YES_NO_OPTION) == 0) {
            dispose();
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    private void jBAltaSiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaSiniActionPerformed
        Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = Conexion.getConexion(); 
        conn.setAutoCommit(false); // Desactiva autocommit 

        // Obtiene la fecha del pc
        java.util.Date fechaActual = new java.util.Date();
        java.sql.Date fechaSiniestro = new java.sql.Date(fechaActual.getTime());

        String cordX = jTFCoordX.getText();
        String cordY = jTFCoordY.getText();
        String detalle = jTADet.getText();
        String tipoSiniestro = jCBTipoS.getSelectedItem().toString();
        int idBrigada = (int)jTDatos.getValueAt(jTDatos.getSelectedRow(), 3);
  
            String sql = "INSERT INTO siniestro (tipo, fechaSiniestro, coordenadaX, coordenadaY, detalles, puntuacion, idBrigada) VALUES (?, ?, ?, ?, ?, ?, ?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, tipoSiniestro);
        stmt.setDate(2, fechaSiniestro); // fecha actual
        stmt.setString(3, cordX);
        stmt.setString(4, cordY);
        stmt.setString(5, detalle);
        stmt.setInt(6, 0); 
        stmt.setInt(7, idBrigada); 
        stmt.executeUpdate();

            conn.commit(); // Confirma la transacción
            System.out.println("Siniestro guardado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback(); // Si hay un error, revierte la transacción
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close(); // Cierra la conexión al finalizar la operación
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBAltaSiniActionPerformed

    private void jTFCoordXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCoordXKeyTyped

        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean caracteres = key >= 45 && key <= 46;
        if (!numeros && !caracteres) {
            evt.consume();
        }


    }//GEN-LAST:event_jTFCoordXKeyTyped

    private void jTFCoordYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCoordYKeyTyped

        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean caracteres = key >= 45 && key <= 46;
        if (!numeros && !caracteres) {
            evt.consume();

        }


    }//GEN-LAST:event_jTFCoordYKeyTyped

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jBActualizarBrigadas;
    private javax.swing.JButton jBAltaSini;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTADet;
    private javax.swing.JTable jTDatos;
    private javax.swing.JTextField jTFCoordX;
    private javax.swing.JTextField jTFCoordY;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private List<Cuartel> obtenerCuartelesDesdeBaseDeDatos(double coordX, double coordY) {
        List<Cuartel> cuarteles = new ArrayList<>();

        // Consulta SQL para tener los cuarteles ordenados por proximidad
        String consultaSQL = "SELECT idCuartel, nombreCuartel, direccion, ciudad, provincia, telefono, coordenadaX, coordenadaY, correo, estado, "
                + "SQRT(POW(coordenadaX - ?, 2) + POW(coordenadaY - ?, 2)) AS proximidad "
                + "FROM Cuartel "
                + "ORDER BY proximidad";

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

    private void cargarBrigadasEnJTable() {
        DefaultTableModel model = (DefaultTableModel) jTDatos.getModel();
        model.setRowCount(0);
        BrigadaData bData = new BrigadaData();
        double cX = Double.parseDouble(jTFCoordX.getText());
        double cY = Double.parseDouble(jTFCoordY.getText());

        for (Brigada brigada : bData.brigadasLibres()) {
            // Agregar cuartel al JTable
            model.addRow(new Object[]{obtenerCercania(brigada.getIdCuartel(), cX, cY), brigada.getIdCuartel(), bData.traerNombreCuartel(brigada.getIdCuartel()), brigada.getIdBrigada(), brigada.getNombreBrigada(),
                bData.traerCiudadCuartel(brigada.getIdCuartel())});
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

    private double obtenerCercania(int idCuartel, double coordX, double coordY) {
        CuartelData cData = new CuartelData();
        double coordenadaXdeCuartel = Double.parseDouble(cData.buscarCuartel(idCuartel).getCoordenadaX());
        double coordenadaYdeCuartel = Double.parseDouble(cData.buscarCuartel(idCuartel).getCoordenadaY());

        double cercania = Math.sqrt((Math.pow(coordX - coordenadaXdeCuartel, 2) + Math.pow(coordY - coordenadaYdeCuartel, 2)));

        int grados;
        if (cercania >= 0) {
            grados = (int) Math.floor(cercania);
        } else {
            grados = (int) Math.ceil(cercania);
        }

        int minutos = (int) Math.floor((cercania - (double) grados) * 60);

        int segundos = (int) Math.floor((minutos - (double) grados) * 60);

        double distanciaKm = (grados * 111.1) + (minutos * 1.8) + (segundos * 0.031);

        return distanciaKm;

    }

    private int obtenerIdBrigada() {
        int idObtenido = -1;  // Valor predeterminado en caso de no encontrar la brigada

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConexion(); // Establece la conexión a la base de datos
            String sql = "SELECT idBrigada FROM brigada WHERE idBrigada = ?";
            stmt = conn.prepareStatement(sql);
            int idBrigada = 0;
            stmt.setInt(1, idBrigada);

            rs = stmt.executeQuery();

            if (rs.next()) {
                idObtenido = rs.getInt("idBrigada");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idObtenido;
    }

}
