package com.exercicios.projeto_lista_duplamente_encadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProx(null);
        novoNo.setNoPrev(ultimoNo);
        if (primeiroNo==null){
            primeiroNo=novoNo;
        }
        if (ultimoNo!=null){
            ultimoNo.setNoProx(novoNo);
        }
        ultimoNo=novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProx(noAuxiliar);

        if (novoNo.getNoProx()!=null){
            novoNo.setNoPrev(noAuxiliar.getNoPrev());
            novoNo.getNoProx().setNoPrev(novoNo);
        }
        else{
            novoNo.setNoPrev(ultimoNo);
            ultimoNo=novoNo;
        }
        if (index==0){
            primeiroNo = novoNo;
        }
        else{
            novoNo.getNoPrev().setNoProx(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if (index == 0){
            primeiroNo = primeiroNo.getNoProx();
            if (primeiroNo!=null){
                primeiroNo.setNoPrev(null);
            }
        }
        else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrev().setNoProx(noAuxiliar.getNoProx());
            if (noAuxiliar != ultimoNo){
                noAuxiliar.getNoProx().setNoPrev(noAuxiliar.getNoPrev());
            }
            else{
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i=0;(i<index)&&(noAuxiliar!=null);i++){
            noAuxiliar = noAuxiliar.getNoProx();
        }
        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i=0;i<size();i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]-->";
            noAuxiliar = noAuxiliar.getNoProx();
        }
        strRetorno+=null;
        return strRetorno;
    }
}
