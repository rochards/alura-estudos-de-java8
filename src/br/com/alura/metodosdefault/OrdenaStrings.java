package br.com.alura.metodosdefault;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/** NOVIDADES DO JAVA 8
 * - Metodos default, sao metodos que possuem corpo dentro de uma interface. Eles sao herdados pelas classes ou
 * interfaces que implementam List, por isso nao "quebram" essas classes/interfaces
 * - Metodos default vistos aqui de List: sort, foreach
 * */

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("alura online", "editora casa do código", "caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();

        //Collections.sort(palavras, comparador); -> forma antiga de fazer
        palavras.sort(comparador);
        System.out.println(palavras);

        Consumer<String> consumidor = new ImprimeNaLina();
        palavras.forEach(consumidor);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return -1;
        }
        if (str1.length() > str2.length()) {
            return 1;
        }
        return 0;
    }
}

class ImprimeNaLina implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
