package Aprendizado.TreinoJava.Lógica;
import java.util.Scanner;
public class inteiroN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número: ");
            int x = sc.nextInt();
            soma = soma + x;

        }
        System.out.println("A soma final dos " + n + " números digitados é: " + soma);
    }
}
