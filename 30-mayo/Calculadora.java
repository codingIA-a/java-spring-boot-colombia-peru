class Calculadora{
    //método suma
    public double suma(double numUno, double numDos){
        return numUno+numDos;
    }
    //método resta
    public double resta(double numUno, double numDos){
        return numUno-numDos;
    }
    //método multiplicación
    public double mult(double numUno, double numDos){
        return numUno*numDos;
    }
    //método división
    public double dividir(double numUno, double numDos){
        try{
            if(numDos != 0){
                double resultado = (numUno/numDos);
                System.out.println("La división entre " + numUno + " y " + numDos + " es " + resultado );
                return resultado;
            }else{
                throw new ArithmeticException("No se puede dividir por cero");
            }
            


        }catch (ArithmeticException e){
            System.out.println("Divisor inválido "+  e.getMessage());
            return numDos;
        }
    }
}