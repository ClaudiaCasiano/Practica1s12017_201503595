/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Paola
 */
public class Tablero extends javax.swing.JFrame {

    /**
     * Creates new form Tablero
     */
    IngresarJugador op;
    ColaLetras cola;
    Jugadores jugador;
    ImageIcon[] im = new ImageIcon[7];  //procesadores dice.. nooo hombreee xD
    ImageIcon imcola, imuser, imficha, imdiccio, immatriz;
    Diccionario dic;
    Icon cuadrito;
    Tab tablero;
    int dimensions, cx, cy;
    int pun[] = new int[7];
    boolean cambiar[] = new boolean[7];
    String letras[] = new String[7];

    public Tablero(Tab tablero, Jugadores jugadores, ColaLetras cola, Diccionario dic) {
        initComponents();
        this.dic = dic;
        this.cola = cola;
        this.tablero = tablero;
        this.jugador = jugadores;
        cargarTablero();
        jugador.Random();
        jugadorAct(jugador.jugadorActual, jugador.jugadorActual.getLetras());
        timer();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCafe = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Puntaje = new javax.swing.JTextPane();
        Tabla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nueva = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lbdiccionario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbcola = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbjugadores = new javax.swing.JLabel();
        paneltab = new javax.swing.JPanel();
        lbtablero = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbfichas = new javax.swing.JLabel();
        AddWord = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CL1 = new javax.swing.JCheckBox();
        CL2 = new javax.swing.JCheckBox();
        CL3 = new javax.swing.JCheckBox();
        CL4 = new javax.swing.JCheckBox();
        CL5 = new javax.swing.JCheckBox();
        CL6 = new javax.swing.JCheckBox();
        CL7 = new javax.swing.JCheckBox();
        change = new javax.swing.JButton();
        cancelar = new javax.swing.JLabel();
        validar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PanelCafe.setBackground(new java.awt.Color(122, 105, 55));
        PanelCafe.setPreferredSize(new java.awt.Dimension(1275, 730));
        PanelCafe.setLayout(null);

        L1.setText("Letra1");
        L1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        L1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        L1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L1MouseDragged(evt);
            }
        });
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                L1MouseReleased(evt);
            }
        });
        PanelCafe.add(L1);
        L1.setBounds(560, 620, 70, 70);

        L7.setText("Letra1");
        L7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        L7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        L7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L7MouseDragged(evt);
            }
        });
        L7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L7MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                L7MouseReleased(evt);
            }
        });
        PanelCafe.add(L7);
        L7.setBounds(70, 620, 70, 70);

        L4.setText("Letra1");
        L4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        L4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        L4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L4MouseDragged(evt);
            }
        });
        L4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L4MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                L4MouseReleased(evt);
            }
        });
        PanelCafe.add(L4);
        L4.setBounds(320, 620, 70, 70);

        L3.setText("Letra1");
        L3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        L3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        L3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L3MouseDragged(evt);
            }
        });
        L3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L3MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                L3MouseReleased(evt);
            }
        });
        PanelCafe.add(L3);
        L3.setBounds(400, 620, 70, 70);

        L2.setText("Letra1");
        L2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        L2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        L2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L2MouseDragged(evt);
            }
        });
        L2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                L2MouseReleased(evt);
            }
        });
        PanelCafe.add(L2);
        L2.setBounds(480, 620, 70, 70);

        L5.setText("Letra1");
        L5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        L5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        L5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L5MouseDragged(evt);
            }
        });
        L5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                L5MouseReleased(evt);
            }
        });
        PanelCafe.add(L5);
        L5.setBounds(240, 620, 70, 70);

        L6.setText("Letra1");
        L6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        L6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        L6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L6MouseDragged(evt);
            }
        });
        L6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L6MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                L6MouseReleased(evt);
            }
        });
        PanelCafe.add(L6);
        L6.setBounds(160, 620, 70, 70);

        jScrollPane1.setViewportView(Puntaje);

        PanelCafe.add(jScrollPane1);
        jScrollPane1.setBounds(690, 160, 210, 130);

        Tabla.setBackground(new java.awt.Color(102, 102, 102));
        Tabla.setMinimumSize(new java.awt.Dimension(600, 600));
        Tabla.setPreferredSize(new java.awt.Dimension(600, 600));
        Tabla.setLayout(null);
        PanelCafe.add(Tabla);
        Tabla.setBounds(60, 10, 600, 600);

        jLabel1.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel1.setText("Cambiar Letras");
        PanelCafe.add(jLabel1);
        jLabel1.setBounds(690, 430, 260, 40);

        jLabel2.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel2.setText("Turno");
        PanelCafe.add(jLabel2);
        jLabel2.setBounds(690, 10, 210, 40);

        nombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre");
        PanelCafe.add(nombre);
        nombre.setBounds(690, 50, 210, 60);

        jLabel4.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel4.setText("Puntuacion");
        PanelCafe.add(jLabel4);
        jLabel4.setBounds(690, 120, 210, 40);

        Nueva.setText("fff");
        PanelCafe.add(Nueva);
        Nueva.setBounds(690, 360, 160, 30);

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdiccionario, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdiccionario, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Diccionario", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbcola, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbcola, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cola Fichas", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbjugadores, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbjugadores, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Jugadores", jPanel5);

        javax.swing.GroupLayout paneltabLayout = new javax.swing.GroupLayout(paneltab);
        paneltab.setLayout(paneltabLayout);
        paneltabLayout.setHorizontalGroup(
            paneltabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtablero, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneltabLayout.setVerticalGroup(
            paneltabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtablero, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tablero", paneltab);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbfichas, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbfichas, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista Fichas", jPanel6);

        PanelCafe.add(jTabbedPane1);
        jTabbedPane1.setBounds(960, 20, 290, 470);

        AddWord.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AddWord.setText("Agregar");
        AddWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddWordActionPerformed(evt);
            }
        });
        PanelCafe.add(AddWord);
        AddWord.setBounds(860, 360, 90, 30);

        jLabel3.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel3.setText("Nueva Palabra");
        PanelCafe.add(jLabel3);
        jLabel3.setBounds(690, 320, 260, 40);

        CL1.setBackground(new java.awt.Color(122, 105, 55));
        CL1.setText("L1");
        CL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CL1ActionPerformed(evt);
            }
        });
        PanelCafe.add(CL1);
        CL1.setBounds(760, 530, 40, 23);

        CL2.setBackground(new java.awt.Color(122, 105, 55));
        CL2.setText("L1");
        CL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CL2ActionPerformed(evt);
            }
        });
        PanelCafe.add(CL2);
        CL2.setBounds(700, 470, 40, 23);

        CL3.setBackground(new java.awt.Color(122, 105, 55));
        CL3.setText("L1");
        CL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CL3ActionPerformed(evt);
            }
        });
        PanelCafe.add(CL3);
        CL3.setBounds(700, 500, 40, 23);

        CL4.setBackground(new java.awt.Color(122, 105, 55));
        CL4.setText("L1");
        CL4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CL4ActionPerformed(evt);
            }
        });
        PanelCafe.add(CL4);
        CL4.setBounds(700, 530, 40, 23);

        CL5.setBackground(new java.awt.Color(122, 105, 55));
        CL5.setText("L1");
        CL5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CL5ActionPerformed(evt);
            }
        });
        PanelCafe.add(CL5);
        CL5.setBounds(700, 560, 40, 23);

        CL6.setBackground(new java.awt.Color(122, 105, 55));
        CL6.setText("L1");
        CL6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CL6ActionPerformed(evt);
            }
        });
        PanelCafe.add(CL6);
        CL6.setBounds(760, 470, 40, 23);

        CL7.setBackground(new java.awt.Color(122, 105, 55));
        CL7.setText("L1");
        CL7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CL7ActionPerformed(evt);
            }
        });
        PanelCafe.add(CL7);
        CL7.setBounds(760, 500, 40, 23);

        change.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        change.setText("Cambiar");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        PanelCafe.add(change);
        change.setBounds(840, 480, 90, 60);

        cancelar.setFont(new java.awt.Font("8BIT WONDER", 0, 11)); // NOI18N
        cancelar.setText("cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        PanelCafe.add(cancelar);
        cancelar.setBounds(850, 590, 120, 80);

        validar1.setFont(new java.awt.Font("8BIT WONDER", 0, 11)); // NOI18N
        validar1.setText("validar");
        validar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        validar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validar1MouseClicked(evt);
            }
        });
        PanelCafe.add(validar1);
        validar1.setBounds(700, 590, 120, 80);

        getContentPane().add(PanelCafe);
        PanelCafe.setBounds(0, 0, 1275, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarTablero() {
        int dim = tablero.dimension;
        System.out.println("LA DIMENSION DEL TABLERO ES " + tablero.dimension);
        dimensions = Tabla.getWidth() / dim;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                JLabel cuadro = new JLabel();
                ImageIcon icono = new ImageIcon(getClass().getResource(tablero.imagen()));
                Icon cuadrito = new ImageIcon(icono.getImage().getScaledInstance(dimensions, dimensions, Image.SCALE_DEFAULT));
                cuadro.setIcon(cuadrito);
                Tabla.add(cuadro);
                cuadro.setBounds(i * dimensions, j * dimensions, dimensions, dimensions);
                cuadro.setVisible(true);
            }

        }

    }

    public void jugadorAct(NodoJug jugador, ListaLetras lista) {
        lista.primeralet = lista.first;
        nombre.setText(jugador.getName());
        im[0] = jugador.getLetras().primeralet.getImagen();
        cuadrito = new ImageIcon(im[0].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L1.setIcon(cuadrito);
        L1.setText(jugador.getLetras().primeralet.getLetra());
        pun[0] = jugador.getLetras().primeralet.getPunteo();
        letras[0] = jugador.getLetras().primeralet.getLetra();
        CL1.setText(lista.primeralet.getLetra());

        im[1] = jugador.getLetras().siguientelet().getImagen();
        cuadrito = new ImageIcon(im[1].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L2.setIcon(cuadrito);
        L2.setText(jugador.getLetras().primeralet.getLetra());
        pun[1] = jugador.getLetras().primeralet.getPunteo();
        letras[1] = jugador.getLetras().primeralet.getLetra();
        CL2.setText(lista.primeralet.getLetra());

        im[2] = jugador.getLetras().siguientelet().getImagen();
        cuadrito = new ImageIcon(im[2].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L3.setIcon(cuadrito);
        L3.setText(jugador.getLetras().primeralet.getLetra());
        pun[2] = jugador.getLetras().primeralet.getPunteo();
        letras[2] = jugador.getLetras().primeralet.getLetra();
        CL3.setText(lista.primeralet.getLetra());

        im[3] = jugador.getLetras().siguientelet().getImagen();
        cuadrito = new ImageIcon(im[3].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L4.setIcon(cuadrito);
        L4.setText(jugador.getLetras().primeralet.getLetra());
        pun[3] = jugador.getLetras().primeralet.getPunteo();
        letras[3] = jugador.getLetras().primeralet.getLetra();
        CL4.setText(lista.primeralet.getLetra());

        im[4] = jugador.getLetras().siguientelet().getImagen();
        cuadrito = new ImageIcon(im[4].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L5.setIcon(cuadrito);
        L5.setText(jugador.getLetras().primeralet.getLetra());
        pun[4] = jugador.getLetras().primeralet.getPunteo();
        letras[4] = jugador.getLetras().primeralet.getLetra();
        CL5.setText(lista.primeralet.getLetra());

        im[5] = jugador.getLetras().siguientelet().getImagen();
        cuadrito = new ImageIcon(im[5].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L6.setIcon(cuadrito);
        L6.setText(jugador.getLetras().primeralet.getLetra());
        pun[5] = jugador.getLetras().primeralet.getPunteo();
        letras[5] = jugador.getLetras().primeralet.getLetra();
        CL6.setText(lista.primeralet.getLetra());

        im[6] = jugador.getLetras().siguientelet().getImagen();
        cuadrito = new ImageIcon(im[6].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L7.setIcon(cuadrito);
        CL7.setText(lista.primeralet.getLetra());
        L7.setText(jugador.getLetras().primeralet.getLetra());
        pun[6] = jugador.getLetras().primeralet.getPunteo();
        letras[6] = jugador.getLetras().primeralet.getLetra();
        jugador.getLetras().grafico();
    }

    private void CL6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CL6ActionPerformed
        // TODO add your handling code here:
        checkletter(6);
    }//GEN-LAST:event_CL6ActionPerformed

    private void L7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L7MouseDragged
        // TODO add your handling code here:
        moverlb(L7, evt, im[6]);
    }//GEN-LAST:event_L7MouseDragged

    private void L7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L7MouseReleased
        // TODO add your handling code here:
        soltarLb(L7, evt, 70, 620, im[6]);
    }//GEN-LAST:event_L7MouseReleased

    private void L6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseDragged
        // TODO add your handling code here:
        moverlb(L6, evt, im[4]);
    }//GEN-LAST:event_L6MouseDragged

    private void L5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseDragged
        // TODO add your handling code here:
        moverlb(L5, evt, im[4]);
    }//GEN-LAST:event_L5MouseDragged

    private void L4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseDragged
        // TODO add your handling code here:
        moverlb(L4, evt, im[3]);
    }//GEN-LAST:event_L4MouseDragged

    private void L3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseDragged
        // TODO add your handling code here:
        moverlb(L3, evt, im[2]);
    }//GEN-LAST:event_L3MouseDragged

    private void L2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseDragged
        // TODO add your handling code here:
        moverlb(L2, evt, im[1]);
    }//GEN-LAST:event_L2MouseDragged

    private void L1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseDragged
        // TODO add your handling code here:
        moverlb(L1, evt, im[0]);
    }//GEN-LAST:event_L1MouseDragged

    private void L6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseReleased
        // TODO add your handling code here:
        soltarLb(L6, evt, 160, 620, im[5]);
    }//GEN-LAST:event_L6MouseReleased

    private void L5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseReleased
        // TODO add your handling code here:
        soltarLb(L5, evt, 240, 620, im[4]);
    }//GEN-LAST:event_L5MouseReleased

    private void L4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseReleased
        // TODO add your handling code here:
        soltarLb(L4, evt, 320, 620, im[3]);
    }//GEN-LAST:event_L4MouseReleased

    private void L3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseReleased
        // TODO add your handling code here:
        soltarLb(L3, evt, 400, 620, im[2]);
    }//GEN-LAST:event_L3MouseReleased

    private void L2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseReleased
        // TODO add your handling code here:
        soltarLb(L2, evt, 480, 620, im[1]);
    }//GEN-LAST:event_L2MouseReleased

    private void L1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseReleased
        // TODO add your handling code here:
        soltarLb(L1, evt, 560, 620, im[0]);
    }//GEN-LAST:event_L1MouseReleased

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
//        
        L7.setBounds(70, 620, 70, 70);
        L6.setBounds(160, 620, 70, 70);
        L5.setBounds(240, 620, 70, 70);
        L4.setBounds(320, 620, 70, 70);
        L3.setBounds(400, 620, 70, 70);
        L2.setBounds(480, 620, 70, 70);
        L1.setBounds(560, 620, 70, 70);
        
        
        for (int i = 0; i < 7; i++) {
            if (cambiar[i]) {
                jugador.jugadorActual.getLetras().cambiarletra(cola,i, letras[i], pun[i], im[i]);
            }
        }
        NodoJug sig = jugador.jugadorActual;
        jugador.jugadorActual = jugador.jugadorActual.getSiguiente();
        jugadorAct(sig, sig.getLetras());

    }//GEN-LAST:event_changeActionPerformed

    private void AddWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddWordActionPerformed
        // TODO add your handling code here:
        String newword = Nueva.getText();
        dic.agregar(newword);
        dic.generarArchivo();
    }//GEN-LAST:event_AddWordActionPerformed

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        // TODO add your handling code here:
        cuadrito = new ImageIcon(im[0].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L1.setIcon(cuadrito);
        cuadrito = new ImageIcon(im[1].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L2.setIcon(cuadrito);
        cuadrito = new ImageIcon(im[2].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L3.setIcon(cuadrito);
        cuadrito = new ImageIcon(im[3].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L4.setIcon(cuadrito);
        cuadrito = new ImageIcon(im[4].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L5.setIcon(cuadrito);
        cuadrito = new ImageIcon(im[5].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L6.setIcon(cuadrito);
        cuadrito = new ImageIcon(im[6].getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        L7.setIcon(cuadrito);
        L7.setBounds(70, 620, 70, 70);
        L6.setBounds(160, 620, 70, 70);
        L5.setBounds(240, 620, 70, 70);
        L4.setBounds(320, 620, 70, 70);
        L3.setBounds(400, 620, 70, 70);
        L2.setBounds(480, 620, 70, 70);
        L1.setBounds(560, 620, 70, 70);
    }//GEN-LAST:event_cancelarMouseClicked

    private void CL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CL2ActionPerformed
        // TODO add your handling code here:
        checkletter(2);
    }//GEN-LAST:event_CL2ActionPerformed

    private void CL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CL3ActionPerformed
        // TODO add your handling code here:
        checkletter(3);
    }//GEN-LAST:event_CL3ActionPerformed

    private void CL4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CL4ActionPerformed
        // TODO add your handling code here:
        checkletter(4);
    }//GEN-LAST:event_CL4ActionPerformed

    private void CL5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CL5ActionPerformed
        // TODO add your handling code here:
        checkletter(5);
    }//GEN-LAST:event_CL5ActionPerformed

    private void CL7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CL7ActionPerformed
        // TODO add your handling code here:
        checkletter(7);
    }//GEN-LAST:event_CL7ActionPerformed

    private void CL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CL1ActionPerformed
        // TODO add your handling code here:
        checkletter(1);
    }//GEN-LAST:event_CL1ActionPerformed

    private void L7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L7MouseClicked
        // TODO add your handling code here:
        clickear(L7, evt);
    }//GEN-LAST:event_L7MouseClicked

    private void L6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseClicked
        // TODO add your handling code here:
        clickear(L6, evt);
    }//GEN-LAST:event_L6MouseClicked

    private void L5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseClicked
        // TODO add your handling code here:
        clickear(L5, evt);
    }//GEN-LAST:event_L5MouseClicked

    private void L4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseClicked
        // TODO add your handling code here:
        clickear(L4, evt);
    }//GEN-LAST:event_L4MouseClicked

    private void L3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseClicked
        // TODO add your handling code here:
        clickear(L3, evt);
    }//GEN-LAST:event_L3MouseClicked

    private void L2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseClicked
        // TODO add your handling code here:
        clickear(L2, evt);
    }//GEN-LAST:event_L2MouseClicked

    private void L1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseClicked
        // TODO add your handling code here:
        clickear(L1, evt);
    }//GEN-LAST:event_L1MouseClicked

    private void validar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validar1MouseClicked
        // TODO add your handling code here:
        if (dic.contiene(tablero.horizontal(cx, cy))){
            Puntaje.setText(Puntaje.getText()+ nombre.getText() + (tablero.horizontal(cx, cy).length()+ 2*3)+"\n");
        }
        if (dic.contiene(tablero.vertical(cx, cy))){
            Puntaje.setText(Puntaje.getText()+ nombre.getText() + "\n");
        }
    }//GEN-LAST:event_validar1MouseClicked

    private void clickear(JLabel lb, java.awt.event.MouseEvent evt){
        System.out.println("click");
//        int tablax = Tabla.getX();
//        int tablay = Tabla.getY();
//        int ax = (lb.getX()-tablax)/dimensions;
//        int ay = (lb.getY()-tablay)/dimensions;
//        int tW = Tabla.getWidth();
//        if (lb.getX() >= tablax && lb.getX() <= tablax + tW & lb.getY() >= tablay & lb.getY() <= tablay + tW) {
//            System.out.println("borra borra");
//            tablero.hacervacio(ax,ay);
//        }
    }
    
    public void moverlb(JLabel lb, java.awt.event.MouseEvent evt, ImageIcon im) {
//        int ax = (lb.getX()-Tabla.getX())/dimensions;
//        int ay = (lb.getY()-Tabla.getY())/dimensions;
        lb.setLocation(lb.getX() + evt.getX() - lb.getWidth() / 2, lb.getY() + evt.getY() - lb.getHeight() / 2);
        
//        if (lb.getX() >= Tabla.getX() && lb.getX() <= Tabla.getAlignmentX() + Tabla.getWidth() & lb.getY() >= Tabla.getY() & lb.getY() <= Tabla.getY() + Tabla.getWidth()) {
//            tablero.hacervacio(ax,ay);
//        }
        
    }

    public void soltarLb(JLabel lb, java.awt.event.MouseEvent evt, int lx, int ly, ImageIcon im) {
        int centrox = lb.getX() + evt.getX() - lb.getWidth() / 2;
        int centroy = lb.getY() + evt.getY() - lb.getHeight() / 2;
        int tablax = Tabla.getX();
        int tablay = Tabla.getY();
        cx = ((centrox - tablax + dimensions / 2 + 1) / dimensions);
        cy = ((centroy - tablay + dimensions / 2 + 1) / dimensions);
        int tW = Tabla.getWidth();
        if (centrox >= tablax && centrox <= tablax + tW & centroy >= tablay & centroy <= tablay + tW) {
            int x = tablax + cx * dimensions;
            int y = tablay + cy * dimensions;
//            if (!tablero.hayAlgo(cx, cy,lb.getText())) {
                tablero.hayAlgo(cx, cy,lb.getText());
                System.out.println(tablero.actually.getLetra());
                lb.setBounds(x, y, dimensions, dimensions);
                cuadrito = new ImageIcon(im.getImage().getScaledInstance(dimensions, dimensions, Image.SCALE_DEFAULT));
                lb.setIcon(cuadrito);
//            } else {
//                lb.setBounds(lx, ly, 70, 70);
//                cuadrito = new ImageIcon(im.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
//                lb.setIcon(cuadrito);
//            }

        } else {
            lb.setBounds(lx, ly, 70, 70);
            cuadrito = new ImageIcon(im.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            lb.setIcon(cuadrito);
        }
    }

    private void checkletter(int le) {
        cambiar[le - 1] = !cambiar[le - 1];
        System.out.println(cambiar[le-1]);
    }

    public void timer() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File miDir = new File(".");
                String directo;
                try {
                    directo = miDir.getCanonicalPath();
                    imcola = new ImageIcon(directo + "\\Practica1EDD\\cola.jpg");
                    imdiccio = new ImageIcon(directo + "\\Practica1EDD\\diccionario.jpg");
                    imficha = new ImageIcon(directo + "\\Practica1EDD\\ficha.jpg");
                    immatriz = new ImageIcon(directo + "\\Practica1EDD\\matriz.jpg");
                    imuser = new ImageIcon(directo + "\\Practica1EDD\\jugadores.jpg");

                    lbcola.setIcon(new ImageIcon(imcola.getImage().getScaledInstance(265, 404, Image.SCALE_DEFAULT)));
                    lbdiccionario.setIcon(new ImageIcon(imdiccio.getImage().getScaledInstance(265, 404, Image.SCALE_DEFAULT)));
                    lbfichas.setIcon(new ImageIcon(imficha.getImage().getScaledInstance(265, 404, Image.SCALE_DEFAULT)));
                    lbtablero.setIcon(new ImageIcon(immatriz.getImage().getScaledInstance(265, 404, Image.SCALE_DEFAULT)));
                    lbjugadores.setIcon(new ImageIcon(imuser.getImage().getScaledInstance(265, 404, Image.SCALE_DEFAULT)));

                } catch (IOException ex) {
                    Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        timer.start();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddWord;
    private javax.swing.JCheckBox CL1;
    private javax.swing.JCheckBox CL2;
    private javax.swing.JCheckBox CL3;
    private javax.swing.JCheckBox CL4;
    private javax.swing.JCheckBox CL5;
    private javax.swing.JCheckBox CL6;
    private javax.swing.JCheckBox CL7;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JTextField Nueva;
    private javax.swing.JPanel PanelCafe;
    private javax.swing.JTextPane Puntaje;
    private javax.swing.JPanel Tabla;
    private javax.swing.JLabel cancelar;
    private javax.swing.JButton change;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbcola;
    private javax.swing.JLabel lbdiccionario;
    private javax.swing.JLabel lbfichas;
    private javax.swing.JLabel lbjugadores;
    private javax.swing.JLabel lbtablero;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel paneltab;
    private javax.swing.JLabel validar1;
    // End of variables declaration//GEN-END:variables
}
