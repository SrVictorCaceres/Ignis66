
package Ignis66.vistas;

import Ignis66.acessoADatos.Conexion;
import Ignis66.acessoADatos.MovilData;
import Ignis66.entidades.Movil;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MovilFormulario extends javax.swing.JFrame {

    private MovilData movilData;
    private Connection conexion;
    
    public MovilFormulario() {
        initComponents();
        conexion = Conexion.getConexion(); // conexión a la base de datos
        movilData = new MovilData(conexion); //instancia de MovilData
        cargarDatosDesdeBaseDeDatos(); 
        jCBTV.addItem("Camión bomba");
        jCBTV.addItem("Autoescala");
        jCBTV.addItem("Bomba Nodriza");
        jCBTV.addItem("Unidad Rescate"); //Unidad de Rescate
        jCBTV.addItem("Unidad M Peligrosos"); //Unidad de materiales peligrosos NRBQ
        jCBTV.addItem("Camión Forestal");
        jCBTV.addItem("Vehículos Aeropuerto"); //Vehículos de Aeropuerto
        jCBTV.addItem("Barco Contraincendios"); //Barco contraincendios
        jCBTV.addItem("Aeronaves E. Incendios"); //Aeronaves de extinción de incendios
        jCBTV.addItem("Trailer");
        // Agrega un ActionListener al JComboBox jCBTV para actualizar las opciones de jCBModelo
        jCBTV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarModelosDisponibles();
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);//no mueve tabla
        // Llena las opciones de jCBModelo
        actualizarModelosDisponibles();
         // Agrega DocumentFilter al campo de texto jTFPatente, pero no se porque no funciona
        ((AbstractDocument) jTFPatente.getDocument()).setDocumentFilter(new PatenteDocumentFilter());
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCBTV = new javax.swing.JComboBox<>();
        jTFPatente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCBModelo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("Vehículos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo de Vehículo", "Patente", "Modelo", "Tripulantes", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable1.getColumnModel().getColumn(2).setMinWidth(70);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(4).setMinWidth(75);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(75);
            jTable1.getColumnModel().getColumn(5).setMinWidth(110);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(110);
        }

        jLabel2.setText("TIPO DE VEHICULO");

        jLabel3.setText("PATENTE");

        jLabel4.setText("MODELO");

        jCBModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCBTV, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jTFPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jCBModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarModelosDisponibles() {
        jCBModelo.removeAllItems(); // limpia las opciones actuales

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int startYear = currentYear - 15;

        // agrega modelos de vehículo dentro del rango de años
        for (int year = currentYear; year >= startYear; year--) {
            jCBModelo.addItem("Modelo " + year);
        }
    }
class PatenteDocumentFilter extends DocumentFilter {

    private String tipoVehiculoSeleccionado;
    private int anioModelo;

    public void setTipoVehiculoSeleccionado(String tipoVehiculo) {
        tipoVehiculoSeleccionado = tipoVehiculo;
    }

    public void setAnioModelo(int anioModelo) {
        anioModelo = anioModelo;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
        Document doc = fb.getDocument();
        String currentText = doc.getText(0, doc.getLength());
        String newText = currentText.substring(0, offset) + text + currentText.substring(offset);

        // Modifica el filtro para permitir solo letras mayúsculas, taampoco funciona
        String uppercaseText = text.toUpperCase(); // Convertir el texto a mayúsculas, tampoco funciona

        if (!uppercaseText.matches("^[A-Z]*$")) {
            return;
        }

        // Restringe la longitud de la patente según el tipo de vehículo, no funciona
        if (tipoVehiculoSeleccionado.equals("Aeronaves E. Incendios") && newText.length() != 5) {
            return;
        } else if (tipoVehiculoSeleccionado.equals("Barco Contraincendios") && newText.length() != 6) {
            return;
        } else if (tipoVehiculoSeleccionado.equals("Trailer") && newText.length() != 9) {
            return;
        } else if (newText.length() != 6 && newText.length() != 7) {
            return;
        }

        super.insertString(fb, offset, uppercaseText, attr);
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
            java.util.logging.Logger.getLogger(MovilFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovilFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovilFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovilFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(MovilFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(MovilFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(MovilFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(MovilFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MovilFormulario formulario = new MovilFormulario();
            formulario.setVisible(true);

            // Acá, después de mostrar el formulario, se puede llamar a un método para cargar los datos en la tabla
            formulario.cargarDatosDesdeBaseDeDatos();
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBModelo;
    private javax.swing.JComboBox<String> jCBTV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFPatente;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   private void cargarDatosDesdeBaseDeDatos() {
        
        List<Movil> listaMoviles = movilData.listarMoviles();

        // Toma el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Limpia la tabla si hubiera datos cargados
        model.setRowCount(0);

        // Llena la tabla con los datos de la base de datos
        for (Movil movil : listaMoviles) {
            model.addRow(new Object[] {
                movil.getIdMovil(),
                movil.getTipoVehiculo(),
                movil.getPatente(),
                movil.getAñoModelo(),
                movil.getTripulantes(),
                movil.getEstado()
            });
        }
    }
 }   
