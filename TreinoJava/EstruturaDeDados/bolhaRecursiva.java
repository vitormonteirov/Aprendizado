package Aprendizado.TreinoJava.EstruturaDeDados;

public class bolhaRecursiva {
    static int[] bolhaRecursiva(int[] vetor, int n){
        while (n >= 1){
            for(int i = 0; i < n - 1; i++){
                if(vetor[i] > vetor[i+1]){
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                }
            }
            return bolhaRecursiva(vetor, n-1);
        }
        return vetor;
    }
}
