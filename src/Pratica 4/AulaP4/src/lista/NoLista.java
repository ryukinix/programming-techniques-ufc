package lista;

/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

/**
 * Implementa a unidade elementar de uma lista
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class NoLista{
    int valor;
    String nome;
    NoLista next;  
 
    public NoLista (int valor){
        this.valor = valor;
        this.next = null;
    }
}