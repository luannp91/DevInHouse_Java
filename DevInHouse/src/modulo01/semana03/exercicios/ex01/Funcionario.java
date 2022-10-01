package modulo01.semana03.exercicios.ex01;

public class Funcionario {

    private String cpf;
    private String nomeCompleto;
    private double salario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double promover() {
        double percentual = 1.15;
        return salario * percentual;
    }
}
