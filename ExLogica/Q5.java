package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O numero é impar");
        }
        sc.close();
    }
}
