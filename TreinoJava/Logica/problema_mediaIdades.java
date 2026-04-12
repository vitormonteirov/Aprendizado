package Aprendizado.TreinoJava.Logica;

import java.util.Scanner;

public class problema_mediaIdades {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade1, idade2;
        String nome1, nome2;

        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        idade1 = sc.nextInt();
        System.out.print("Digite o nome da segunda pessoa: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.print("Digita a sua idade: ");
        idade2 = sc.nextInt();

        double mediadeidade = (float)(idade1 + idade2)/2;
        int somadeidade = idade1 + idade2;

        System.out.println("A primeira pessoa se chama "+ nome1 + " e tem "+ idade1 + " anos ");
        System.out.println("A segunda pessoa se chama "+ nome2 + " e tem "+ idade2 + " anos");
        System.out.println("A média de idade de "+ nome1 + " e "+ nome2 + " é: "+ mediadeidade);
        System.out.println("A soma das idades de "+ nome1 + " e "+ nome2 + " é: "+ somadeidade );

        sc.close();
    }
}
