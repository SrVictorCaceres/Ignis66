
package Ignis66.vistas;

import Ignis66.acessoADatos.BomberoData;
import Ignis66.acessoADatos.BrigadaData;
import Ignis66.acessoADatos.Conexion;
import Ignis66.acessoADatos.CuartelData;
import Ignis66.entidades.Bombero;
import Ignis66.entidades.Brigada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;


public class AsignarBrigada extends javax.swing.JFrame {

    int idCuartel;
    int idBrigada;
    
    ArrayList<Brigada> lista = new ArrayList();
        
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int f, int c){
                return false;
            }
            
        };
        
        DefaultTableModel modelo2 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int f, int c){
                return false;
            }
        };
        
        DefaultTableModel modelo3 = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int f, int c){
                return false;
            }
        };
        
        
    /**
     * Creates new form AsignarBrigada
     */
    public AsignarBrigada() {
        initComponents();
        validacion();
        armarTabla();
        armarTabla2();
        armarTablaFinal();
        cargarCuarteles();
        setDefaultCloseOperation(0); //para desactivar la X(cerrar) del formulario.
        botAgregar();
        disableCopyPaste(txtBrigada);
        disableCopyPaste(txtEspecialidad);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBomberos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBrigadas = new javax.swing.JTable();
        botonOK = new javax.swing.JButton();
        asignarBrigada = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBrigada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        errorBomberos = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaBB = new javax.swing.JTable();
        quitarBombero = new javax.swing.JButton();
        limpiarCampos = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cantidadBomberos = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ComboBoxCuarteles = new javax.swing.JComboBox<>();
        botonAgregar = new javax.swing.JButton();
        jVaciarBrigada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.red);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Asignación de Brigadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(747, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 916, 29);

        tablaBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre Completo", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaBomberos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBomberosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBomberos);
        if (tablaBomberos.getColumnModel().getColumnCount() > 0) {
            tablaBomberos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaBomberos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaBomberos.getColumnModel().getColumn(2).setPreferredWidth(60);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 380, 370, 170);

        tablaBrigadas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaBrigadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBrigadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaBrigadas);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 150, 820, 130);

        botonOK.setText("OK");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });
        getContentPane().add(botonOK);
        botonOK.setBounds(530, 80, 50, 30);

        asignarBrigada.setText("Asignar Brigada");
        asignarBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarBrigadaActionPerformed(evt);
            }
        });
        getContentPane().add(asignarBrigada);
        asignarBrigada.setBounds(700, 520, 175, 32);

        jLabel2.setText("Brigada: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 300, 90, 16);

        txtBrigada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBrigadaKeyTyped(evt);
            }
        });
        getContentPane().add(txtBrigada);
        txtBrigada.setBounds(290, 290, 110, 30);

        jLabel3.setText("Especialidad: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 300, 140, 16);

        txtEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecialidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtEspecialidad);
        txtEspecialidad.setBounds(650, 290, 140, 30);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(700, 570, 175, 32);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Brigadas del Cuartel seleccionado");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 130, 210, 15);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(40, 70, 820, 10);

        errorBomberos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorBomberos.setForeground(new java.awt.Color(204, 0, 0));
        errorBomberos.setText("!");
        getContentPane().add(errorBomberos);
        errorBomberos.setBounds(710, 360, 10, 15);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(40, 360, 370, 10);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Asigne los 5 Bomberos que conformaran la Brigada");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 340, 330, 15);

        TablaBB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre Completo", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TablaBB);
        if (TablaBB.getColumnModel().getColumnCount() > 0) {
            TablaBB.getColumnModel().getColumn(0).setPreferredWidth(30);
            TablaBB.getColumnModel().getColumn(1).setPreferredWidth(200);
            TablaBB.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(520, 380, 350, 130);

        quitarBombero.setText("Quitar Bombero");
        quitarBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarBomberoActionPerformed(evt);
            }
        });
        getContentPane().add(quitarBombero);
        quitarBombero.setBounds(520, 520, 160, 32);

        limpiarCampos.setText("Limpiar Campos");
        limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(limpiarCampos);
        limpiarCampos.setBounds(510, 570, 175, 32);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Integrantes de la Brigada:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(520, 360, 170, 15);

        cantidadBomberos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cantidadBomberos.setText("8");
        getContentPane().add(cantidadBomberos);
        cantidadBomberos.setBounds(690, 360, 10, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Por favor seleccione el Cuartel, y posteriormente una Brigada:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 50, 400, 15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Cuarteles");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 90, 60, 15);

        ComboBoxCuarteles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboBoxCuartelesMouseClicked(evt);
            }
        });
        getContentPane().add(ComboBoxCuarteles);
        ComboBoxCuarteles.setBounds(110, 80, 410, 30);

        botonAgregar.setText(">");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar);
        botonAgregar.setBounds(440, 450, 50, 32);

        jVaciarBrigada.setText("Vacíar Brigada");
        jVaciarBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVaciarBrigadaActionPerformed(evt);
            }
        });
        getContentPane().add(jVaciarBrigada);
        jVaciarBrigada.setBounds(310, 570, 180, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
       
      
      limpiarTablaBrigadas();
       String sacarId = ComboBoxCuarteles.getSelectedItem().toString().substring(0, 2);
       idCuartel=Integer.parseInt(sacarId);
      
        cargarTabla2(idCuartel);
        
       
        
    }//GEN-LAST:event_botonOKActionPerformed

    private void asignarBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarBrigadaActionPerformed
        Brigada brigada = new Brigada();
        BomberoData bomData = new BomberoData();
        BrigadaData brData = new BrigadaData();
        
         bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero1());
         bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero2());
         bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero3());
         bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero4());
         bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero5());
        
         bomData.asignarBomberoABrigada(idBrigada,(int) TablaBB.getValueAt(0, 0));
         bomData.asignarBomberoABrigada(idBrigada,(int) TablaBB.getValueAt(1, 0));
         bomData.asignarBomberoABrigada(idBrigada,(int) TablaBB.getValueAt(2, 0));
         bomData.asignarBomberoABrigada(idBrigada,(int) TablaBB.getValueAt(3, 0));
         bomData.asignarBomberoABrigada(idBrigada,(int) TablaBB.getValueAt(4, 0));
         
        brigada.setBombero1((int) TablaBB.getValueAt(0, 0));
        brigada.setBombero2((int) TablaBB.getValueAt(1, 0));
        brigada.setBombero3((int) TablaBB.getValueAt(2, 0));
        brigada.setBombero4((int) TablaBB.getValueAt(3, 0));
        brigada.setBombero5((int) TablaBB.getValueAt(4, 0));
       
        brData.cargarBrigada(brigada, idBrigada);
       limpiarTablaBrigadas();
        cargarCuarteles();
        
         
        
        /*  Bombero bombero = new Bombero();
        bombero.setNombreCompleto(b1.getText());
        Bombero bombero2 = new Bombero();
        bombero2.setNombreCompleto(b2.getText());
        Bombero bombero3 = new Bombero();
        bombero3.setNombreCompleto(b3.getText());
        Bombero bombero4 = new Bombero();
        bombero4.setNombreCompleto(b4.getText());
        Bombero bombero5 = new Bombero();
        bombero5.setNombreCompleto(b5.getText());
        Brigada brigada = new Brigada();
        brigada.setNombreBrigada(txtBrigada.getText());
        brigada.setEspecialidad(txtEspecialidad.getText());
        
        if(b1.getText().isEmpty() || b2.getText().isEmpty() || b3.getText().isEmpty() || b4.getText().isEmpty() || b5.getText().isEmpty() || txtBrigada.getText().isEmpty() || txtEspecialidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Para asignar una brigada se necesita que todos los campos esten completos");
        }else{
            lista.add(new Brigada(brigada.getNombreBrigada(), bombero, bombero2, bombero3, bombero4, bombero5, brigada.getEspecialidad(), true, false));
        
            modelo.addRow(new Object[]{brigada.getNombreBrigada(), bombero.getNombreCompleto(), bombero2.getNombreCompleto(), bombero3.getNombreCompleto(), bombero4.getNombreCompleto(), bombero5.getNombreCompleto(), brigada.getEspecialidad()});
            modelo2.removeRow(tablaBrigadas.getSelectedRow());
        }
        
        
        
        limpCampos();*/
    }//GEN-LAST:event_asignarBrigadaActionPerformed

    private void tablaBrigadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBrigadasMouseClicked
            limpiarTablaBomberos();
            limpiarTablaFinal();
            BrigadaData brData = new BrigadaData();
            BomberoData bomData = new BomberoData();
        
            txtBrigada.setText(tablaBrigadas.getValueAt(tablaBrigadas.getSelectedRow(), 1).toString());
            txtEspecialidad.setText(tablaBrigadas.getValueAt(tablaBrigadas.getSelectedRow(), 3).toString());
            if(txtEspecialidad.getText()!=null)
            cargarTabla(txtEspecialidad.getText());
           
            idBrigada=(int) tablaBrigadas.getValueAt(tablaBrigadas.getSelectedRow(), 0);
           
            
           if (brData.buscarBrigada(idBrigada).getBombero1()!=0){
                int idB = brData.buscarBrigada(idBrigada).getBombero1();
                modelo3.addRow(new Object[]{idB,bomData.traerDatos(idB).getNombreCompleto()});}
           if (brData.buscarBrigada(idBrigada).getBombero2()!=0){
                int idB2 = brData.buscarBrigada(idBrigada).getBombero2();
                modelo3.addRow(new Object[]{idB2,bomData.traerDatos(idB2).getNombreCompleto()});}
           if (brData.buscarBrigada(idBrigada).getBombero3()!=0){
                int idB3 = brData.buscarBrigada(idBrigada).getBombero3();
                modelo3.addRow(new Object[]{idB3,bomData.traerDatos(idB3).getNombreCompleto()});}
           if (brData.buscarBrigada(idBrigada).getBombero4()!=0){
                int idB4 = brData.buscarBrigada(idBrigada).getBombero4();
                modelo3.addRow(new Object[]{idB4,bomData.traerDatos(idB4).getNombreCompleto()});    } 
           if (brData.buscarBrigada(idBrigada).getBombero5()!=0){
                int idB5 = brData.buscarBrigada(idBrigada).getBombero5();
                modelo3.addRow(new Object[]{idB5,bomData.traerDatos(idB5).getNombreCompleto()});     }       
              
          
            
            validacion();
            
    }//GEN-LAST:event_tablaBrigadasMouseClicked

    private void txtBrigadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrigadaKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != 32)&& (c!='\u00f1')&&(c!='\u00d1')) { 
            evt.consume();
        }
    }//GEN-LAST:event_txtBrigadaKeyTyped

    private void txtEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecialidadKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != 32)&& (c!='\u00f1')&&(c!='\u00d1')) { 
            evt.consume();
        }
    }//GEN-LAST:event_txtEspecialidadKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir de esta pantalla?", "Ignis - Salir de la Aplicación", JOptionPane.YES_NO_OPTION) == 0) {
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void quitarBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarBomberoActionPerformed
        BomberoData bomData = new BomberoData(); 
        BrigadaData brData = new BrigadaData(); 
        int b = (int) TablaBB.getValueAt(TablaBB.getSelectedRow(), 0);
        Bombero bomb = bomData.traerDatos(b);
        System.out.println(b);
        System.out.println(brData.buscarBrigada(idBrigada).getBombero1());
          System.out.println(brData.buscarBrigada(idBrigada).getBombero2());  
          System.out.println(brData.buscarBrigada(idBrigada).getBombero3());
            System.out.println(brData.buscarBrigada(idBrigada).getBombero4());
              System.out.println(brData.buscarBrigada(idBrigada).getBombero5());
            
          

                
      if(b==brData.buscarBrigada(idBrigada).getBombero1())
            brData.quitarBombero1DeBrigada(b,idBrigada);
     if(b==brData.buscarBrigada(idBrigada).getBombero2())
            brData.quitarBombero2DeBrigada(b,idBrigada);
     if(b==brData.buscarBrigada(idBrigada).getBombero3())
            brData.quitarBombero3DeBrigada(b,idBrigada);
     if(b==brData.buscarBrigada(idBrigada).getBombero4())
            brData.quitarBombero4DeBrigada(b,idBrigada);
     if(b==brData.buscarBrigada(idBrigada).getBombero5())
            brData.quitarBombero5DeBrigada(b,idBrigada);
            
     
          
       
        
        bomData.quitarBomberoDeBrigada((int) TablaBB.getValueAt(TablaBB.getSelectedRow(), 0));
        modelo3.removeRow(TablaBB.getSelectedRow());
        limpiarTablaBomberos();
        limpiarTablaBrigadas();
        cargarTabla2(idCuartel);
        cargarTabla(txtEspecialidad.getText());
        validacion();
    }//GEN-LAST:event_quitarBomberoActionPerformed

    private void limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposActionPerformed
        
        limpCampos();
        
    }//GEN-LAST:event_limpiarCamposActionPerformed

    private void ComboBoxCuartelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxCuartelesMouseClicked
    
        
    }//GEN-LAST:event_ComboBoxCuartelesMouseClicked
