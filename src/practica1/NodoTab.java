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
public class NodoTab {

    private String letra;
    private int valor;
    private int fila;
    private int columna;

    private NodoTab siguiete;
    private NodoTab anterior;
    private NodoTab up;
    private NodoTab down;

    public NodoTab(String letra, int valor, int fila, int columna) {
        this.letra = letra;
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
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
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiete
     */
    public NodoTab getSiguiete() {
        return siguiete;
    }

    /**
     * @param siguiete the siguiete to set
     */
    public void setSiguiete(NodoTab siguiete) {
        this.siguiete = siguiete;
    }

    /**
     * @return the anterior
     */
    public NodoTab getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoTab anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the up
     */
    public NodoTab getUp() {
        return up;
    }

    /**
     * @param up the up to set
     */
    public void setUp(NodoTab up) {
        this.up = up;
    }

    /**
     * @return the down
     */
    public NodoTab getDown() {
        return down;
    }

    /**
     * @param down the down to set
     */
    public void setDown(NodoTab down) {
        this.down = down;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

}
