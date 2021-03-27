package br.com.alura.metodoreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** NOVIDADES DO JAVA 8
 * - Utilizacao de Method Reference. Ex.: String::length, System.out::println
 * */
public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("alura online", "editora casa do código", "caelum");

        // comparingInt eh um metodo static dentro da interface Comparator. Esse metodo retorna um Comparator, que eh
        // o argumento esperado pleo metodo sort
        palavras.sort(Comparator.comparingInt(String::length)); // String::length -> chama a referencia do metodo
        // palavras.sort(Comparator.comparingInt(s -> s.length())); -> forma mais explicita. Mas eh equivalmente acima
        System.out.println(palavras);

        // de uma forma mais generica
        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
        /**
         * Como eu poderia ter feito para ficar mais claro
         *
         * Function<String, Integer> funcao s = s -> s.lenght();
         * Comparator<String> comparador = Comparator.comparing(funcao);
         * palavras.sort(comparador);
         * */

        palavras.forEach(System.out::println);
        // OBS.: acima eu estou passando um method reference e nao um lambda
    }
}
