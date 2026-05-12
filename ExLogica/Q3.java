package Aprendizado.ExLogica;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o valor da prestação: ");
        double prestacao = sc.nextDouble();

        if (prestacao >= (salario * 0.2)) {
            System.out.println("O empréstimo não pode ser concedido.");
        }
        else {
            System.out.println("Emprestimo concedido!");
        }
        sc.close();
    }
}
