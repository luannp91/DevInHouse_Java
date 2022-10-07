package modulo01.semana04.exercicios.ex03;

import java.util.Scanner;

public class Produto implements Tributavel {

    private double valor;
    private double valorImposto;

    @Override
    public double calcularValorComImposto() {
        return this.valor + this.valorImposto;
    }
}
