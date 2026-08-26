package Aprendizado.DSjava.Chapter2.Arithmetic;

public class FibonacciProgression extends Progression {
    long prev;
    FibonacciProgression() {
        this(0,1);
    }
    public FibonacciProgression(long value1, long value2) {
        first = value1;
        prev = value2 - value1;
    }
    public long nextValue() {
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }
}
