/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package banco.contas;

/**
 * Classe para gerenciamento de uma classe do tipo poupança
 * @author Manoel Vilela
 */
public class ContaPoupanca extends Conta {
    private double reajuste;
    
    /**
     * Aplica taxa de lucro de reajuste para conta poupança
     * @param taxa valor entre (0,1] para aplicação do reajuste.
     */
    public void reajustar(double taxa) {
        setSaldo(getSaldo() + taxa * getSaldo());
    }
    
    /**
     * Aplica taxa de lucro padrão de reajuste
     * Ps.: eu acredito que isso não deveria ser 0.1, mas sim 
     * o atributo `reajuste` lido no cadastro. Deixei como descrito na
     * especificação por via das dúvidas.
     */
    public void reajustar() {
        reajustar(0.1);
    }
    
    @Override
    public String tipoConta() {
        return "Conta Poupança";
    }

    /**
     * @return the reajuste
     */
    public double getReajuste() {
        return reajuste;
    }

    /**
     * @param reajuste the reajuste to set
     */
    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }
}
