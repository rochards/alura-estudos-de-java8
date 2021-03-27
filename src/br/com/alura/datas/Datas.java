package br.com.alura.datas;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * A API de datas eh imutavel
 * */
public class Datas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje);
        System.out.println("100 dias a partir de hoje: " + hoje.plusDays(100));

        LocalDate copaDoMundo = LocalDate.of(2022, Month.JUNE, 5);
        Period periodo = Period.between(hoje, copaDoMundo);
        System.out.println("Anos para a copa: " + periodo.getYears());

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da próxima copa: " + copaDoMundo.format(formatador));


        System.out.println("===== LocalDateTime =====");

        DateTimeFormatter tFormatador = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        LocalDateTime tHoje = LocalDateTime.now();
        System.out.println("Data e hora de agora: " + tHoje);
        System.out.println("Data e hora de agora: " + tHoje.format(tFormatador));

        LocalTime intervalo = LocalTime.of(16, 30);
        System.out.println("Hora do intervalo: " + intervalo);

    }
}
