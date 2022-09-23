package modulo01.semana02.exercicios;

//  Dado a lista de números:
//
//  List<Integer> lista = Arrays.asList(1,2,3,4);
//
//  Percorra a lista e gere uma nova com o triplo do valor de cada elemento:

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4);

        for (Integer listas : lista) {
            System.out.println(listas * 3);
        }
    }
}

