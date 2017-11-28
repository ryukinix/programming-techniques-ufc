public class Basic {

    public static void booleans() {
        boolean a = false;
        System.out.println(a);
        a = 10 > 5;
        System.out.println(a);
    }

    public static void strings() {
        String a = "marciel";
        String b = "abacate";
        System.out.println(a + " " + b);
        System.out.println(a + "[5] = " + a.charAt(5));
        System.out.println("Tamanho de " + a + " é " + a.length());
        System.out.println(a + " é igual " + b + "? " + a.equals(b));
    }

    public static void arithmetic() {
        int a = 1;
        int b = 2;
        int c = ++a*b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Integer.parseInt("123"));
    }

    public static void main(String[] args){
        System.out.println(":: Booleans...");
        booleans();
        System.out.println(":: Strings...");
        strings();
        System.out.println(":: Arithmetic...");
        arithmetic();

    }
}
