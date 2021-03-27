package br.com.alura.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCurso2 {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 133));
        cursos.add(new Curso("C", 55));

        cursos.stream()
                .filter(curso -> curso.getQtdDeAlunos() >= 100)
                .findFirst()
                .ifPresent(System.out::println); // esse ifPresent eh do Optional

        OptionalDouble average = cursos.stream()
                .mapToInt(Curso::getQtdDeAlunos)
                .average();
        average.ifPresent(System.out::println);

        List<Curso> resultado = cursos.stream()
                .filter(curso -> curso.getQtdDeAlunos() >= 100)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
