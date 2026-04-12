package Aprendizado.TreinoJava.Logica;

public class laçoDeRepetição {
    public static void main(String[] args) {

        /*
        * Laços irão repetir infinitamente até serem paradas
        *  Laços = while && for
        * Pode ser usado o break; para que seja interrompida o loop while
         */
        //while (condição) {Se condição for verdadeira o que estiver aqui dentro acontece}

        int clone = 0;
        int maxDeClones = 20;

        while (clone < maxDeClones) {
            clone++;
            System.out.println("Foi feito o clone " + clone);
        }

        for (int i = 0; i <= maxDeClones; i++) {
            System.out.println("Está sendo feito o clone " + i);

        }
    }
}
