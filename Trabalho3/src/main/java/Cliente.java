public class Cliente {
    private static int cont = 1;
    private final int numero;
    private int tempoDeAtendimento;
    String purple = "\u001B[35m";
    String reset = "\u001B[0m";

    public Cliente(int tempoDeAtendimento) {
        this.numero = cont++;
        this.tempoDeAtendimento = tempoDeAtendimento;
    }

    public int getTempoDeAtendimento() {
        return tempoDeAtendimento;
    }

    public void setTempoDeAtendimento(int tempoDeAtendimento) {
        this.tempoDeAtendimento = tempoDeAtendimento;
    }

    public void setCaixa(Caixa caixa) {
    }

    @Override
    public String toString() {
        return STR."\{purple}Cliente [\{numero}] Tempo de atendimento: \{tempoDeAtendimento}\{reset}";
    }
}
