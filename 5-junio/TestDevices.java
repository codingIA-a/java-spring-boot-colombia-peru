public class TestDevices {
    public static void main(String[] args){
        Smartphone samsung = new Smartphone("Galaxy s21", 12);
        Notebook hpPavillion = new Notebook("HP","GTX 1050");

        samsung.powerOn();
        hpPavillion.powerOn();

        samsung.makeCall();
        samsung.takePhoto();

        hpPavillion.openIde();
        hpPavillion.openVscode();

        hpPavillion.powerOff(hpPavillion);
        samsung.powerOff(samsung);
    }
}
