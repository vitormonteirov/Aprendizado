package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números: ");
        System.out.print("Primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Terceiro numero: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " é o maior número");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " é o maior número");
        }
        else {
            System.out.println(num3 + " é o maior numero");
        }
        sc.close();
    }
}
