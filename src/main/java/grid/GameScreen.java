package grid;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen extends BaseScreen {

    private ScreenManager screenM;
    private GridState gridS;
    private GameLogic game;
    private Display display;
    // private Easy easy;

    public GameScreen(ScreenManager screenManager, GridState gridState){
        screenM = screenManager;
        gridS = gridState;
        this.display = new Display(game);
        this.game = new GameLogic();

        JLabel titleText = new JLabel("This is the game screen.");

        int[][] gridArray;
        gridArray = GridState.getCurrentGrid();
        int l = gridState.getLevel();
        char m = gridState.getMode();
        //Check if grid is null
        if (gridArray == null) {
            throw new IllegalStateException("GridState returned a null grid. " + l + m);
        }

        int size = gridState.gridSize();

        JButton[][] gridButtons = new JButton[size][size];
        JPanel gridPanel = display.displayGrid(gridArray, size, size, gridButtons);

        // game.move(gridState);



        add(titleText);
        add(gridPanel);
    }
}
