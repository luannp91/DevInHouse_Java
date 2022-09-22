package modulo01.semana02.exercicios;

//  Dado a lista de números:
//
//  List<Integer> lista = Arrays.asList(1,2,3,4);
//
//  Percorra a lista e gere uma nova com o triplo do valor de cada elemento:

import java.util.Arrays;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        int[] numero = {1, 2, 3, 4};

        String aux = "";
        for (int i = 0; i < numero.length; i++) {
            aux += Integer.toString(numero[i] * 3) + " ";
        }
        System.out.println(aux);
    }
}
