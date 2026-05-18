package Aprendizado.BeeCrowd;
import java.util.*;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int veiculo = 12;
        int tempogastoH = sc.nextInt();
        int velocidadeMedia =  sc.nextInt();

        double distancia = tempogastoH * velocidadeMedia;
        double litrosNecessarios = distancia / veiculo;
        System.out.printf("%.3f\n", litrosNecessarios);

        sc.close();
    }
}
