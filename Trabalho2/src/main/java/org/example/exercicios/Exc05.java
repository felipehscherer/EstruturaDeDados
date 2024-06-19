package org.example.exercicios;
import org.example.estruturas.LSE;

import java.util.Scanner;

public class Exc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LSE lista = new LSE();
        int opcao;
        do{
            System.out.println("Lista: ");
            lista.imprimirRecursivo();
            System.out.println("1 - Inserir no inicio\n" +
                               "2 - Inserir no fim\n" +
                               "3 - Remover\n" +
                               "4 - Encerrar");

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
                default:
                    break;
            }
        } while(opcao != 4);
    }
}
