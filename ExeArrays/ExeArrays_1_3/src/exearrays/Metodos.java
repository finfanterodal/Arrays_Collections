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
    String[] modulos = {"PROG", "BD", "CD", "Nota Media"};
    int[][] notas1 = new int[filas][columnas];

    //Dámoslle valores cun método:

    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Pon un valor."));
    }


    public void crearTabla(int[][] array) {
        int filas=array.length;
        int columnas=array[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = darValor();
            }
        }
    }

    public void visualizarTabla(int[][] array) {
        int filas=array.length;
        int columnas=array[0].length;
        for (int i = 0; i < filas; i++) {
            System.out.print("|");
            for (int j = 0; j < columnas; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println(" |");
        }
    }

       public void crearTabla() {
        for (int i = 0; i < notas1.length; i++) {//i Filas
            for (int j = 0; j < notas1[i].length; j++) {//j columnas
                notas1[i][j] = darValor();
            }
        }
    }

    public void visualizarTabla() {
        for (int i = 0; i < notas1.length; i++) {//i Filas
            System.out.print("|");
            for (int j = 0; j < notas1[i].length; j++) {//j columnas
                System.out.print(" "+notas1[i][j]);
            }
            System.out.println(" |");
        }
    }
    
        


    public void notaMedia( int[][] array1,int[] notaMedia) {

        int aux = 0;
        for (int i = 0; i < notaMedia.length; i++) {//i Filas
            aux = 0;
            for (int j = 0; j < array1[i].length; j++) {//j columnas
                aux = array1[i][j] + aux;
            }
            System.out.println(" " + (notaMedia[i] = aux / array1[i].length));
        }
    }
    
        
    public void notaMediaModulo(int[][] array1,int[]array) {
        
       
        float aux=0;      
        for ( int col = 0; col < array1[0].length; col++) {//Columna
            aux=0; 
            for (int fil = 0; fil < array1.length; fil++) {//Fila
                aux = array1[fil][col] + aux;
            }
            System.out.print(Math.round(aux / array1.length)+" ");
            array[col]=(int)aux/array1.length;
            
        }
    }
    
        public void OrdenarTabla( int[][] notas, int[]notaMedia) {
    //Por grupo o elemento a elemento
    int aux,aux2;
    for ( int i = 0; i<notaMedia.length; i++){
         for ( int j = i+1; j<notaMedia.length; j++){
             if(notaMedia[i]>notaMedia[j]){
               aux=notaMedia[i];
               notaMedia[i]=notaMedia[j];
               notaMedia[j]=aux;   
                for (int k = 0; k<notas[0].length; k++){
                    aux2=notas[i][k];
                    notas[i][k]=notas[j][k];
                    notas[j][k]=aux2;
                }
             }
             
         }
    }
  
    }
    
    public void ordenarMedias(int[][] notas,int[]notaMedia){
        
        int aux=0;
        int[] aux2 = {0,0,0};
        String aux3 = "";
        System.out.println("");
        for(int i=0;i<notaMedia.length-1;i++){
            for(int j=i+1;j<notaMedia.length;j++){
                if(notaMedia[i]>notaMedia[j]){
                    aux=notaMedia[j];
                    notaMedia[j]=notaMedia[i];
                    notaMedia[i]=aux;
                    aux2 = notas[j];
                    notas[j]=notas[i];
                    notas[i]=aux2;
                    aux3 = nomes[j];
                    nomes[j]=nomes[i];
                    nomes[i]=aux3;
//                    for(k=0;k<notas.length;k++){
//                        aux2=notas[i][k];
//                        notas[i][k]=notas[j][k];
//                        notas[j][k]=aux2;
//                    }
                }
            }
        }

    }

}
