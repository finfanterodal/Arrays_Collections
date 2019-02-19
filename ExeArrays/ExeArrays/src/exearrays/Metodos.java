package exearrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Metodos {

    //Collemos 8 espazos de memoria para 8 datos tipo int:
    int tamaño=8;
    int[] notas = new int[tamaño];//0-7 valores
    int[] repetidos = new int[8];
    private int numr;
    //Dámoslle valores cun método:

    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Pon un valor."));
    }

    //Bucle para dar valores ao noso arrays:
    public void crearArray() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darValor();
        }
    }

    //Bucle para visualizar os valores do array:
    public void amosar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }

    public void amosarForEach() {
        System.out.println("\n***For each***");
        for (int elemento : notas) {
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
        if (j==0) {
            System.out.println("No se ha encontrado elemento.");
        } else if (j==1) {
            System.out.println("No se ha repetido.");
        } else {
            for (int i = 0; i < j; i++) {

                System.out.println(elemento + ", Posicion:" + repetidos[i]);

            }
            System.out.println("\nEl elemento se ha repetido: " + numr + " veces.");
        }
    }
    
    public void ordenarArray(){
        int aux;
        for (int i = 0; i < notas.length-1; i++) {
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


    public void eliminar() {
        System.out.println("\n***Eliminar***");
        int aux;
        int elemento = darValor();
        for (int i = 0; i < notas.length; i++) {
            if (elemento == notas[i]) {
                for (int pos = i; pos < notas.length - 1; pos++) {
                    aux=notas[pos];
                    notas[pos] = notas[pos + 1];
                    notas[pos+1]=aux;
                }
            }
        }
        tamaño--;
    }
}
