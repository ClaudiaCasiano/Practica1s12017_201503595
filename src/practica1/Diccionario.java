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
public class Diccionario {
    NodoListaSimple cabeza;

    public Diccionario() {
       cabeza = null;
    }
    
    public void agregar(String palabra){
        NodoListaSimple nuevo = new NodoListaSimple(palabra);
        if (cabeza == null){
            this.cabeza = nuevo;
            
        }else {
            NodoListaSimple actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
    }     
}
    
    public boolean buscar (String palabra){
        NodoListaSimple visual;
        for (visual = cabeza; visual != null; visual = visual.getSiguiente()) {
            if(visual.getPalabra()==palabra){
                return true;
            }
        }
        return false;
    }
}
