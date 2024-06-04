public class Libro{
    private String titulo;
    private String autor;
    private double precio;

    //getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //constructores
    public Libro(String titulo) {
        this.titulo = titulo;
    }
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String bookInfo(){
        return titulo + " (" + autor + ", " + precio + "): " + autor;
    }
    
    
    
}