package Aprendizado.DSjava.Chapter1.Arithmetic;

public class Progression {

    //Primeiro valor da progressao
    protected long first;
    //Valor atual
    protected long cur;

    //Construtor Default
    Progression(){
        cur = first = 0;
    }

    //Reinicializa a progressao com valor inicial
    protected long firstValue(){
        cur = first;
        return cur;
    }

    //Avança para proximo valor
    protected long nextValue(){
        return ++cur; //Proximo valor default
    }

    //Imprime os valores N da progressao
    public void printProgression(int n){
        System.out.print(firstValue());
        for (int i = 2; i <= n; i++)
            System.out.print(" " + nextValue());
        System.out.println(); //Termina a linha
    }
}
