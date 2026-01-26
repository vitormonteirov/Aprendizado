package Aprendizado.TreinoJava.Lógica;
import javax.swing.JOptionPane;

public class calculoDeSalario {
    public static void main(String[] args) {

        double salarioAtual;
        double salarioFinal;
        String usuario;

        try {
            usuario = JOptionPane.showInputDialog("Digite o nome do usuario: ");

            if (usuario == null || usuario.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome de usuario nao pode estar vazio");
            }
            String salarioInput = JOptionPane.showInputDialog("Digite o salario do usuario: ");
            if (salarioInput == null) {
                throw new IllegalArgumentException("Operação cancelada");
            }
            salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario atual: "));
            if (salarioAtual <= 0) {
                throw new IllegalArgumentException("Salario deve ser maior que zero");
            }

            salarioFinal = reajuste(salarioAtual);

            JOptionPane.showMessageDialog(null,
                    "O nome do usuario é: " + usuario +
                            "\nSeu salario atual é: R$ " + String.format("%.2f", salarioAtual) +
                            "\nSeu novo salario será: R$ " + String.format("%.2f", salarioFinal));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro: Valor Inválido, digite apenas números.",
                    "Erro de Entrada",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro: " + e.getMessage(),
                    "Erro de Validação",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro inesperado: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
        static double reajuste( double valor){
            valor = valor + valor * 8.75 / 100;
            return valor;
        }
    }

