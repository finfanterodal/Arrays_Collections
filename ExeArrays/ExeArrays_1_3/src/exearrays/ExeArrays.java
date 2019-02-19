package exearrays;



/**
 *
 * @author finfanterodal
 */
public class ExeArrays {

    public static int numElementos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int filas = 4;
//        int columnas = 3;
        //Array de notas con 2 dimensiones, 4 filas y 3 columnas
        //int[][] notas1 = new int[filas][columnas]; o definiéndole los valores debajo
        int[][] notas1 = {{5, 5, 5}, {4, 4, 4}, {10, 10, 10},{3, 3, 3}};
        int[] notaMedia = new int[notas1.length];
        int[] notaMediaM=new int[notas1.length];
        Metodos metodo1 = new Metodos();
        //metodo1.crearTabla();
        System.out.println("***");
        metodo1.visualizarTabla(notas1);
        metodo1.notaMedia(notas1,notaMedia);
        //metodo1.notaMediaModulo( notas1);
       metodo1.OrdenarTabla(notas1,notaMedia);
       //metodo1.ordenarMedias(notas1, notaMedia);     
        metodo1.visualizarTabla(notas1);
        metodo1.notaMedia(notas1, notaMedia);
    }

}
