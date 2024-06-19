package org.example.estruturas;

public interface Lista {
    public boolean vazia();
    public int tamanho();
    public void insereInicio(int info);
    public void insereFim(int info);
    public boolean remove(int info);
}
