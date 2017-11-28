/*
 * Copyright <c> 2017 Manoel Vilela
 */
package books;

/**
 * Handle the Book class
 * @author lerax
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book obj1 = new Book("Calculus made Easy", 1930, "Unknown");
        Book obj2 = new Book("Fluent Python", 2014, "Luciano Ramalho");
        Book obj3 = new Book("Land of Lisp", 2011, "Conrad Barski");
        obj1.print();
        obj2.print();
        obj3.print();
    }
    
}
