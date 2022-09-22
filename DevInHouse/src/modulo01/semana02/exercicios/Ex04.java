package modulo01.semana02.exercicios;

//Mike tem um nro da sorte: 25.
//        Ele conseguiu uma listagem do histórico dos resultados da loteria conforme arrays abaixo.
//        Escreva um código para percorrer os elementos de nros sorteados e contabilizar quantas vezes
//        o nro da sorte dele foi sorteado.
//        * Dica: Usar um for dentro do outro para percorrer os arrays internos.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {

        int sorteados[][] = {
                {1, 44, 6, 2, 45, 60},
                {10, 21, 55, 25, 34, 44},
                {8, 18, 28, 29, 55, 59},
                {60, 25, 11, 34, 6, 9},
                {55, 43, 25, 12, 7, 11}
        };

        int nroSorte = 25;
        int contador = 0;

        for (int i = 0; i < sorteados.length; i++) {
            int elementos = sorteados[i].length;
            for (int j = 0; j < elementos; j++) {
                if (sorteados[i][j] == nroSorte) {
                    contador++;
                }
            }
        }
        int qtdes = contador;
        System.out.println(qtdes);
    }
}
