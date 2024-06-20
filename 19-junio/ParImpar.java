public class ParImpar{
    public int esPar(int numero){
        String mensajePar = "El número " + numero + " es par";
        String mensajeImpar = "El número " + numero + " es impar";
        //determinar si el número es par o no
        if (numero %2 == 0) {
            System.out.println(mensajePar);
        }else{
            System.out.println(mensajeImpar);
        }
        return numero;
    }
}