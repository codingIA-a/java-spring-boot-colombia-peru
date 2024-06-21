package oop;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    //constructor con todos los atributos
    public Estudiante(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    

    public Estudiante(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Mostrar la info del estudiante
    public void mostrarInfo(){
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println("------------------------");
    }

    
}
