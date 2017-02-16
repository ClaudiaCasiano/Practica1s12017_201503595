/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Paola
 */
public class ListaLetras {
    
    NodoLet first;
    int number=0;
    String [] elim = new String[7];

    public ListaLetras(NodoLet first) {
        this.first = null;
    }
    
    public void insert(String letter){
        NodoLet newe = new NodoLet(letter);
        
        if(first == null){
            first = newe;
            first.setSiguiente(null);
        }else{
            NodoLet actual = first;
            
            while(actual.getSiguiente()!= null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(newe);
            newe.setSiguiente(null);
        }
    }
    
    public void guardarelim(String letter){
        if (number < 6){
            elim[number]=letter;
            number++;
        }
    }
    
}
