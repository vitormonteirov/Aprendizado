package Aprendizado.TreinoJava.Lógica;
import java.util.*;

public class inteiroN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        int soma;

        System.out.print("Insira um número: ");
        N = scanner.nextInt();
        soma = 0;

        while (N != 0){
        for (int i = -1; i != 0; i++) {
             soma += N;
        }
            System.out.print("Insira um número: ");
            N = scanner.nextInt();
        }

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
    }

