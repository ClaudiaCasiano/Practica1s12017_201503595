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

    public Jugadores() {
        head = null;
    }

    public void insert(String name, ListaLetras lista) {
        newe = new NodoJug(name, lista);

        if (head == null) {
            head = newe;
            newe.setSiguiente(head);
        } else {
            NodoJug actual = head;
            while (actual.getSiguiente() != head) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(newe);
            newe.setAnterior(actual);
            newe.setSiguiente(head);
        }
        System.out.println("se incerto "+ newe.getName());
    }

    public void imprimir() {
        NodoJug visual;
        for (visual = head; visual!= newe; visual = visual.getSiguiente()) {
            System.out.println(visual.getName());
        }
        System.out.println(newe.getName());
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
}
