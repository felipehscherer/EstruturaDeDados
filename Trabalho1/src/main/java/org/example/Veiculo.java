package org.example;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private int potencia;
    private int lugares;
    private String marca;
    private Categoria categoria;

    public Veiculo(String placa, String modelo, String marca, int ano, int potencia, int lugares, Categoria categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.lugares = lugares;
        this.categoria = categoria;
    }
}
