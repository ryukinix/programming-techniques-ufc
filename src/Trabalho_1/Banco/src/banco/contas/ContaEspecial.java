/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package banco.contas;

/**
 * Classe para gerenciar o tipo ContaEspecial.
 * @author Manoel Vilela
 */
public class ContaEspecial extends Conta {
    private int limite;
    private int multa;
    
    @Override
    public String tipoConta() {
        return "Conta Especial";
    }
    
    /**
     * Aplica multa no saldo quando o cheque especial é usado
     */
    public void descontar() {
        setSaldo(getSaldo() - Math.abs(getSaldo())*((float)getMulta()/100));
    }
    
    /**
     * Saque especial: possui um limite quando não há saldo disponível
     * @param valor valor a ser sacado
     * @return estado de sucesso ou falha da operação de saque
     */
    @Override
    public boolean sacar(double valor) {
        double saldo = getSaldo();
        if (saldo + limite >= valor) {
            setSaldo(saldo - valor);
            if (getSaldo() < 0) {
                descontar();
            }
            return true;
        }
        
        return false;
    }

    /**
     * @return the limite
     */
    public int getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(int limite) {
        this.limite = limite;
    }

    /**
     * @return the multa
     */
    public int getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(int multa) {
        this.multa = multa;
    }
}
