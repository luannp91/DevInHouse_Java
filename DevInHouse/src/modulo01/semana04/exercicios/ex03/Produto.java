package modulo01.semana04.exercicios.ex03;

import java.util.Scanner;

public class Produto implements Tributavel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite o valor do imposto: ");
        double valorImposto = scanner.nextDouble();

        System.out.println(Tributavel.calcularValorComImposto(valor, valorImposto));
    }

}
