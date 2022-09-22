package modulo01.semana01.exercicios;

public class Ex08 {

    public static void main(String[] args) {

        String time = "Tabajara F.C";
        int vitoria = 12;
        int derrota = 2;
        int empate = 6;

        int qtdePonto = (vitoria * 3) + (empate * 1) + (derrota * 0);
        int partidas = vitoria + empate + derrota;

        System.out.println("O time " + time + " acumulou " + qtdePonto + " após jogar " + partidas
                        + " partidas.");

    }
}
