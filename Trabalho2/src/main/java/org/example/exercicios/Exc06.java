package org.example.exercicios;

import org.example.estruturas.LDE;
import org.example.estruturas.NohDuplo;

import java.util.Scanner;

public class Exc06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LDE l1 = new LDE();
        LDE l2 = new LDE();

        char opcao = '!';
        do{
            System.out.println("Lista 1: ");
            l1.imprimir();

            System.out.println("Lista 2: ");
            l2.imprimir();

            System.out.print("[ 1 - Inserir no inicio da Lista 1 ");
            System.out.print("| 2 - Inserir no fim da Lista 1 ");
            System.out.println("| 3 - Remover da Lista 1 ]");

            System.out.print("[ a - Inserir no inicio da Lista 2 ");
            System.out.print("| b - Inserir no fim da Lista 2 ");
            System.out.println("| c - Remover da Lista 2 ]\n");

            System.out.println("M - Concatenar simplesmente as listas");
            System.out.println("O - Concatenar ordenadamente as listas");
            System.out.println("X - Encerrar");

            System.out.print("Digite a opção desejada: ");
            String entrada = sc.nextLine();

            if (entrada.isEmpty()) {
                System.out.println("Entrada inválida. Por favor, digite uma opção.");
                continue;
            }

            opcao = entrada.charAt(0);

            int valor = 0;

            if(opcao == '1' || opcao == '2' || opcao == '3' || opcao == 'a' || opcao == 'b' || opcao == 'c'){
                System.out.print("Valor: ");
                valor = sc.nextInt();
                sc.nextLine();
                System.out.println(valor);
            }

            switch (opcao) {
                case '1':
                    l1.insereInicio(valor);
                    break;

                case '2':
                    l1.insereFim(valor);
                    break;
                case '3':
                    l1.remove(valor);
                    break;
                case 'a':
                    l2.insereInicio(valor);
                    break;
                case 'b':
                    l2.insereFim(valor);
                    break;
                case 'c':
                    l2.remove(valor);
                    break;
                case 'm':
                    System.out.println("\nLista concatenada simplesmente: ");
                    concatenarSimples(l1, l2).imprimir();

                    System.out.println("--------------------");
                    System.out.println("Pressione ENTER para continuar...");
                    sc.nextLine();
                    break;
                case 'o':
                    System.out.println("\nLista concatenada ordenadamente: ");
                    concatenarOrdenado(l1, l2).imprimir();
                    System.out.println("Pressione ENTER para continuar...");
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while(opcao != 'X' && opcao != 'x');

    }


    public static LDE concatenarSimples(LDE lista1, LDE lista2){
        LDE listaConcatenada = new LDE();

        NohDuplo ponteiro = lista1.inicio;
        while(ponteiro != null){
            listaConcatenada.insereFim(ponteiro.getInfo());
            ponteiro = ponteiro.getProximo();
        }

        ponteiro = lista2.inicio;
        while(ponteiro != null){
            listaConcatenada.insereFim(ponteiro.getInfo());
            ponteiro = ponteiro.getProximo();
        }

        return listaConcatenada;
    }

    public static LDE concatenarOrdenado(LDE lista1, LDE lista2){
        LDE listaConcatenada = new LDE();

        NohDuplo ponteiro = lista1.inicio;
        while(ponteiro != null){
            listaConcatenada.insereOrdenado(ponteiro.getInfo());
            ponteiro = ponteiro.getProximo();
        }

        ponteiro = lista2.inicio;
        while(ponteiro != null) {
            listaConcatenada.insereOrdenado(ponteiro.getInfo());
            ponteiro = ponteiro.getProximo();
        }

        return listaConcatenada;
    }
}
