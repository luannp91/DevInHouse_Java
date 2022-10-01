package modulo01.semana03.exercicios.ex10;

import java.time.LocalDate;
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

    public void imprimirNrosFrequentes() {
        // criando e populando Map de nros sorteados e respectivas quantidade em que foram sorteados
        Map<Integer, Integer> map = new HashMap<>();
        for (Concurso concurso: concursos) {
            int[] sorteados = concurso.getSorteados();
            for (int i = 0; i < sorteados.length; i++) {
                int nro = sorteados[i];
                int qtdAtual = map.getOrDefault(nro, 0);
                map.put(nro, qtdAtual + 1);
            }
        }
        // calculado as maiores e menores quantidades
        int nroMaisFrequente = 1;
        int nroMenosFrequente = 1;
        int qtdMaisFrequente = 0;
        int qtdMenosFrequente = Integer.MAX_VALUE;

        for(Integer nro: map.keySet()) {
            Integer qtd = map.get(nro);
            if (qtd > qtdMaisFrequente) {
                qtdMaisFrequente = qtd;
                nroMaisFrequente = nro;
            }
            if (qtd < qtdMenosFrequente) {
                qtdMenosFrequente = qtd;
                nroMenosFrequente = nro;
            }
        }

        System.out.println("Número mais frequente = " + nroMaisFrequente);
        System.out.println("Número menos frequente = " + nroMenosFrequente);
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
