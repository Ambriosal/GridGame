package main.java.grid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame
            JFrame frame = new JFrame("JFrame Title: Grid Game"); //Creates a window 
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit prog when window closed

            // Create a JPanel with CardLayout
            CardLayout cardLayout = new CardLayout();
            JPanel cardPanel = new JPanel(cardLayout); // a panel that holds all the screens (with cardLay)


            //1st screen
            // Add a JLabel to the cardPanel with a unique name "card1"
            cardPanel.add(new JLabel("Card 1 content"), "card1");

            // Create a JLabel with text
            JLabel label = new JLabel("Welcome to Grid Game");

            //buttons
            JButton easy = new JButton("Easy Mode");
            easy.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    label.setText("Easy mode here");
                    cardLayout.show(cardPanel, "easyScreen");
                }
            });

            JButton med = new JButton ("Medium Mode");
            med.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    cardLayout.show(cardPanel, "medScreen");
                }
            });

            JButton hard = new JButton ("Hard Mode");
            hard.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    cardLayout.show(cardPanel, "hardScreen");
                }
            });



            // Create a new JPanel to hold the label and add it to the cardPanel
            JPanel labelPanel = new JPanel();
            labelPanel.add(label);

            labelPanel.add(easy);
            labelPanel.add(med);
            labelPanel.add(hard);
            cardPanel.add(labelPanel, "mainLabel"); 
            ///
            
            //
            JLabel pee = new JLabel ("Easy mode here!");            
            JPanel easyPanel = new JPanel();
            easyPanel.add(pee);
            cardPanel.add(easyPanel, "easyScreen");

            //
            JLabel peep = new JLabel ("Medium mode here!");            
            JPanel medPanel = new JPanel();
            medPanel.add(peep);
            cardPanel.add(medPanel, "medScreen");
            //            
            JPanel hardPanel = new JPanel();
            JLabel poop = new JLabel ("Hard mode is here!");
            hardPanel.add(poop);
            cardPanel.add(hardPanel, "hardScreen");

            ///

            // Add the cardPanel to the content pane of the frame
            frame.getContentPane().add(cardPanel);

            // Set the initial card to be visible
            cardLayout.show(cardPanel, "mainLabel");

            // Set the size of the JFrame
            frame.setSize(200, 200);

            // Set the JFrame to be visible
            frame.setVisible(true);
        });
    }

    
}
