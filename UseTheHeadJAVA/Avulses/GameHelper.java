package Aprendizado.UseTheHeadJAVA.Avulses;
import java.util.Scanner;

public class GameHelper {
    Scanner sc = new Scanner(System.in);

    public int getUserInput(String prompt) {
        System.out.print(prompt + " : ");
        return sc.nextInt();


    }

}
