/*
 * Copyright <c> 2017 Manoel Vilela
 */
package fibonacci;

/**
 * Compute the Fibonacci Sequence
 * @author lerax
 */
public class Sequence {
    private long a;
    private long b;
    
    public Sequence() {
        this.reset();
    }
    
    public Sequence(long a, long b) {
        this.a = a;
        this.b = b;
    }
    
    public long next() {
        long x = a;
        this.a = b;
        this.b = x + a;
        return x;
    }
    
    public void printUntil(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(this.next() + " ");
        }
        System.out.println();
        this.reset();
    }
    
    public void reset() {
        this.a = 1;
        this.b = 1;
    }
    
    public long sumUntil(int n) {
        long acc = 0;
        for(int i = 0; i < n; i++) {
            acc += this.next();
        }
        this.reset();
        return acc;
    }
}
