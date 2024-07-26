package grid;

import java.io.IOException;
import javax.swing.JButton;
import java.util.HashMap;

public class GameLogic {

    /* FIELDS */

    // private GridState state = new GridState();
    private boolean won = false;
    private int easyWins = 0;
    private int medWins = 0;
    private int hardWins = 0;
    private int colour = -1;

    // hash map
    private HashMap<Integer, Integer> shoeColour = new HashMap<>();

    HashMap<Integer, Integer> setShoe() {

        shoeColour.put(1, 6);
        shoeColour.put(2, 7);
        shoeColour.put(3, 8);
        shoeColour.put(4, 9);
        shoeColour.put(5, 10);
        shoeColour.put(11, 12);

        return shoeColour;
    }
    

    public GameLogic() {
        // Default constructor
    }

    private int getEasyWins() {
        return easyWins;
    }

    private void setEasyWins(int num) {
        easyWins = num;
    }

    private int getMedWins() {
        return medWins;
    }

    private void setMedWins(int num) {
        medWins = num;
    }

    private int getHardWins() {
        return hardWins;
    }

    private void setHardWins(int num) {
        hardWins = num;
    }

    private boolean getWon() {
        return won;
    }

    private void isWon(boolean w) {
        won = w;
    }

    boolean levelWin(GridState state) {
        int size = state.gridSize();
        boolean done = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (GridState.getCurrentGrid()[i][j] != GridState.answerGrid()[i][j]) {
                    System.out.println("Cell not completed.");
                    done = false;
                    return done;
                }
            }
        }
        // done is true
        return done;
    }

    void updateWins(GridState state) {
        boolean levelCompleted = levelWin(state);

        if (levelCompleted) {
            int win = 0;

            if (state.getMode() == 'h') {
                win = getHardWins() + 1;
                setHardWins(win);
            } else if (state.getMode() == 'm') {
                win = getMedWins() + 1;
                setMedWins(win);
            } else {
                win = getEasyWins() + 1;
                setEasyWins(win);
            }

            if (win == 3) {
                System.out.println("Mode completed.");
                // Additional logic for mode win, if needed
            }
        }
    }

    void move(int[][] grid, int x, int y, JButton[][] buttons) {

        // int colour = -1;
        setShoe();

        if (colour == -1) {
            System.err.println("Colour was -ve");
            if (grid[x][y] != 0) {
                colour = shoeColour.get(grid[x][y]);
            }

        } else {

            //IF SHOE IS CLICKED
            if((grid[x][y] >= 1 && grid[x][y] <=5) || grid[x][y] == 11){
                //acquire colour
                colour = shoeColour.get(grid[x][y]);
            }
            // IF A MUTUABLE TILE IS CLICKED
            else if (grid[x][y] == 0 || (grid[x][y] >= 6 && grid[x][y] <= 10) || grid[x][y] == 12 ) {
  
                try {
                    //UPDATE TILE COLOUR
                    buttons[x][y].setIcon(Display.createImageIcon("shoe" + colour + ".png"));
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Shit ain't working.");
                }
            }

        }
    }

    void resetColour() {
        colour = -1;
    }

}