package grid;

public class GridState extends Mode {

    static char mode = 'e';
    static Easy easy = new Easy();
    static Med med = new Med();
    static Hard hard = new Hard();
    static int[][] currentGrid;

    GridState() {
        initGrid();
    }

    void setMode(char m) {
        mode = m;
        initGrid();
    }

    char getMode() {
        return mode;
    }

    static void setCurrentGrid(int[][] current) {
        currentGrid = current;
    }

    static int[][] getCurrentGrid() {
        return currentGrid;
    }

    int[][] getLevelGrid() {
        int[][] lvlGrid;
        if (getLevel() <= 3) {
            lvlGrid = easy.getGrid();
        } else if (getLevel()  >= 4 && getLevel() <= 6) {
           lvlGrid = med.getGrid();
        } else {
            lvlGrid = hard.getGrid();
        }
        return lvlGrid;

    }

    int[][] changeGridMode(char modeSelect) {

        if (modeSelect == 'e') {
            return easy.getGrid();
        } else if (modeSelect == 'm') {
            return med.getGrid();
        } else {
            return hard.getGrid();
        }
    }

    static int[][] answerGrid() {
        if (mode == 'e') {
            return easy.getAnswerGrid();
        } else if (mode == 'm') {
            return med.getAnswerGrid();
        } else {
            return hard.getAnswerGrid();
        }
    }

    int gridSize() {

        int size = 0;

        if (mode == 'e') {
            size = 5;
        }
        if (mode == 'm') {
            size = 6;
        }
        if (mode == 'h') {
            size = 8;
        }
        return size;
    }

    // Init grid

    void initGrid() {
        int size = gridSize();
        currentGrid = new int[size][size];
    }

}