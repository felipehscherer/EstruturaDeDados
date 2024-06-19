package org.example.estruturas;

public class LDE implements Lista{
    public NohDuplo inicio;
    public NohDuplo fim;

    public LDE(){
        inicio = null;
        fim = null;
    }

    public boolean vazia(){
        return inicio == null;
    }

    public int tamanho(){
        int contador = 0;
        NohDuplo ponteiro = inicio;

        while(ponteiro != null){
            contador++;
            ponteiro = ponteiro.getProximo();
        }

        return contador;
    }

    public void insereInicio(int info){
        NohDuplo novo = new NohDuplo(info);

        if(inicio == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(int info){
        NohDuplo novo = new NohDuplo(info);

        if(fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public NohDuplo buscarNohDuplo(int info){
        NohDuplo ponteiro = this.inicio;

        while(ponteiro != null && ponteiro.getInfo() != info){
            ponteiro = ponteiro.getProximo();
        }

        return ponteiro;
    }

    public boolean remove(int info){
        NohDuplo NohDuploRemovido = buscarNohDuplo(info);

        if (NohDuploRemovido == null){
            return false;
        }

        if (NohDuploRemovido == this.inicio){
            this.inicio = NohDuploRemovido.getProximo();

            if (this.inicio != null){
                this.inicio.setAnterior(null);
            } else {
                this.fim = null;
            }
        } else if (NohDuploRemovido.getProximo() == null){
            NohDuploRemovido.getAnterior().setProximo(null);
            this.fim = NohDuploRemovido.getAnterior();
        } else {
            NohDuploRemovido.getAnterior().setProximo(NohDuploRemovido.getProximo());
            NohDuploRemovido.getProximo().setAnterior(NohDuploRemovido.getAnterior());
        }

        return true;
    }

    public void imprimir() {
        NohDuplo ponteiro = this.inicio;
        if (ponteiro == null){
            System.out.println("Lista vazia!");
            return;
        }

        while(ponteiro != null){
            System.out.print(ponteiro.getInfo());

            NohDuplo next = ponteiro.getProximo();
            if(next != null){
                System.out.print(" <-> ");
            } else {
                System.out.println();
            }

            ponteiro = ponteiro.getProximo();
        }
    }

    // QUESTÃO 4: -------------------------------------------------
    public void insereOrdenado(int info) {
        NohDuplo novo = new NohDuplo(info);
        NohDuplo ponteiro = this.inicio;

        if(this.inicio == null) {
            this.inicio = novo;
            this.fim = novo;
            return;
        }

        while(ponteiro != null && ponteiro.getInfo() < info){
            ponteiro = ponteiro.getProximo();
        }

        if(ponteiro == this.inicio){
            // se o ponteiro for o inicio, o novo nó será o novo inicio
            novo.setProximo(this.inicio);
            this.inicio.setAnterior(novo);
            this.inicio = novo;
        } else if(ponteiro == null){
            // se o ponteiro for nulo, o novo nó será o novo fim
            this.fim.setProximo(novo);
            novo.setAnterior(this.fim);
            this.fim = novo;
        } else {
            // se o ponteiro estiver no meio da lista, o novo nó será inserido entre o ponteiro e o nó anterior ao ponteiro
            novo.setProximo(ponteiro);
            novo.setAnterior(ponteiro.getAnterior());
            ponteiro.getAnterior().setProximo(novo);
            ponteiro.setAnterior(novo);
        }
    }
    //------------------------------------------------------------

    // QUESTÃO 8: -------------------------------------------------

    public void insertionSortSteps(){
        NohDuplo ponteiro = this.inicio;
        NohDuplo chave = ponteiro.getProximo();

        while(chave != null){
            int infoChave = chave.getInfo();
            NohDuplo anterior = chave.getAnterior();

            while(anterior != null && anterior.getInfo() > infoChave){
                anterior.getProximo().setInfo(anterior.getInfo());
                anterior = anterior.getAnterior();
            }

            if(anterior == null){
                ponteiro.setInfo(infoChave);
            } else {
                anterior.getProximo().setInfo(infoChave);
            }

            chave = chave.getProximo();

            System.out.println("Passo " + infoChave + ":");
            this.imprimir();
            System.out.println();
        }
    }

    //------------------------------------------------------------
}
