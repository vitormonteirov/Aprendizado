package Aprendizado.TreinoJava.Lógica;
import java.util.Scanner;

public class problema_somaImpares {
    public static void main(String[] args) {
        Scanner leitorDeNumero = new Scanner(System.in);

        int x, y, troca, soma;

        System.out.println("Digite dois numeros: ");
        x = leitorDeNumero.nextInt();
        y = leitorDeNumero.nextInt();

        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }
        soma = 0;
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println("A soma dos impares é: " + soma);
    }
}


