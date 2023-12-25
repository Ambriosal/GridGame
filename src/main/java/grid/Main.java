package main.java.grid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame {

    public static void main(String[] args){


        JFrame frame = new JFrame ("Simple");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create JLabel with text

        JLabel label = new JLabel ("Hello, Java JFrame!");

        frame.getContentPane().add(label);

        //
        frame.setSize(300, 200);

        frame.setVisible(true);
    }

    
}
