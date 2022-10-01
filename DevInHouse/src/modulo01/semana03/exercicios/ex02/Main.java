package modulo01.semana03.exercicios.ex02;

import modulo01.semana03.exercicios.ex02.Funcionario;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Johnny B.", 3500.00);
        funcionario.aumentar(350);

        System.out.println(funcionario.getSalario());
    }

}
