package exemplos;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(1, "Manoel");
        c.depositar(100);
        System.out.println("Titular: " + c.getNomeTitular());
        System.out.println("Saldo Atual: " + c.getSaldo());
        System.out.println("Sacando R$ 50...");
        c.sacar(50);
        System.out.println("Saldo Atual: " + c.getSaldo());
        System.out.println("Sacando mais R$ 100...");
        c.sacar(100);
        System.out.println("Saldo Atual: " + c.getSaldo());
    }
}
