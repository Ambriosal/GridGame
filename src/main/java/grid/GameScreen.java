package grid;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends BaseScreen {

    private ScreenManager screenM;
    private GridState gridS;
    private GameLogic game;
    private Display display;
    private JPanel gridPanel;
    // private JLabel winLabel;

    public GameScreen(ScreenManager screenManager, GridState gridState) {
        screenM = screenManager;
        gridS = gridState;
        this.game = new GameLogic();
        this.display = new Display(game, gridS);

        JLabel titleText = new JLabel("This is the game screen.");

        int[][] gridArray;
        gridArray = GridState.getCurrentGrid();
        int l = gridState.getLevel();
        char m = gridState.getMode();
        // Check if grid is null
        if (gridArray == null) {
            throw new IllegalStateException("GridState returned a null grid. " + l + m);
        }
        // JLabel infoText = new JLabel();
        int size = gridState.gridSize();
        JLabel infoText = new JLabel("");

        gridPanel = display.displayGrid(gridArray, size, size, infoText);

        // Reset button
        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(gridPanel); // Removes old grid
                gridPanel = display.displayGrid(gridS.getLevelGrid(), size, size, infoText);// resets
                add(gridPanel);
                // Revalidate and repaint container
                revalidate();
                repaint();
            }
        });

        // Back button
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                screenM.showScreen("ModeSelect");
            }
        });

        JButton next = new JButton("Next");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[][] newLvlGrid = new int[size][size];
                GridState.setCurrentGrid(gridS.copyGrid(newLvlGrid, gridS.getLevelGrid()));
                remove(gridPanel); // removes old grid
                gridPanel = display.displayGrid(gridS.getLevelGrid(), size, size, infoText);
                System.out.println("Easy wins: " + game.getEasyWins());
                infoText.setText("");
                add(gridPanel);
                revalidate();
                repaint();
            }
        });


        add(reset);
        add(next);
        add(back);
        add(infoText);
        add(titleText);
        add(gridPanel);
        add(infoText);
    }

}
