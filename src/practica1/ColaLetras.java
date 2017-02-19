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
public class ColaLetras {
    NodoLet first;
    NodoLet actual;
    int number=0;
    int valoractual;
    String [] elim = new String[7];
    int noLetras = 95;

    
    public void insert(String letter,int punteo){
        NodoLet newe = new NodoLet(letter,punteo);
        
        if(first == null){
            first = newe;
            first.setSiguiente(null);
            actual = first;
        }else{
           
            actual.setSiguiente(newe);
            newe.setSiguiente(null);
            actual = newe;
        }
    }
    
    public String push(){
        actual = first;
        /*crear un numero random de 0 a 94 para que le asigne el valor a un nodo y devuelva el 
        siguiente de este nodo, por eso debe ser 94, ya que si es 95 y toca el ultimo nodo, no podra devolver nada
        ya que el siguiente de este es null
        */
        int n = new Random().nextInt(noLetras);
        for(int i = 0; i < n; i++){
            actual = actual.getSiguiente();
        }
        NodoLet devuelve = actual.getSiguiente();
        valoractual =devuelve.getPunteo();
        actual.setSiguiente(actual.getSiguiente().getSiguiente());
        noLetras--;
        return devuelve.getLetra();
    }
    
    public int pushno(){
        return valoractual;
    }
    
    
    
    public void guardarelim(String letter){
        if (number < 6){
            elim[number]=letter;
            number++;
        }
    }
}
