package Aprendizado.TreinoJava.EstruturaDeDados;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FindFile {
    private  static RandomAccessFile arquivo;
    public static void main(String[] args) {
        try {
            int codCli;
            String nome, tel, email;
            String caminho = EscolherArquivo.caminho();
            arquivo = new RandomAccessFile(new File(caminho), "rw");
            long a = arquivo.length();
            arquivo.seek(a);
            codCli = (int)(a / 100 + 1);
            gravar(codCli);
            nome = JOptionPane.showInputDialog("Digite o nome");
            gravar(nome.toUpperCase(), 20);
            tel = JOptionPane.showInputDialog("Digite o telefone");
            gravar(tel.toUpperCase(), 8);
            email = JOptionPane.showInputDialog("Digite o email");
            gravar(email.toUpperCase(), 20);
            arquivo.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Erro no arquivo");
        }
    }
    public static void gravar (String dado, int tamanho)
        throws IOException{
        StringBuffer buffer = new StringBuffer(dado);
        buffer.setLength(tamanho);
        arquivo.writeChars(buffer.toString());
    }
    public static void gravar (int codCli) throws IOException{
        arquivo.writeInt(codCli);
    }
}
