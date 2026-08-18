package Aprendizado.UseTheHeadJAVA.Avulses;
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

        drawPanel drawPanel = new drawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER,  drawPanel );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.repaint();
    }
    //Pode ser substituido por uma expressao lambda
        public void actionPerformed(ActionEvent e) {
         button.setText("Raiga");
             }
   //Não consegui inserir uma imagem
    public void imagem(Graphics g){
       Image image = new ImageIcon(getClass().getResource("/Aprendizado.png")).getImage();
    }
    }

