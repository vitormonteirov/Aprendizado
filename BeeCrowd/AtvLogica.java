package Aprendizado.BeeCrowd;
import java.util.*;

public class AtvLogica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade > 0 && idade < 16) {
            System.out.println("Ainda não pode votar!");
        }
        else {
            System.out.println("Você já pode votar!");
        }
    }
}
