package grid;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends BaseScreen {

    private ScreenManager screenM;
    private GridState gridS;
    private GameLogic game;
    private Display display;
    private JPanel gridPanel;

    public GameScreen(ScreenManager screenManager, GridState gridState){
        screenM = screenManager;
        gridS = gridState;
        this.game = new GameLogic();
        this.display = new Display(game);

        JLabel titleText = new JLabel("This is the game screen.");

        int[][] gridArray;
        int[][] resetGrid;
        resetGrid = GridState.getCurrentGrid();
        gridArray = GridState.getCurrentGrid();
        int l = gridState.getLevel();
        char m = gridState.getMode();
        //Check if grid is null
        if (gridArray == null) {
            throw new IllegalStateException("GridState returned a null grid. " + l + m);
        }

        int size = gridState.gridSize();

        gridPanel = display.displayGrid(gridArray, size, size);


        //Reset button
        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                remove(gridPanel); //Removes old grid
                gridPanel = display.displayGrid(resetGrid, size, size);
                add(gridPanel);
                //Revalidate and repaint container
                revalidate();
                repaint();

            }
        });

        //Back button
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                screenM.showScreen("ModeSelect");
            }
        });

        //Move Counter
        JLabel moveCount = new JLabel();

        add(reset);
        add(back);
        add(titleText);
        add(gridPanel);
    }


    // private void moveCountUpdate (int num){
        
    // }
}
