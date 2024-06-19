package org.example.exercicios;

import org.example.estruturas.LSE;
import java.util.Scanner;

public class Exc07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LSE lista = new LSE();

        int opcao;
        do{
            System.out.println("Lista: ");
            lista.bubbleSort();
            System.out.println("1 - Inserir valor");
            System.out.println("4 - Finalizar");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            int valor = 0;

            if(opcao == 1){
                System.out.print("Valor: ");
                valor = sc.nextInt();
            }

            switch (opcao) {
                case 1:
                    lista.insereInicio(valor);;
                    break;
                default:
                    break;
            }
        } while(opcao != 4);
    }
}
