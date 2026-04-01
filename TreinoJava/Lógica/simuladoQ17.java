package Aprendizado.TreinoJava.Lógica;
import java.util.*;

public class simuladoQ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite a Largura e o comprimento do terreno: ");
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        System.out.println("Agora Digite o valor do metro quadrado: ");
        double metroQuadrado = sc.nextDouble();

        double areaDoTerreno = largura * comprimento;
        double valorDoTerreno = metroQuadrado * areaDoTerreno;

        System.out.printf("O terreno tem: %.2f metros quadrados%n", areaDoTerreno);
        System.out.printf("O valor do terreno é: %.2f%n", valorDoTerreno);
    }
}
