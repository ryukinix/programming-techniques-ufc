/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

import list.List;


/**
 * @brief Implementation of a Stack structure using generic and List class
 * @param <T> generic type of the Stack
 * @author Manoel Vilela
 */
public class Stack<T> {
    private List<T> list;
    
    public Stack() {
        this.list = new List<>();
    }
    
    public void push(T data) {
        this.list.prepend(data);
    }
    
    public T pop() {
        return this.list.popHead();
    }
    
    public void print() {
        this.list.print();
    }
}
