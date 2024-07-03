import java.util.Random;

public class BankAccount{
    private String numeroDeCuenta;
    private double saldoCuentaCorriente;
    private double saldoCuentaDeAhorros;
    private static int cuentasCreadas = 0;
    private static double totalDineroAlmacenado = 0;

    //constructor
    public BankAccount() {
        this.numeroDeCuenta = generarNumeroCuenta();
        cuentasCreadas ++;
        totalDineroAlmacenado += saldoCuentaCorriente+saldoCuentaDeAhorros;
    }

    private String generarNumeroCuenta(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<10; i++){
            sb.append(random.nextInt(10));
        }
        numeroDeCuenta = sb.toString();
        return numeroDeCuenta;
    }

    public double getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

    public double getSaldoCuentaDeAhorros() {
        return saldoCuentaDeAhorros;
    }

    public void depositar(double monto, boolean esCuentaCorriente){
        if (esCuentaCorriente) {
            saldoCuentaCorriente += monto;
        }else{
            saldoCuentaDeAhorros += monto;
        }
        totalDineroAlmacenado += monto;
    }
    //retirar dinero
    public void retirar(double monto, boolean esCuentaCorriente){
        if (esCuentaCorriente) {
            if (saldoCuentaCorriente >= monto ) {
                saldoCuentaCorriente -= monto ;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            if (saldoCuentaDeAhorros >= monto) {
                saldoCuentaDeAhorros -= monto;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }
    }
    public void verTotalDinero(){
        System.out.println("Saldo en cuenta corriente Nro: " + numeroDeCuenta + "\n" + saldoCuentaCorriente);
        System.out.println("Saldo en la cuenta de ahorros: " + saldoCuentaDeAhorros);
    }

    public static int getCuentasCreadas() {
        return cuentasCreadas;
    }

    public static double getTotalDineroAlmacenado() {
        return totalDineroAlmacenado;
    }
    
}