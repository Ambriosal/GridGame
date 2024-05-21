package grid;

public class GridState extends Mode {

    private char mode = 'e';
    public static Easy easy = new Easy();
    public static Med med = new Med();
    public static Hard hard = new Hard();
    private static int[][] currentGrid;

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

    int[][] changeGridMode(char modeSelect) {

        if (modeSelect == 'e') {
            return easy.getGrid();
        } else if (modeSelect == 'm') {
            return med.getGrid();
        } else {
            return hard.getGrid();
        }
    }

    int[][] answerGrid() {
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


    //Init grid

    void initGrid(){
        int size = gridSize();
        currentGrid = new int[size][size];
    }

}
