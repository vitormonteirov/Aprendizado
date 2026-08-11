package Aprendizado.DSjava.Chapter1.Arithmetic;

public class FibonacciProgression extends Progression {
    long prev;
    FibonacciProgression() {
        this(0,1);
    }
    FibonacciProgression(long value1, long value2) {
        first = value1;
        prev = value2 - value1;
    }
    protected long nextValue() {
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }
}
