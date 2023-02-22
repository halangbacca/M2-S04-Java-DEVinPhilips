public class ContaCorrente extends Conta implements Operavel {
    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        super.saldo -= valor;

    }
}
