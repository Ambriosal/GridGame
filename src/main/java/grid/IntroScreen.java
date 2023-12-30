package grid;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class IntroScreen {


    void intro(){

        JPanel introPanel = new JPanel();

        JLabel introTitle = new JLabel("Intro Panel: Welcome to Grid Game");

        JButton next = new JButton("Next!");

        introPanel.add(introTitle);
        introPanel.add(next);

    }
    
}
