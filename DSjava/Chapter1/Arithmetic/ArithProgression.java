package Aprendizado.DSjava.Chapter1.Arithmetic;

public class ArithProgression extends Progression {
    protected long inc;
    //Herda as variaveis furst e cur
    // Construtor Default inicializa com incremento de 1
    ArithProgression(){
        this(1);
    }
    //Construtor parametrico fornece o incremento
    ArithProgression(long increment){
        inc = increment;
    }
    protected long nextValue() {
        cur += inc;
        return cur;
    }
}
