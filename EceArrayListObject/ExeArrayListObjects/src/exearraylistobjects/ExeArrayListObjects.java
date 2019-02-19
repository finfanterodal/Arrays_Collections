/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exearraylistobjects;

import Utilities.PedirDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class ExeArrayListObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> alumnList = new ArrayList<>();
        MetodosComunes m1=new MetodosComunes();
        String opcion;
        do {
            opcion = PedirDatos.StringVal("Menu\n" + "1.Engadir elemento.\n" + "2.Amosar\n" + "3.Borrar.\n" + "4.Borrar Elemento.\n" + "5.Ordenar.\n"+"6.Buscar elemento\n" +"7.Modificar Nota."+"\n8.Salir.");
            switch (opcion) {
                case "1":
                    m1.engadir(alumnList);
                    break;
                case "2":
                    m1.amosar(alumnList, PedirDatos.intVal("1.FOR-EACH\n2.ITERATOR"));
                    break;

                case "3":
                    m1.deleteByPos(PedirDatos.intVal("Posicion") - 1, alumnList);
                    break;

                case "4":
                    m1.deleteByElement(PedirDatos.StringVal("dni"), alumnList, PedirDatos.intVal("1.FOR\n2.FOR EACH\n3.ITERATOR"));
                    break;
                case "5":
                    m1.ordenar(alumnList);

                    break;
                case "6":
                    m1.buscarElemento(PedirDatos.StringVal("dni"),alumnList);
                    break;
                    case "7":
                                        m1.modificarNota(PedirDatos.StringVal("dni"), alumnList);

                    break;
                case "8":

                    //0
                    System.exit(0);
                default:
                    System.out.println("Opción inexistente.");

            }

        } while (opcion != "8");

    }

}
