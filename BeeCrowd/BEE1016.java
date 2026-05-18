package Aprendizado.BeeCrowd;
import java.util.*;

public class BEE1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int kmPercorrido = sc.nextInt();
        int minutosKm = kmPercorrido * 2;

        System.out.println(minutosKm + " minutos");
        sc.close();
    }
}
