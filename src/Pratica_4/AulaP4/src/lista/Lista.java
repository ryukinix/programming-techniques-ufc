/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package lista;

/**
 * 
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Lista {
    NoLista inicio;
     
    public Lista() {
        this.inicio = null;
    }

    public void inserir(int valor) {
        NoLista no = new NoLista(valor);
        if (this.inicio != null) {
            no.next = this.inicio;
        }
        this.inicio = no;
        
    }
    
    @SuppressWarnings("empty-statement")
    public void inserirNoFim(int valor) {
        NoLista no = new NoLista(valor);
        if (this.inicio == null) {
            this.inicio = no;
        } else {
            NoLista l;
            for(l = this.inicio; l.next != null; l = l.next);
            l.next = no;
        }
    }

    
    public void imprimirLista() {
        System.out.print("[");
        for(NoLista no = this.inicio; no != null; no = no.next) {
            System.out.print(no.valor);
            if (no.next != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    } 
}
