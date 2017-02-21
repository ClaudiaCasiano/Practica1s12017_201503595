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
    graphiz grafico = new graphiz();
    String archivo = "";

    public Diccionario() {
        cabeza = null;
    }

    public void agregar(String palabra) {
        NodoListaSimple nuevo = new NodoListaSimple(palabra);
        if (cabeza == null) {
            this.cabeza = nuevo;
            archivo = archivo + cabeza.getPalabra() + "; \n";

        } else {
            NodoListaSimple actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            archivo = archivo + nuevo.getPalabra() + "; \n";
            archivo = archivo + actual.getPalabra() + " -> " + nuevo.getPalabra() + "; \n";
        }
    }

    public boolean buscar(String palabra) {
        NodoListaSimple visual;
        for (visual = cabeza; visual != null; visual = visual.getSiguiente()) {
            if (visual.getPalabra() == palabra) {
                return true;
            }
        }
        return false;
    }

    public void generarArchivo() {
        grafico.grafo(archivo, "diccionario");
        grafico.generar("diccionario");
    }
}
