package oop;

import java.util.ArrayList;

public class Universidad {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    public Universidad() {
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    //método para agregar estudiantes
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    //método para mostrar todos los estudiantes
    public void mostrarEstudiante(){
        System.out.println("Lista de estudiantes en la universidad: ");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInfo();
        }
    }
    
}
