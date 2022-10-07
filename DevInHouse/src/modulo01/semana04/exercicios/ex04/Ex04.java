package modulo01.semana04.exercicios.ex04;

import java.io.IOError;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ok = true;
        do {
            try {
                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();
                if (idade < 0 || idade == 0 || idade > 100) {
                    throw new IdadeException("Não digitar valor negativo, igual à zero ou superior à 100!!!");
                } else {
                    System.out.println("Olá, você tem " + idade + " anos de idade!");
                }
                break;
            } catch (IdadeException e) {
                System.out.println(e.getMessage());
                ok = false;
            }
        } while (!ok);
    }
}

