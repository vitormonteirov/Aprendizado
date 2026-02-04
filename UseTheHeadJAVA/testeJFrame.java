package Aprendizado.UseTheHeadJAVA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

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
   //Não consegui inserir uma imagem
    public void imagem(Graphics g){
       Image image = new ImageIcon(getClass().getResource("/Aprendizado.png")).getImage();
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        Color startColor = new Color(red,green,blue);

        red = rand.nextInt(255);
        green = rand.nextInt(255);
        blue = rand.nextInt(255);
        Color endColor = new Color(red,green,blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 150, 150);
    }
}
