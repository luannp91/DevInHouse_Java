package modulo01.semana03.exercicios.ex07;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Concurso implements Comparable<Concurso> {

    private Integer numero;
    private LocalDate date;
    private int[] sorteados;

    private List<Concurso> concursos;

    public Concurso(List<Concurso> concursos) {
        this.concursos = concursos;
    }

    public Concurso() {
    }

    public Concurso(Integer numero, LocalDate date, int[] sorteados) {
        this.numero = numero;
        this.date = date;
        this.sorteados = sorteados;
    }

    public void imprimir() {
        for(Concurso conc: concursos) {
            System.out.println(conc);
        }
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

    public void imprimirEmOrdemDeNumero() {
        Collections.sort(concursos);
        for(Concurso concurso: concursos){
            System.out.println(concurso);
        }
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "numero= " + numero +
                ", date= " + date +
                ", sorteados= " + Arrays.toString(sorteados) +
                '}';
    }

    @Override
    public int compareTo(Concurso concurso) {
        return this.numero.compareTo(concurso.numero);
    }
}
