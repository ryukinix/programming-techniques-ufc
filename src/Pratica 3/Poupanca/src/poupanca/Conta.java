package poupanca;

public class Conta {
    private double saldo;
    
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public void tipoConta(){
        System.out.println("Tipo de conta: comum");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
