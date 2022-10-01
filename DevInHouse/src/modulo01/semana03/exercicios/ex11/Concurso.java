package modulo01.semana03.exercicios.ex11;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void imprimirNroMaisAtrasado() {
        // criando e populando map de nros sorteados e respectivas ultima data em que foram sorteados (data mais recente de sorteio)
        Map<Integer, LocalDate> map = new HashMap<>();
        for (Concurso concurso : concursos) {
            int[] sorteados = concurso.getSorteados();
            for (int i = 0; i < sorteados.length; i++) {
                int nro = sorteados[i];
                if (map.containsKey(nro)) {
                    LocalDate dataUltSorteio = map.get(nro);
                    if (concurso.getDate().isAfter(dataUltSorteio)) {
                        map.put(nro, concurso.getDate());
                    }
                } else {
                    map.put(nro, concurso.getDate());
                }
            }
        }

        LocalDate dataMaisAntiga = LocalDate.now();
        int nroMaisAtrasado = 0;
        for (Integer nro : map.keySet()) {
            LocalDate data = map.get(nro);
            if (data.isBefore(dataMaisAntiga)) {
                dataMaisAntiga = data;
                nroMaisAtrasado = nro;
            }
        }

        System.out.println("Mais atrasado: " + nroMaisAtrasado);
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
