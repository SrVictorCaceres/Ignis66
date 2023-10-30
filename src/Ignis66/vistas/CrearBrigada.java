
package Ignis66.vistas;

import Ignis66.acessoADatos.BrigadaData;
import Ignis66.acessoADatos.Conexion;
import Ignis66.entidades.Brigada;
import Ignis66.entidades.EspBrigada;
import Ignis66.entidades.NomBrigada;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CrearBrigada extends javax.swing.JFrame {
    
      private String idCuartelSeleccionado;
   
      private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        };
        
        
      };

    
    public CrearBrigada() {
        initComponents();
        llenarComboNBrigada();
        
        cargarCuarteles();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbB = new javax.swing.JComboBox<>();
        jlCuartelSeleccionado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCuarteles = new javax.swing.JTable();
        jcbE = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.red);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Ingresar Brigadas al Sistema");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Brigada: ");

        jlCuartelSeleccionado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jButton1.setText("Crear Brigada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Especialidad: ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Seleccione en la tabla el Cuartel al que pertenecerá la Brigada:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("El Cuartel seleccionado es:");

        tblCuarteles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Barrio/Ciudad", "Provincia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCuarteles.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCuarteles.getTableHeader().setResizingAllowed(false);
        tblCuarteles.getTableHeader().setReorderingAllowed(false);
        tblCuarteles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuartelesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCuarteles);
        if (tblCuarteles.getColumnModel().getColumnCount() > 0) {
            tblCuarteles.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblCuarteles.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblCuarteles.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblCuarteles.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jcbE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INCENDIO", "RESCATE", "MAT. PELIGROSOS", "INC. FORESTALES", "ACUATICA", "CANINA ", "MONTAÑA", "BUCEO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCuartelSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbE, 0, 190, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcbB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCuartelSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Brigada brigada = new Brigada();
        brigada.setNombreBrigada(jcbB.getSelectedItem().toString());
        brigada.setEspecialidad(jcbE.getSelectedItem().toString());
        brigada.setActivo("ACTIVO");
        brigada.setLibre("LIBRE");
        
         
        BrigadaData bData = new BrigadaData();
       int idCS = Integer.parseInt(idCuartelSeleccionado);
        bData.agregarBrigada(brigada, idCS);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir de esta pantalla?", "Ignis - Salir de la Aplicación", JOptionPane.YES_NO_OPTION) == 0) {
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblCuartelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuartelesMouseClicked
       
        int seleccion = tblCuarteles.getSelectedRow();
        idCuartelSeleccionado = tblCuarteles.getValueAt(seleccion, 0).toString();
        jlCuartelSeleccionado.setText("(" +idCuartelSeleccionado +") " + tblCuarteles.getValueAt(seleccion, 1));
        
        
    }//GEN-LAST:event_tblCuartelesMouseClicked

      public void buscarIDCuartel(String idCuartel) {

        String reg[] = new String[5];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Provincia"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where idCuartel LIKE'%" + idCuartel + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
          
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuarteles.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
                
                
                
                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }

    }

    public void buscarNOMCuartel(String nombre) {

        String reg[] = new String[5];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Provincia"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where nombreCuartel LIKE'%" + nombre + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuarteles.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
               
         

                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
    }

    public void buscarCIUCuartel(String Ciudad) {

        String reg[] = new String[5];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Provincia"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where ciudad LIKE'%" + Ciudad + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuarteles.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(5);
            
                
                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
    }

    public DefaultTableModel cargarCuarteles() {

        String[] nCol = {"ID", "Nombre", "Barrio/Ciudad",  "Provincia"};
        String[] reg = new String[4];
       
 //    tblCuarteles.getTableHeader().setReorderingAllowed(false);//no mueve tabla
    
    DefaultTableModel modelo = new DefaultTableModel(null, nCol) {
        
        public boolean isCellEditable(int f, int c) {
                return false;
            };
        };
        
        
    
        tblCuarteles.setModel(modelo);

        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM cuartel WHERE estado = 'activo'";

        try {

            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(4);
                reg[3] = rs.getString(5);
          
               

                modelo.addRow(reg);
            }
            ps.close();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
        return modelo;

    }

   
    
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
            java.util.logging.Logger.getLogger(CrearBrigada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearBrigada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearBrigada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearBrigada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearBrigada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<NomBrigada> jcbB;
    private javax.swing.JComboBox<String> jcbE;
    private javax.swing.JLabel jlCuartelSeleccionado;
    private javax.swing.JTable tblCuarteles;
    // End of variables declaration//GEN-END:variables

    public void llenarComboNBrigada(){
        jcbB.addItem(NomBrigada.ALFA);
        jcbB.addItem(NomBrigada.BRAVO);
        jcbB.addItem(NomBrigada.CHARLIE);
        jcbB.addItem(NomBrigada.DELTA);
        jcbB.addItem(NomBrigada.ECHO);
        jcbB.addItem(NomBrigada.FOXTROT);
        jcbB.addItem(NomBrigada.GOLF);
        jcbB.addItem(NomBrigada.HOTEL);
    }
    
     

}
