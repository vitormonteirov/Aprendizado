package Aprendizado.TreinoJava.EstruturaDeDados;

public class bolhaIterativa {
    static int[] bolhaInterativa(int[] vetor) {
        int i,j, aux;
        for (j = vetor.length -1; j>= 1; j--) {   //Faz contagem a partir do ultimo numero do array e reduz 1 a cada loop
            for (i = 0; i < j; i++) { // Inicia no indice 0 e aumenta a cada loop
                if (vetor[i] > vetor[i+1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                } // Condicional para realizar a troca de posição dos numeros no array
            }
        }
    return vetor;
    }
}

//BubbleSort
