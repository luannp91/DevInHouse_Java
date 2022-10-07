package modulo01.semana04.exercicios.ex01;

public class ContaCorrente extends Conta implements Operavel {

    @Override
    public double depositar(double valor) {
        return valor;
    }

    @Override
    public double sacar(double valor) {
        return valor;
    }


}
