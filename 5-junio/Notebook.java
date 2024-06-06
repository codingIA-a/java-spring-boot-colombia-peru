public class Notebook implements Device{
    //atributos
    private String marca;
    private String tarjetaGrafica;

     //constructores
    public Notebook() {
    }
    public Notebook(String marca) {
        this.marca = marca;
    }
    public Notebook(String marca, String tarjetaGrafica) {
        this.marca = marca;
        this.tarjetaGrafica = tarjetaGrafica;
    }
    //getters y setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
    //método de interface
    public void powerOn(){
        System.out.println("Encendiendo notebook");
    }
    //métodos de notebook
    public void openIde(){
        System.out.println("Abriendo IDE");
    }
    public void openVscode(){
        System.out.println("Abriendo VS Code");
    }
    
}
