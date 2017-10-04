/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package banco.contas;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author Manoel Vilela
 */
public class Conta {
    private String nome;
    private int numero;
    private double saldo;
    private static final ArrayList<Conta> contas; // usado pra fazer busca
    private static final Locale locale = new Locale("pt", "BR"); 

    /**
     * Formatador para moedas.
     */
    public static final DecimalFormat currencyFormatter;
    
    /**
     * inicialização estática para a lista de contas
     */
    static {
        contas = new ArrayList<>();
        currencyFormatter = (DecimalFormat) NumberFormat.getCurrencyInstance(locale);
    }
    
    public Conta() {
        // adiciona na lista estática novas contas
        // toda vez que um novo objeto conta é adicionado
        this.contas.add(this); 
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
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Realiza um depósito na conta
     * @param valor 
     */
    public void depositar(double valor) {
        this.setSaldo(valor + getSaldo());
    }
    
    /**
     * Realiza uma operação de saque na conta se houver saldo
     * @param valor
     * @return retorna estado de sucesso ou falha da operação
     */
    public boolean sacar(double valor) {
        double saldo = getSaldo();
        if (saldo >= valor) {
            setSaldo(saldo - valor);
            return true;
        }
        
        return false;
    }
    
    /**
     * Retorna o tipo de conta
     * @return string que descreve a conta
     */
    public String tipoConta() {
        return "Conta Comum";
    }
    /**
     * Realiza uma transferência entre duas contas
     * @param origem conta de origem
     * @param destino conta de destino
     * @param valor valor a ser transferido
     * @return estado de sucesso ou falha
     */
    public static boolean transferir(int origem, int destino, double valor) {
        Conta contaOrigem = buscaConta(origem);
        Conta contaDestino = buscaConta(destino);
        if (contaOrigem != null && contaDestino != null) {
            boolean sucessoSaque = contaOrigem.sacar(valor);
            if (sucessoSaque) {
                contaDestino.depositar(valor);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Função usada para buscar conta
     * @param numero número da conta
     * @return 
     */
    public static Conta buscaConta(int numero) {
        for(Conta conta : Conta.contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
    /**
     * Retorna um sumário sobre as informações da conta
     * @return 
     */
    public String info() {
        String banner = "=============================\n";
        String nomeTitular = "Nome: " + getNome().toUpperCase();
        String numeroTitular = " | Número: " + getNumero() + "\n";
        String tipo = "Tipo de conta: " + tipoConta() + "\n";
        String saldoAtual = "Saldo: " + currencyFormatter.format(getSaldo()) + "\n";
    
        return nomeTitular + numeroTitular + tipo + saldoAtual + banner;
    }
    
    public static String todasInfos() {
        String start = "";
        for(Conta conta: Conta.contas) {
            start += conta.info();
        }
        return start;
    }
}
