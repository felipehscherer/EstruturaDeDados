package org.example.exercicios;

import org.example.estruturas.LDE;
import org.example.estruturas.NohDuplo;

import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LDE lista = new LDE();
        int opcao;
        do{
            System.out.println("Lista: ");
            lista.imprimir();
            System.out.println("1 - Inserir no inicio");
            System.out.println("2 - Inserir no fim");
            System.out.println("3 - Remover");
            System.out.println("4 - Exibir quantidade de pares");
            System.out.println("5 - Encerrar\n");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            int valor = 0;

            if(opcao == 1 || opcao == 2 || opcao == 3){
                System.out.print("Valor: ");
                valor = sc.nextInt();
            }

            switch (opcao) {
                case 1:
                    lista.insereInicio(valor);;
                    break;

                case 2:
                    lista.insereFim(valor);
                    break;

                case 3:
                    lista.remove(valor);
                    break;

                case 4:
                    int qtdNumerosPares = nroPares(lista);
                    System.out.println("Quantidade de números pares: " + qtdNumerosPares);
                    System.out.print("ENTER para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;

                case 5:
                    break;

                default:
                    break;
            }

        } while(opcao != 5);
    }

    public static int nroPares(LDE lista){
        NohDuplo ponteiro = lista.inicio;
        int contador = 0;

        while(ponteiro != null){
            if(ponteiro.getInfo() % 2 == 0){
                contador++;
            }
            ponteiro = ponteiro.getProximo();
        }

        return contador;
    }
}
