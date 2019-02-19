package exearrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Metodos {

    //Para as táboas
    int filas = 4;
    int columnas = 3;
    String[] nomes = {"aa", "bb", "cc", "dd"};
    String[] modulos = {"PROG", "FOL", "BD"};
    int[][] notas1 = new int[filas][columnas];
    //Collemos 8 espazos de memoria para 8 datos tipo int:
    int tamaño = 8;
    int[] notas = new int[tamaño];//0-7 valores

    int[] repetidos = new int[8];
    private int numr;
    //Dámoslle valores cun método:

    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Pon un valor."));
    }

    //Bucle para dar valores ao noso array:
    public int[] crearArray(int[] array, int numElementos) {
        for (int i = 0; i < numElementos; i++) {
            array[i] = darValor();
        }
        return array;
    }

    //Bucle para visualizar os valores do array:
    public void amosar(int[] array) {
        System.out.println("\n***Amosar1***");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //Bucle para visualizar os valores do array:
    public void amosar2(int[] array) {
        System.out.println("\n***Amosar2***");
        for (int i = 0; i < ExeArrays.numElementos; i++) {
            System.out.println(array[i]);
        }
    }

    public void amosarForEach(int[] array) {
        System.out.println("\n***For each***");
        for (int elemento : array) {
            System.out.println(elemento);
        }
    }

    public void encontrarElemento() {
        System.out.println("***Encontrar elemento***");
        boolean estado = false;
        int elemento = darValor();
        Ejemplo:
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == elemento) {
                System.out.println("Posición: " + (i + 1));
                estado = true;
                break;// o i=notas.length;
            }
        }
        if (estado == false) {
            System.out.println("No se ha encontrado elemento.");
        }

    }

    public void encontrarElementoRepetido() {
        System.out.println("\n***Encontrar elemento***");
        boolean estado = false;
        int elemento = darValor();
        int j = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == elemento) {
                repetidos[j] = notas[i];
                j++;
                numr = j;
                estado = true;
            }
        }
        if (estado == false) {
            System.out.println("No se ha encontrado elemento.");
        }
        for (j = 0; j < numr; j++) {

            System.out.println("Posiciones: " + (j + 1) + ", Elemento Repetido:" + repetidos[j]);

        }
        System.out.println("\nEl elemento se ha repetido: " + numr + " veces.");
    }

    public void encontrarElementoRepetido1() {
        System.out.println("\n***Encontrar elemento 1***");
        int elemento = darValor();
        int j = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == elemento) {
                repetidos[j] = i + 1;
                j++;
            }
        }
        if (j == 0) {
            System.out.println("No se ha encontrado elemento.");
        } else if (j == 1) {
            System.out.println("No se ha repetido.");
        } else {
            for (int i = 0; i < j; i++) {

                System.out.println(elemento + ", Posicion:" + repetidos[i]);

            }
            System.out.println("\nEl elemento se ha repetido: " + numr + " veces.");
        }
    }

    public void ordenarArray() {
        int aux;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }
    }

    public void ordenarSort() {
        Arrays.sort(notas);//Orden natural, menor a mayor.
    }
//Eliminar un elemento y disminuir el array

    public int[] eliminar(int[] array) {
        System.out.println("\n***Eliminar***");
        int aux;
        int elemento = darValor();
        for (int i = 0; i < ExeArrays.numElementos; i++) {
            if (elemento == array[i]) {
                for (int pos = i; pos < ExeArrays.numElementos - 1; pos++) {
                    array[pos + 1] = array[pos];
                }
            }
        }
        ExeArrays.numElementos--;
        return array;
    }

    //Engadir un elemento en unha posición
    public int[] engadirElementos(int[] array, int pos, int elementos) {
        System.out.println("\n***Engadir elemento***");
        if (elementos < array.length) {
            int elemento = darValor();
            for (int i = elementos - 1; i >= pos - 1; i--) {
                array[i + 1] = array[i];
            }
            array[pos - 1] = elemento;
            ExeArrays.numElementos++;
        }

        return array;
    }
/*
    public void rellenarTabla(int[][] array, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = darValor();
            }
        }
    }

    public void visualizarTabla(int[][] array, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
*/
       public void crearTabla() {
        for (int i = 0; i < notas1.length; i++) {//i Filas
            for (int j = 0; j <notas1[i].length; j++) {//j columnas
                notas1[i][j] = darValor();
            }
        }
    } 
    
        public void visualizarTabla() {
        for (int i = 0; i < notas1.length; i++) {//i Filas
            for (int j = 0; j <notas1[i].length; j++) {//j columnas              
                System.out.print(" " + notas1[i][j]);
            }
             System.out.println("");
        }
                         
        
    }
    
}



         