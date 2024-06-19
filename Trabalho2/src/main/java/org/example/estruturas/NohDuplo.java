package org.example.estruturas;

public class NohDuplo {
    private int info;
    private NohDuplo anterior;
    private NohDuplo proximo;

    public NohDuplo(int info) {
        this.info = info;
        this.anterior = null;
        this.proximo = null;
    }

    public int getInfo() {
        return info;
    }

    public NohDuplo getProximo() {
        return proximo;
    }
    public void setProximo(NohDuplo proximo) {
        this.proximo = proximo;
    }

    public NohDuplo getAnterior() {
        return anterior;
    }
    public void setAnterior(NohDuplo anterior) {
        this.anterior = anterior;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}