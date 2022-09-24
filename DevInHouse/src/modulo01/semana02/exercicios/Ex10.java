package modulo01.semana02.exercicios;

//  Um palíndrome (ou palíndromo), segundo o dicionário Houaiss,
//  "diz-se de frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa", 
//  como por exemplo:  osso, ana, radar.
//  Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado.
//
//  Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String entradaNormal = "";
        String entradaInvertida = "";

        System.out.print("Digite palavras, frases ou valores numéricos: ");
        entradaNormal = entrada.nextLine();

        for (int i = entradaNormal.length() - 1; i >= 0; --i) {
            entradaInvertida += entradaNormal.charAt(i);
        }

        if (entradaNormal.equalsIgnoreCase(entradaInvertida))
            System.out.println("Palíndromo!");
        else
            System.out.println("Não é Palíndromo!");
    }

}