package Aprendizado.TreinoJava.Logica;

import java.util.Scanner;

public class problema_menorDeTres {

    public static void main(String[] args) {
        Scanner leitorDeIdade = new Scanner(System.in);

        int age1, age2, age3;

        System.out.print("Digite 3 idades: ");
        age1 = leitorDeIdade.nextInt();
        age2 = leitorDeIdade.nextInt();
        age3 = leitorDeIdade.nextInt();

        if (age1 < age2 && age1 < age3){
            System.out.println("A menor idade é: " + age1);
        }
        else if (age2 < age3) {
            System.out.println("A menor idade é " + age2);
        }
        else {
            System.out.println("A menor idade é " + age3);
        }



    }
}
