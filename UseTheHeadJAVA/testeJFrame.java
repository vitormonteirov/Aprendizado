package Aprendizado.UseTheHeadJAVA;
import javax.swing.*;

import static java.awt.Color.pink;

public class testeJFrame {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        JButton button = new JButton("Eu te amo Sabrina");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}
