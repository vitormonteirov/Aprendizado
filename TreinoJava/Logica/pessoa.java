package Aprendizado.TreinoJava.Logica;

// Classe para representar uma pessoa e calcular seu IMC
class Pessoa {
    private String nome;
    private double peso; // em quilogramas (kg)
    private double altura; // em metros (m)

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        // A fórmula do IMC é: peso / (altura * altura)
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    public String getNome() {
        return nome;
    }

    public String interpretarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade grau 1";
        } else if (imc < 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3 (mórbida)";
        }
    }
}




