package modulo01.semana03.exercicios.ex02;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Johnny B.");
        Funcionario funcionario2 = new Funcionario("Emma Ubuntu", 3500.00);

        System.out.println(funcionario2.aumentar(350));
        System.out.println(funcionario2.aumentar(350, 250));
    }

}
