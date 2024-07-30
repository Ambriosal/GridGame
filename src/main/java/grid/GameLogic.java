package grid;

import java.io.IOException;
import javax.swing.JButton;
import java.util.HashMap;
import java.util.Arrays;

public class GameLogic {

    /* FIELDS */

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

    int getEasyWins() {
        return easyWins;
    }

    private void setEasyWins(int num) {
        easyWins = num;
    }

    int getMedWins() {
        return medWins;
    }

    private void setMedWins(int num) {
        medWins = num;
    }

    int getHardWins() {
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

    boolean levelWin(int[][] grid, GridState state) {
        boolean done = false;

        if (Arrays.deepEquals(grid, GridState.answerGrid())) {
            done = true;
        }
        System.out.println();

        return done;
    }

    void updateWins(int[][] grid, GridState state, boolean won) {

        if (won) {
            int win = 0;

            switch (state.getMode()) {
                case 'h':
                    win = getHardWins() + 1;
                    setHardWins(win);
                    break;
                case 'm':
                    win = getMedWins() + 1;
                    setMedWins(win);
                    break;
                case 'e':
                    win = getEasyWins() + 1;
                    setEasyWins(win);
                    break;
                default:
                    throw new IllegalStateException("Unknown mode: " + state.getMode());
            }

            System.out.println("Level " + win + " won");
            if (win == 3) {
                System.out.println("Mode completed.");
            } else {
                // Update grid to next level
                win = state.getLevel() + 1;
                state.setLevel(win);
                // Update current grid state
                state.getLevelGrid();
            }
        }
    }

    int[][] move(int[][] grid, int x, int y, JButton[][] buttons) {
        // calls hashmap
        setShoe();

        // get currentgrid state
        int[][] current = GridState.getCurrentGrid();

        if (colour == -1) {
            if (grid[x][y] != 0) {
                colour = shoeColour.get(grid[x][y]);
            }
        } else {
            // IF SHOE IS CLICKED
            if ((grid[x][y] >= 1 && grid[x][y] <= 5) || grid[x][y] == 11) {
                // acquire colour
                colour = shoeColour.get(grid[x][y]);
            }
            // IF A MUTUABLE TILE IS CLICKED
            else if (grid[x][y] == 0 || (grid[x][y] >= 6 && grid[x][y] <= 10) || grid[x][y] == 12) {
                try {
                    // UPDATE TILE COLOUR
                    buttons[x][y].setIcon(Display.createImageIcon("shoe" + colour + ".png"));
                    // update array
                    current[x][y] = colour;

                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Shit ain't working.");
                }
            }
        }
        GridState.setCurrentGrid(current);

        return current;
    }

}