/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package ternario;

/**
 * Implementa uma classe pessoa, que é mulher ou não. (é, idiota).
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Pessoa {
    public boolean Mulher;
    private String name;
    
    public Pessoa(String name, boolean mulher) {
        this.Mulher = mulher;
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
