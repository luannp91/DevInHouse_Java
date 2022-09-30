package modulo01.semana03.exercicios.ex02;

public class Funcionario {

    private String nome;
    private double salario;


    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double aumentar(double valor) {
        return salario += 350;
    }

    public double aumentar(double valor, double comissao) {
        return salario += 350 + 250;
    }
}
