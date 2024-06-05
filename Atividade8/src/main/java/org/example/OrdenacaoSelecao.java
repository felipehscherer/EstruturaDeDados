package org.example;

public class OrdenacaoSelecao {

    public static void ordenacaoSelecao(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[menorIndice]) {
                    menorIndice = j;
                }
            }
            int temp = array[menorIndice];
            array[menorIndice] = array[i];
            array[i] = temp;
        }
    }
}
