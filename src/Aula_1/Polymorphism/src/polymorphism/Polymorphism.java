/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;



/**
 * Polymorphism demonstration through Inheritance (Subtyping)
 * @author Manoel Vilela
 */
public class Polymorphism {

    
    /**
     * TODO: read by argument if is Person, Student or Teacher
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Student());
        persons.add(new Teacher());
        persons.add(new Person());
        
        Scanner scan = new Scanner(System.in);
        
        for(Person person : persons) {
            person.setName(scan.nextLine());
        }
        
        for(Person person: persons) {
            System.out.println(person.getName());
        }
        
        scan.close();
    }
    
}
