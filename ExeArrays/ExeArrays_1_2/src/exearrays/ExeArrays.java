package exearrays;



/**
 *
 * @author finfanterodal
 */
public class ExeArrays {
       public static int numElementos ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* int filas=4;
     int columnas=3;
            //Array de notas con 2 dimensiones, 4 filas y 3 columnas
    int[][] notas1=new int [filas][columnas];*/

        Metodos metodo1 = new Metodos();
         /* //Declaración del array enteros con 6 elementos
         int [] enteros=new int[6];
         //Creamos el array añadiendo solo 4 valores
         numElementos=metodo1.darValor();
         metodo1.crearArray(enteros, numElementos);
         metodo1.amosar(enteros);
         metodo1.engadirElementos(enteros, 4, numElementos);
         metodo1.amosar(enteros);
         metodo1.amosar2(enteros);
         enteros=metodo1.eliminar(enteros);
         metodo1.amosar2(enteros);
         metodo1.amosar(enteros);
       */
        //Declaración del array numeros
        /*int tamaño = metodo1.darValor();
        int[] numeros = new int[tamaño];
        //Creamos el array numeros con el método
        metodo1.crearArray(numeros, tamaño);
        metodo1.amosar(numeros);
        metodo1.amosarForEach(numeros);
        /*metodo1.amosarForEach();
        metodo1.encontrarElementoRepetido1();
        metodo1.amosarForEach();
        metodo1.ordenarArray();
        metodo1.amosarForEach();
        metodo1.ordenarSort();*/
        //IO.imprimir( IO.VENTANA,IO.introducirInt(IO.VENTANA,"Introduce un Int."));
//    metodo1.rellenarTabla(notas1, filas, columnas);
//    metodo1.visualizarTabla(notas1, filas, columnas);
metodo1.visualizarTabla();
    }
    

}
