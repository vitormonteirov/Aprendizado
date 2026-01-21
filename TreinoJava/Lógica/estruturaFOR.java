package Aprendizado.TreinoJava.Lógica;

import java.util.Scanner;
class estruturaFOR {     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos números serão digitados?: ");
        int n = sc.nextInt();
        
        if (n <= 10) {
            for (int i = 0; i < n; i++) {
                System.out.println("Contagem:" + (i + 1));
            }
        }
        else{
             System.out.println("Não será possível contar até " + n + " números.");
        }
                sc.close(); }
    }

