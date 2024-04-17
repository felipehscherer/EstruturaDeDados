package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

    BufferedReader br = null;
    String linha = "";
    String csvDivisor = ",";
    public void lerArquivo(String caminho) {
        try {
            br = new BufferedReader(new FileReader(caminho));
            while ((linha = br.readLine()) != null) {
                String[] itens = linha.split(csvDivisor);
                for (int i = 0; i < 8; i++) {
                    System.out.println(itens[i]);
                }

            }
        } catch (Exception e) {
          e.getMessage();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
    }
}
