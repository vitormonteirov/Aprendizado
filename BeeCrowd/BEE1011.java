package Aprendizado.BeeCrowd;
import java.util.*;

public class BEE1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        final double PI = 3.14159;
        double esfera = (4/3.0) * PI * (Math.pow(R, 3));
        System.out.printf("VOLUME = %.3f\n", esfera);
    }
}
