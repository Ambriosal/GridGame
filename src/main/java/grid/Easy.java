package grid;

public class Easy extends Mode {

    /* FIELDS */

    private int moveCounter = 0;
    private int level = 0;
    private int progress = 33;


    Easy() {
        // default constructor
    }

    // void setLevel(int lvl) {
    //     level = lvl;
    // }

    // int getLevel() {
    //     return level;

    // }

    int[][] getGrid() { // returns grid for specified levl

        if (level == 1) {
            return new int[][]{{0, 0, 0, 1, 4},
                {0, 0, 3, 4, 0},
                {1, 0, 0, 0, 0},
                {2, 3, 0, 5, 2},
                {0, 0, 0, 0, 5}
            };

        } else if (level == 2) {
            return new int[][]{{0, 2, 1, 4, 0},
                {0, 0, 0, 5, 0},
                {0, 0, 5, 0, 0},
                {2, 0, 0, 3, 0},
                {1, 0, 3, 4, 0}
                };

        } else {
            return new int[][]{{0, 0, 1, 0, 4},
                {0, 0, 0, 0, 2},
                {1, 0, 5, 0, 0},
                {5, 0, 4, 0, 0},
                {0, 0, 0, 0, 2} 
            };
        }
    }

    // void setProgress(int p) {
    //     progress = p;
    // }

    // int getProgress() {
    //     return progress;
    // }

    int[][] getAnswerGrid() { // returns grid for specified levl

        if (level == 1) {
            return new int[][]{{6, 6, 6, 1, 4},
                {6, 8, 3, 4, 9},
                {1, 8, 7, 7, 7},
                {2, 3, 7, 5, 2},
                {7, 7, 7, 10, 5}
            };

        } else if (level == 2) {
            return new int[][]{{7, 2, 1, 4, 9},
                {7, 6, 6, 5, 9},
                {7, 6, 5, 10, 9},
                {2, 6, 8, 3, 9},
                {1, 6, 3, 4, 9}
            };

        } else {
            return new int[][]{{6, 6, 1, 9, 4},
                {6, 10, 10, 9, 2},
                {1, 10, 5, 9, 7},
                {5, 10, 4, 9, 7},
                {10, 10, 9, 9, 2} 
            };
        }
    }

    // int getMoveCount() {
    //     return moveCounter;
    // }

    // void updateMove(int m) {
    //     moveCounter = m;
    // }

    // void updateMove() {
    //     moveCounter++;
    // }

}
