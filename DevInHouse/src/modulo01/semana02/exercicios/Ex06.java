package modulo01.semana02.exercicios;

//  Dado a lista de números:
//
//  List<Integer> lista = Arrays.asList(1,2,3,4);
//
//  Percorra a lista e gere uma nova com o triplo do valor de cada elemento:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4);
        List<Integer> triplos = new ArrayList<>();

        for (Integer numeros : lista) {
            int resultado = numeros * 3;
            triplos.add(resultado);
        }
        System.out.println(triplos);
    }
}

