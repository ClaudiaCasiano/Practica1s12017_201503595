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
public class NodoListaSimple {
 
    private String palabra;
    private NodoListaSimple siguiente;
    
    public NodoListaSimple(String palabra){
        this.palabra=palabra;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the siguiente
     */
    public NodoListaSimple getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    }
    
}
