package com.exercicios.projeto_lista_circular;

public class No<T> {

    private T conteudo;
    private No<T> noProx;

    public No(T conteudo) {
        this.noProx = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProx() {
        return noProx;
    }

    public void setNoProx(No<T> noProx) {
        this.noProx = noProx;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
