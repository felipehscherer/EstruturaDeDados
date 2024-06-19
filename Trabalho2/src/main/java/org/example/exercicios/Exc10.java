package org.example.exercicios;

public class Exc10 {
    public static void main(String[] args) {
        int m = 1;
        int n = 5;
        System.out.println("A soma de " + m + " até " + n + " é: " + soma(m, n));
    }

    public static int soma(int m, int n) {
        if (m == n) {
            return m;
        }
        return m + soma(m + 1, n);
    }
}
