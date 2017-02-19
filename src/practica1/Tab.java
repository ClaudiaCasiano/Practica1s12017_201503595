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
    int columnas;

    public void crear(int d) {
        int i = 1;
        this.columnas = d;
        NodoTab nuevo = new NodoTab("primero 1, " + i, 0);
        first = nuevo;
        actually = first;
        System.out.println(first.getLetra());

//--------------------PRIMERA FILA ------------------        
        while (i < d) {
            i++;
            NodoTab nuevo1 = new NodoTab("columna ," + i , 0);
            actually.setSiguiete(nuevo1);
            nuevo1.setAnterior(actually);
            actually = nuevo1;
            System.out.println(nuevo1.getLetra());
        }
//-----------------------ULTIMA COLUMNA-----------------------       
        i = 1;
        while (i < d) {
            i++;
            NodoTab nuevo1 = new NodoTab("fila " +i, 0);
            actually.setDown(nuevo1);
            nuevo1.setUp(actually);
            actually = nuevo1;
            System.out.println(actually.getLetra());
        }
        columnas--;
        System.out.println("se ha llegado al ultimo "+ actually.getLetra());
        prueba2(actually);
        

////--------------------ULTIMA FILA------------------
//        i = 1;
//        while (i < d) {
//            i++;
//            NodoTab mania = new NodoTab(null, 0);
//            nuevo.setAnterior(mania);
//            mania.setSiguiete(nuevo);
//            mania.setUp(null);
//            nuevo = mania;
//            System.out.println("ultima fila " + i);
//        }
////--------------------PRIMERA COLUMNA------------------
//
//        i = 1;
//        while (i < d - 1) {
//            i++;
//            NodoTab mania = new NodoTab(null, 0);
//            nuevo.setUp(mania);
//            mania.setDown(nuevo);
//            nuevo = mania;
//            System.out.println("Primera columna " + i);
//        }
//        nuevo.setUp(first);
//        first.setDown(nuevo);
//        System.out.println(nuevo.getUp().getLetra());
//        System.out.println(first.getSiguiete().getLetra());
//        this.adentro(nuevo);
    }

//    public void adentro(NodoTab nuevo) {
//
//        NodoTab holi = null;
//        NodoTab aux = nuevo;
//        NodoTab guide = aux.getUp().getSiguiete();
//        int i = 1;
//        while (guide.getSiguiete() != null) {
//
//            holi = new NodoTab("quisawea " + i, 0);
//            holi.setAnterior(nuevo);
//            nuevo.setSiguiete(holi);
//            holi.setUp(guide);
//            guide.setDown(holi);
////            if(i == 1){//y la guia exterior
////               aux = guide.getDown();
////            }
//            guide = guide.getSiguiete();
//            nuevo = nuevo.getSiguiete();
//            i++;
//            System.out.println("algo" + i);
//        }
//        nuevo.setSiguiete(guide.getDown());
//        guide.getDown().setAnterior(nuevo);
//        System.out.println(nuevo.getLetra());
//
//        if (aux.getDown() != null) {
//            adentro(aux.getDown());
//        }
//        System.out.println(nuevo.getSiguiete().getLetra());
//
//    }

    public void prueba2(NodoTab actual) {

        while (columnas != 0) {
            NodoTab nuevono = new NodoTab("ab", 4);
            actual.setAnterior(nuevono);
            actual.getAnterior().setSiguiete(actual);
            actual = nuevono;
            while (actual.getSiguiete().getUp().getUp() != null) {
                NodoTab nuevono2 = new NodoTab("ab", 5);
                actual.setUp(nuevono2);
                nuevono2.setSiguiete(actual.getSiguiete().getUp());
                nuevono2.getSiguiete().setAnterior(nuevono2);
                nuevono2.setDown(actual);
                actual = nuevono2;
                System.out.println(actual.getLetra());
            }
            actual.setUp(actual.getSiguiete().getUp().getAnterior());
            actual.getUp().setDown(actual);
            actual = actual.getUp().getAnterior();
            columnas--;
            if (columnas == 0){
                break;
            }

            while (actual.getSiguiete().getDown() != null) {
                NodoTab nuevono3 = new NodoTab("ha", 6);
                actual.setDown(nuevono3);
                nuevono3.setSiguiete(actual.getSiguiete().getDown());
                nuevono3.getSiguiete().setAnterior(nuevono3);
                nuevono3.setUp(actual);
                actual = nuevono3;
                System.out.println(actual.getLetra());
            }
            columnas--;
            System.out.println(actual.getLetra());

        }
    }

}
