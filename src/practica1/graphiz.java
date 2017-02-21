/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Paola
 */
public class graphiz {

    public void grafo(String archivo, String nombre) {// EN ESTE CREO EL ARCHIVO CON EL QUE SE GRAFICA
        try {
            File miDir = new File(".");
            String directo = miDir.getCanonicalPath();
            File vo = new File(directo + "\\Practica1EDD\\" + nombre + ".txt");
            BufferedWriter bw;
            if (vo.exists()) {
                bw = new BufferedWriter(new FileWriter(vo));
                bw.write("digraph G\n{" + archivo + "\n}");
//                bw.newLine();
//                bw.write("digraph G\n{" + archivo + "\n}");

            } else {
                bw = new BufferedWriter(new FileWriter(vo));
                bw.write("digraph G\n{" + archivo + "\n}");
            }

            bw.close();
        } catch (Exception e) {
            System.out.println("Errorcito D':");
            System.out.println(e.getMessage());
        }
    }

    public void generar(String name) {
        try {

            File miDir = new File(".");
            String directo = miDir.getCanonicalPath();

            String dotPath = directo + "\\Graphviz 2.28\\bin\\dot.exe";

            String fileInputPath = directo + "\\Practica1EDD\\" + name + ".txt";
            String fileOutputPath = directo + "\\Practica1EDD\\" + name + ".jpg";
//            String fileOutputPath = getClass().getResource("/grafo1.jpg").toString();

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(cmd);
            System.out.println("supuestamente genero la imagen");
            p.waitFor();
        } catch (Exception ex) {
            System.out.println("Error en Generar D:");
            ex.printStackTrace();
        } finally {
        }
    }
}
