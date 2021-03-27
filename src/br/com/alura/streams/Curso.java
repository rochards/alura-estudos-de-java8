package br.com.alura.streams;

public class Curso {

    private String nome;
    private int qtdDeAlunos;

    public Curso(String nome, int qtdDeAlunos) {
        this.nome = nome;
        this.qtdDeAlunos = qtdDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdDeAlunos() {
        return qtdDeAlunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", qtdDeAlunos=" + qtdDeAlunos +
                '}';
    }
}
