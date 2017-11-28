/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package poupanca;

import javax.swing.JOptionPane;

/**
 * Program about inheritance, polymorphism and GUI
 * @author Manoel Vilela <manoel_vilela@engineer.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criação de duas contas
        ContaPoupanca cp = new ContaPoupanca();
        Conta c = new Conta();
        
        cp.depositar(1000);
        cp.reajustar(0.2);
        cp.sacar(500);
        System.out.println("Saldo conta poup: " + cp.getSaldo());
        cp.reajustar();
        System.out.println("Saldo conta poup: " + cp.getSaldo());
        // conta normal
        c.tipoConta();
        // conta poupança (polimorfismo)
        cp.tipoConta();
        
        // gui stuff
        String name = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Bem vindo " + name);
    }
    
}
