/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package ap2;

/**
 *
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Carros {
    protected String tipo;
    private String nome;
    private int ano;
    private int preco;

    public Carros(String nome, int ano, int preco) {
        this.tipo = "Carros";
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }
 
    public String getTipo() {
        return this.tipo;
    }
    
    public void print() {
        System.out.println("---------------");
        System.out.println("Classe: " + getTipo());
        System.out.println("Nome: " + getNome());
        System.out.println("Ano: " + getAno());
        System.out.println("Preco: " + getPreco());
    }
}
