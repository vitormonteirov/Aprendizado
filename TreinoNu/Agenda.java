package Aprendizado.TreinoNu;
import java.util.*;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CLIENTE> clientes = new ArrayList<>();

            while (true) {
                System.out.println("Digite o nome do cliente( ou 'sair' para encerrar): ");
                String nome = sc.nextLine();

                if (nome.equals("sair")) {
                    break;
                }
                System.out.println("Digite o serviço que o cliente deseja: ");
                String servico = sc.nextLine();

                System.out.println("Digite o valor que o cliente vai pagar: ");
                int valor = sc.nextInt();

                CLIENTE cliente = new CLIENTE(nome, servico, valor);

                clientes.add(cliente);

            }
            sc.close();

            int resultado = 0;
            for (CLIENTE cliente : clientes) {
            resultado += cliente.getVALOR();
            }
                System.out.println(resultado);
        }
}
