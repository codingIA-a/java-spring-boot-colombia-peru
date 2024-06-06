public class Smartphone implements Device {
    //atributos
    private String modelo;
    private int pixelesCamara;
    //getters y setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPixelesCamara() {
        return pixelesCamara;
    }
    public void setPixelesCamara(int pixelesCamara) {
        this.pixelesCamara = pixelesCamara;
    }
    //constructores
    public Smartphone() {
    }
    public Smartphone(String modelo) {
        this.modelo = modelo;
    }
    public Smartphone(String modelo, int pixelesCamara) {
        this.modelo = modelo;
        this.pixelesCamara = pixelesCamara;
    }
    //método interface
    public void powerOn(){
        System.out.println("Encendiendo smartphone");
    }
    //métodos smartphone
    public void takePhoto(){
        System.out.println("Tomando fotografía");
    }
    public void makeCall(){
        System.out.println("Haciendo una llamada");
    }
}
