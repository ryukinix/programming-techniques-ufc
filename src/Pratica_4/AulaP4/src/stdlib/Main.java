package stdlib;

/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

/**
 * Testa algumas propriedades da stdlib
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Main {
    public static void main(String[] args) {
        int num = 81; 
        double x = Math.sqrt(num); 
        
        System.out.println("== MATH METHODS ==");
        System.out.println("A raiz quadrada de "+num+" é "+x); 
         
        System.out.println("Valor absoluto: "+Math.abs(-81.4)); 
        System.out.println("Seno: "+Math.sin(90.0)); 
        System.out.println("Seno: "+Math.sin(Math.toRadians(90))); 
        System.out.println("Max: "+Math.max(85, 20));
        System.out.println("--");
        System.out.println("Floor: 10.5 -> "+ Math.floor(10.5));
        System.out.println("Ceil: 10.5 -> "+ Math.ceil(10.5));
        System.out.println("Log10: 10 -> "+ Math.log10(10));
        
        System.out.println("\n== STRING METHODS ==");
        String nome = "Fulano"; 
        String frase = "Meu nome é "; 
        String completa = frase + nome;
        
        System.out.println(completa); 
        System.out.println("O tamanho do nome é: "+nome.length()); 
        System.out.println("O caracter da posicao 2 é: "+nome.charAt(1)); 
        System.out.println("Frase toda em maiúsculas: " +completa.toUpperCase()); 
        System.out.println("Trecho de 2 a 8: "+completa.substring(2,8)); 
        System.out.printf("Retira os espaços antes e depois: '%s'\n", frase.trim()); 
        System.out.println("Substituindo Fulano por Sicrano: " 
                           +completa.replace("Fulano", "Sicrano")); 
        System.out.println("--");
        
        System.out.print("Split por espaço: ");
        for(String s: completa.split(" ")) {
            System.out.printf("'%s' ", s);
        }
        System.out.println();
        System.out.println("Fras toda minúscula: " + completa.toLowerCase());
        System.out.println("Começa com 'Meu': " + completa.startsWith("Meu"));
    }
}
