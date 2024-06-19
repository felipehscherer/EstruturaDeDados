package org.example.exercicios;

import org.example.estruturas.Vetor;

import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();


        Vetor v1 = new Vetor(n);

        for(int i=0; i<n; i++){
            System.out.print("v[" + i + "] = ");
            v1.adiciona(sc.nextInt());
        }
        sc.close();
        selectionSort(v1);

    }

    public static void selectionSort(Vetor vetor){
        for(int i=vetor.tamanho()-1; i>0; i--){
            int indexMaior = i;

            for(int j=i-1; j>=0; j--){
                if(vetor.getAt(j) > vetor.getAt(indexMaior)){
                    indexMaior = j;
                }
            }
            int valorIndexI = vetor.getAt(i);

            if(indexMaior != i){
                vetor.setAt(i, vetor.getAt(indexMaior));
                vetor.setAt(indexMaior, valorIndexI);
                System.out.print("TROCA: ");
                System.out.print("v[" +i+ "] <-> ");
                System.out.print("v[" +indexMaior+ "]: \n");
                vetor.imprimir();
            }
        }
    }
}
