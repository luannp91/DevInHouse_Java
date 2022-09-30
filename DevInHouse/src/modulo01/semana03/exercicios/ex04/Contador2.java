package modulo01.semana03.exercicios.ex04;

public class Contador2 {

    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public static void contarPalavras(String frase) {
        String[] palavras = frase.split(" ");
        System.out.println(palavras.length);
    }
}
