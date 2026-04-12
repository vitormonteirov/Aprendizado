package Aprendizado.TreinoJava.Logica;

public class dadosPessoa {

	public static void main (String[] args) {
	
	
		 int idade = 23;
		 double salario = 4800.5;
		 double altura = 1.65;
		 char genero = 'F';
		 String nome = "Sabrina Tenorio";

		
		 System.out.println("IDADE = " + idade);
		 System.out.println("SALARIO = " + String.format("%.2f", salario));
		 System.out.println("ALTURA = " + String.format("%.2f", altura));
		 System.out.println("GENERO = " + genero);
         System.out.println("NOME= " + nome);
	}

}
