/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package list;

/**
 * @brief Simple implementation of a Single Linked List
 * @param <T> type of the List
 * @author Manoel Vilela
 */
public class List<T> {
    private Node<T> head;
    private int size;

    public List() {
        this.head = null;
        this.size = 0;
    }

    public void prepend(T data) {
        Node<T> newHead = new Node<>(data);
        newHead.next = this.getHead();
        this.setHead(newHead);
        size++;
    }
    
    public void append(T data) {
        Node<T> currentHead = this.getHead();
        Node<T> newNode = new Node<>(data);
        
        if (currentHead == null) {
            this.setHead(newNode);
        } else {
            while(currentHead.next != null) {
               currentHead = currentHead.next;
            }
            currentHead.next = newNode;
        }
        size++;
    }
    
    public int getSize() {
        return this.size;
    }

    // isso vai dar merda
    public T popHead() {
        Node<T> oldHead = this.head;
        this.head = oldHead.next;
        size--;
        return oldHead.data;
    }
    
    // isso também
    public T popTail() {
        Node<T> tail = this.head;
        Node<T> previousNode = tail;
        
        while(tail.next != null) {
            previousNode = tail;
            tail = tail.next;
        }
        previousNode.next = null;
        size--;
        return tail.data;
    }
    
    public Node<T> getHead() {
        return this.head;
    }
    
    public void insert(int i, T data) {
        if (i > size) {
            System.out.println("Ta louco? Tenho onde enfiar essa merda não!");
            return;
        }
        
        if (i == 0) {
            this.prepend(data);
            return;
        }
        
        Node<T> currentHead = this.getHead();
        while(i-- > 1) {
            currentHead = currentHead.next;
        }
        
        Node<T> newNode = new Node<>(data);
        newNode.next = currentHead.next;
        currentHead.next = newNode;
    };
    
    public void insert(T data) {
        this.append(data);
    }
    
    // da merda se tiver vazia
    public boolean remove(T data) {
        Node<T> currentHead = this.getHead();
        
        // evitar dar pau
        if (currentHead == null) {
            return false;
        }
        
        // se for a cabeça, remova logo essa bosta
        if (currentHead.data == data) {
            this.popHead();
            return true;
        }
        
        // se não for, deve ser um do resto aq
        while(currentHead.next != null) {
            if (currentHead.next.data == data) {
                currentHead.next = currentHead.next.next;
                return true;
            }
        }
            
        return false;
    }
    
    protected void setHead(Node<T> node) {
        this.head = node;
    }
    
    public void print() {
        System.out.print("[");
        Node<T> currentHead = this.head;
        
        while(currentHead != null) {
            System.out.print(currentHead.data);
            if (currentHead.next != null) {
                System.out.print(", ");
            }
            currentHead = currentHead.next;
        }
        
        System.out.println("]");
    }
    
}
