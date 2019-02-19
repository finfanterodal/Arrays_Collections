package exehashmap;

import java.util.Objects;

/**
 *
 * @author finfanterodal
 */
public class Alumno implements Comparable{
   //Atributos
    private String nome;
    private int ref;
    private int nota;
    
   //Constructores

    public Alumno() {
    }

    public Alumno(String nome, int nota) {
        this.nome = nome;
        ref=Secretaria.refe;
        this.nota = nota;
        Secretaria.refe++;
    }
    
    //Métodos de acceso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }



    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    //toString

    @Override
    public String toString() {
        return "nome=" + nome +", nota=" + nota;
    }
//Adaptamos este método para poder utilizar sort, porque al ser un objeta creado por nosotros debemos especificarle cómo debe comparar lo que nosotros tenemos.

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;
        if (this.nome.compareToIgnoreCase(a.getNome()) > 0) {
            return 1;
        } else if (this.nome.compareToIgnoreCase(a.getNome()) < 0) {
            return -1;
        } else {
            return 0;
        }

    }

    

}
