package Aprendizado.TreinoJava.Logica;
import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        while (valor >= 0 && valor <= 20) {
            valor = valor + 1;
            System.out.println(valor);
        }
        input.close();
    }
}
