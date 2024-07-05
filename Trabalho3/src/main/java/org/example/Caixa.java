package org.example;

public class Caixa {
    private Cliente clienteAtual;
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String purple = "\u001B[34m";

    public void atenderCliente(Cliente cliente) {
        this.clienteAtual = cliente;
    }

    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    public void processarAtendimento() {
        if (clienteAtual != null) {
            clienteAtual.decrementarTempoDeAtendimento();
            if (clienteAtual.getTempoDeAtendimento() == 0) {
                clienteAtual = null;
            }
        }
    }

    @Override
    public String toString() {
        if (clienteAtual != null) {
            return purple + "(" + red + "Caixa atendendo: " + clienteAtual.toString() + purple + "):";
        } else {
            return purple + "(" + green + "Caixa livre" + purple + "):";
        }
    }
}