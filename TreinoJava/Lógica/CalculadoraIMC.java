package Aprendizado.TreinoJava.Lógica;

import java.util.Scanner;

// Classe principal para executar o programa
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de IMC ---");

        // Solicita os dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso em kg (ex: 75,5): ");
        double peso = scanner.nextFloat();

        System.out.print("Digite sua altura em metros (ex: 1,70): ");
        double altura = scanner.nextFloat();

        // Cria um objeto da classe Pessoa com os dados fornecidos
        Pessoa pessoa = new Pessoa(nome, peso, altura);

        // Calcula e exibe o IMC
        try {
            double imc = pessoa.calcularIMC();
            System.out.printf("\nOlá, %s!\n", pessoa.getNome());
            System.out.printf("Seu IMC é: %.2f\n", imc);
            System.out.printf("Classificação: %s\n", pessoa.interpretarIMC());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
