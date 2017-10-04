/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package lista;

/**
 * Classe para teste sobre a implementação de listas
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Main {

    /** Método principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        l1.inserir(1); 
        l1.inserir(2); 
        l1.inserir(3); 
        l1.inserirNoFim(10); 
        l1.inserirNoFim(12); 
      
        l2.inserir(5); 
        l2.inserir(15); 
        l2.inserir(25); 
 
        l1.imprimirLista(); 
        System.out.println("\n"); 
        l2.imprimirLista();
    }
    
}
