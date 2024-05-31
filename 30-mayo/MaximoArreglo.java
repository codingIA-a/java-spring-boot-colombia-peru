public class MaximoArreglo {
    public int encontrarMaximo(int[] arreglo){
        //inicializar el número máximo en el primer índice
        int maximo = arreglo[0];
        
        //Recorrer el arreglo
        for(int i = 1; i < arreglo.length; i++){
            //si se encuentra un numero mayor
            if (arreglo[i] > maximo){
                maximo = arreglo[i];
            }
        }
        return maximo;
    }
}
