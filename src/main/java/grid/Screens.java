package grid;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;


public class Screens extends JFrame {

    private IntroScreen intro = new IntroScreen();



    void display(){


        JFrame frame = new JFrame("Title: Grid Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);


        cardPanel.add(new JLabel("card 1 content"), "card 1");

        intro.intro();
    }
    
}
