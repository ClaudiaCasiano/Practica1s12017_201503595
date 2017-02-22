/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.jespxml.modelo.Tag;

/**
 *
 * @author Paola
 */
public class Tab {

    NodoTab first;
    NodoTab primerfila;
    NodoTab actually;
    Tablero tablero;
    graphiz grafic;
    int valor = 1; //este es solo para llenar el espacio
    int columnas = 0;
    int filas = 0;
    int dimension, dx, dy;
    public String archivo = "";

    public void crear(int d) {

        for (int i = 0; i <= d; i++) {
            for (int j = 0; j <= d; j++) {
                archivo = archivo + "node" + i + "" + j + ";\n";
            }
        }
        this.dimension = d;
        int i = 1;
        NodoTab nuevo = new NodoTab("null", 1, filas, columnas, "/Images/normal.jpg");
        first = nuevo;
        primerfila = first;
        actually = first;

//        System.out.println("1(" + actually.getFila() + "," + actually.getColumna() + ")");
//--------------------PRIMERA FILA ------------------        
        while (columnas < d - 1) {
            i++;
            columnas++;
            NodoTab nuevo1 = new NodoTab("null", 1, filas, columnas, "/Images/normal.jpg");
            actually.setSiguiete(nuevo1);
            archivo = archivo + "node" + (filas) + "" + "" + (columnas - 1) + " -> node" + filas + "" + columnas + "; \n";
            archivo = archivo + "node" + (filas) + "" + "" + (columnas) + " -> node" + filas + "" + (columnas - 1) + "; \n";
            nuevo1.setAnterior(actually);
            actually = nuevo1;
//            System.out.println("(" + actually.getFila() + "," + actually.getColumna() + ")");
        }
//-----------------------ULTIMA COLUMNA-----------------------       
        i = 1;
        System.out.println(columnas);
        while (filas < d - 1) {

            filas++;
            i++;
            NodoTab nuevo1 = new NodoTab("null", 0, filas, columnas, "/Images/normal.jpg");
            actually.setDown(nuevo1);
            archivo = archivo + "node" + (filas + 1) + "" + "" + (columnas) + " -> node" + filas + "" + columnas + "; \n";
            archivo = archivo + "node" + (filas) + "" + "" + (columnas) + " -> node" + (filas + 1) + "" + (columnas - 1) + "; \n";
            nuevo1.setUp(actually);
            actually = nuevo1;
//            System.out.println("(" + actually.getFila() + "," + actually.getColumna() + ")");
        }
        System.out.println("termino ultima columna");
        prueba2(actually);

    }

    public void prueba2(NodoTab actual) {

        columnas--;
        while (columnas >= 0) {
            NodoTab nuevono = new NodoTab("null", 1, filas, columnas, "/Images/normal.jpg");
            actual.setAnterior(nuevono);
//            archivo = archivo + "node" + (filas) + "" + "" + (columnas - 1) + " -> node" + filas + "" + columnas + "; \n";
//            archivo = archivo + "node" + (filas) + "" + "" + (columnas) + " -> node" + filas + "" + (columnas - 1) + "; \n";
            actual.getAnterior().setSiguiete(actual);
            actual = nuevono;
//            System.out.println("(" + actual.getFila() + "," + actual.getColumna() + ")");
            while (actual.getSiguiete().getUp().getUp() != null) {
                filas--;
                NodoTab nuevono2 = new NodoTab("null", 1, filas, columnas, "/Images/normal.jpg");
//                archivo = archivo + "node" + (filas) + "" + "" + (columnas) + " -> node" + (filas + 1) + "" + columnas + "; \n";
//                archivo = archivo + "node" + (filas + 1) + "" + "" + (columnas) + " -> node" + filas + "" + (columnas) + "; \n";
                actual.setUp(nuevono2);
                nuevono2.setSiguiete(actual.getSiguiete().getUp());
                nuevono2.getSiguiete().setAnterior(nuevono2);
//                archivo = archivo + "node" + (filas) + "" + "" + (columnas) + " -> node" + (filas) + "" + (columnas+1) + "; \n";
//                archivo = archivo + "node" + (filas) + "" + "" + (columnas+1) + " -> node" + (filas) + "" + (columnas) + "; \n";

                nuevono2.setDown(actual);
                actual = nuevono2;
//                System.out.println("(" + actual.getFila() + "," + actual.getColumna() + ")");
            }
//            System.out.println("1 de fila " + filas + "," + columnas);
            actual.setUp(actual.getSiguiete().getUp().getAnterior());
            actual.getUp().setDown(actual);
//            System.out.println("(" + actual.getUp().getFila() + "," + actual.getUp().getColumna() + ")");
            if (actual.getUp().getAnterior() != null) {
                actual = actual.getUp().getAnterior();
            }
            columnas--;
            filas--;
            if (columnas < 0) {
                actually = first;
                break;
            }
            filas++;

            while (filas < dimension) {
                NodoTab nuevono3 = new NodoTab("null", 1, filas, columnas, "/Images/normal.jpg");
                actual.setDown(nuevono3);
                nuevono3.setSiguiete(actual.getSiguiete().getDown());
                nuevono3.getSiguiete().setAnterior(nuevono3);
                nuevono3.setUp(actual);
                actual = nuevono3;
//                System.out.println("(" + actual.getFila() + "," + actual.getColumna() + ")");
                filas++;
            }
//            System.out.println("valor de filita2 " + filas);
            filas--;
            columnas--;
            if (columnas < 0) {
                actually = first;
                break;
            }

//            System.out.println("kkk(" + filas + "," + columnas + ")");
        }
//        crearel(archivo);

    }

