/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package poupanca;

/**
 * Specialized class 'ContaPoupanca' from 'Conta' 
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class ContaPoupanca extends Conta {
    
    public void reajustar(double taxa) {
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * taxa;
        this.depositar(reajuste);
    }
    
    @Override
    public void tipoConta() {
        System.out.println("Tipo de conta: poupança");
    }
    
    public void reajustar() {
        reajustar(0.1);
    }
}
