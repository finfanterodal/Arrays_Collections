/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exehashmap;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class ExeHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el HashMap, con su clave y un valor
        HashMap<String, Alumno> listaAlumnos = new HashMap<>();
        Secretaria obj = new Secretaria();
        int opcion;
        String dni;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1.Engadir.\n" + "2.Amosar.\n" + "3.Amosar en ArrayList.\n" + "4.Eliminar.\n"+ "5.Modificar.\n"));
            switch (opcion) {
                case 1:
                    dni = JOptionPane.showInputDialog("dni");
                    obj.crear(listaAlumnos, dni);
                    break;
                case 2:
                    obj.amosar(listaAlumnos);
                    break;

                case 3:
                    ArrayList<Alumno> lista = new ArrayList<>();
                    obj.pasarArrayList(listaAlumnos, lista);
                    break;

                case 4:
                    dni = JOptionPane.showInputDialog("dni");
                    obj.eliminar(listaAlumnos, dni);
                    break;
                case 5:
                    int nota=Integer.parseInt(JOptionPane.showInputDialog("nota"));
                    dni = JOptionPane.showInputDialog("dni");
                    obj.modificar(listaAlumnos, dni, nota);
                    
                    break;

                case 8:

                    //0
                    System.exit(8);
                default:
                    System.out.println("Opción inexistente.");

            }

        } while (opcion != 8);
    }

}
