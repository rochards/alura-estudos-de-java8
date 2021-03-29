package br.com.alura.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/** NOVIDADES DO JAVA 8
 * - Utilizacao de expressoes lambda
 * - Interface Funcional: sao interfaces que possuem apenas um metodo abstratos. Elas sao proprias para trabalharem
 * com expressoes lambdas
 * */

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("alura online", "editora casa do código", "caelum");

        // Como a interface Comparator tem apenas um metodo abstrato (accept), podemos descrever seu comportamento por
        // um expressao lambda, e o Java ja faz a inferencia
        palavras.forEach((String s) -> {
            System.out.println(s);
        });

        // Como so temos um argumento, o lambda consegue inferir o tipo de dados. Tbm posso retirar as {}
        palavras.forEach(s -> System.out.println(s));

        // Mais enxuto ainda
        palavras.forEach(System.out::println);

        
        palavras.sort((str1, str2) -> Integer.compare(str1.length(),str2.length()));
        System.out.println(palavras);
    }
}
