package exearraylistobjects;

import java.util.Objects;

/**
 *
 * @author finfanterodal
 */
public class Alumno implements Comparable{
   //Atributos
    private String nome;
    private String dni;
    private int nota;
    
   //Constructores

    public Alumno() {
    }

    public Alumno(String nome, String dni, int nota) {
        this.nome = nome;
        this.dni = dni;
        this.nota = nota;
    }
    
    //Métodos de acceso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
        return "nome=" + nome + ", dni=" + dni + ", nota=" + nota;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    

}
