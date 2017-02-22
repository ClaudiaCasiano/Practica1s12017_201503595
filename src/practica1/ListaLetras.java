/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Paola
 */
public class ListaLetras {

    ColaLetras cola;
    graphiz grafic = new graphiz();

    public ListaLetras(ColaLetras cola) {
        this.cola = cola;
    }

    NodoLet first;
    NodoLet actual;
    NodoLet primeralet;

    int number = 0;
    String archivo = "";
    int noLetras = 95;

    public void insert(String letter, int punteo, ImageIcon imagen) {//Metodo insertar una letra a la lista
        NodoLet newe = new NodoLet(letter, punteo, imagen);

        if (first == null) {
            first = newe;
            first.setSiguiente(null);
            actual = first;
            primeralet = first;
        } else {

            actual.setSiguiente(newe);
            newe.setAnterior(actual);
            newe.setSiguiente(null);
            actual = newe;
        }
    }

    public NodoLet siguientelet() {
        primeralet = primeralet.getSiguiente();
        return primeralet;
    }

    void grafico() {
        archivo = "";
        int i = 1;
        NodoLet imprime = first;
        archivo = archivo + imprime.getLetra() + i + "; \n";
        i++;
        imprime = imprime.getSiguiente();
        while (imprime != null) {

            archivo = archivo  + imprime.getLetra()+ i + "; \n";
            imprime = imprime.getSiguiente();
            i++;
        }
        i=2;
        imprime = first.getSiguiente();
        while (imprime != null) {

//            archivo = archivo + i + imprime.getLetra() + "; \n";
            archivo = archivo + imprime.getAnterior().getLetra() + (i - 1) + " -> " + imprime.getLetra() + i + "; \n";
            imprime = imprime.getSiguiente();
            i++;
        }

        grafic.grafo(archivo, "ficha");
        grafic.generar("ficha");
    }

       String letter[] = new String[2];

       
       
       //PARA REEMPLAZAR LETRA
    void cambiarletra(int i,String letter, int punteo, ImageIcon image) {
        NodoLet ju = first;
        for (int j = 0; j < i; j++) {
            ju = ju.getSiguiente();
        }
        cola.insert(letter, punteo, image);
        cola.push();
        ju.setLetra(cola.pushlet());
        ju.setPunteo(cola.pushno());
        ju.setImagen(cola.pushim());
        cola.noLetras++;
        
        
    
    }
}
