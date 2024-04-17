package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LeituraArquivo la = new LeituraArquivo();

        la.lerArquivo("src/main/resources/Veiculos.csv");
    }
}