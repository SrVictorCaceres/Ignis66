package Ignis66.vistas;

import Ignis66.vistas.ABMCuartel;
import desplazable.Desface;
import java.awt.Dimension;

public class Inicio extends javax.swing.JFrame {

    Desface desplace;
    private static int anchoOriginal;
    private static int altoOriginal;
    private boolean maximizada = false;
    private Dimension tamañoMaximizado;
    int xMouse, yMouse;

    public Inicio() {
        initComponents();

        desplace = new Desface();

        //guarda tamaño original
        anchoOriginal = getWidth();
        altoOriginal = getHeight();
        
        setBounds(0, 0, 1100 , 610);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLCerrar = new javax.swing.JLabel();
        jLMin = new javax.swing.JLabel();
        jLMax = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPMenúPlegable = new javax.swing.JPanel();
        jLMenú = new javax.swing.JLabel();
        jLBtnBrig = new javax.swing.JLabel();
        jLBtnBomb = new javax.swing.JLabel();
        jLBtnMov = new javax.swing.JLabel();
        jLBtnSini = new javax.swing.JLabel();
        jLBtnCuar = new javax.swing.JLabel();
        botonModificacion = new javax.swing.JLabel();
        botonAltaBombero = new javax.swing.JLabel();
        botonAltaBrigada = new javax.swing.JLabel();
        botonAsignacion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        altaSiniestro = new javax.swing.JLabel();
        cerrarSiniestro = new javax.swing.JLabel();
        consultas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCerrar.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLCerrar.setToolTipText("");
        jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Minimizar.png"))); // NOI18N
        jLMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinMouseClicked(evt);
            }
        });
        jPanel2.add(jLMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

        jLMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Maximizar.png"))); // NOI18N
        jLMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMaxMouseClicked(evt);
            }
        });
        jPanel2.add(jLMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sirena-gif.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 400, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sirena-gif.gif"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sirena-gif.gif"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 570, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 30));

        jPMenúPlegable.setBackground(new java.awt.Color(255, 255, 255));

        jLMenú.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botonMenu.png"))); // NOI18N
        jLMenú.setText("jLabel1");
        jLMenú.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLMenú.setPreferredSize(new java.awt.Dimension(36, 16));
        jLMenú.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMenúMouseClicked(evt);
            }
        });

        jLBtnBrig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Brigada.png"))); // NOI18N
        jLBtnBrig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBtnBrigMouseClicked(evt);
            }
        });

        jLBtnBomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Bombero.png"))); // NOI18N
        jLBtnBomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBtnBombMouseClicked(evt);
            }
        });

        jLBtnMov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Móvil.png"))); // NOI18N
        jLBtnMov.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLBtnMov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBtnMovMouseClicked(evt);
            }
        });

        jLBtnSini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Siniestro.png"))); // NOI18N
        jLBtnSini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLBtnCuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Cuartel.png"))); // NOI18N
        jLBtnCuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLBtnCuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBtnCuarMouseClicked(evt);
            }
        });

        botonModificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/modificacion_1.png"))); // NOI18N
        botonModificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificacion.setMaximumSize(new java.awt.Dimension(150, 30));
        botonModificacion.setMinimumSize(new java.awt.Dimension(150, 30));
        botonModificacion.setPreferredSize(new java.awt.Dimension(150, 30));
        botonModificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificacionMouseClicked(evt);
            }
        });

        botonAltaBombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/altaBombero.png"))); // NOI18N
        botonAltaBombero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAltaBombero.setMaximumSize(new java.awt.Dimension(150, 30));
        botonAltaBombero.setMinimumSize(new java.awt.Dimension(150, 30));
        botonAltaBombero.setPreferredSize(new java.awt.Dimension(150, 30));
        botonAltaBombero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAltaBomberoMouseClicked(evt);
            }
        });

        botonAltaBrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/altaBrigada.png"))); // NOI18N
        botonAltaBrigada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAltaBrigada.setMaximumSize(new java.awt.Dimension(150, 30));
        botonAltaBrigada.setMinimumSize(new java.awt.Dimension(150, 30));
        botonAltaBrigada.setPreferredSize(new java.awt.Dimension(150, 30));
        botonAltaBrigada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAltaBrigadaMouseClicked(evt);
            }
        });

        botonAsignacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/asignacion.png"))); // NOI18N
        botonAsignacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAsignacion.setMaximumSize(new java.awt.Dimension(150, 30));
        botonAsignacion.setMinimumSize(new java.awt.Dimension(150, 30));
        botonAsignacion.setPreferredSize(new java.awt.Dimension(150, 30));
        botonAsignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAsignacionMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Salir.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        altaSiniestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/altaSiniestro.png"))); // NOI18N
        altaSiniestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        altaSiniestro.setMaximumSize(new java.awt.Dimension(150, 30));
        altaSiniestro.setMinimumSize(new java.awt.Dimension(150, 30));
        altaSiniestro.setPreferredSize(new java.awt.Dimension(150, 30));
        altaSiniestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                altaSiniestroMouseClicked(evt);
            }
        });

        cerrarSiniestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cerrarSiniestro.png"))); // NOI18N
        cerrarSiniestro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSiniestro.setMaximumSize(new java.awt.Dimension(150, 30));
        cerrarSiniestro.setMinimumSize(new java.awt.Dimension(150, 30));
        cerrarSiniestro.setPreferredSize(new java.awt.Dimension(150, 30));
        cerrarSiniestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSiniestroMouseClicked(evt);
            }
        });

        consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/consultas.png"))); // NOI18N
        consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultas.setMaximumSize(new java.awt.Dimension(150, 30));
        consultas.setMinimumSize(new java.awt.Dimension(150, 30));
        consultas.setPreferredSize(new java.awt.Dimension(150, 30));
        consultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPMenúPlegableLayout = new javax.swing.GroupLayout(jPMenúPlegable);
        jPMenúPlegable.setLayout(jPMenúPlegableLayout);
        jPMenúPlegableLayout.setHorizontalGroup(
            jPMenúPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenúPlegableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLMenú, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(jPMenúPlegableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMenúPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPMenúPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPMenúPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAltaBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPMenúPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLBtnBrig, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLBtnCuar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLBtnSini, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLBtnMov, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPMenúPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botonAltaBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLBtnBomb, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPMenúPlegableLayout.setVerticalGroup(
            jPMenúPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenúPlegableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMenú, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLBtnBomb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAltaBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botonModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLBtnBrig, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAltaBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLBtnCuar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLBtnSini, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(altaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(cerrarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLBtnMov, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPMenúPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 230, 580));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1070, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLMenúMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMenúMouseClicked

        //recuérdenme que nuncaa mass haga un menú plegable 
        if (jPMenúPlegable.getX() == 0) {
            desplace.desplazarIzquierda(jPMenúPlegable, jPMenúPlegable.getX(), -180, 5, 10);
        } else if (jPMenúPlegable.getX() == -180) {
            desplace.desplazarDerecha(jPMenúPlegable, jPMenúPlegable.getX(), 0, 5, 10);
        }
    }//GEN-LAST:event_jLMenúMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged


    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        jPMenúPlegable.setSize(jPMenúPlegable.getWidth(), this.getHeight());
    }//GEN-LAST:event_formComponentResized

    private void jLMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLMinMouseClicked

    private void jLMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMaxMouseClicked
        if (!maximizada) {
            // Almacena el tamaño actual antes de maximizar
            tamañoMaximizado = getSize();
            this.setExtendedState(MAXIMIZED_BOTH);
            maximizada = true;
        } else {
            // Restaura al tamaño original
            setSize(anchoOriginal, altoOriginal);
            maximizada = false;
        }
    }//GEN-LAST:event_jLMaxMouseClicked

    private void jLBtnBombMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBtnBombMouseClicked
                 
    }//GEN-LAST:event_jLBtnBombMouseClicked

    private void botonAltaBomberoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAltaBomberoMouseClicked
        AltaBombero altaBombero = new AltaBombero();
        altaBombero.setVisible(true);
         
        
    }//GEN-LAST:event_botonAltaBomberoMouseClicked

    private void botonModificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificacionMouseClicked
        ModificarBombero modificarBombero = new ModificarBombero();
        modificarBombero.setVisible(true);
    }//GEN-LAST:event_botonModificacionMouseClicked

    private void jLBtnCuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBtnCuarMouseClicked
        ABMCuartel abmCuartel = new ABMCuartel();
        abmCuartel.setVisible(true);
    }//GEN-LAST:event_jLBtnCuarMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLBtnMovMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBtnMovMouseClicked

        MovilFormulario MF = new MovilFormulario();
        MF.setVisible(true);

    }//GEN-LAST:event_jLBtnMovMouseClicked

    private void jLBtnBrigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBtnBrigMouseClicked
       
    }//GEN-LAST:event_jLBtnBrigMouseClicked

    private void botonAltaBrigadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAltaBrigadaMouseClicked
       CrearBrigada crearBrigada = new CrearBrigada();
        crearBrigada.setVisible(true);
    }//GEN-LAST:event_botonAltaBrigadaMouseClicked

    private void botonAsignacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAsignacionMouseClicked
      AsignarBrigada asigBrig = new AsignarBrigada();
        asigBrig.setVisible(true);
    }//GEN-LAST:event_botonAsignacionMouseClicked

    private void altaSiniestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altaSiniestroMouseClicked
         SiniestroVista siniestroVista = new SiniestroVista();
        siniestroVista.setVisible(true);
        
    }//GEN-LAST:event_altaSiniestroMouseClicked

    private void cerrarSiniestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSiniestroMouseClicked
        BajaSiniestro resolver = new BajaSiniestro();
        resolver.setVisible(true);
    }//GEN-LAST:event_cerrarSiniestroMouseClicked

    private void consultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultasMouseClicked
        SiniestroEntreFechas consulta = new  SiniestroEntreFechas();
        consulta.setVisible(true);
        
    }//GEN-LAST:event_consultasMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altaSiniestro;
    private javax.swing.JLabel botonAltaBombero;
    private javax.swing.JLabel botonAltaBrigada;
    private javax.swing.JLabel botonAsignacion;
    private javax.swing.JLabel botonModificacion;
    private javax.swing.JLabel cerrarSiniestro;
    private javax.swing.JLabel consultas;
    private javax.swing.JLabel jLBtnBomb;
    private javax.swing.JLabel jLBtnBrig;
    private javax.swing.JLabel jLBtnCuar;
    private javax.swing.JLabel jLBtnMov;
    private javax.swing.JLabel jLBtnSini;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMax;
    private javax.swing.JLabel jLMenú;
    private javax.swing.JLabel jLMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPMenúPlegable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
