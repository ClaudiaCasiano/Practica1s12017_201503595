/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JFileChooser;

/**
 *
 * @author Paola
 */
public class MetodosPrincipal {
    
    public String AbrirArchivo(){
        JFileChooser abrir = new JFileChooser();
        String archivo =abrir.getName();
        
        return archivo + "queonza";
    }
    
    
}
