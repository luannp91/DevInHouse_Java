package modulo01.semana01.exercicios;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu herói favorito: ");
        String heroi = scanner.nextLine();

        System.out.println("Seu herói favorito é: " + heroi);
        scanner.close();
    }
}
