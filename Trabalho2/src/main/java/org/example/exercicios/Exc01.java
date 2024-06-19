package org.example.exercicios;

import org.example.estruturas.Vetor;
import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        Vetor v1 = new Vetor(n);
        Vetor v2 = new Vetor(n);

        for(int i=0; i<n; i++){
            System.out.print("v1[" + i + "] = ");
            v1.adiciona(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            System.out.print("v2[" + i + "] = ");
            v2.adiciona(sc.nextInt());
        }
        sc.close();
        Vetor vInterseccao = gerarVetorInterseccao(v1, v2);

        System.out.println("VETOR INTERSECCAO: ");
        vInterseccao.imprimir();
    }

    public static Vetor gerarVetorInterseccao(Vetor v1, Vetor v2){
        Vetor vetorInterseccao = new Vetor(v1.tamanho());

        for(int i=0; i<v1.tamanho(); i++){
            if(v2.contem(v1.getAt(i))){
                if(!vetorInterseccao.contem(v1.getAt(i))){
                    vetorInterseccao.adiciona(v1.getAt(i));
                }
            }
        }
        return vetorInterseccao;
    }
}
