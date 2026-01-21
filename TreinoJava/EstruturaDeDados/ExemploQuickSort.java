package Aprendizado.TreinoJava.EstruturaDeDados;
import javax.swing.JOptionPane;

public class ExemploQuickSort {
    public static void main(String[] args) {
        int[] v = {9, 3, 13, 1};
        bolhaIterativa.bolhaInterativa(v);   //chamada ao metodo
        mostrar(v);
        int[] vetor = {5, 3, 9, 0, 8};
        bolhaRecursiva.bolhaRecursiva(vetor, vetor.length);  //chamada ao metodo
        mostrar(vetor);
        int num[] = {25, 57, 48, 37, 12, 92, 86, 33};
        quickSort.quickSort (0, num.length - 1, num);  //chamada ao metodo
        mostrar(num);                   // foi necessário o length -1 pq meu array vai de 0 a 7 mas tem 8 elementos
    }
    static void mostrar(int[] v) {
        String vetor = "";
        for(int i = 0; i < v.length; i++) vetor = vetor + v[i] + ", ";
        JOptionPane.showMessageDialog(null, vetor);
    }
}
