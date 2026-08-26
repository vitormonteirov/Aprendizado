package Aprendizado.DSjava.Chapter2.Arithmetic.Exercices;

import Aprendizado.DSjava.Chapter2.Arithmetic.FibonacciProgression;
import Aprendizado.DSjava.Chapter2.Arithmetic.Progression;

public class R28 {
    public static void main(String[] args) {
        Progression prog = new FibonacciProgression(2,2);
        Progression prog2 = new FibonacciProgression(2,2);

        prog2.printProgression(10);
        System.out.println(prog.novaProgression(8));

    }
}
