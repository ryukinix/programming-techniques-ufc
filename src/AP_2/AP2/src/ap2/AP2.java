/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package ap2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class AP2 {
    
    public static void questao1() {
        System.out.println("== Questão 1");
        Carros c = new Carros("Corola", 1999, 40000);
        c.print();
        Veiculos v = new Veiculos("Gol", 2017, 40000, 4);
        v.print();
    }
    
    public static void questao2a() {
        System.out.println("== Questão 2.a");
        String path = "/home/lerax/Desktop/questao2a.txt"; // para salvar resposta
        Scanner in = new Scanner(System.in);
        System.out.print("Digite N: ");
        int n = in.nextInt();
        System.out.print("Digite K: ");
        int k = in.nextInt();
        int m = Math.min(n, k);
        String result1 = String.format("Sqrt(%d) = %.2f\n", m, Math.sqrt(m));
        String result2 = String.format("Log10(%d) = %.2f\n", m, Math.log10(m));
        System.out.print(result1);
        System.out.print(result2);
        try {
            // buffer de escrita anexado a um arquivo em disco
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            buffWrite.append(result1); // adiciona nova linha com resultado 1
            buffWrite.append(result2); // adiciona nova linha com resultado 2
            System.out.println("Resultados também salvo em: " + path);
            buffWrite.close();
        } catch (IOException ex) {
            System.out.println("Não foi possível abrir o arquivo.");
        }
    }
    
    public static void questao2b() {
        System.out.println("== Questão 2.b");
        try {
            VetorAleatorio.readSize();
            VetorAleatorio.fill(0, 10);
            VetorAleatorio.print();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, digite um número inteiro válido.");
            questao2b();
        }
 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        questao1();
        questao2a();
        questao2b();
    }
    
}
