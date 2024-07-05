package org.example;

public class Cliente {
    private static int contador = 0;
    private int numero;
    private int tempoDeAtendimento;
    String purple = "\u001B[35m";

    public Cliente(int tempoDeAtendimento) {
        this.numero = ++contador;
        this.tempoDeAtendimento = tempoDeAtendimento;
    }

    public int getTempoDeAtendimento() {
        return tempoDeAtendimento;
    }

    public void decrementarTempoDeAtendimento() {
        if (tempoDeAtendimento > 0) {
            tempoDeAtendimento--;
        }
    }

    @Override
    public String toString() {
        return purple + "Cliente [" +
                 numero + "]" +
                 " Tempo de atendimento: " + tempoDeAtendimento;
    }
}
