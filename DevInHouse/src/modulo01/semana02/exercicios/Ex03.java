package modulo01.semana02.exercicios;

public class Ex03 {
    public static void main(String[] args) {

        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        for (int i = 0; i < extrato.length; i++) {
            System.out.println(extrato[i]);
        }

        System.out.println("#######################################################");

        int tamanho = extrato.length;
        int[] aux = new int[tamanho];
        for (int i = 0; i < extrato.length; i++) {
            tamanho--;
            aux[i] = extrato[tamanho];
            System.out.println(aux[i]);
        }

        System.out.println("#######################################################");

        int saldo = 0;
        for (int i = 0; i < extrato.length; i++) {
            saldo += extrato[i];
            System.out.println(saldo);
        }

        System.out.println("#######################################################");

        if (saldo >= 0){
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}