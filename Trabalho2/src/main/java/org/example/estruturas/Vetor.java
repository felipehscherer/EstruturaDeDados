package org.example.estruturas;

public class Vetor implements IVetor{
    private int[] vetor;
    private int tamanhoPreenchido = 0;

    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
    }

    public int tamanho() {
        return tamanhoPreenchido;
    }

    public boolean cheio() {
        return tamanhoPreenchido == this.vetor.length;
    }

    public boolean contem(int valor) {
        for (int i = 0; i < tamanhoPreenchido; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public int getAt(int index) {
        return vetor[index];
    }

    public int setAt(int index, int valor) {
        return vetor[index] = valor;
    }

    public void adiciona(int valor) {
        if (!cheio()) {
            vetor[tamanhoPreenchido] = valor;
            tamanhoPreenchido++;
        }
    }

    public boolean remove(int valor) {
        for (int i = 0; i < tamanhoPreenchido; i++) {
            if (vetor[i] == valor) {
                for (int j = i; j < tamanhoPreenchido - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                tamanhoPreenchido--;
                return true;
            }
        }
        return false;
    }

    public void imprimir() {
        if(tamanhoPreenchido == 0){
            System.out.println("Vetor vazio");
            return;
        }

        for (int i = 0; i < tamanhoPreenchido; i++) {
            System.out.println("v[" +i+ "] = " +vetor[i] + ";");
        }
    }
}
