package org.example.estruturas;

public class NohSimples {
    private int info;
    private NohSimples proximo;

    public NohSimples(int info) {
        this.info = info;
        this.proximo = null;
    }

    public int getInfo() {
        return info;
    }

    public NohSimples getProximo() {
        return proximo;
    }

    public void setProximo(NohSimples proximo) {
        this.proximo = proximo;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}