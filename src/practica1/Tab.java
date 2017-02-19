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
public class Tab {

    NodoTab first;
    NodoTab actually;
    Tablero tablero;
    int valor=1; //este es solo para llenar el espacio
    int columnas=0;
    int filas=0;
    int dimension;

    public void crear(int d) {
        this.dimension =d;
        int i = 1;
        NodoTab nuevo = new NodoTab("o" ,valor,filas,columnas);
        first = nuevo;
        actually = first;
        System.out.println("1("+actually.getFila()+","+actually.getColumna()+")");

//--------------------PRIMERA FILA ------------------        
        while (columnas < d-1) {
            i++;
            columnas ++;
            NodoTab nuevo1 = new NodoTab("o"  , valor,filas,columnas);
            actually.setSiguiete(nuevo1);
            nuevo1.setAnterior(actually);
            actually = nuevo1;       
            System.out.println("("+actually.getFila()+","+actually.getColumna()+")");
        }
//-----------------------ULTIMA COLUMNA-----------------------       
        i = 1;
        System.out.println(columnas);
        while (filas < d-1) {
            
            filas++;
            i++;
            NodoTab nuevo1 = new NodoTab("o", 0,filas,columnas);
            actually.setDown(nuevo1);
            nuevo1.setUp(actually);
            actually = nuevo1;
            System.out.println("("+actually.getFila()+","+actually.getColumna()+")");
        }
        System.out.println("termino ultima columna");
        prueba2(actually);
        
    }

    public void prueba2(NodoTab actual) {

        columnas--;
        while (columnas >= 0) {
            NodoTab nuevono = new NodoTab("o", 4,filas,columnas);
            actual.setAnterior(nuevono);
            actual.getAnterior().setSiguiete(actual);
            actual = nuevono;
            System.out.println("("+actual.getFila()+","+actual.getColumna()+")");
            while (actual.getSiguiete().getUp().getUp() != null) {
                filas--;
                NodoTab nuevono2 = new NodoTab("o", 5,filas,columnas);
                actual.setUp(nuevono2);
                nuevono2.setSiguiete(actual.getSiguiete().getUp());
                nuevono2.getSiguiete().setAnterior(nuevono2);
                nuevono2.setDown(actual);
                actual = nuevono2;
                System.out.println("("+actual.getFila()+","+actual.getColumna()+")");
            }
            System.out.println("valor de fila "+filas + ","+columnas);
            actual.setUp(actual.getSiguiete().getUp().getAnterior());
            actual.getUp().setDown(actual);
            System.out.println("("+actual.getUp().getFila()+","+actual.getUp().getColumna()+")");
            if (actual.getUp().getAnterior()!=null){
              actual = actual.getUp().getAnterior();  
            }
            columnas--;
            filas--;
            if (columnas < 0){
                break;
            }
            filas++;
            
            while (filas<dimension) {
                NodoTab nuevono3 = new NodoTab("o", 6,filas,columnas);
                actual.setDown(nuevono3);
                nuevono3.setSiguiete(actual.getSiguiete().getDown());
                nuevono3.getSiguiete().setAnterior(nuevono3);
                nuevono3.setUp(actual);
                actual = nuevono3;
                System.out.println("("+actual.getFila()+","+actual.getColumna()+")");
                filas++;
            }
            System.out.println("valor de filita2 "+ filas);
            filas--;
            columnas--;
            System.out.println("kkk("+filas+","+columnas+")");
        }
    }

    private void CrearCasilla(int fila, int columna) {
        
    
    }
}
