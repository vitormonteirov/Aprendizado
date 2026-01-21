package Aprendizado.TreinoJava.Lógica;
import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
    Scanner scmissao = new Scanner(System.in);
        /*
        * Ternarios: São manerias de reduzir o código e tornar mais limpo
        * ex: variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
         */

        int numeroDeMissoes;

        System.out.print("Digite quantas missões seu ninja realizou: ");
        numeroDeMissoes = scmissao.nextInt();

        String expDoNinja = (numeroDeMissoes > 16) ? "Ninja experiente" : "Ninja Inexperiente";
        System.out.println(expDoNinja);
    }
}
