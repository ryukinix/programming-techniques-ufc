/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package polymorphism;

import java.util.Scanner;

/**
 * Person base class
 * @author Manoel Vilela
 */
public class Person {
    protected String name;
    private int age;
    private Sex sex;
    
    public Sex getSex() {
        return this.sex;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void readData(Scanner scan) {
        // write... read sex, age and name
    }
}
