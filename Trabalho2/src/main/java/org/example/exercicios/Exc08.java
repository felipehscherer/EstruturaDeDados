package org.example.exercicios;

import org.example.estruturas.LDE;
import org.example.estruturas.LSE;

public class Exc08 {
    public static void main(String[] args) {

        LSE lista = new LSE();
        lista.insereFim(3);
        lista.insereFim(7);
        lista.insereFim(1);
        lista.insereFim(4);
        lista.insereFim(9);
        lista.insereFim(2);

        System.out.println("Vetor original:");
        lista.imprimirRecursivo();

        System.out.println("\nVetor ordenado (bubbleSort):");
        lista.bubbleSortSteps();

        LSE lista2 = new LSE();
        lista2.insereFim(3);
        lista2.insereFim(7);
        lista2.insereFim(1);
        lista2.insereFim(4);
        lista2.insereFim(9);
        lista2.insereFim(2);

        System.out.println("\n Vetor ordenado (selectionSort):");
        lista2.selectionSortSteps();

        LDE lista3 = new LDE();
        lista3.insereFim(3);
        lista3.insereFim(7);
        lista3.insereFim(1);
        lista3.insereFim(4);
        lista3.insereFim(9);
        lista3.insereFim(2);

        System.out.println("\n Vetor ordenado (insertionSort):");
        lista3.insertionSortSteps();

    }
}
