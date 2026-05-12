package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num == 20){
            System.out.println("O numero é igual a 20");
        }
        else if(num > 20){
            System.out.println("O numero é maior que 20");
        }
        else{
            System.out.println("O numero é menor que 20");
        }
        sc.close();
    }
}
