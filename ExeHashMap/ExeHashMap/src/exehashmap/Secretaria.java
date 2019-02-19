/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exehashmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Secretaria {
    
    public static int refe = 6000;
    Alumno a1;

    //HashMap<clave,valor> (la clave no se repite), debemos comprobar que no esté la clave porque nos sobreescribiría los datos.
    public void crear(HashMap<String, Alumno> alum, String dni) {
        //containsKey devuelve true si la clave está en la colleccion y sino false
        if (alum.containsKey(dni)) {
            JOptionPane.showInternalMessageDialog(null, "Ya está en la lista.");
        } else {
            alum.put(dni, new Alumno(JOptionPane.showInputDialog("nome"), Integer.parseInt(JOptionPane.showInputDialog("nota"))));
        }
    }
    public void amosar(HashMap<String, Alumno> alum) {
        System.out.println(alum);

     /*   Iterator it = alum.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(alum.get(it.next()));
        }*/
    }

    public void pasarArrayList(HashMap<String, Alumno> alum,ArrayList<Alumno> lista) {
        //Pasar HashMap a ArrayList
    
        lista.addAll(alum.values());
        for (Alumno ele : lista) {
            System.out.println(ele);
        }
    }
    
    public void eliminar(HashMap<String, Alumno> alum,String dni) {
        if (alum.containsKey(dni)) {
            alum.remove(dni);
        }else{
            JOptionPane.showMessageDialog(null, "No está en la lista.");
        }
    }

    public void modificar(HashMap<String, Alumno> alum, String dni, int nota) {
        if (alum.containsKey(dni)) {
            alum.get(dni).setNota(nota);
            //Otra Opción:
            Alumno a = alum.get(dni);
            a.setNota(nota);
            alum.replace(dni, a);
        } else {
            JOptionPane.showMessageDialog(null, "No está en la lista.");
        }
    }

    public void consultar(HashMap<String, Alumno> alum, String dni) {
        if (alum.containsKey(dni)) {
            System.out.println(alum.get(dni).toString());
        }
    }

    
}
