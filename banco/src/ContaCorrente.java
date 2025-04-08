public class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 1.50;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double valorTotal = valor + TAXA_SAQUE;
        if (valorTotal > 0 && saldo >= valorTotal) {
            saldo -= valorTotal;
            System.out.println("Saque de R$" + valor + " realizado (taxa: R$" + TAXA_SAQUE + ").");
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido para saque.");
        return false;
    }
}