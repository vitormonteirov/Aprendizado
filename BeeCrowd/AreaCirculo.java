package Aprendizado.BeeCrowd;
import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            double raio;
            double n = 3.14159;
            raio = sc.nextDouble();
            double area = n * (Math.pow(raio, 2));
            System.out.println("A= " + area);
        }
    }

