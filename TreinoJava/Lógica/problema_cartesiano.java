package Aprendizado.TreinoJava.Lógica;
import java.util.Scanner;

public class problema_cartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;

        System.out.print("Escolha dois número inteiros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante!");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante!");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante!");
            } else {
                System.out.println("Quarto Quadrante!");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        System.out.println("Voce digitou dois zeros, o programa encerrará agora!");
            sc.close();
    }
}
