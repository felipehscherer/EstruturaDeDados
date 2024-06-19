package org.example.estruturas;

public class LSE implements Lista{
    public NohSimples inicio;

    public LSE(){
        inicio = null;
    }

    public boolean vazia(){
        return inicio == null;
    }

    public int tamanho(){
        int contador = 0;
        NohSimples ponteiro = inicio;

        while(ponteiro != null){
            contador++;
            ponteiro = ponteiro.getProximo();
        }

        return contador;
    }

    public void insereInicio(int info){
        NohSimples novo = new NohSimples(info);

        if(inicio == null){
            inicio = novo;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public void insereFim(int info){
        NohSimples novo = new NohSimples(info);

        if(inicio == null) {
            inicio = novo;
        } else {
            NohSimples ultimo = inicio;
            for(NohSimples i=inicio; i!=null; i=i.getProximo()){
                ultimo = i;
            }
            ultimo.setProximo(novo);
        }
    }

    public boolean remove(int info){
        NohSimples anterior = this.inicio;
        NohSimples ponteiro = this.inicio;

        while(ponteiro != null && ponteiro.getInfo() != info){
            anterior = ponteiro;
            ponteiro = ponteiro.getProximo();
        }

        if(ponteiro == this.inicio){
            this.inicio = ponteiro.getProximo();
        }
        if(ponteiro == null){
            return false;
        }
        if(anterior == null){
            this.inicio = ponteiro.getProximo();
        } else {
            anterior.setProximo(ponteiro.getProximo());
        }

        return true;
    }

    // QUESTÃO 5: -------------------------------------------------
    public void imprimirRecursivo(){
        imprimirRecursivo(this.inicio);
    }

    public void imprimirRecursivo(NohSimples noh){
        if(noh != null){
            System.out.print(" -> " + noh.getInfo());
            imprimirRecursivo(noh.getProximo());
        }
    }
    // -------------------------------------------------------------


    // QUESTÃO 7: -------------------------------------------------
    public void bubbleSort(){
        NohSimples i, j;
        for(i = this.inicio; i != null; i = i.getProximo()){
            for(j = i.getProximo(); j != null; j = j.getProximo()){
                if(i.getInfo() > j.getInfo()){
                    int aux = i.getInfo();
                    i.setInfo(j.getInfo());
                    j.setInfo(aux);
                }
            }
            System.out.print(i.getInfo() +  " | ");
        }
    }
    // -------------------------------------------------------------

    // QUESTÃO 8: -------------------------------------------------
    public void bubbleSortSteps(){
        NohSimples i, j;
        for(i = this.inicio; i != null; i = i.getProximo()){
            for(j = i.getProximo(); j != null; j = j.getProximo()){
                if(i.getInfo() > j.getInfo()) {
                    int aux = i.getInfo();
                    i.setInfo(j.getInfo());
                    j.setInfo(aux);
                    System.out.println("Troca: " + i.getInfo() + " com " + j.getInfo());
                    System.out.print("Vetor: ");
                    imprimirRecursivo();
                    System.out.println();
                }
            }
        }
    }

    public void selectionSortSteps(){
        NohSimples i, j;
        for(i = this.inicio; i != null; i = i.getProximo()){
            NohSimples menor = i;
            for(j = i.getProximo(); j != null; j = j.getProximo()){
                if(j.getInfo() < menor.getInfo()){
                    menor = j;
                }
            }
            int aux = i.getInfo();
            i.setInfo(menor.getInfo());
            menor.setInfo(aux);
            System.out.println("Troca: " + i.getInfo() + " com " + menor.getInfo());
            System.out.print("Vetor: ");
            imprimirRecursivo();
            System.out.println();
        }
    }

    // -------------------------------------------------------------

}
