package org.example;

import java.util.*;

public class Supermarket {
    private List<Caixa> caixas;
    private List<Fila> filas;
    private Random random;
    String green = "\u001B[32m";
    String blue = "\u001B[34m";
    String cyan = "\u001B[36m";
    String yellow = "\u001B[33m";


    public Supermarket(int numeroDeCaixas) {
        caixas = new ArrayList<>(numeroDeCaixas);
        filas = new ArrayList<>(numeroDeCaixas);
        random = new Random();
        for (int i = 0; i < numeroDeCaixas; i++) {
            caixas.add(new Caixa());
            filas.add(new Fila());
        }
    }
    public void simularPassoDeTempo() {
        System.out.println(green + "Supermarket PAMPA");
        // Simular chegada de novos clientes
        if (random.nextInt(100) < 10) {
            int tempoDeAtendimento = random.nextInt(11) + 5;
            Cliente novoCliente = new Cliente(tempoDeAtendimento);
            filas.stream().min(Comparator.comparingInt(Fila::tamanho)).ifPresent(filaMenor -> filaMenor.adicionarCliente(novoCliente));
            System.out.println(green + "Novo cliente chegou: " + novoCliente);
        }

        for (int i = 0; i < caixas.size(); i++) {
            Caixa caixa = caixas.get(i);
            if (caixa.getClienteAtual() == null && !filas.get(i).estaVazia()) {
                caixa.atenderCliente(filas.get(i).removerCliente());
            }
            caixa.processarAtendimento();
        }

        // Exibir estado atual das filas e caixas
        for (int i = 0; i < caixas.size(); i++) {
            System.out.println(blue + "Caixa " + (i + 1) + " " + caixas.get(i).toString());
            System.out.println(cyan + "Fila " + (i + 1) + " " + filas.get(i).toString());
            System.out.println(yellow + "==========================================");
        }
    }
}