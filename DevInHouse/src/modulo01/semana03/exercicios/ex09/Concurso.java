package modulo01.semana03.exercicios.ex09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    public void verificarNumerosSorteados() {
        System.out.println("Digite as seis dezenas para pesquisar (separada por virgulas): ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] split = input.split(",");
        int[] numeros = { Integer.parseInt(split[0].trim()), Integer.parseInt(split[1].trim()), Integer.parseInt(split[2].trim()),
                Integer.parseInt(split[3].trim()), Integer.parseInt(split[4].trim()), Integer.parseInt(split[5].trim()) };

        List<Integer> listaNumeros = ConversorArrayParaLista.converterOrdenado(numeros);
        // iterar nos concursos
        int[] dezenasSorteados = null;
        Integer nroDoConcurso = null;
        for(Concurso concurso: concursos) {
            List<Integer> nrosOrdenados = ConversorArrayParaLista.converterOrdenado(concurso.getSorteados());
            if (nrosOrdenados.toString().equals(listaNumeros.toString())) {
                dezenasSorteados = concurso.getSorteados();
                nroDoConcurso = concurso.getNumero();
                break;
            }
        }
        if (dezenasSorteados == null) {
            System.out.println("Numeros nunca sorteados");
        } else {
            System.out.println("Dezenas sorteadas no concurso: " + nroDoConcurso);
            System.out.println(Arrays.toString(dezenasSorteados) );
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
