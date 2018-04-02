//Cristian Benitez
//OOP
//4/1/2018
//color is in purple I think it is a sweet color!

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Color;

class Oval extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(new Color(128,0,128));
        g.fillOval(0,0,panelWidth,panelHeight);

        System.out.println("paintComponent");
    }
}

public class OvalDraw{
    public static void main(String[] args ) {
        System.out.println("OvalDraw Starting");


        JFrame myFrame = new JFrame();
        myFrame.setTitle("OvalDraw");
        myFrame.setBounds(300,200,400,900);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oval myOval = new Oval();
        Container contentPane = myFrame.getContentPane();
        contentPane.add(myOval);
    } 
}