public class TestLibro {
    public static void main(String[] args){
        //Crear libros
        Libro libro1 = new Libro("1984");
        Libro libro2 = new Libro("Neuromante", "William Gibson");
        Libro libro3 = new Libro("Fahrenheit 451", "Ray Bradbury" , 12.99);

        //setear atributos (establecer atributos)
        libro1.setAutor("George Orwell");
        libro1.setPrecio(6.0);

        libro2.setPrecio(10.0);

        //Mostrar info de todos los libros
        System.out.println(libro1.bookInfo());
        System.out.println(libro2.bookInfo());
        System.out.println(libro3.bookInfo());
    }
}
