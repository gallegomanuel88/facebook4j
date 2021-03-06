/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook4j;

import java.awt.Color;
import java.net.MalformedURLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author galle
 */
public class Ventana extends javax.swing.JFrame {

    Metodos objMetodos = new Metodos ();
    Facebook facebook = new FacebookFactory().getInstance();
    
    public Ventana() {
        initComponents();
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
        botonPost = new javax.swing.JButton();
        textoPost = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        idLike = new javax.swing.JTextField();
        botonLike = new javax.swing.JButton();
        botonUnLike = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        comentarioPost = new javax.swing.JTextField();
        botonComentar = new javax.swing.JButton();
        IdPostComentario = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        rutaImagen = new javax.swing.JTextField();
        botonPublicarImagen = new javax.swing.JButton();
        comentarioImagen = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        botonBuscarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuariosBuscados = new javax.swing.JTable();
        nombrePersonaBuscar = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        botonBuscarPost = new javax.swing.JButton();
        contenidoPostBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPostBuscados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonPost.setText("Publicar");
        botonPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPostActionPerformed(evt);
            }
        });

        textoPost.setForeground(new java.awt.Color(126, 121, 121));
        textoPost.setText("¿Que estas pensando postear?");
        textoPost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textoPostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoPostFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoPost)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonPost, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPost)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        idLike.setForeground(new java.awt.Color(127, 124, 124));
        idLike.setText("IdPost");
        idLike.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idLikeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idLikeFocusLost(evt);
            }
        });

        botonLike.setText("Like");
        botonLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLikeActionPerformed(evt);
            }
        });

        botonUnLike.setText("Unlike");
        botonUnLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnLikeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLike, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonLike, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonUnLike, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLike)
                    .addComponent(botonUnLike))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comentarioPost.setForeground(new java.awt.Color(127, 124, 124));
        comentarioPost.setText("Comenta el post");
        comentarioPost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comentarioPostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                comentarioPostFocusLost(evt);
            }
        });

        botonComentar.setText("Comentar");
        botonComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComentarActionPerformed(evt);
            }
        });

        IdPostComentario.setForeground(new java.awt.Color(127, 124, 124));
        IdPostComentario.setText("IdPost");
        IdPostComentario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IdPostComentarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdPostComentarioFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comentarioPost, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonComentar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdPostComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IdPostComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comentarioPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonComentar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rutaImagen.setForeground(new java.awt.Color(127, 124, 124));
        rutaImagen.setText("Ruta de la imagen");
        rutaImagen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rutaImagenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rutaImagenFocusLost(evt);
            }
        });

        botonPublicarImagen.setText("Publicar");
        botonPublicarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPublicarImagenActionPerformed(evt);
            }
        });

        comentarioImagen.setForeground(new java.awt.Color(127, 124, 124));
        comentarioImagen.setText("Comenta la foto");
        comentarioImagen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comentarioImagenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                comentarioImagenFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rutaImagen)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(botonPublicarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comentarioImagen, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(comentarioImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPublicarImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonBuscarUsuario.setText("Buscar");
        botonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarUsuarioActionPerformed(evt);
            }
        });

        tablaUsuariosBuscados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuarios encontrados"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuariosBuscados);

        nombrePersonaBuscar.setForeground(new java.awt.Color(127, 124, 124));
        nombrePersonaBuscar.setText("Escribe nombre de la persona");
        nombrePersonaBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombrePersonaBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombrePersonaBuscarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(botonBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombrePersonaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarUsuario)
                    .addComponent(nombrePersonaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botonBuscarPost.setText("Buscar");
        botonBuscarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPostActionPerformed(evt);
            }
        });

        contenidoPostBuscar.setForeground(new java.awt.Color(127, 124, 124));
        contenidoPostBuscar.setText("Escribe titulo del post");
        contenidoPostBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contenidoPostBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contenidoPostBuscarFocusLost(evt);
            }
        });

        tablaPostBuscados.setForeground(new java.awt.Color(127, 124, 124));
        tablaPostBuscados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comentarios buscados"
            }
        ));
        jScrollPane2.setViewportView(tablaPostBuscados);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(botonBuscarPost, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contenidoPostBuscar)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarPost)
                    .addComponent(contenidoPostBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPostActionPerformed
        try {
            objMetodos.publicarEstado(textoPost.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonPostActionPerformed

    private void botonLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLikeActionPerformed
        try {
            objMetodos.darLike(idLike.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonLikeActionPerformed

    private void botonComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComentarActionPerformed
        try {
            objMetodos.comentarPost(IdPostComentario.getText(), comentarioPost.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonComentarActionPerformed

    private void idLikeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idLikeFocusGained
        if(idLike.getText().equals("")||idLike.getText().equals("IdPost")){
            idLike.setText("");
            idLike.setForeground(Color.black);
        }
    }//GEN-LAST:event_idLikeFocusGained

    private void idLikeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idLikeFocusLost
        if(idLike.getText().equals("")){
            idLike.setText("IdPost");
            idLike.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_idLikeFocusLost

    private void textoPostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoPostFocusGained
        if(textoPost.getText().equals("")||textoPost.getText().equals("¿Que estas pensando postear?")){
            textoPost.setText("");
            textoPost.setForeground(Color.black);
        }
    }//GEN-LAST:event_textoPostFocusGained

    private void textoPostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoPostFocusLost
        if(textoPost.getText().equals("")){
            textoPost.setText("¿Que estas pensando postear?");
            textoPost.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_textoPostFocusLost

    private void IdPostComentarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdPostComentarioFocusGained
        if(IdPostComentario.getText().equals("")||IdPostComentario.getText().equals("IdPost")){
            IdPostComentario.setText("");
            IdPostComentario.setForeground(Color.black);
        }
    }//GEN-LAST:event_IdPostComentarioFocusGained

    private void IdPostComentarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdPostComentarioFocusLost
        if(IdPostComentario.getText().equals("")){
            IdPostComentario.setText("IdPost");
            IdPostComentario.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_IdPostComentarioFocusLost

    private void comentarioPostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comentarioPostFocusGained
        if(comentarioPost.getText().equals("")||comentarioPost.getText().equals("Comenta el post")){
            comentarioPost.setText("");
            comentarioPost.setForeground(Color.black);
        }
    }//GEN-LAST:event_comentarioPostFocusGained

    private void comentarioPostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comentarioPostFocusLost
        if(comentarioPost.getText().equals("")){
            comentarioPost.setText("Comenta el post");
            comentarioPost.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_comentarioPostFocusLost

    private void botonUnLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnLikeActionPerformed
        try {
            objMetodos.darUnLike(idLike.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonUnLikeActionPerformed

    private void rutaImagenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rutaImagenFocusGained
        if(rutaImagen.getText().equals("")||rutaImagen.getText().equals("Ruta de la imagen")){
            rutaImagen.setText("");
            rutaImagen.setForeground(Color.black);
        }
    }//GEN-LAST:event_rutaImagenFocusGained

    private void rutaImagenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rutaImagenFocusLost
        if(rutaImagen.getText().equals("")){
            rutaImagen.setText("Ruta de la imagen");
            rutaImagen.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_rutaImagenFocusLost

    private void botonPublicarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPublicarImagenActionPerformed
        try {
            objMetodos.publicarImagen(rutaImagen.getText(), comentarioImagen.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonPublicarImagenActionPerformed

    private void comentarioImagenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comentarioImagenFocusGained
        if(comentarioImagen.getText().equals("")||comentarioImagen.getText().equals("Comenta la foto")){
            comentarioImagen.setText("");
            comentarioImagen.setForeground(Color.black);
        }
    }//GEN-LAST:event_comentarioImagenFocusGained

    private void comentarioImagenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comentarioImagenFocusLost
        if(comentarioImagen.getText().equals("")){
            comentarioImagen.setText("Comenta la foto");
            comentarioImagen.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_comentarioImagenFocusLost

    private void botonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarUsuarioActionPerformed
        int u;
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaUsuariosBuscados.getModel();
            
            ResponseList<User> results = facebook.searchUsers("Pablo");
            for( u=0; u<results.size(); u++){
                System.out.println(results.get(u));
                //Intento de meter los resultados en una tabla pero la tabla no acepta una variable tipo user
                //modelo.addRow((Vector) results.get(u));
            }
        } catch (FacebookException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonBuscarUsuarioActionPerformed

    private void nombrePersonaBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombrePersonaBuscarFocusGained
        if(nombrePersonaBuscar.getText().equals("")||nombrePersonaBuscar.getText().equals("Escribe nombre de la persona")){
            nombrePersonaBuscar.setText("");
            nombrePersonaBuscar.setForeground(Color.black);
        }
    }//GEN-LAST:event_nombrePersonaBuscarFocusGained

    private void nombrePersonaBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombrePersonaBuscarFocusLost
        if(nombrePersonaBuscar.getText().equals("")){
            nombrePersonaBuscar.setText("Escribe nombre de la persona");
            nombrePersonaBuscar.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_nombrePersonaBuscarFocusLost

    private void contenidoPostBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contenidoPostBuscarFocusGained
        if(contenidoPostBuscar.getText().equals("")||contenidoPostBuscar.getText().equals("Escribe titulo del post")){
            contenidoPostBuscar.setText("");
            contenidoPostBuscar.setForeground(Color.black);
        }
    }//GEN-LAST:event_contenidoPostBuscarFocusGained

    private void contenidoPostBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contenidoPostBuscarFocusLost
        if(contenidoPostBuscar.getText().equals("")){
            contenidoPostBuscar.setText("Escribe titulo del post");
            contenidoPostBuscar.setForeground(Color.GRAY);
       }
    }//GEN-LAST:event_contenidoPostBuscarFocusLost

    private void botonBuscarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPostActionPerformed
        int u;
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaPostBuscados.getModel();
            //No realiza la busqueda con lo cual no puedo imprimir los datos por consola y menos mostrarlos en una tabla.
            ResponseList<Post> results = facebook.searchPosts(contenidoPostBuscar.getText());
            System.out.println(results.get(WIDTH));
            //for( u=0; u<results.size(); u++){
                //System.out.println(results.get(u));
                //modelo.addRow((Vector) results.get(u));
            //}
        } catch (FacebookException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonBuscarPostActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdPostComentario;
    private javax.swing.JButton botonBuscarPost;
    private javax.swing.JButton botonBuscarUsuario;
    private javax.swing.JButton botonComentar;
    private javax.swing.JButton botonLike;
    private javax.swing.JButton botonPost;
    private javax.swing.JButton botonPublicarImagen;
    private javax.swing.JButton botonUnLike;
    private javax.swing.JTextField comentarioImagen;
    private javax.swing.JTextField comentarioPost;
    private javax.swing.JTextField contenidoPostBuscar;
    private javax.swing.JTextField idLike;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombrePersonaBuscar;
    private javax.swing.JTextField rutaImagen;
    private javax.swing.JTable tablaPostBuscados;
    private javax.swing.JTable tablaUsuariosBuscados;
    private javax.swing.JTextField textoPost;
    // End of variables declaration//GEN-END:variables
}
