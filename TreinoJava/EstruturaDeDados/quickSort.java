package Aprendizado.TreinoJava.EstruturaDeDados;

public class quickSort {
    static void quickSort(int primeiro, int ultimo, int vetor[]){
        int x;
        if (primeiro<ultimo){
            x = particao(primeiro, ultimo, vetor);
            quickSort (primeiro, x - 1, vetor);
            quickSort (x + 1, ultimo, vetor);
        }
        // A função quickSort faz uma chamada recursiva, passando como valor inicial a posição seguinte ao pivô

    }
    static int particao(int primeiro, int ultimo, int vetor[]){
        int j = ultimo;
        int aux, pivo;
        pivo = vetor[primeiro];
        for(int i = ultimo; i >= primeiro; i--){
            if (vetor[i] >= pivo){
                aux = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = aux;
                j--;
            }
        }
        return j + 1;
    }
}
