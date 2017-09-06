package exemplos;

public class Conta {
    private int numero;
    private String nomeTitular;
    private double saldo;

    public Conta(int numero, String nomeTitular) {
        setNumero(numero);
        setNomeTitular(nomeTitular);
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean sacar (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
