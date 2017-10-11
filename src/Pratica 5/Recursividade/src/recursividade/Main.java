/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package recursividade;

/**
 * Exemplos de métodos definidos recursivamente.
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Main {

    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
    
    public static int somaPares(int n) {
        int soma = 0;
        if (n == 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                soma = n;
            }
            return (soma + somaPares(n - 1));
        }
    }
    
    public static int mostrar(int m) {
        if (m > 50) {
            return 50;
        } else {
            System.out.println(m);
            return  mostrar(m+1);
        }
    }
    
    public static int mostraImpares(int n) {
        if (n == 0) {
            System.out.println("");
            return 0;
        } else {
            if (n % 2 != 0) {
                System.out.printf("%d ", n);
            }
            
            return mostraImpares(n-1);
        }
    }
    
    public static int imprimePares(int n) {
        if (n == 0) {
            System.out.println("");
            return 0;
        } else {    
            if (n % 2 == 0) {
                System.out.printf("%d ", n);
            }
            return imprimePares(n - 1);
        }
    }
    
    // sum [m, n]
    public static int soma_mn(int m, int n) {
        if (n == m) {
            return n;
        } else if (m < n) {
            return soma_mn(m, n - 1) + n; 
        } else {
            return soma_mn(m - 1, n) + m;
        }
    }
    
    public static int fib(int num) {
        int aux;
        if (num < 2) {
            return 1;
        } else {
            aux = fib(num - 1) + fib(num - 2);
            return aux;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.printf("== fatorial(%d)\n", n);
        System.out.println(fatorial(n));
        
        n = 5;
        System.out.printf("== somaPares(%d)\n", n);
        System.out.println(somaPares(n));
        
        n = 40;
        System.out.printf("== mostrar(%d)\n", n);
        mostrar(n);
        
        n = 10;
        System.out.printf("== mostraImpares(%d)\n", n);
        mostraImpares(n);
        
        n = 10;
        System.out.printf("== imprimePares(%d)\n", n);
        imprimePares(n);
        
        int a = 1, b = 5;
        System.out.printf("== soma_mn(%d, %d)\n", a, b);
        System.out.println(soma_mn(a, b));
        System.out.printf("== soma_mn(%d, %d)\n", b, a);
        System.out.println(soma_mn(b, a));
        
        System.out.println("== fib -> [0, 10]");
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d ", fib(i));
        }
        System.out.println("");
    }
    
}