    private void CrearCasilla(int f, int c, int valor) {
        NodoTab visual = first;
        if (f <= dimension && c <= dimension) {
            for (int i = 0; i < f; i++) {
                visual = visual.getDown();
            }
            for (int i = 0; i < c; i++) {
                visual = visual.getSiguiete();
            }

            visual.setValor(valor);
            if (valor == 2) {
                visual.setImagen("/Images/doble.jpg");
            } else {
                visual.setImagen("/Images/triple.jpg");
            }
        }

    }

    void setdobles(int n) {

        if (valor == 1) {
            dx = n;
            valor++;
        } else if (valor == 2) {
            dy = n;
            CrearCasilla(dx, dy, 2);
            valor = 1;
        }

    }

    public String imagen() {
        String im = actually.getImagen();
        if (actually.getSiguiete() != null) {
            actually = actually.getSiguiete();
        } else if (primerfila.getDown() != null) {
            primerfila = primerfila.getDown();
            actually = primerfila;
        }
        return im;
    }

    void settriples(int n) {

        if (valor == 1) {
            dx = n;
            valor++;
        } else if (valor == 2) {
            dy = n;
            CrearCasilla(dx, dy, 3);
            valor = 1;
        }

    }

    public String arch() {
        archivo = "";
        NodoTab fila = first;
        NodoTab actual;
        archivo = archivo + first.getLetra() + "; \n";

        for (int i = 1; i < dimension - 1; i++) {
            actual = fila;
            for (int j = 1; j < dimension; j++) {
                actual = actual.getSiguiete();
                archivo = archivo + actual.getLetra() + " -> " + actual.getAnterior().getLetra();
                archivo = archivo + actual.getAnterior().getLetra() + " -> " + actual.getLetra();
            }
            if (fila.getDown() != null) {
                fila = fila.getDown();
                actual = fila;
                for (int j = 0; j < dimension; j++) {
                    archivo = archivo + actual.getLetra() + " -> " + actual.getUp().getLetra();
                    archivo = archivo + actual.getUp().getLetra() + " -> " + actual.getLetra();
                    actual = actual.getSiguiete();
                }
            }

        }

        return archivo;
    }

    public boolean hayAlgo(int x, int y, String letra) {
        NodoTab casilla = first;
        for (int i = 0; i < x; i++) {
            casilla = casilla.getSiguiete();
        }
        for (int i = 0; i < y; i++) {
            casilla = casilla.getDown();
        }
        actually = casilla;
        if ("null".equals(casilla.getLetra())) {
            casilla.setLetra(letra);
            return false;
        }

        return true;
    }

    public void crearel() {
        grafic = new graphiz();
        grafic.grafo(arch(), "matriz");
        grafic.generar("matriz");
    }

    void hacervacio(int cx, int cy) {
        NodoTab casilla = first;
        for (int i = 0; i < cx; i++) {
            casilla = casilla.getSiguiete();
        }
        for (int i = 0; i < cy; i++) {
            casilla = casilla.getDown();
        }
        casilla.setLetra("null");
    }

    public String horizontal(int x, int y) {
        String palabra = "";
        NodoTab actual = first;
        for (int i = 0; i < x; i++) {
            actual = actual.getSiguiete();
        }
        for (int j = 0; j < y; j++) {
            actual = actual.getDown();
        }

        while (actual.getSiguiete().getLetra() != "null" && actual.getSiguiete() != null) {
            palabra = palabra + actual.getSiguiete().getLetra();
            actual = actual.getSiguiete();
        }
        while (actual.getAnterior().getLetra() != "null" && actual.getAnterior() != null) {
            palabra = actual.getSiguiete().getLetra() + palabra;
            actual = actual.getAnterior();
        }
        return palabra;

    }

    public String vertical(int x, int y) {
        String palabra = "";
        NodoTab actual = first;
        for (int i = 0; i < x; i++) {
            actual = actual.getSiguiete();
        }
        for (int j = 0; j < y; j++) {
            actual = actual.getDown();
        }

        while (actual.getSiguiete().getLetra() != "null" && actual.getSiguiete() != null) {
            palabra = palabra + actual.getDown().getLetra();
            actual = actual.getDown();
        }
        while (actual.getAnterior().getLetra() != "null" && actual.getAnterior() != null) {
            palabra = actual.getUp().getLetra() + palabra;
            actual = actual.getUp();
        }
        return palabra;
    }
}
