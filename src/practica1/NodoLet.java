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
public class NodoLet {
    private String letra;
    private NodoLet siguiente;

    public NodoLet(String letra) {
        this.letra = letra;
    }

    /**
     * @return the letra
     */
    public String getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(String letra) {
        this.letra = letra;
    }

    /**
     * @return the siguiente
     */
    public NodoLet getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLet siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
