package Aprendizado.TreinoJava.Logica;
import javax.swing.JOptionPane;

public class fixação1 {
    public static void main(String[] args) {
        int valor1, valor2, valor3, valor4;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor:"));
        valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor:"));

        int soma = valor1 + valor2 + valor3 + valor4;

        JOptionPane.showMessageDialog(null, "A soma dos 4 valores é: " + soma);
    }
}
