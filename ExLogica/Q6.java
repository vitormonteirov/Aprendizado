package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println(Math.sqrt(num));
        }
        else{
            System.out.println(Math.pow(num,2));
        }
        sc.close();
    }
}
