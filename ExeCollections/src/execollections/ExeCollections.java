/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execollections;

import Utilities.PedirDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class ExeCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  //ArrayList sin tipo definido
         ArrayList lista=new ArrayList();
         //Como solo llevan objetos podemos poner:
         lista.add("aaaa");
         lista.add(new Integer(2));
           lista.add(4);
           for(int i=0;i<lista.size();i++){
               //Mostrar el valor de la posición determinda
               System.out.println(lista.get(i));*/

        // Debemos especificar de qué tipo es el ArrayList
        MetodosComunes m1 = new MetodosComunes();
        ArrayList<Integer> lista = new ArrayList<>();
        int opcion;
        /*   //Como solo llevan objetos podemos poner:
        //lista.add("aaaa"); no me permite meter String solo enteros
        lista.add(new Integer(2));
        lista.add(4);
        for (int i = 0; i < lista.size(); i++) {
            //Mostrar el valor de la posición determinda
            System.out.println(lista.get(i));
        }*/

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n" + "1.Engadir elemento.\n" + "2.Amosar\n" + "3.Borrar.\n" + "4.Borrar Elemento.\n"+"5.Actualizar valor."+"\n6.Salir."));
            switch (opcion) {
                case 1:
                    m1.engadir(lista);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                case 2:
                    m1.mostrar(lista, 2);
                    break;
                    
                case 3:
                    m1.deleteByPos(PedirDatos.intVal("Posición") - 1, lista);
                    break;

                case 4:
                    m1.deleteByElement(PedirDatos.intVal("Valor aborrar."), lista);
                    break;
                case 5:
                    m1.actualizarValor(PedirDatos.intVal("Posicion"), PedirDatos.intVal("Valor nuevo"), lista);
                    break;
                case 6:
                    //0
                    System.exit(0);
                default:
                    System.out.println("Opción inexistente.");
                      
            }
            
        } while (opcion!=6);

    }

}
