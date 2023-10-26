package Ignis66.vistas;

import Ignis66.acessoADatos.Conexion;
import Ignis66.acessoADatos.CuartelData;
import Ignis66.entidades.Cuartel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class ABMCuartel extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    ;

    };
    public ABMCuartel() {
        initComponents();
        setLocationRelativeTo(null);
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnEliminar.setEnabled(false);
       /* modelarTabla();*/
        cargarCuartel();

        disableCopyPaste(txtNombre);  //deshabilita el copy paste en el textfield
        disableCopyPaste(txtDireccion);
        disableCopyPaste(txtCiudad);
        disableCopyPaste(txtProvincia);
        disableCopyPaste(txtCoordX);
        disableCopyPaste(txtCoordY);
        disableCopyPaste(txtMail);
        disableCopyPaste(txtNroTel);
        disableCopyPaste(txtBusCiu);
        disableCopyPaste(txtBusNom);
        disableCopyPaste(txtBuscId);
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

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbEstado = new javax.swing.JRadioButton();
        txtCoordX = new javax.swing.JTextField();
        txtCoordY = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtNroTel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblIdCuartel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblCoordX = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblPcia = new javax.swing.JLabel();
        lblCoordY = new javax.swing.JLabel();
        lblBuscId = new javax.swing.JLabel();
        txtBuscId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBusNom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBusCiu = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCuarte = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 0));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(20, 460, 70, 31);

        btnActualizar.setBackground(new java.awt.Color(0, 204, 204));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(153, 0, 153));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(130, 460, 83, 31);

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 51, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(270, 460, 73, 31);

        btnGuardar.setBackground(new java.awt.Color(153, 255, 153));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 153, 51));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(390, 460, 72, 31);

        btnSalir.setBackground(new java.awt.Color(153, 153, 255));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(550, 460, 67, 31);

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel6.setText("* Telefono:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 100, 47, 13);

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel7.setText("* Coordenada X:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 190, 80, 13);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel3.setText("* Coordenada Y:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 190, 90, 13);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel8.setText("* Email:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 240, 50, 13);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel9.setText("* Estado:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 240, 50, 13);

        rbEstado.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        rbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(rbEstado);
        rbEstado.setBounds(410, 260, 30, 20);

        txtCoordX.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtCoordX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoordXActionPerformed(evt);
            }
        });
        txtCoordX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCoordXKeyReleased(evt);
            }
        });
        getContentPane().add(txtCoordX);
        txtCoordX.setBounds(10, 210, 230, 21);

        txtCoordY.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtCoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCoordYKeyReleased(evt);
            }
        });
        getContentPane().add(txtCoordY);
        txtCoordY.setBounds(400, 210, 190, 21);

        txtMail.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMailKeyReleased(evt);
            }
        });
        getContentPane().add(txtMail);
        txtMail.setBounds(10, 260, 230, 21);

        txtNroTel.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtNroTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroTelActionPerformed(evt);
            }
        });
        txtNroTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNroTelKeyReleased(evt);
            }
        });
        getContentPane().add(txtNroTel);
        txtNroTel.setBounds(400, 120, 190, 21);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel10.setText("* Barrio /Ciudad:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 140, 71, 13);

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel11.setText("* Provincia:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(400, 140, 48, 21);

        txtCiudad.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiudadKeyReleased(evt);
            }
        });
        getContentPane().add(txtCiudad);
        txtCiudad.setBounds(10, 160, 230, 21);

        txtProvincia.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        txtProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProvinciaKeyReleased(evt);
            }
        });
        getContentPane().add(txtProvincia);
        txtProvincia.setBounds(400, 160, 190, 22);

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel12.setText("Código:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 50, 80, 13);

        lblIdCuartel.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        getContentPane().add(lblIdCuartel);
        lblIdCuartel.setBounds(10, 63, 60, 20);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel2.setText("* Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 50, 44, 13);

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(400, 70, 190, 21);

        txtDireccion.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(10, 110, 230, 21);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel4.setText("* Dirección:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 90, 60, 13);

        lblDireccion.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(269, 39, 80, 21);

        lblCiudad.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(342, 194, 100, 21);

        lblCoordX.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        lblCoordX.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblCoordX);
        lblCoordX.setBounds(250, 210, 112, 21);

        jLabel15.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(408, 391, 112, 0);

        lblMail.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblMail);
        lblMail.setBounds(414, 391, 106, 0);

        lblNombre.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblNombre);
        lblNombre.setBounds(1039, 33, 71, 0);

        lblTelefono.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(1039, 39, 76, 21);

        lblPcia.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        lblPcia.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblPcia);
        lblPcia.setBounds(791, 93, 342, 22);

        lblCoordY.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        lblCoordY.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblCoordY);
        lblCoordY.setBounds(791, 338, 342, 0);

        lblBuscId.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblBuscId.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscId.setText("Ingrese ID a Bucar:");
        getContentPane().add(lblBuscId);
        lblBuscId.setBounds(20, 320, 81, 13);

        txtBuscId.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtBuscId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscId);
        txtBuscId.setBounds(20, 340, 80, 23);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingrese Nombre a Bucar:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 320, 107, 13);

        txtBusNom.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtBusNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusNomActionPerformed(evt);
            }
        });
        txtBusNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusNomKeyReleased(evt);
            }
        });
        getContentPane().add(txtBusNom);
        txtBusNom.setBounds(200, 340, 154, 21);

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Ingrese Ciudad a Buscar:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 320, 116, 13);

        txtBusCiu.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtBusCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusCiuKeyReleased(evt);
            }
        });
        getContentPane().add(txtBusCiu);
        txtBusCiu.setBounds(400, 340, 130, 21);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(177, 27));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("ABM DE CUARTELES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 599, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 27);

        jLabel14.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("(*) <-- Campos obligatorios ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(252, 30, 150, 15);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(6, 46, 720, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 302, 710, 20);

        tblCuarte.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCuarte);
        if (tblCuarte.getColumnModel().getColumnCount() > 0) {
            tblCuarte.getColumnModel().getColumn(0).setMinWidth(20);
            tblCuarte.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblCuarte.getColumnModel().getColumn(0).setMaxWidth(20);
            tblCuarte.getColumnModel().getColumn(1).setMinWidth(80);
            tblCuarte.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblCuarte.getColumnModel().getColumn(1).setMaxWidth(80);
            tblCuarte.getColumnModel().getColumn(2).setMinWidth(50);
            tblCuarte.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblCuarte.getColumnModel().getColumn(2).setMaxWidth(50);
            tblCuarte.getColumnModel().getColumn(3).setMinWidth(30);
            tblCuarte.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblCuarte.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 370, 510, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos() {
        lblIdCuartel.setText(null);
        txtNombre.setText(null);
        txtDireccion.setText(null);
        txtCiudad.setText(null);
        txtProvincia.setText(null);
        txtNroTel.setText(null);
        txtCoordX.setText(null);
        txtCoordY.setText(null);
        txtMail.setText(null);
        rbEstado.setSelected(false);
        txtBusCiu.setText(null);
        txtBusNom.setText(null);
        txtBuscId.setText(null);

    }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        CuartelData cdata = new CuartelData();
        Cuartel ctl = new Cuartel();
        try {
            /*ctl.setIdCuartel(Integer.parseInt(lblIdCuartel.getText()));*/
            ctl.setNombreCuartel(txtNombre.getText());
            ctl.setDireccion(txtDireccion.getText());
            ctl.setCiudad(txtCiudad.getText());
            ctl.setProvincia(txtProvincia.getText());
            ctl.setTelefono(txtNroTel.getText());
            ctl.setCoordenadaX(txtCoordX.getText());
            ctl.setCoordenadaY(txtCoordY.getText());
            ctl.setCorreo(txtMail.getText());
            ctl.setEstado((String) rbEstado.getText());
              
            cdata.modificarCuartel(ctl, Integer.parseInt(lblIdCuartel.getText()));
            
           limpiarCampos();
           /* modelarTabla();*/
            cargarCuartel();
      
        
        } catch (NumberFormatException ne) {
            mensaje("Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           mensaje("Debe completar correctamente todos los campos obligatorios");}
    
           
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void rbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEstadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir de esta pantalla?", "Ignis - Salir de la Aplicación", JOptionPane.YES_NO_OPTION) == 0) {
            dispose();
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCoordXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoordXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoordXActionPerformed

    private void txtNroTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroTelActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        validarCorreo();

    }//GEN-LAST:event_txtMailActionPerformed

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        validar();


    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

        validar();

    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNroTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroTelKeyReleased
        validar();

    }//GEN-LAST:event_txtNroTelKeyReleased

    private void txtCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyReleased
        validar();

    }//GEN-LAST:event_txtCiudadKeyReleased

    private void txtProvinciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvinciaKeyReleased
        validar();

    }//GEN-LAST:event_txtProvinciaKeyReleased

    private void txtCoordXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoordXKeyReleased
        validar();

    }//GEN-LAST:event_txtCoordXKeyReleased

    private void txtCoordYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoordYKeyReleased
        validar();

    }//GEN-LAST:event_txtCoordYKeyReleased

    private void txtMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyReleased
        validar();

    }//GEN-LAST:event_txtMailKeyReleased

    private void txtBusNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusNomActionPerformed

    private void txtBusNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusNomKeyReleased
        if (txtBusNom.getText().isEmpty()) {
            limpiarCampos();
            cargarCuartel();
            txtBusCiu.setEnabled(true);
            txtBuscId.setEnabled(true);
        } else {
            txtBusCiu.setEnabled(false);
            txtBuscId.setEnabled(false);
            buscarNOMCuartel(txtBusNom.getText());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusNomKeyReleased

    private void txtBusCiuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusCiuKeyReleased
        if (txtBusCiu.getText().isEmpty()) {
            limpiarCampos();
            cargarCuartel();
            txtBusNom.setEnabled(true);
            txtBuscId.setEnabled(true);

        } else {
            txtBusNom.setEnabled(false);
            txtBuscId.setEnabled(false);
            buscarCIUCuartel(txtBusCiu.getText());
    }//GEN-LAST:event_txtBusCiuKeyReleased
    }
    private void txtBuscIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscIdKeyReleased
        if (txtBuscId.getText().isEmpty()) {
            limpiarCampos();
            cargarCuartel();
            txtBusNom.setEnabled(true);
            txtBusCiu.setEnabled(true);
        } else {
            txtBusNom.setEnabled(false);
            txtBusCiu.setEnabled(false);
            buscarIDCuartel(txtBuscId.getText());
    }//GEN-LAST:event_txtBuscIdKeyReleased
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
        cargarCuartel();
        txtBusNom.setEnabled(true);
            txtBusCiu.setEnabled(true);
         txtBuscId.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       CuartelData cdata = new CuartelData();
        Cuartel cuartel = new Cuartel();     
           try {
             cuartel.setNombreCuartel(txtNombre.getText());
            cuartel.setDireccion(txtDireccion.getText());
            cuartel.setCiudad(txtCiudad.getText());
            cuartel.setProvincia(txtProvincia.getText());
            cuartel.setTelefono(txtNroTel.getText());
            cuartel.setCoordenadaX(txtCoordX.getText());
            cuartel.setCoordenadaY(txtCoordY.getText());
            cuartel.setCorreo(txtMail.getText());
            cuartel.setEstado((String) rbEstado.getText());
              
            cdata.altaCuartel(cuartel);
            
           limpiarCampos();
            /*modelarTabla();*/
            cargarCuartel();
        
         } catch (NumberFormatException ne) {
            mensaje("Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           mensaje("Debe completar correctamente todos los campos obligatorios");}
    
           
                 




// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void validar() {

        if (txtNombre.getText().isEmpty()) {
            lblNombre.setText("Campo Requerido");
        } else {
            lblNombre.setText("");
        }
        if (txtCiudad.getText().isEmpty()) {
            lblCiudad.setText("Campo Requerido");
        } else {
            lblCiudad.setText("");
        }
        if (txtCoordX.getText().isEmpty()) {
            lblCoordX.setText("Campo Requerido");
        } else {
            lblCoordX.setText("");
        }
        if (txtCoordY.getText().isEmpty()) {
            lblCoordY.setText("Campo Requerido");
        } else {
            lblCoordY.setText("");
        }
        if (txtDireccion.getText().isEmpty()) {
            lblDireccion.setText("Campo Requerido");
        } else {
            lblDireccion.setText("");
        }
        if (txtMail.getText().isEmpty()) {
            lblMail.setText("Campo Requerido");
        } else {

            lblMail.setText("");

        }

        if (txtNroTel.getText().isEmpty()) {
            lblTelefono.setText("Campo Requerido");
        } else if (txtNroTel.getText().length() != 10) {
        } else {
            lblTelefono.setText("");
        }
        if (txtProvincia.getText().isEmpty()) {
            lblPcia.setText("Campo Requerido");
        } else {
            lblPcia.setText("");
        }

        if (txtNombre.getText().isEmpty() || txtCiudad.getText().isEmpty() || txtCoordX.getText().isEmpty()
                || txtCoordY.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtMail.getText().isEmpty()
                || txtNroTel.getText().isEmpty() || txtProvincia.getText().isEmpty()) {

            btnGuardar.setEnabled(false);
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnLimpiar.setEnabled(false);
        } else {
            btnGuardar.setEnabled(true);
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnLimpiar.setEnabled(true);
        }

    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ABMCuartel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABMCuartel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABMCuartel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABMCuartel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMCuartel().setVisible(true);
            }
        });

    }

    public void buscarIDCuartel(String idCuartel) {

        String reg[] = new String[5];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Estado"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where idCuartel LIKE'%" + idCuartel + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
          
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuarte.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(10);
                
                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            mensaje("Error en la carga de datos ");
        }

    }

    public void buscarNOMCuartel(String nombre) {

        String reg[] = new String[5];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Estado"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where nombreCuartel LIKE'%" + nombre + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuarte.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(10);
         

                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
    }

    public void buscarCIUCuartel(String Ciudad) {

        String reg[] = new String[5];
        String nCol[] = {"ID", "Nombre", "Dirección", "Ciudad", "Estado"};
        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel where ciudad LIKE'%" + Ciudad + "%'";
        DefaultTableModel model = new DefaultTableModel(null, nCol) {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        ;
        };
        
        tblCuarte.setModel(model);

        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(3);
                reg[3] = rs.getString(4);
                reg[4] = rs.getString(10);
                
                model.addRow(reg);
            }

            ps.close();

        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
    }

    private void validarCorreo() {
        lblMail.setText((ABMCuartel.ValidarEmail(txtMail.getText().trim())) ? "mail valido" : "mail invalido");//con trim obviamos espacios al principio o al final del textfield.

    }

    public static boolean ValidarEmail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    public DefaultTableModel cargarCuartel() {

        String[] nCol = {"ID", "Nombre", "Barrio/Ciudad", "Telefono", "Estado"};
        String[] reg = new String[5];
       /*tblCuarte.setModel(modelo);*/
     tblCuarte.getTableHeader().setReorderingAllowed(false);//no mueve tabla
       /*  tblCuarte.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblCuarte.getColumnModel().getColumn(1).setPreferredWidth(30);
        tblCuarte.getColumnModel().getColumn(2).setPreferredWidth(30);
        tblCuarte.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblCuarte.getColumnModel().getColumn(4).setPreferredWidth(12);*/
    DefaultTableModel modelo = new DefaultTableModel(null, nCol) {
        
        public boolean isCellEditable(int f, int c) {
                return false;
            };
        };
        tblCuarte.setModel(modelo);

        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM Cuartel ";

        try {

            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reg[0] = rs.getString(1);
                reg[1] = rs.getString(2);
                reg[2] = rs.getString(4);
                reg[3] = rs.getString(6);
                reg[4] = rs.getString(10);

                modelo.addRow(reg);
            }
            ps.close();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
        return modelo;

    }

  /*  private void modelarTabla() {
        modelo.addColumn("bbID");
        modelo.addColumn("bbNombre");
        modelo.addColumn("bbBarrio / Ciudad");
        modelo.addColumn("bbProvincia");
        modelo.addColumn("bbEstado");
        tblCuarte.setModel(modelo);
        tblCuarte.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblCuarte.getColumnModel().getColumn(1).setPreferredWidth(30);
        tblCuarte.getColumnModel().getColumn(2).setPreferredWidth(30);
        tblCuarte.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblCuarte.getColumnModel().getColumn(4).setPreferredWidth(12);
    }*/

    private void limpiarTabla() {
        int i = 0;
        while (modelo.getRowCount() != 0) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBuscId;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCoordX;
    private javax.swing.JLabel lblCoordY;
    private javax.swing.JLabel lblDireccion;
    public static javax.swing.JLabel lblIdCuartel;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPcia;
    private javax.swing.JLabel lblTelefono;
    public static javax.swing.JRadioButton rbEstado;
    private javax.swing.JTable tblCuarte;
    private javax.swing.JTextField txtBusCiu;
    private javax.swing.JTextField txtBusNom;
    private javax.swing.JTextField txtBuscId;
    public static javax.swing.JTextField txtCiudad;
    public static javax.swing.JTextField txtCoordX;
    public static javax.swing.JTextField txtCoordY;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtMail;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtNroTel;
    public static javax.swing.JTextField txtProvincia;
    // End of variables declaration//GEN-END:variables
}
