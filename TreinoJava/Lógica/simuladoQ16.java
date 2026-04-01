package Aprendizado.TreinoJava.Lógica;
import java.util.*;

public class simuladoQ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base e a altura do retângulo: ");
        int base = sc.nextInt();
        int altura = sc.nextInt();

        int AreaRetangulo = base *  altura;
        int perimetroRetangulo = 2 * (base + altura);
        double diagonalRetangulo = (Math.sqrt((base * base) + (altura * altura)));

        System.out.println("Area do retangulo: " + AreaRetangulo +
                " Perimetro do retangulo: " + perimetroRetangulo +
                " Diagonal do retangulo: " + diagonalRetangulo);
    }
}
