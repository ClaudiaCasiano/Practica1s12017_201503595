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
    int valor = 1; //este es solo para llenar el espacio
    int columnas = 0;
    int filas = 0;
    int dimension, dx, dy;
    public String archivo="";

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
        System.out.println(archivo);
        
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

    
}
