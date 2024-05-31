public class TestCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        double testSuma = calc.suma(7, 3);
        System.out.println("Suma: " + testSuma);

        //probar división
        calc.dividir(4,2 );
        calc.dividir(2,0 );
    }
}
