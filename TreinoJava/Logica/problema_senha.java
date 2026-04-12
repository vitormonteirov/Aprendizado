package Aprendizado.TreinoJava.Logica;
import java.util.Scanner;

public class problema_senha {
    public static void main(String[] args) {
        Scanner leitorDeSenha = new Scanner(System.in);

        String usuario;
        int senha;

        System.out.print("Digite seu Usuario: ");
        usuario = leitorDeSenha.nextLine();
        System.out.print("Digite sua senha numerica: ");
        senha = leitorDeSenha.nextInt();

        while (senha != 2002) {
            System.out.print("Senha Invalida! Tente novamente: ");
            senha = leitorDeSenha.nextInt();

        }
        System.out.println("Acesso Permitido");

        leitorDeSenha.close();
        // teste
    }
}
