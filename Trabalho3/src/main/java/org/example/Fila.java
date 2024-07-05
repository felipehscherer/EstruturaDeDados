package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Cliente> fila;
    String cyan = "\u001B[36m";

    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
    }

    public Cliente removerCliente() {
        return fila.poll();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public int tamanho() {
        return fila.size();
    }

    @Override
    public String toString() {
        return cyan + fila;
    }
}
