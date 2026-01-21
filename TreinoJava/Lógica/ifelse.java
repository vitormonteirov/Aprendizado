package Aprendizado.TreinoJava.Lógica;

import java.util.Scanner;
public class ifelse {
    // Este programa verifica se um número é par ou ímpar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
    if (numero % 2 == 0) {
        System.out.println("O número " + numero + " é par.");
    } 
    else {
        System.out.println("O número " + numero + " é ímpar."); 
    }
    sc.close();
}
    
}

