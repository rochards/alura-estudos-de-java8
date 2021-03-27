package br.com.alura.lambdas;

public class ThreadLambda {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("Executando em Runnable")).start();
    }
}
