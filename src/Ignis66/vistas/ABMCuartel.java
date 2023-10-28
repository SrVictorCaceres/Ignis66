package Ignis66.vistas;

import Ignis66.acessoADatos.Conexion;
import Ignis66.acessoADatos.CuartelData;
import Ignis66.entidades.Bombero;
import Ignis66.entidades.Cuartel;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnLimpiar.setEnabled(true);
        btnEliminar.setEnabled(false);
        modelarTabla();
        cargarCuartel();
        validar();
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
        component.getInputMap().put(KeyStroke.getKeyStroke("control c"), "none");
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
        jcbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

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
        setPreferredSize(new java.awt.Dimension(700, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 0));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(0, 204, 204));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(153, 0, 153));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 51, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(153, 255, 153));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 153, 51));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        btnSalir.setBackground(new java.awt.Color(153, 153, 255));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 67, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel6.setText("  Telefono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel7.setText("  Coordenada X:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel3.setText("  Coordenada Y:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel8.setText("  Email:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 50, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel9.setText("  Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 50, -1));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoordXKeyTyped(evt);
            }
        });
        getContentPane().add(txtCoordX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 230, -1));

        txtCoordY.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtCoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCoordYKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoordYKeyTyped(evt);
            }
        });
        getContentPane().add(txtCoordY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 230, -1));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailKeyTyped(evt);
            }
        });
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 190, -1));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroTelKeyTyped(evt);
            }
        });
        getContentPane().add(txtNroTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 190, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel10.setText(" Barrio /Ciudad:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 140, 80, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel11.setText("  Provincia:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, 21));

        txtCiudad.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiudadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 230, -1));

        txtProvincia.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        txtProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProvinciaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvinciaKeyTyped(evt);
            }
        });
        getContentPane().add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 190, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel12.setText("Código:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        lblIdCuartel.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        getContentPane().add(lblIdCuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 60, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel2.setText(" Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 50, 60, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 190, -1));

        txtDireccion.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel4.setText(" Dirección:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        lblDireccion.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 109, 140, 20));

        lblCiudad.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 110, 20));

        lblCoordX.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblCoordX.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblCoordX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 112, 21));

        jLabel15.setFont(new java.awt.Font("Roboto", 2, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 391, 112, -1));

        lblMail.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 130, 20));

        lblNombre.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 73, 140, 20));

        lblTelefono.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 130, 20));

        lblPcia.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblPcia.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblPcia, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 163, 150, 20));

        lblCoordY.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblCoordY.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblCoordY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 140, 20));

        lblBuscId.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblBuscId.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscId.setText("Ingrese ID a buscar:");
        getContentPane().add(lblBuscId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txtBuscId.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtBuscId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingrese Nombre a buscar:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusNomKeyTyped(evt);
            }
        });
        getContentPane().add(txtBusNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 154, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Ingrese Ciudad a buscar:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 116, -1));

        txtBusCiu.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtBusCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusCiuKeyReleased(evt);
            }
        });
        getContentPane().add(txtBusCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 130, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("(*) <-- Campos obligatorios ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 30, 150, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 720, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, 710, 20));

        tblCuarte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCuarte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuarteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCuarte);
        if (tblCuarte.getColumnModel().getColumnCount() > 0) {
            tblCuarte.getColumnModel().getColumn(0).setResizable(false);
            tblCuarte.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblCuarte.getColumnModel().getColumn(1).setResizable(false);
            tblCuarte.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblCuarte.getColumnModel().getColumn(2).setResizable(false);
            tblCuarte.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblCuarte.getColumnModel().getColumn(3).setResizable(false);
            tblCuarte.getColumnModel().getColumn(3).setPreferredWidth(120);
            tblCuarte.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 700, 90));

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        getContentPane().add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 190, -1));

        lblEstado.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 140, 20));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("(*)");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 30));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("(*)");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, 20, 20));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("(*)");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 20, 20));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("(*)");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, 20, 20));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("(*)");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 20, 10));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("(*)");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 20, 30));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("(*)");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 20, 40));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setText("(*)");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 20, 10));

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jLabel24.setText("(*)");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 20, 30));

        jLabel25.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setText("(*)");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 20, 30));

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
        txtBusCiu.setText(null);
        txtBusNom.setText(null);
        txtBuscId.setText(null);
        jcbEstado.setSelectedItem(null);
        validar();

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
            ctl.setEstado((String) jcbEstado.getSelectedItem());
            cdata.modificarCuartel(ctl, Integer.parseInt(lblIdCuartel.getText()));
            
            limpiarCampos();
              limpiarTabla(); 
            cargarCuartel();

        } catch (NumberFormatException ne) {
            mensaje("No existen datos para modificar. Intente nuevamente.");
        } catch (NullPointerException np) {
            mensaje("Debe completar correctamente todos los campos obligatorios");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

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
        CuartelData cdata = new CuartelData();
        Cuartel ctl = new Cuartel();
        try {
            if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el registro seleccionado?", "Ignis - Advertencia de la Aplicación", JOptionPane.YES_NO_OPTION) == 0) {
                cdata.eliminaCuartel(ctl, Integer.parseInt(lblIdCuartel.getText()));
               
                limpiarTabla(); 
                cargarCuartel();
                limpiarCampos();
               
                txtBusCiu.setEnabled(false);
                txtBuscId.setEnabled(false);
                txtBusNom.setEnabled(false);

            }

        } catch (NullPointerException np) {
            mensaje("Debe completar correctamente todos los campos obligatorios");
        }
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
        validar();
        txtBusNom.setEnabled(true);
        txtBusCiu.setEnabled(true);
        txtBuscId.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        CuartelData cdata = new CuartelData();
        Cuartel cuartel = new Cuartel();

        if (lblIdCuartel == null) {
            mensaje("imposible realizar la opereción, Solo puede actualizar el registro");
        } else {
            try {
                cuartel.setNombreCuartel(txtNombre.getText());
                cuartel.setDireccion(txtDireccion.getText());
                cuartel.setCiudad(txtCiudad.getText());
                cuartel.setProvincia(txtProvincia.getText());
                cuartel.setTelefono(txtNroTel.getText());
                cuartel.setCoordenadaX(txtCoordX.getText());
                cuartel.setCoordenadaY(txtCoordY.getText());
                cuartel.setCorreo(txtMail.getText());
                cuartel.setEstado((String) jcbEstado.getSelectedItem());

                cdata.altaCuartel(cuartel);

                limpiarCampos();
                limpiarTabla(); 
                cargarCuartel();
            } catch (NullPointerException np) {
                mensaje("Debe completar correctamente todos los campos obligatorios");
            } catch (NumberFormatException ne) {
                mensaje("Error al intentar guardar el Registro. Intente nuevamente.");

            }
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblCuarteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuarteMouseClicked

        int filaSelec = tblCuarte.getSelectedRow();
        // String[] registros = new String[10];//
        CuartelData cdata = new CuartelData();
        String idCuartel = tblCuarte.getValueAt(filaSelec, 0).toString();
        int idC = Integer.parseInt(idCuartel);
        Cuartel c = cdata.buscarCuartel(idC);
        lblIdCuartel.setText(idC + "");

        txtNombre.setText(c.getNombreCuartel());

        txtDireccion.setText(c.getDireccion());

        txtCiudad.setText(c.getCiudad());
        txtNroTel.setText(c.getTelefono());
        txtProvincia.setText(c.getProvincia());

        txtCoordX.setText(c.getCoordenadaX());

        txtCoordY.setText(c.getCoordenadaY());

        txtMail.setText(c.getCorreo());

        jcbEstado.setSelectedItem(c.getEstado());

        validar();
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnSalir.setEnabled(true);
        txtBusNom.setEnabled(false);
        txtBusCiu.setEnabled(false);
        txtBuscId.setEnabled(false);
    }//GEN-LAST:event_tblCuarteMouseClicked

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped

        if (txtDireccion.getText().length() >= 30) {
            evt.consume();
            mensaje("Solo se admiten 30 caracteres");
        }


    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        if (txtNombre.getText().length() >= 30) {
            evt.consume();
            mensaje("Solo se admiten 30 caracteres");
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNroTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroTelKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
            mensaje("Solo se admiten 10 caracteres númericos");
        }

        if (txtNroTel.getText().trim().length() == 10) {
            evt.consume();
        }


    }//GEN-LAST:event_txtNroTelKeyTyped

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
       if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();

        }

        if (txtCiudad.getText().length() == 22) {

            mensaje("Solo se admiten 22 caracteres");
            evt.consume();

    }     

    }//GEN-LAST:event_txtCiudadKeyTyped

    private void txtProvinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvinciaKeyTyped

        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();

        }

        if (txtProvincia.getText().length() == 22) {

            mensaje("Solo se admiten 22 caracteres");
            evt.consume();

    }//GEN-LAST:event_txtProvinciaKeyTyped
    }
    private void txtCoordXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoordXKeyTyped
        if (txtCoordX.getText().trim().length() == 20) {
            evt.consume();
            mensaje("Solo se admiten 20 caracteres");
        }

    }//GEN-LAST:event_txtCoordXKeyTyped

    private void txtCoordYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoordYKeyTyped
        if (txtCoordY.getText().length() >= 20) {
            evt.consume();
            mensaje("Solo se admiten 20 caracteres");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoordYKeyTyped

    private void txtMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyTyped
        if (txtMail.getText().trim().length() >= 30) {
            evt.consume();
            mensaje("Solo se admiten 30 caracteres");
        }

    }//GEN-LAST:event_txtMailKeyTyped

    private void txtBuscIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscIdKeyTyped

        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57 && !(evt.getKeyChar() == KeyEvent.VK_SPACE); //Solo caracteres númericos

        if (!numeros) {
            evt.consume();

        }

        if (txtBuscId.getText().trim().length() == 4) {
            evt.consume();
            mensaje("Solo se admiten 4 caracteres númericos");
        }


    }//GEN-LAST:event_txtBuscIdKeyTyped

    private void txtBusNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusNomKeyTyped


    }//GEN-LAST:event_txtBusNomKeyTyped

    public void validar() {
        if (lblIdCuartel.getText() == null) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }
        if (txtNombre.getText().isEmpty()) {
            lblNombre.setText("Campo Requerido");

        } else if (txtNombre.getText().length() >= 30) {
        } else {
            lblNombre.setText("");
            txtBusNom.setEnabled(false);
            txtBusCiu.setEnabled(false);
            txtBuscId.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnActualizar.setEnabled(true);
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
            txtBusNom.setEnabled(false);
            txtBusCiu.setEnabled(false);
            txtBuscId.setEnabled(false);

            btnEliminar.setEnabled(false);
            btnActualizar.setEnabled(true);

        }
        if (txtMail.getText().isEmpty()) {
            lblMail.setText("Campo Requerido");
        } else {
            lblMail.setText("");
        }
        if (jcbEstado.getSelectedItem() == null) {
            lblEstado.setText("Campo Requerido");
        } else {
            lblEstado.setText("");
        }

        if (txtNroTel.getText().isEmpty()) {
            lblTelefono.setText("Campo Requerido");

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
            /*btnGuardar.setEnabled(true);*/
            btnLimpiar.setEnabled(true);
            btnActualizar.setEnabled(true);
            /*btnEliminar.setEnabled(true);*/

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
        txtMail.setText((ABMCuartel.ValidarEmail(txtMail.getText().trim())) ? "mail valido" : "mail invalido");//con trim obviamos espacios al principio o al final del textfield.

    }

    public static boolean ValidarEmail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    public void cargarCuartel() {
        limpiarCampos();
        CuartelData cdata = new CuartelData();
        for (Cuartel cuartel : cdata.listarCuartel()) {
            modelo.addRow(new Object[]{cuartel.getIdCuartel(), cuartel.getNombreCuartel(), cuartel.getDireccion(), cuartel.getCiudad(), cuartel.getEstado()});
            tblCuarte.setVisible(false);
            tblCuarte.setModel(modelo);
            modelo.fireTableDataChanged();
            tblCuarte.setVisible(true);
        }

    }

    private void modelarTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("direccion");
        modelo.addColumn("Barrio / Ciudad");
        modelo.addColumn("Estado");
        tblCuarte.setModel(modelo);
        tblCuarte.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblCuarte.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblCuarte.getColumnModel().getColumn(2).setPreferredWidth(300);
        tblCuarte.getColumnModel().getColumn(3).setPreferredWidth(200);
        tblCuarte.getColumnModel().getColumn(4).setPreferredWidth(120);
    }

    private void limpiarTabla() {
        int i = 0;
        while (modelo.getRowCount() != 0) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnActualizar;
    public static javax.swing.JButton btnEliminar;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnLimpiar;
    public static javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    public static javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JLabel lblBuscId;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCoordX;
    private javax.swing.JLabel lblCoordY;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstado;
    public static javax.swing.JLabel lblIdCuartel;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPcia;
    private javax.swing.JLabel lblTelefono;
    public static javax.swing.JTable tblCuarte;
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
