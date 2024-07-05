import java.util.Random;
import java.util.Scanner;

public class Supermercado {
    private Caixa inicio;
    private Scanner entrada;
    private Random random;
    String green = "\u001B[32m";
    String blue = "\u001B[34m";
    String cyan = "\u001B[36m";
    String yellow = "\u001B[33m";
    String red = "\u001B[31m";

    public Supermercado(int numCaixas) {
        this.inicio = null;
        this.entrada = new Scanner(System.in);
        this.random = new Random();
        inicializarCaixas(numCaixas);
    }

    private void inicializarCaixas(int numCaixas) {
        Caixa caixaAnterior = null;
        for (int i = 0; i < numCaixas; i++) {
            Caixa novoCaixa = new Caixa();
            if (i == 0) {
                inicio = novoCaixa;
            } else {
                caixaAnterior.setProximo(novoCaixa);
            }
            caixaAnterior = novoCaixa;
        }
    }
    public void simular() {
        while (true) {

            System.out.println("Digite [1] para avançar o tempo | Digite [0] para sair");
            String proxPasso = entrada.nextLine();

            if (proxPasso.equals("1")) {
                if (chegadaDoCliente()) {
                    Cliente cliente = new Cliente(random.nextInt(11) + 5);
                    Caixa caixaDisponivel = encontrarCaixaDisponivel();

                    if (caixaDisponivel != null) {
                        caixaDisponivel.getFila().add(cliente);
                        cliente.setCaixa(caixaDisponivel);
                    } else {
                        Caixa caixaMenorFila = encontrarCaixaMenorFila();
                        caixaMenorFila.getFila().add(cliente);
                        cliente.setCaixa(caixaMenorFila);
                    }
                }

                Caixa atual = inicio;
                while (atual != null) {
                    if (atual.getClienteAtual() == null && !atual.getFila().isEmpty()) {
                        Cliente proximoCliente = (Cliente) atual.getFila().peek();
                        atual.getFila().remove();
                        atual.setClienteAtual(proximoCliente);
                    }
                    atual.atenderCliente();
                    atual = atual.getProximo();
                }

                exibirStatus();
            } else if (proxPasso.equals("0")) {
                System.out.println(STR."\{red}Encerrando simulação...");
                break;
            } else {
                System.out.println(STR."\{red}Comando inválido.");
            }
        }
    }

    private boolean chegadaDoCliente() {
        return random.nextInt(100) < 80;
    } // aumentei pra 80 só pra testar melhor

    private Caixa encontrarCaixaDisponivel() {
        Caixa atual = inicio;
        while (atual != null) {
            if (atual.getClienteAtual() == null) {
                return atual;
            }
            atual = atual.getProximo();
        }
        return null;
    }

    private Caixa encontrarCaixaMenorFila() {
        Caixa menorFila = inicio;
        Caixa atual = inicio.getProximo();
        while (atual != null) {
            if (atual.getFila().size() < menorFila.getFila().size()) {
                menorFila = atual;
            }
            atual = atual.getProximo();
        }
        return menorFila;
    }

    private void exibirStatus() {
        Caixa atual = inicio;
        int index = 1;
        while (atual != null) {
            System.out.println(STR."\{blue}Caixa \{index}:");
            System.out.println(STR."\{cyan}Cliente atual: + \{green}\{atual.getClienteAtual() != null ? atual.getClienteAtual() : red + "Nenhum"}");
            System.out.println(STR."\{cyan}Fila: \{yellow}\{atual.getFila()}");
            atual = atual.getProximo();
            index++;
        }
    }
}
