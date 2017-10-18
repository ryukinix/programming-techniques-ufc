/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package arquivos;

import java.io.FileNotFoundException;

/**
 * Mostra as possiveis maneiras de tratar um erro de inexistência de arquivo. O
 * primeiro é o clássico try/catch e o segundo o delegate it. Basicamente,
 * delegate it faz com que o erro seja passado pra frente.
 *
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Inexistencia {

    public static void metodo() throws FileNotFoundException {
        new java.io.FileInputStream("arquivo123.txt");
    }

    // passa o erro pra frente (delega)
    public static void delegateIt() throws java.io.FileNotFoundException{
        metodo();
    }

    // trata o erro internamente
    public static void tryCatch() {
        try {
            metodo();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Nao foi possível abrir o arquivo para leitura");
        }
    }
    
    public static void main(String[] args) {
        tryCatch();
        try {
            delegateIt();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("ERROR: " + e);
        }
    }
}
