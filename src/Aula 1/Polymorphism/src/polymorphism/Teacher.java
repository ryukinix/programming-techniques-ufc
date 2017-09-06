/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package polymorphism;

/**
 * Teacher specialized class as child from Person
 * @author Manoel Vilela
 */
public class Teacher extends Person {
    private String curriculum;
    private float salary;
    
    public String getCurriculum() {
        return this.curriculum;
    }
    
    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
    
    public float getSalary() {
        return this.salary;
    }
    
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return "Professor: " + name;
    }
}
