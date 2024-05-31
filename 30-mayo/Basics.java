import java.util.ArrayList;
import java.util.Arrays;

public class Basics{
    public void calcularPromedio(double[] arreglo){
        //establecer una variable acumuladora
        double suma = 0;
        for(int i = 0; i< arreglo.length; i++){
            suma += arreglo[i];
        }
        //calcular el numero total de elementos
        int numElementos = arreglo.length;
        //calcular el promedio
        double promedio = (suma/ numElementos);
        //imprimir el resultado
        System.out.println("Promedio: " + promedio);
    }
    public void numerosImpares(){
        ArrayList<Integer> arregloImpares = new ArrayList<Integer>();
        for (int i = 0; i < 256; i++){
            if(i % 2 !=0){
                arregloImpares.add(i);
            }
        }
        System.out.println(arregloImpares);
    }


    //último ejercicio
    public void cambiarValores(int[] arreglo){
        for(int i =0; i <arreglo.length -1; i++){
            arreglo[i] = arreglo[i+1];
        }
        arreglo[arreglo.length -1] = 0;
        System.out.println(Arrays.toString(arreglo));
    }
}