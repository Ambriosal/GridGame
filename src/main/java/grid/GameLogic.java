package grid;

import java.io.IOException;

import javax.swing.JButton;

public class GameLogic {

    /* FIELDS */

    // private GridState state = new GridState();
    private boolean won = false;
    private int easyWins = 0;
    private int medWins = 0;
    private int hardWins = 0;

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
        // done is truie
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

        int cur = 0;
        // if grid clicked
        if (grid[x][y] == 1) {
            // changes to this image
            cur = 6;

        } else if (grid[x][y] == 2) {
            cur = 7;
            // if the grid is NOT (1-4), change to 7
        } else if (grid[x][y] == 3) {
            cur = 8;
        } else if (grid[x][y] == 4) {
            cur = 9;
        } else if (grid[x][y] == 5) {
            cur = 10;
        } else if (grid[x][y] == 6) {
            cur = 11;
        } else if (grid[x][y] == 7) {
            cur = 12;
        } else {
            grid[x][y] = cur;
        }
        try {
            buttons[x][y].setIcon(Display.createImageIcon("shoe" + cur + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Shit aint working");
        }
    }

}
