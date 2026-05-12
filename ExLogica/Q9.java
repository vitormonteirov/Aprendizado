package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        System.out.print("Primeiro número: ");
        int NumA = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int NumB = sc.nextInt();

        int NumC = NumA;
        NumA = NumB;
        NumB = NumC;

        System.out.println(NumA + " e " + NumB);

        sc.close();
    }
}
