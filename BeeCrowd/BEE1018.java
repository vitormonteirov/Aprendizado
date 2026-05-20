package Aprendizado.BeeCrowd;
import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        System.out.println(valor);

        int restante = valor;

        int notas100 = restante / 100;
        restante %= 100;

        int notas50 = restante / 50;
        restante %= 50;

        int notas20 = restante / 20;
        restante %= 20;

        int notas10 = restante / 10;
        restante %= 10;

        int notas5 = restante / 5;
        restante %= 5;

        int notas2 = restante / 2;
        restante %= 2;

        int notas1 = restante;

        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}