public class TestMaximoArreglo {
    public static void main(String[] args){
        MaximoArreglo mA = new MaximoArreglo();
        //arreglos de ejemplo
        int[] arreglo1 = {-3, -5, -7};
        int[] arreglo2 = {2, 1, 3, 0, -1, -5};
        int[] arreglo3 = {0,0,0,0,0};

        System.out.println("El valor máximo del arreglo1 es: " + mA.encontrarMaximo(arreglo1));
        System.out.println("El valor máximo del arreglo2 es: " + mA.encontrarMaximo(arreglo2));
        System.out.println("El valor máximo del arreglo3 es: " + mA.encontrarMaximo(arreglo3));
    }
}
