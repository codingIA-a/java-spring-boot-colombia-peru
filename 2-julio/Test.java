public class Test {
    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount();
        BankAccount cuenta2 = new BankAccount();
        cuenta1.depositar(10, false);
        cuenta1.depositar(15, true);

        cuenta1.verTotalDinero();

        cuenta1.retirar(15, false);
        cuenta1.retirar(20, true);
        cuenta1.verTotalDinero();

        System.out.println(BankAccount.getCuentasCreadas());
        System.out.println(BankAccount.getTotalDineroAlmacenado());
    }
}
