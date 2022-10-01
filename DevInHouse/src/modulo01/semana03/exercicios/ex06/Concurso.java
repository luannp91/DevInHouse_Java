package modulo01.semana03.exercicios.ex06;

import java.time.LocalDate;
import java.util.Arrays;

public class Concurso {

    private Integer numero;
    private LocalDate date;
    private int[] sorteados;

    public Concurso() {
    }

    public Concurso(Integer numero, LocalDate date, int[] sorteados) {
        this.numero = numero;
        this.date = date;
        this.sorteados = sorteados;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int[] getSorteados() {
        return sorteados;
    }

    public void setSorteados(int[] sorteados) {
        this.sorteados = sorteados;
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "numero= " + numero +
                ", date= " + date +
                ", sorteados= " + Arrays.toString(sorteados) +
                '}';
    }
}
