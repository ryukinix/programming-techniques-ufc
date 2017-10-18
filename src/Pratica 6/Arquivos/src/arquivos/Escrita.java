/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * Este programa demonstra como escrever uma tabuada de N para um arquivo
 * O segundo parâmetro de FileWriter é o append, se é para sobrescrever ou
 * anexar os próximos dados no arquivo.
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Escrita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        final String filename = "/home/lerax/Desktop/tabuada.txt";
        Scanner ler = new Scanner(System.in);
        int i, n;
        System.out.printf("Informe o número para a tabuada: \n");
        n = ler.nextInt();
        
        FileWriter arq = new FileWriter(filename, true); // append = true
        PrintWriter gravarArq = new PrintWriter(arq);
        for (i = 1; i <= 10; i++) {
            gravarArq.printf("| %2d X %d = %3d |%n", i, n, (i*n));
        }
       
        gravarArq.printf("+--------------+%n");
        
        arq.close();
        
        System.out.printf("\nTabuada do %d foi gravada com sucesso em %s\n", n, filename);
               
                
    }
    
}
