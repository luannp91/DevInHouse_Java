package modulo01.semana03.exercicios.ex01;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNomeCompleto("Johnny B.");
        funcionario.setCpf("123.456.789-00");
        funcionario.setSalario(3500.00);

        System.out.println(funcionario.promover());
    }
}
