public interface Device {
    public void powerOn();
    default void powerOff(Object device){
        System.out.println("Apagando " + device.getClass().getSimpleName());
    }
    
}