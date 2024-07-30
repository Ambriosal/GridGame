package grid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

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

        //Progress
        JProgressBar progress = new JProgressBar(0,0,100);
        progressUpdate(progress);


        //Back button
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                screenManager.showScreen("Intro");
            }
        });

        //Adding components
        add(selectText);
        add(easyButton);
        add(medButton);
        add(hardButton);
        add(progress);
        add(back);
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
        //go to gameScreen
        createAndShowGameScreen();

    }

    public void hardSelected(){
        gridState.setMode('h');
        gridState.setLevel(7);
        GridState.setCurrentGrid(GridState.hard.getGrid());
        //go to gameScreen
        createAndShowGameScreen();
    }

    private void createAndShowGameScreen(){
        GameScreen gameScreen = new GameScreen(screenManager, gridState);
        screenManager.addScreen("Game", gameScreen);
        screenManager.showScreen("Game");
    }

    
    private void progressUpdate(JProgressBar progress){
        gridState.setProgress(11*gridState.getLevel());
        progress.setValue(gridState.getProgress());
        progress.setStringPainted(true);
    }

}
