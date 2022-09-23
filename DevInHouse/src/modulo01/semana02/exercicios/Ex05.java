package modulo01.semana02.exercicios;

//
//  Implemente uma função 'calcular' que receba como parâmetro um array (numérico) e identifique o maior e
//  menor  valor do mesmo. Imprima no console estes valores ou "Não é possível calcular" qdo não for possível.
//
//  Teste a função com as seguintes entradas:
//
//  - {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47}
//  - {1}
//  - {1, -1}
//  - null
//  - {-2,-2,-2,-2}
//  - {20,10, 30}

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {

        int[] numeros1 = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};

        int maior1 = numeros1[0];
        int menor1 = numeros1[0];
        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i] > maior1) {
                maior1 = numeros1[i];
            }
            for (int j = 0; j < numeros1.length; j++) {
                if (numeros1[j] < menor1) {
                    menor1 = numeros1[j];
                }
            }
        }

        System.out.println("O maior número é: " + maior1 + " e o menor número é: " + menor1);
        System.out.println();

        int[] numeros2 = {1};
        int maior2 = numeros2[0];
        int menor2 = numeros2[0];
        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] > maior2) {
                maior2 = numeros2[i];
            }
            for (int j = 0; j < numeros2.length; j++) {
                if (numeros2[j] < menor2) {
                    menor2 = numeros2[j];
                }
            }
        }
        System.out.println("O maior número é: " + maior2 + " e o menor número é: " + menor2);
        System.out.println();

        int[] numeros3 = {1, -1};
        int maior3 = numeros3[0];
        int menor3 = numeros3[0];
        for (int i = 0; i < numeros3.length; i++) {
            if (numeros3[i] > maior3) {
                maior3 = numeros3[i];
            }
            for (int j = 0; j < numeros3.length; j++) {
                if (numeros3[j] < menor3) {
                    menor3 = numeros3[j];
                }
            }
        }
        System.out.println("O maior número é: " + maior3 + " e o menor número é: " + menor3);
        System.out.println();

        int[] numeros5 = {-2, -2, -2, -2};
        int maior5 = numeros5[0];
        int menor5 = numeros5[0];
        for (int i = 0; i < numeros5.length; i++) {
            if (numeros5[i] > maior5) {
                maior5 = numeros3[i];
            }
            for (int j = 0; j < numeros5.length; j++) {
                if (numeros5[j] < menor5) {
                    menor5 = numeros5[j];
                }
            }
        }
        System.out.println("O maior número é: " + maior5 + " e o menor número é: " + menor5);
        System.out.println();

        int[] numeros6 = {20, 10, 30};
        int maior6 = numeros6[0];
        int menor6 = numeros6[0];
        for (int i = 0; i < numeros6.length; i++) {
            if (numeros6[i] > maior6) {
                maior6 = numeros6[i];
            }
            for (int j = 0; j < numeros6.length; j++) {
                if (numeros6[j] < menor6) {
                    menor6 = numeros6[j];
                }
            }
        }
        System.out.println("O maior número é: " + maior6 + " e o menor número é: " + menor6);
        System.out.println();

        int[] numeros4 = null;
        if (numeros4 == null) {
            System.out.println("Não é possível calcular!");
            return;
        }
        int maior4 = numeros4[0];
        int menor4 = numeros4[0];
        for (int i = 0; i < numeros4.length; i++) {
            if (numeros4[i] > maior4) {
                maior4 = numeros4[i];
            }
            for (int j = 0; j < numeros4.length; j++) {
                if (numeros4[j] < menor4) {
                    menor4 = numeros4[j];
                }
            }
        }
        System.out.println("O maior número é: " + maior4 + " e o menor número é: " + menor4);
        System.out.println();
    }
}
