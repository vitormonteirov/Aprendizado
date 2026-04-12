package Aprendizado.TreinoJava.Logica;

public class ExemploRetorno{

    // O "int" antes do nome do método indica que ele OBRIGATORIAMENTE vai devolver um número inteiro
    public int calcularIdadeHumanaGato(int idadeGato) {
        int idadeHumana;

        // Lógica simplificada: 1 ano = 15 anos humanos, 2 anos = 24 anos humanos, etc.
        if (idadeGato == 1) {
            idadeHumana = 15;
        } else if (idadeGato == 2) {
            idadeHumana = 24;
        } else {
            // A partir do 3º ano, cada ano do gato equivale a cerca de 4 anos humanos
            idadeHumana = 24 + ((idadeGato - 2) * 4);
        }

        // A palavra-chave "return" pega o valor da variável e devolve para quem chamou o método
        return idadeHumana;
    }

    public static void main(String[] args) {
        ExemploRetorno exemplo = new ExemploRetorno();
        ExemploRetorno exemplo2 = new ExemploRetorno();

        // COMO O MÉTODO RETORNA UM VALOR, nós podemos guardar o resultado dentro de uma variável!
        int anosHumanos = exemplo.calcularIdadeHumanaGato(4);
        int idadeHumana2 =  exemplo2.calcularIdadeHumanaGato(6);

        // Agora podemos usar essa variável no resto do nosso programa
        System.out.println("Um gato de 4 anos tem aproximadamente " + anosHumanos + " anos humanos!");
        System.out.println("Um gato de 6 anos tem aproximadamente " + idadeHumana2 + " anos humanos!");
    }
}

