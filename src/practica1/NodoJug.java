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
public class NodoJug {
    private String name;
    private ListaLetras letras;
    
    private NodoJug siguiente;
    private NodoJug anterior;

    public NodoJug(String name, ListaLetras letras){
        this.name=name;
        this.letras = letras;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the siguiente
     */
    public NodoJug getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoJug siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoJug getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoJug anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the letras
     */
    public ListaLetras getLetras() {
        return letras;
    }

    /**
     * @param letras the letras to set
     */
    public void setLetras(ListaLetras letras) {
        this.letras = letras;
    }
    
    
}
