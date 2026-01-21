package Aprendizado.TreinoJava.Lógica;
import java.util.Scanner;

public class problema_TentativaCrescente {
    public static void main(String[] args) {
        Scanner leitorDeNumero = new Scanner(System.in);

        int x, y;

        System.out.print("Digite dois numeros: ");
        x = leitorDeNumero.nextInt();
        y = leitorDeNumero.nextInt();

        while (leitorDeNumero.hasNextLine())  {
            String crescente = (x > y) ? "Os números estão em ordem decrescente" : "Os números estão em ordem crescente";
            System.out.println(crescente);

                System.out.print("Digite dois numeros: ");
                x = leitorDeNumero.nextInt();
                y = leitorDeNumero.nextInt();



        }
    }
}