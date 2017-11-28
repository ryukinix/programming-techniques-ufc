/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package list;

/**
 * @brief Primitive content of a Node 
 * @param <T> generic type to store on each Node
 * @author Manoel Vilela
 */
public class Node<T> {
    public T data;
    public Node next;
    
    public Node() {
        this.next = null;
    }
    
    public Node (T data) {
        this.data = data;
        this.next = null;
    }
}
