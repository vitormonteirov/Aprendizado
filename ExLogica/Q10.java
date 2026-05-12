package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Leia dois numeros inteiros: ");
        System.out.print("Primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = sc.nextInt();

        if(num1 != num2 && num1 > num2) {
            System.out.println("Os numeros inteiros são diferentes e "+ num1 + " é maior que " + num2);
        }
        else if (num1 != num2 && num1 < num2) {
            System.out.println("Os numeros são diferentes e "+ num1 + " é menor que " + num2);
        }
        else {
            System.out.println("Os numeros sao iguais");
        }
        sc.close();
    }
}

