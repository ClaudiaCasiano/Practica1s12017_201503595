/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;

/**
 *
 * @author Paola
 */
public class ListaLetras {
    ColaLetras cola;
    
    public ListaLetras(ColaLetras cola){
        this.cola = cola;
    }

    NodoLet first;
    NodoLet actual;
    int number = 0;
    String[] elim = new String[7];
    int noLetras = 95;

    public void insert(String letter, int punteo) {
        NodoLet newe = new NodoLet(letter, punteo);

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

    public String[] letra() {
        String letter[] = new String[2];
        
        
        return letter;

    }

    public void guardarelim(String letter) {
        if (number < 6) {
            elim[number] = letter;
            number++;
        }
    }

}
