/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author Paola
 */
public class IngresarJugador extends javax.swing.JFrame {

//    ListaLetras letras;
    Tab tablero;
    Diccionario diccionario;
    int nojug = 0;
    Jugadores jugadores = new Jugadores();
    ColaLetras cola;

    /**
     * Creates new form IngresarJugador
     */
    public IngresarJugador(ColaLetras cola, Tab tablero, Diccionario diccionario) {
        this.cola = cola;
        this.tablero = tablero;
        this.diccionario = diccionario;
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
        nombrejug = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        listo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("04b", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Ingresa Tu nombre Prro");

        ingresar.setBackground(new java.awt.Color(64, 109, 109));
        ingresar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        listo.setBackground(new java.awt.Color(64, 109, 109));
        listo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        listo.setText("¡Listo!");
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(nombrejug, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ingresar)
                            .addGap(83, 83, 83)
                            .addComponent(listo)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 77, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(nombrejug, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ingresar)
                        .addComponent(listo))
                    .addGap(0, 77, Short.MAX_VALUE)))
        );

        jLabel1.getAccessibleContext().setAccessibleName("LbNombre");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // TODO add your handling code here:
        try {
            if (jugadores.verificar(nombrejug.getText()) && !nombrejug.getText().isEmpty()) {
            ListaLetras letras = new ListaLetras(cola);
            for (int i = 0; i < 7; i++) {
                NodoLet co = cola.ran();
                letras.insert(co.getLetra(), co.getPunteo(),co.getImagen());//llena lista de letras del jugador
                System.out.print("(" + letras.actual.getLetra() + "," + letras.actual.getPunteo()+ ")");
            }
            jugadores.insert(nombrejug.getText().trim(), letras);
            nojug++;
            JOptionPane.showMessageDialog(null, "Se ha ingresado a " + nombrejug.getText());
            nombrejug.setText("");
        } else {
            System.out.println("Ese jugador ya ha sido ingresado o no ingreso nombre D:<");
        }
        } catch (Exception e) {
            System.out.println("waitmeh");
        }

    }//GEN-LAST:event_ingresarActionPerformed

    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed
        // TODO add your handling code here:
        if(jugadores.numero>1){
           jugadores.ultimo();
        jugadores.grafico();
        Tablero juego = new Tablero(tablero, jugadores, cola, diccionario);
        juego.setBounds(0, 0, 1275, 760);
        this.dispose();
        juego.setVisible(true);
        jugadores.imprimir(); 
        }else{
            JOptionPane.showMessageDialog(null, "Debe ser mas de un jugador");
        }
        
    }//GEN-LAST:event_listoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listo;
    private javax.swing.JTextField nombrejug;
    // End of variables declaration//GEN-END:variables
}
