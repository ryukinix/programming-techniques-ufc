/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package arquivos;

/**
 * Um exemplo de tratamento de erros em Java.
 *
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class TesteErro {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro: " + e);
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    public static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("fim do metodo2");
    }
}
