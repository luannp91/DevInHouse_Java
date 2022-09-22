package modulo01.semana01.exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate hoje = LocalDate.now();

        System.out.print("Qual o ano de seu nascimento: ");
        int ano = scanner.nextInt();
        int nascimento = hoje.getYear() - ano;

        System.out.println(nascimento);
        scanner.close();
    }
}
