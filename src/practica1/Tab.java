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

    public void crear(int d) {
        int i = 1;
        NodoTab nuevo = new NodoTab("1," + i, 0);
        first = nuevo;
        first.setSiguiete(null);
        nuevo = first;
        System.out.println(first.getLetra());

//--------------------PRIMERA FILA ------------------        
        while (i < d) {
            i++;
            NodoTab mania = new NodoTab("fila" + i, 0);
            nuevo.setSiguiete(mania);
            mania.setSiguiete(null);
            mania.setAnterior(nuevo);
            nuevo = mania;
            System.out.println(nuevo.getLetra());
        }
//-----------------------ULTIMA COLUMNA-----------------------       
        i = 1;
        while (i < d) {
            i++;
            NodoTab mania = new NodoTab(null, 0);
            nuevo.setDown(mania);
            mania.setSiguiete(null);
            mania.setUp(nuevo);
            nuevo = mania;
            System.out.println("ULTIMO " + i);
        }

//--------------------ULTIMA FILA------------------
        i = 1;
        while (i < d) {
            i++;
            NodoTab mania = new NodoTab(null, 0);
            nuevo.setAnterior(mania);
            mania.setSiguiete(nuevo);
            mania.setUp(null);
            nuevo = mania;
            System.out.println("ultima fila " + i);
        }
//--------------------PRIMERA COLUMNA------------------

        i = 1;
        while (i < d - 1) {
            i++;
            NodoTab mania = new NodoTab(null, 0);
            nuevo.setUp(mania);
            mania.setDown(nuevo);
            nuevo = mania;
            System.out.println("Primera columna " + i);
        }
        nuevo.setUp(first);
        first.setDown(nuevo);
        System.out.println(nuevo.getUp().getLetra());
        System.out.println(first.getSiguiete().getLetra());
        this.adentro(nuevo);
    }

    public void adentro(NodoTab nuevo) {

        
        NodoTab holi = null;
        NodoTab aux = nuevo;
        NodoTab guide = aux.getUp().getSiguiete();
        int i = 1;
        while (guide.getSiguiete() != null) {

            holi = new NodoTab("quisawea "+i, 0);
            holi.setAnterior(nuevo);
            nuevo.setSiguiete(holi);
            holi.setUp(guide);
            guide.setDown(holi);
//            if(i == 1){//y la guia exterior
//               aux = guide.getDown();
//            }
            guide = guide.getSiguiete();
            nuevo = nuevo.getSiguiete();
           i++;
            System.out.println("algo" +i);
        } 
                nuevo.setSiguiete(guide.getDown());
                guide.getDown().setAnterior(nuevo);
                System.out.println(nuevo.getLetra());
                
        if (aux.getDown()!= null){
            adentro(aux.getDown());
        }
        System.out.println(nuevo.getSiguiete().getLetra());
                        
          

    }

}
