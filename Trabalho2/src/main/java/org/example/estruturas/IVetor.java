package org.example.estruturas;

public interface IVetor {
    public int tamanho();
    public boolean cheio();
    public boolean contem(int valor);
    public void adiciona(int valor);
    public boolean remove(int valor);
}