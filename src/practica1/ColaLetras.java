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
public class ColaLetras {

    NodoLet first;
    NodoLet actual;

    NodoLet f;
    NodoLet u;

    int number = 0;
    int valoractual;
    String[] elim = new String[7];
    int noLetras = 95;
    String letraactual;
    ImageIcon imagenactual;

    public void insert(String letter, int punteo, ImageIcon imagen) {
        NodoLet newe = new NodoLet(letter, punteo, imagen);
        System.out.print(newe.getLetra() + ", ");
        if (first == null) {
            first = newe;
            first.setSiguiente(null);
            actual = first;
        } else {

            actual.setSiguiente(newe);
            newe.setSiguiente(null);
            actual = newe;
        }
    }

    public void push() {
        actual = first;
        /*crear un numero random de 0 a 94 para que le asigne el valor a un nodo y devuelva el 
        siguiente de este nodo, por eso debe ser 94, ya que si es 95 y toca el ultimo nodo, no podra devolver nada
        ya que el siguiente de este es null
         */
        Random n = new Random();
        int x = (int) (n.nextDouble() * noLetras);
        System.out.print(" numero de letras" + noLetras);
        System.out.print(" numero random " + x + "; ");
        for (int i = 0; i < x - 1; i++) {
            System.out.print(i);
            if (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            System.out.print(actual.getLetra() + ", ");
        }
        NodoLet devuelve = actual;
        if (actual.getSiguiente() != null) {
            devuelve = actual.getSiguiente();
        }

        valoractual = devuelve.getPunteo();
        imagenactual = devuelve.getImagen();
        letraactual = devuelve.getLetra();
        actual.setSiguiente(devuelve.getSiguiente());
        noLetras--;
    }
    public NodoLet ran() {
                actual = first;

       Random n = new Random();
        int x = (int) (n.nextDouble() * noLetras);
        System.out.print(" numero de letras" + noLetras);
        System.out.print(" numero random " + x + "; ");
        for (int i = 0; i < x - 1; i++) {
            System.out.print(i);
            if (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            System.out.print(actual.getLetra() + ", ");
        }
        NodoLet devuelve = actual;
        if (actual.getSiguiente() != null) {
            devuelve = actual.getSiguiente();
        }
        noLetras--;
        return devuelve;
    }

    public int pushno() {
        return valoractual;
    }

    public ImageIcon pushim() {
        return imagenactual;
    }

    public String pushlet() {
        return letraactual;
    }

    public void guardarelim(String letter) {
        if (number < 6) {
            elim[number] = letter;
            number++;
        }
    }
}
