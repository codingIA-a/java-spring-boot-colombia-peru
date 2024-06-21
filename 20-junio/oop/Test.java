package oop;

public class Test {
    public static void main(String[] args) {
        //crear estudiantes
        Estudiante estudiante1 = new Estudiante(1,"Juan", "Pérez",23);
        Estudiante estudiante2 = new Estudiante(2, "Pablo","Pozo",30);

        Estudiante estudiante3 = new Estudiante(3, "Miguel", "Tapia");
        //establecer edad a estudiante 3 
        estudiante3.setEdad(90);
        String nombreEstudiante3 = estudiante3.getNombre();
        System.out.println("Nombre estudiante 3 : " + nombreEstudiante3);
        //crear universidad
        Universidad universidadDojo = new Universidad();

        //agregar estudiantes a la universidad
        universidadDojo.agregarEstudiante(estudiante1);
        universidadDojo.agregarEstudiante(estudiante2);
        universidadDojo.agregarEstudiante(estudiante3);

        //mostrar todos los estudiantes de la universidad
        universidadDojo.mostrarEstudiante();
    }
}
