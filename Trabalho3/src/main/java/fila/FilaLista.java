package fila;

import java.util.NoSuchElementException;

public class FilaLista implements IFila{
    private Noh inicio;
    private Noh fim;
    private int tamanho;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    @Override
    public boolean add(Object info) {
        Noh novoNoh = new Noh(info);
        if (isEmpty()) {
            inicio = novoNoh;
        } else {
            fim.setProx(novoNoh);
        }
        fim = novoNoh;
        tamanho++;
        return true;
    }
    @Override
    public boolean remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        inicio = inicio.getProx();
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return true;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        return inicio.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    public Noh getInicio() {
        return inicio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Noh atual = inicio;
        while (atual != null) {
            sb.append(atual.getInfo()).append(" ");
            atual = atual.getProx();
        }
        return sb.toString();
    }
}
