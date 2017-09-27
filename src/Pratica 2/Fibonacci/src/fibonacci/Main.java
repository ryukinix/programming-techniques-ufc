/*
 * Copyright <c> 2017 Manoel Vilela
 */
package fibonacci;

import java.util.Scanner;

/**
 * Compute the Fibonacci sequence
 * -> print the sequence
 * -> print the sum of the sequence
 * @author lerax
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sequence seq = new Sequence();
        Scanner scan = new Scanner(System.in);
        int n = 0; 
        do {
            System.out.println("Digite um número entre [3,90]: ");
            n = scan.nextInt();
            if (n < 3 || n > 90) {
                System.out.println("Número fora do limite! Tente novamente.");
            }
        } while(n < 3 || n > 90);
        seq.printUntil(n);
        System.out.println("Soma de toda sequência: " + seq.sumUntil(n));
    }
    
}
