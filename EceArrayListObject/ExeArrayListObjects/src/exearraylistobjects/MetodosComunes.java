/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exearraylistobjects;

import Utilities.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author finfanterodal
 */
public class MetodosComunes {

    //1:Primera manera de crear un alumno
    public void engadir(ArrayList<Alumno> alumnList) {
        String name, dni;
        int grade;
        name = PedirDatos.StringVal("Nombre");
        dni = PedirDatos.StringVal("DNI");
        grade = PedirDatos.intVal("Nota");
        //Creamos objeto de tipo alumno
        Alumno a1 = new Alumno(name, dni, grade);
        //Aádimos los valores
        alumnList.add(a1);
    }
    //2: tra manera de crear un Alumno

    public void engadir2(ArrayList<Alumno> alumnList) {
        //Alumno a1 = crearAlumno();
        //Aádimos los valores
        alumnList.add(crearAlumno());
    }
    
    public Alumno crearAlumno() {
        String name, dni;
        int grade;
        name = PedirDatos.StringVal("Nombre");
        dni = PedirDatos.StringVal("DNI");
        grade = PedirDatos.intVal("Nota");
        //Creamos objeto de tipo alumno
        Alumno a1 = new Alumno(name, dni, grade);
        return a1;
    }
    //3: tra manera de crear un Alumno

    public void engadir3(ArrayList<Alumno> alumnList) {
        //Alumno a1 = crearAlumno();
        //Aádimos los valores
        alumnList.add(new Alumno(PedirDatos.StringVal("Nome"), PedirDatos.StringVal("dni"), PedirDatos.intVal("nota")));
    }
    //Método para amosar

    public void amosar(ArrayList<Alumno> alumnList, int opcion) {
        switch (opcion) {
            
            case 1:
                //2:ForEach (Colle a coleción, a recorre y va poniendo elemento a elemento en ele)
                System.out.println("FOR-EACH");
                for (Alumno ele : alumnList) {
                    System.out.println(ele);
                }
                break;
            case 2:
                //3.Iterator (Se mueve por la colección mientras haya elementos, y podemos ir cogiendo elemento a elemento.)
                System.out.println("ITERATOR");
                Iterator it = alumnList.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                break;
        }
    }
    //Método para borrrar por posición:

    public Alumno deleteByPos(int posicion, ArrayList<Alumno> alumnList) {
        return alumnList.remove(posicion);
    }

    //Método para borrrar elemento:
    public void deleteByElement(String dni, ArrayList<Alumno> alumnList, int opcion) {
        //Tiene que recibir un objeto del valor del elemento
        switch (opcion) {
            
            case 1:
                // numList.remove(new Integer(elemento));
                for (int i = 0; i < alumnList.size(); i++) {
                    if (alumnList.get(i).getDni().equals(dni)) {
                        alumnList.remove(i);
                    }
                }
                break;
            case 2:
                for (Alumno a1 : alumnList) {
                    if (dni.equals(a1.getDni())) {
                        alumnList.remove(a1);
                    }
                }
                break;
            case 3:
                Alumno a = new Alumno();
                Iterator it = alumnList.iterator();
                while (it.hasNext()) {
                    a = (Alumno) it.next();
                    if (dni.equalsIgnoreCase(a.getDni())) {
                        alumnList.remove(a);
                    }
                }
                
                break;
        }
    }
    
    public void ordenar(ArrayList<Alumno> alumnList) {
        Collections.sort(alumnList);
        
    }
    
    public void buscarElemento(String dni, ArrayList<Alumno> alumnList) {
        System.out.println("\n");
        for (Alumno a1 : alumnList) {
            if (dni.equals(a1.getDni())) {
                System.out.println(a1.toString());                
            }
        }
    }
    
    public void modificarNota(String dni, ArrayList<Alumno> alumnList) {
        System.out.println("\n");
        for (Alumno a1 : alumnList) {
            if (dni.equals(a1.getDni())) {
                a1.setNota(PedirDatos.intVal("Nueva nota"));
            }
        }
    }
    
}
