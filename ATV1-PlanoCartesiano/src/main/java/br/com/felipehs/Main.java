package br.com.felipehs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PlanoCartesiano p1 = new PlanoCartesiano(2, 8);
        PlanoCartesiano p2 = new PlanoCartesiano(2, 8);
        System.out.println(PlanoCartesiano.calcularDistancia(p1, p2));
    }
}