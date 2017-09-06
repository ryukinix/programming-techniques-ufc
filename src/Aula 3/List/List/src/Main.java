/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

import list.List;

/**
 * A fucking example of fucking data structures
 * @author Manoel Vilela
 */
public class Main {
    
    public static void stackExample(int size) {
        System.out.println(":: STACK");
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < size; i++) {
            stack.push(i);
            stack.print();
        }
        for(int i = 0; i < size; i++) {
            stack.pop();
            stack.print();
        }
        
    }
    
    public static void queueExample(int size) {
        System.out.println(":: QUEUE");
        Queue<Integer> queue = new Queue<>();
        for(int i = 0; i < size; i++) {
            queue.enqueue(i);
            queue.print();
        }
        for(int i = 0; i < size; i++) {
            queue.dequeue();
            queue.print();
        }
    }
    
    public static void removeTest() {
        System.out.println(":: REMOVE TEST");
        List<Integer> list = new List<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.print();
        list.remove(2);
        list.print();
        list.remove(1);
        list.print();
        list.remove(3);
        list.print();
    }
    
    public static void insertTest() {
        System.out.println(":: INSERT TEST");
        List<Integer> list = new List<>();
        list.append(0);
        list.append(0);
        list.append(0);
        list.print();
        list.insert(0, 1);
        list.print();
        list.insert(2, 2);
        list.print();
        list.insert(4, 4);
        list.print();
    }


    /**
     * @brief This shit is a fucking linked list implementation on ** Java
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 10;
        stackExample(size);
        queueExample(size);
        removeTest();
        insertTest();
    }
    
}
