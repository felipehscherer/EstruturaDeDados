package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket(5);
        Scanner sc = new Scanner(System.in);

        System.out.println("Pressione [ENTER] para simulação");
        while (true) {
            sc.nextLine();
            supermarket.simularPassoDeTempo();
    }
}
}
