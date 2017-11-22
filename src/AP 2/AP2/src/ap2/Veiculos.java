/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package ap2;

/**
 *
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Veiculos extends Carros{
    private int portas;
    
    public Veiculos(String nome, int ano, int preco, int portas) {
        super(nome, ano, preco);
        this.portas = portas;
        this.tipo = "Veiculos";
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Portas: " + getPortas());
    }

    /**
     * @return the portas
     */
    public int getPortas() {
        return portas;
    }

    /**
     * @param portas the portas to set
     */
    public void setPortas(int portas) {
        this.portas = portas;
    }
    
}
