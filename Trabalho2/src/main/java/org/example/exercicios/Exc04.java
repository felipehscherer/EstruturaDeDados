package org.example.exercicios;

import org.example.estruturas.LDE;

import java.util.Scanner;

public class Exc04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LDE lista = new LDE();
        
        int opcao;
        do{
            System.out.println("Lista: ");
            lista.imprimir();
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Encerrar");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor: ");
                    int valor = sc.nextInt();
                    lista.insereOrdenado(valor);
                    break;

                case 2:
                    System.out.print("Valor: ");
                    int valorRemover = sc.nextInt();
                    lista.remove(valorRemover);
                    break;
                default:
                    break;
            }

        } while(opcao != 3);
    }
}
