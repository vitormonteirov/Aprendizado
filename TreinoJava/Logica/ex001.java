package Aprendizado.TreinoJava.Logica;
import java.util.*;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.print("Digite um número Maior que 1 e menor que 1000: ");
        int x = sc.nextInt();

        for (int i = 1; i >= 1 && i <= x ; i++) {
            if (i % 2 != 0) {
                nums.add(i);
            }
        }
        System.out.println("Os números impares entre 1 e " + x + " são: " + nums);
    }
}
