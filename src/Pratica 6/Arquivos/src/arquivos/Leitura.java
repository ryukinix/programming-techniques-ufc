/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Este programa ler uma entrada do usuário, escreve pra um arquivo
 * então lê o arquivo escrito e imprime para o usuário de volta.
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Leitura {

    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";

        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else {
                break;
            }
            linha = buffRead.readLine();
        }

        buffRead.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva alog: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

    public static void main(String[] args) throws IOException {
        String path = "/home/lerax/Desktop/arquivo2.txt";

        escritor(path);
        leitor(path);
    }
}
