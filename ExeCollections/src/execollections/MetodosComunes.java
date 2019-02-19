/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execollections;

import java.util.ArrayList;
import Utilities.PedirDatos;
import java.util.Iterator;

/**
 *
 * @author finfanterodalSystem.e
 */
public class MetodosComunes {

    //Método para añadir valores enteros a nuestro ArrayList:
    public void engadir(ArrayList<Integer> numList) {
        numList.add(PedirDatos.intVal("Valor entero."));
    }

    //Método para mostrar los valores de mi ArrayList
    public void mostrar(ArrayList<Integer> numList, int opcion) {
        //Hay tres formas de mostrar los datos:
        switch (opcion) {
            case 1:
                //1:For
                System.out.println("FOR");
                for (int i = 0; i < numList.size(); i++) {
                    //Mostrar el valor de la posición determinda
                    System.out.println(numList.get(i));
                }
                break;
            case 2:
                //2:ForEach (Colle a coleción, a recorre y va poniendo elemento a elemento en ele)
                System.out.println("FOR-EACH");
                for (Integer ele : numList) {
                    System.out.println(ele);
                }
                break;
            case 3:
                //3.Iterator (Se mueve por la colección mientras haya elementos, y podemos ir cogiendo elemento a elemento.)
                System.out.println("ITERATOR");
                Iterator it = numList.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                break;
        }
    }

    //Método para borrrar por posición:
    public int deleteByPos(int posicion, ArrayList<Integer> numList) {
        return numList.remove(posicion);
    }

    //Método para borrrar elemento:
    public void deleteByElement(Integer elemento, ArrayList<Integer> numList) {
        //Tiene que recibir un objeto del valor del elemento
        // numList.remove(new Integer(elemento));
        numList.remove(elemento);
    }
    
    public void actualizarValor(int pos,Integer valor,ArrayList<Integer> numList){
        numList.set(pos-1, valor);
    }

}
