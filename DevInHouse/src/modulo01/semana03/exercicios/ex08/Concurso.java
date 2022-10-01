package modulo01.semana03.exercicios.ex08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

    public void verificarDataSorteio() {
        System.out.println("Informe a data (formato = dd/MM/yyyy): ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPesquisa = LocalDate.parse(input, formatador);
        int[] sorteadosNaData = null;
        for(Concurso concurso: concursos) {
            if (concurso.getDate().equals(dataPesquisa)) {
                sorteadosNaData = concurso.getSorteados();
                break;
            }
        }
        if (sorteadosNaData == null) {
            System.out.println("Não houve sorteio neste dia");
        } else {
            System.out.println(Arrays.toString(sorteadosNaData) );
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
