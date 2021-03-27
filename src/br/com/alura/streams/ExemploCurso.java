package br.com.alura.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCurso {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 133));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getQtdDeAlunos));
        cursos.forEach(System.out::println);

        /* esse stream vem da interface Collection. Como List extends de Collection, temos acesso a ele.
        // stream eh um metodo default
        // nao altera a nossa lista */
        int sum = cursos.stream()
                .filter(curso -> curso.getQtdDeAlunos() >= 100)
                .mapToInt(Curso::getQtdDeAlunos)
                .sum();
        System.out.println("Soma = " + sum);
    }
}
