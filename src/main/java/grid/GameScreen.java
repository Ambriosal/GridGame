package grid;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen extends BaseScreen {

    private ScreenManager screenManager;
    private GridState gridState;
    private Display display;
    // private Easy easy;

    public GameScreen(ScreenManager screenManager, GridState gridState){
        this.screenManager = screenManager;
        this.gridState = gridState;
        this.display = new Display();
        // this.easy = new Easy();

        JLabel titleText = new JLabel("This is the game screen.");



        int[][] gridArray;
        gridArray = gridState.getCurrentGrid();

        int size = gridState.gridSize();

        JButton[][] gridButtons = new JButton[size][size];
        JPanel gridPanel = display.displayGrid(gridArray, size, size, gridButtons);


        add(titleText);
        add(gridPanel);
    }



    
}
