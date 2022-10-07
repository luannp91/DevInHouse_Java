package modulo01.semana04.exercicios.ex01;

public class ContaCorrente extends Conta implements Operavel {

    private double saldo;
    @Override
    protected double obterSaldoAtual() {
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        return saldo + valor;
    }

    @Override
    public double sacar(double valor) {
        return  saldo - valor;
    }
}
