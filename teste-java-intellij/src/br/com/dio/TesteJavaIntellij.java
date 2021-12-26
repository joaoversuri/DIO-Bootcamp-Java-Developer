package br.com.dio;

import br.com.dio.model.Gato;

public class TesteJavaIntellij {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O Senhor dos anéis: A Sociedade do Anel", 450);
        System.out.println(livro);

//        System.out.println("Hello world!");
//        int a=5;
//        int b=3;
//        System.out.println(a+b);

    }
}
class Livro{
    private String nome;
    private Integer npag;

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag='" + npag + '\'' +
                '}';
    }
}