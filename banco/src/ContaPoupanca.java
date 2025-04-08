public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido para saque.");
        return false;
    }
}