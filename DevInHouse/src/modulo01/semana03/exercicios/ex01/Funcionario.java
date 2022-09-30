package modulo01.semana03.exercicios.ex01;

public class Funcionario {

    public String cpf;
    public String nomeCompleto;
    public double salario;


    public double promover() {
        double percentual = 1.15;
        return salario * percentual;
    }
}
