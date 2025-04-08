public class Main {
    public static void main(String[] args) {

        Conta corrente = new ContaCorrente("12345-6", "João Silva", 1000.0);
        Conta poupanca = new ContaPoupanca("65432-1", "Maria Souza", 500.0);

        System.out.println("\n=== Operações na Conta Corrente ===");
        corrente.depositar(200.0);
        System.out.println("Saldo atual: R$" + corrente.consultarSaldo());

        corrente.sacar(100.0);
        System.out.println("Saldo atual: R$" + corrente.consultarSaldo());

        corrente.sacar(1000.0);
        System.out.println("Saldo atual: R$" + corrente.consultarSaldo());

        System.out.println("\n=== Operações na Conta Poupança ===");
        poupanca.depositar(300.0);
        System.out.println("Saldo atual: R$" + poupanca.consultarSaldo());

        poupanca.sacar(100.0);
        System.out.println("Saldo atual: R$" + poupanca.consultarSaldo());

        poupanca.sacar(1000.0);
        System.out.println("Saldo atual: R$" + poupanca.consultarSaldo());

        System.out.println("\n=== Testando Polimorfismo ===");
        OperacoesBancarias[] contas = {corrente, poupanca};

        for (OperacoesBancarias conta : contas) {
            conta.depositar(50.0);
            System.out.println("Saldo após depósito: R$" + conta.consultarSaldo());
        }
    }
}