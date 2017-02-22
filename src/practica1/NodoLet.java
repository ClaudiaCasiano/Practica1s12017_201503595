/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.ImageIcon;

/**
 *
 * @author Paola
 */
    public class NodoLet {
    private String letra;
    private int punteo;
    private ImageIcon imagen;
    private NodoLet siguiente;
    private NodoLet anterior;

    public NodoLet(String letra, int punteo, ImageIcon imagen) {
        this.letra = letra;
        this.punteo = punteo;
        this.imagen = imagen;
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

    /**
     * @return the punteo
     */
    public int getPunteo() {
        return punteo;
    }

    /**
     * @param punteo the punteo to set
     */
    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    /**
     * @return the imagen
     */
    public ImageIcon getImagen() {
        return imagen;
    }

    /**
     * @return the anterior
     */
    public NodoLet getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoLet anterior) {
        this.anterior = anterior;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    
}
