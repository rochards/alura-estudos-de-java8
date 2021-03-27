package br.com.alura.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
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
    }
}
