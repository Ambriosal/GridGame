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

        //Easy button
        JButton easyButton = new JButton("Easy");
        easyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                easySelected();
            }
        });

        //Med button
        JButton medButton = new JButton("Medium");
        medButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                medSelected();
            }
        });

        //Hard button
        JButton hardButton = new JButton("Hard");
        hardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                hardSelected();
            }
        });

        //Adding components
        add(selectText);
        add(easyButton);
        add(medButton);
        add(hardButton);
    }


    public void easySelected(){
        gridState.setMode('e');
        gridState.setLevel(1);
        GridState.setCurrentGrid(GridState.easy.getGrid());
        //go to game screen
        createAndShowGameScreen();

    }

    public void medSelected(){
        gridState.setMode('m');
        gridState.setLevel(4);
        GridState.setCurrentGrid(GridState.med.getGrid());
        //got to gameScreen
        createAndShowGameScreen();

    }

    public void hardSelected(){
        gridState.setMode('h');
        gridState.setLevel(7);
        GridState.setCurrentGrid(GridState.hard.getGrid());
        //got to gameScreen
        createAndShowGameScreen();

    }

    private void createAndShowGameScreen(){
        GameScreen gameScreen = new GameScreen(screenManager, gridState);
        screenManager.addScreen("Game", gameScreen);
        screenManager.showScreen("Game");
    }

}
