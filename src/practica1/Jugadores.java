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
    NodoJug newe;
    int numero = 0;
    NodoJug jugadorActual;
    ListaLetras listaActual;
    graphiz grafic = new graphiz();
    String archivo = "";

    public Jugadores() {
        head = null;
    }

    public void insert(String name, ListaLetras lista) {
        newe = new NodoJug(name, lista);
        numero++;

        if (head == null) {
            this.head = newe;
            newe.setSiguiente(head);
            jugadorActual = this.head;
            archivo = archivo + head.getName()+"; \n";
        } else {
            NodoJug actual = head;
            while (actual.getSiguiente() != head) {
                actual = actual.getSiguiente();
            }
            archivo = archivo + newe.getName()+"; \n";
            archivo = archivo + actual.getName()+" -> "+newe.getName()+"; \n";
            actual.setSiguiente(newe);
            newe.setAnterior(actual);
            newe.setSiguiente(head);
        }
        System.out.println("se incerto "+ newe.getName());
    }
    
    public void ultimo(){
        archivo = archivo + newe.getName()+" -> "+head.getName()+"; \n";
    }

    public void imprimir() {
        NodoJug visual;
        for (visual = head; visual!= newe; visual = visual.getSiguiente()) {
            System.out.println(visual.getName());
        }
        System.out.println(newe.getName());
    }
    
    public NodoJug siguiente(){
        jugadorActual = jugadorActual.getSiguiente();
        return jugadorActual;
    }

    public boolean verificar(String nombre) {
        NodoJug visual;
        if (head == null) {
            return true;// si la lista esta vacio, retorna true
        } else {
            for (visual = head; visual!= newe; visual = visual.getSiguiente()) {
            if(visual.getName()== nombre){
                return false;
            }
            if (newe.getName()==nombre){
                return false;
            }
        }
            return true;//en otro caso, si lo deja :33
        }

    }

    void grafico() {
        System.out.println(archivo);
        grafic.grafo(archivo, "jugadores");
        grafic.generar("jugadores");
    }
}
