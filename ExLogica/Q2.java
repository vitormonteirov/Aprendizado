package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNasc = sc.nextInt();

        System.out.print("Agora digite o ano em que estamos: ");
        int anoHj = sc.nextInt();

        int idade = anoHj - anoNasc;
        System.out.println("Sua idade é: " + idade);

        if (idade >= 18) {
            System.out.println(nome + ", sua entrada foi permitida.");
        }
        else {
            System.out.println("Você tem menos de 18 anos, sua entrada não é permitida.");
        }
        sc.close();
    }
}
