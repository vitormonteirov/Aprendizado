package Aprendizado.BeeCrowd;
import java.util.*;

public class BEE1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeEmDias = sc.nextInt();
        int ano;
        int mes;
        int dia;

        ano = idadeEmDias / 365;
        mes = (idadeEmDias % 365) / 30;
        dia = (idadeEmDias % 365) % 30;

            System.out.println(ano + " ano(s)");
            System.out.println(mes + " mes(es)");
            System.out.println(dia + " dia(s)");
            sc.close();
        }
    }
