package grid;

import javax.swing.JButton;
import javax.swing.JLabel;

public class GameScreen extends BaseScreen {

    private ScreenManager screenManager;
    private Display display;
    private Easy easy;

    public GameScreen(ScreenManager screenManager){
        this.screenManager = screenManager;

        JLabel titleText = new JLabel("This is the game screen.");


        int[][] gridArray;
        // gridArray = easy.getGrid();

        JButton[][] grid;
        // grid = display.displayGrid(gridArray, 3, 3);


        add(titleText);
        // add(grid);
    }



    
}
