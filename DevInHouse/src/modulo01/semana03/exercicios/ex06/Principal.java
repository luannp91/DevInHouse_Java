package modulo01.semana03.exercicios.ex06;

import modulo01.semana03.exercicios.ex05.Concurso;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/estudo/DevInHouse/DevInHouse/src/modulo01/semana03/exercicios/ex06/megasena.txt");
        List<String> lista = Files.readAllLines(path);

        List<Concurso> concursos = new ArrayList<>();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (String item : lista) {
            String[] partes = item.split(",");
            Integer numero = Integer.valueOf(partes[0]);
            LocalDate data = LocalDate.parse(partes[1], format);

            int[] sorteados = new int[6];
            for (int i = 2; i <= 7; i++) {
                sorteados[i - 2] = Integer.parseInt(partes[i]);
            }

            System.out.println(Arrays.toString(Arrays.stream(sorteados).sorted().toArray()));

            Concurso concurso = new Concurso(numero, data, sorteados);
            concursos.add(concurso);
        }
    }

}


