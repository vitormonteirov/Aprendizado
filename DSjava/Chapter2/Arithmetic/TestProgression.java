package Aprendizado.DSjava.Chapter2.Arithmetic;

public class TestProgression {
    public static void main(String[] args) {

        Progression prog;

        System.out.println("Progressao Aritimetica de incremento padrão: ");
        prog = new ArithProgression();
        prog.printProgression(10);

        System.out.println("Progressao Aritimetica de incremento 5: ");
        prog = new ArithProgression(5);
        prog.printProgression(10);

        System.out.println("Progressao Geometrica de base padrão: ");
        prog = new GeomProgression();
        prog.printProgression(10);

        System.out.println("Progressao Geometrica de base 3: ");
        prog = new GeomProgression(3);
        prog.printProgression(10);

        System.out.println("Progressao Fibonacci de inicio padrão: ");
        prog = new FibonacciProgression();
        prog.printProgression(10);

        System.out.println("Progressao Fibonacci de inicio 4 e 6: ");
        prog = new FibonacciProgression(4,6);
        prog.printProgression(10);
    }
}