public void botAgregar(){
        if(tablaBomberos.getSelectedRow() == -1){
            botonAgregar.setEnabled(false);
        }else if(tablaBomberos.getSelectedRow() != -1){
            botonAgregar.setEnabled(true);
            
        }
    }
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
          
            int pos = tablaBomberos.getSelectedRow();
      //  if (pos != 1){
            int id = (int) tablaBomberos.getValueAt(pos, 0);
            String nombre =  tablaBomberos.getValueAt(pos, 1).toString();
                     
           /* boolean check = validarDuplicados(id);
            
            if (check)
                 JOptionPane.showMessageDialog(this, "Error!! El Bombero ya fue seleccionado");
            else if (check == false)
                modelo3.addRow(new Object[]{id,nombre});
           else
                JOptionPane.showMessageDialog(this, "Error!! Debe seleccionar un Bombero");*/
             
          modelo3.addRow(new Object[]{id, nombre});
            
            modelo.removeRow(tablaBomberos.getSelectedRow());
            
            validacion();
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void jVaciarBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVaciarBrigadaActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Esta seguro que desea guardar la Brigada vacía?", "Ignis - Vacíar Brigada", JOptionPane.YES_NO_OPTION) == 0) {
            //metodo para vacias la brigada
            BrigadaData brData = new BrigadaData();
            BomberoData bomData = new BomberoData();
            bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero1());
            bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero2());
            bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero3());
            bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero4());
            bomData.quitarBomberoDeBrigada(brData.buscarBrigada(idBrigada).getBombero5());

            
            brData.buscarBrigada(idBrigada).setBombero1(0);
            brData.buscarBrigada(idBrigada).setBombero2(0);
            brData.buscarBrigada(idBrigada).setBombero3(0);
            brData.buscarBrigada(idBrigada).setBombero4(0);
            brData.buscarBrigada(idBrigada).setBombero5(0);
            
            brData.vaciarBrigada(idBrigada);
        }
        
        
    }//GEN-LAST:event_jVaciarBrigadaActionPerformed

    private void tablaBomberosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBomberosMouseClicked
    botAgregar();
    }//GEN-LAST:event_tablaBomberosMouseClicked

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
            java.util.logging.Logger.getLogger(AsignarBrigada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarBrigada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarBrigada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarBrigada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AsignarBrigada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCuarteles;
    private javax.swing.JTable TablaBB;
    private javax.swing.JButton asignarBrigada;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel cantidadBomberos;
    private javax.swing.JLabel errorBomberos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jVaciarBrigada;
    private javax.swing.JButton limpiarCampos;
    private javax.swing.JButton quitarBombero;
    private javax.swing.JTable tablaBomberos;
    public javax.swing.JTable tablaBrigadas;
    private javax.swing.JTextField txtBrigada;
    private javax.swing.JTextField txtEspecialidad;
    // End of variables declaration//GEN-END:variables


    public void armarTabla(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Completo");        
        modelo.addColumn("DNI");
        
          tablaBomberos.setModel(modelo);
    }
        
        public void cargarTabla(String especialidad){
        
        BomberoData bData = new BomberoData();
        for(Bombero bombero: bData.listarBomberosPorEspecialidad(especialidad)){
      
            modelo.addRow(new Object[]{bombero.getIdBombero(), bombero.getNombreCompleto(), bombero.getDni()});
        }
        
    }
    
    public void armarTabla2(){
        
        modelo2.addColumn("ID");
        modelo2.addColumn("Brigada");
        modelo2.addColumn("Nombre");        
        modelo2.addColumn("Especialidad");
        modelo2.addColumn("Activa");
        modelo2.addColumn("Libre");
      
        tablaBrigadas.setModel(modelo2);
    }
    
       public void cargarTabla2(int idCuartel){
                   
        BrigadaData bData = new BrigadaData();
        CuartelData cData = new CuartelData();        
      
        for(Brigada bri: bData.brigadasTodas()){
            cData.buscarCuartel(bri.getIdCuartel());
         
            if(bri.getIdCuartel()==idCuartel){
                modelo2.addRow(new Object[]{bri.getIdBrigada(), bri.getNombreBrigada(), bData.traerNombreCuartel(bri.getIdCuartel()),bri.getEspecialidad(), bri.getLibre(), bri.getActivo()});
            }
        }
        tablaBrigadas.setModel(modelo2);
    }
    
    public void validacion(){
        BrigadaData bData = new BrigadaData();
        cantidadBomberos.setText("" +modelo3.getRowCount());
        
        
        if (modelo3.getRowCount()==5){
            asignarBrigada.setEnabled(true);
            errorBomberos.setText("");
        }else{
            asignarBrigada.setEnabled(false);
            errorBomberos.setText("!");
        }
        
        int id;
        for (Brigada brigada : bData.brigadasTodas()){
             id = brigada.getIdBrigada();
         
            if (bData.buscarBrigada(id).getBombero1()==0 || bData.buscarBrigada(id).getBombero2()==0 || bData.buscarBrigada(id).getBombero3()==0 || 
                    bData.buscarBrigada(id).getBombero4()==0 || bData.buscarBrigada(id).getBombero5()==0 ){
                bData.desactivarBrigada(id);}
            else {
                 bData.activarBrigada(id);}
        }
    }
  
    
    public void armarTablaFinal(){
        modelo3.addColumn("ID");
        modelo3.addColumn("Nombre Completo");
   
        TablaBB.setModel(modelo3);
    }
    
    public boolean validarDuplicados(int id){
        
        for (int i =0; i < modelo3.getRowCount(); i++){
                 int idVal = (int) modelo3.getValueAt(i, 0);
                 if (idVal == id)
                     return true;
        }
        return false;
    }

 
    
    public DefaultComboBoxModel cargarCuarteles() {

    DefaultComboBoxModel modeloC = new DefaultComboBoxModel();
       ComboBoxCuarteles.setModel(modeloC);

        String sql = "SELECT idCuartel, nombreCuartel, direccion, Ciudad, Provincia, telefono, coordenadaX, coordenadaY, correo, estado FROM cuartel";

        try {

            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {      
                            modeloC.addElement(rs.getString(1) + " - " +rs.getString(2) +" (" +rs.getString(4) +")");
                            }
            ps.close();

        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error en la carga de datos " + sqle.getMessage());
        }
        return modeloC;

    }
    
   public void  limpiarTablaBomberos(){
          if (tablaBomberos.getRowCount()> 0){
 
      do{
       modelo.removeRow(tablaBomberos.getRowCount()-1);
         }while (tablaBomberos.getRowCount()>0);  
      } 
   
    }
        
   public void limpiarTablaFinal(){
  if (TablaBB.getRowCount()> 0){
 
      do{
       modelo3.removeRow(TablaBB.getRowCount()-1);
         }while (TablaBB.getRowCount()>0);  
      } 
   }
   
   public void limpiarTablaBrigadas(){
        if (tablaBrigadas.getRowCount()> 0){
 
      do{
       modelo2.removeRow(tablaBrigadas.getRowCount()-1);
         }while (tablaBrigadas.getRowCount()>0);  
      } 
    
   }
   
    public void limpCampos(){
        limpiarTablaBrigadas();
        limpiarTablaBomberos();
        ComboBoxCuarteles.setSelectedItem(null);
        
        txtBrigada.setText("");
        txtEspecialidad.setText("");
    }
    
}
