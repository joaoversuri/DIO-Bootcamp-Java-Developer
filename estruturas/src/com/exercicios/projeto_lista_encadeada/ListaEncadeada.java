package com.exercicios.projeto_lista_encadeada;

public class ListaEncadeada<T> {

    No<T> refEntrada;

    public ListaEncadeada(){
        this.refEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            refEntrada=novoNo;
            return;
        }
        No<T> noAuxiliar = refEntrada;
        for (int i=0;i<this.size()-1;i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){

        validaIndice(index);
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;

        for (int i=0;i<=index;i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){

        No<T> noPivot = this.getNo(index);
        if (index==0){
            refEntrada = noPivot.getProximoNo();
            return noPivot.getConteudo();
        }

        No<T> noAnterior  = getNo(index-1);
        noAnterior.setProximoNo(noPivot.getProximoNo());
        return noPivot.getConteudo();

    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refAuxiliar = refEntrada;
        while (true){
            if (refAuxiliar!=null){
                tamanhoLista++;
                if (refAuxiliar.getProximoNo()!=null){
                    refAuxiliar = refAuxiliar.getProximoNo();
                }
                else{
                    break;
                }
            }
            else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty(){
        return refEntrada==null?true:false;
    }

    private void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice "+index+" desta lista. Esta só lista até o índice "+ ultimoIndice+".");
        }
    }

    @Override
    public String toString() {
        String strRtorno = "";
        No<T> noAuxiliar = refEntrada;
        for (int i=0; i<this.size();i++){
            strRtorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRtorno+="null";
        return strRtorno;
    }
}
