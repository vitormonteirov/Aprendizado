package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um saldo: ");
        double saldo = sc.nextDouble();
        double reajuste = saldo + (saldo * 0.01);

        System.out.println("Saldo atual: " + reajuste);

        sc.close();
    }
}
