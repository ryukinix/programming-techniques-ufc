/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package ternario;

/**
 * Realiza alguns teste sobre o uso do operador ternário
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Main {
    public static void main(String[] args) {
        int a = -1, b = 2;
        int minVal = a < b? a: b;
        int absVal = a < 0? -a: a;
        System.out.println("Min val: " + minVal);
        System.out.println("Abs val: " + absVal);
        
        Pessoa p = new Pessoa("Janaina", true);
        System.out.println ("Bom dia " + 
                (p.Mulher ? "senhora " : "senhor ")
                +p.getName ()); 
    }
}
