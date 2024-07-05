import fila.FilaLista;

public class Caixa {
    private final FilaLista fila;
    private Cliente clienteAtual;
    private Caixa proximo;
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String purple = "\u001B[34m";

    public Caixa() {
        this.fila = new FilaLista();
    }

    public FilaLista getFila() {
        return fila;
    }

    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    public void setClienteAtual(Cliente clienteAtual) {
        this.clienteAtual = clienteAtual;
    }

    public Caixa getProximo() {
        return proximo;
    }

    public void setProximo(Caixa proximo) {
        this.proximo = proximo;
    }

    public void atenderCliente() {
        if (clienteAtual != null) {
            clienteAtual.setTempoDeAtendimento(clienteAtual.getTempoDeAtendimento() - 1);
            if (clienteAtual.getTempoDeAtendimento() == 0) {
                clienteAtual = null;
            }
        }
    }

    @Override
    public String toString() {
        if (clienteAtual != null) {
            return purple + "(" + red + "Caixa atendendo: " + clienteAtual.toString() + purple + "):";
        } else {
            return purple + "(" + green + "Caixa livre" + purple + "):";
        }
    }
}
