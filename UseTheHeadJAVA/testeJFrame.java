package Aprendizado.UseTheHeadJAVA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testeJFrame implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        testeJFrame gui = new testeJFrame();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Eu te amo Sabrina");

        button.addActionListener(this);
        this.button = button;

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
         button.setText("Não me cutuque");
    }
    public void imagem(Graphics g){
       Image image = new ImageIcon(getClass().getResource("/Aprendizado.png")).getImage();
    }
}
