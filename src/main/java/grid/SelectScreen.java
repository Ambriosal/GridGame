package grid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class SelectScreen extends BaseScreen{

    private ScreenManager screenManager;
    private GridState gridState = new GridState();

    public SelectScreen(ScreenManager screenManager){
        this.screenManager = screenManager;

        JLabel selectText = new JLabel("Please select a game mode below.");
        JButton easyButton = new JButton("Easy");
        easyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                easySelected();
            }
        });


        JButton medButton = new JButton("Medium");
        JButton hardButton = new JButton("Hard");

        /* 
         If easy is clicked...
         Set the level to 1.
         Pass the info of Easy to Display.displayGrid
        */


        add(selectText);
        add(easyButton);
        add(medButton);
        add(hardButton);
    }


    public void easySelected(){
        gridState.setMode('e');
        gridState.setLevel(1);
        //go to game screen
        // screenManager.showScreen("Game");



    }
    
}
