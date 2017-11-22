/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package ap2;

import java.util.Scanner;

/**
 *
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class VetorAleatorio {
    public static int size;
    public static int[] vector;
    
    public static void readSize() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        VetorAleatorio.size = in.nextInt();
        VetorAleatorio.vector = new int[size];
    }
        
       
    public static void print() {
        for (int i = 0; i < Math.min(15, VetorAleatorio.size); i++) {
            System.out.printf("%d : %d\n", i + 1, VetorAleatorio.vector[i]);
        }
    }
    
    public static void fill(int a, int b) {
        for (int i = 0; i < VetorAleatorio.size; i++) {
            VetorAleatorio.vector[i] = VetorAleatorio.random(a, b);
        }
    }
    
    public static void fill() {
        fill(2, 102);
    }

    public static int random(int a, int b) {
        return (int) Math.floor((a + Math.random()*(b-a)));
    }
}
