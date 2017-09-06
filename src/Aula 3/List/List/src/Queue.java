/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

import list.List;

/**
 * @brief Simple implementation of a Queue based on List type
 * @param <T> type of the Queue container
 * @author Manoel Vilela
 */
public class Queue<T> {
    private List<T> list;

    public Queue() {
        this.list = new List<>();
    }
    
    public void enqueue(T data) {
        this.list.append(data);
    }
    
    public T dequeue() {
        return this.list.popHead();
    }
    
    public void print() {
        this.list.print();
    }
    
}
