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
public class Jugadores {
    NodoJug head;
    
    public Jugadores()
    {
        head = null;
    }
    
    public void insert(String name, ListaLetras lista){
        NodoJug newe = new NodoJug(name,lista);
        
        if(head== null){
            head = newe;
            head.setSiguiente(head);
        }else {
            NodoJug actual = head;
            while (actual.getSiguiente() != head) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(newe);
            newe.setAnterior(actual);
            newe.setSiguiente(head);
        }
    }
    
}
