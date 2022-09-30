package modulo01.semana03.exercicios.ex01;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nomeCompleto = "Johnny B.";
        funcionario.cpf = "123.456.789-00";
        funcionario.salario = 3500.00;


        System.out.println(funcionario.nomeCompleto);
        System.out.println(funcionario.cpf);
        System.out.println(funcionario.salario);
        System.out.println(funcionario.promover());
    }
}
