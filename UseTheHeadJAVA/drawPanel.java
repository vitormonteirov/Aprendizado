package Aprendizado.UseTheHeadJAVA;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class drawPanel extends JPanel
{
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
