package Aprendizado.DSjava.Chapter2.Arithmetic;

public class GeomProgression extends Progression {
    protected long base;
    GeomProgression() {
        this(2);
    }
    GeomProgression(long b) {
        base = b;
        first = 1;
        cur = first;
    }
    protected long nextValue() {
        cur*=base;
        return cur;
    }
}
