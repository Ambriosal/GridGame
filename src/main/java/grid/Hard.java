package grid;


public class Hard {

    private int moveCounter = 0;
    private static int level = 0;
    private static int progress = 33;

    Hard(){ //def constructor

    }

    void setLevel(int lvl){
        level = lvl;
    }

    int getLevel(){
        return level;

    }    

    int[][] getGrid() { // returns grid for specified levl

        if (level == 1) {
            return new int[][]{{1, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 11, 0, 5, 0, 0},
                {0, 0, 0, 0, 0, 0, 2, 3},
                {0, 0, 0, 0, 5, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 1, 0},
                {11, 0, 0, 0, 4, 0, 4, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
            };

        } else if (level == 2) {
            return new int[][]{{0, 0, 0, 2, 0, 3, 4, 5},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 11},
                {0, 0, 4, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 11},
                {0, 0, 0, 0, 0, 0, 0, 3}
            };

        } else {
            return new int[][]{{2, 0, 0, 0, 0, 0, 5, 2},
                {0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 0, 0, 3, 0, 0, 0},
                {0, 0, 11, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 4, 0, 0, 0},
                {0, 0, 11, 0, 0, 0, 0, 0},
                {0, 0, 3, 1, 0, 0, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 0} 
            };
        }
    }

    void setProgress(int p){
        progress = p;
    }

    int getProgress(){
        return progress;
    }

    int[][] getAnswerGrid() { // returns grid for specified levl

        if (level == 1) {
            return new int[][]{{1, 7, 7, 7, 7, 7, 7, 3},
                {6, 7, 10, 10, 10, 10, 7, 8},
                {6, 7, 10, 11, 12, 5, 7, 8},
                {6, 7, 10, 10, 12, 12, 2, 3},
                {6, 7, 7, 10, 5, 12, 12, 12},
                {6, 6, 2, 6, 6, 6, 1, 12},
                {11, 6, 6, 6, 4, 9, 4, 12},
                {12, 12, 12, 12, 12, 12, 12, 12}
            };

        } else if (level == 2) {
            return new int[][]{{7, 7, 7, 2, 8, 3, 4, 5},
                {7, 8, 8, 8, 8, 9, 9, 10},
                {7, 8, 9, 9, 9, 9, 5, 10},
                {7, 8, 9, 8, 8, 8, 8, 11},
                {7, 8, 4, 8, 6, 1, 8, 12},
                {7, 8, 8, 8, 6, 2, 8, 12},
                {7, 1, 6, 6, 6, 7, 8, 11},
                {7, 7, 7, 7, 7, 7, 8, 3}
            };

        } else {
            return new int[][]{{2, 7, 7, 7, 7, 7, 5, 2},
                {9, 9, 9, 9, 4, 7, 10, 7},
                {9, 8, 8, 8, 3, 7, 10, 7},
                {9, 8, 11, 6, 1, 7, 10, 7},
                {9, 8, 12, 6, 4, 7, 10, 7},
                {9, 8, 11, 6, 9, 7, 10, 7},
                {9, 8, 3, 1, 9, 7, 5, 7},
                {9, 9, 9, 9, 9, 7, 7, 7} 
            };
        }
    }


    int getMoveCount(){
        return moveCounter;
    }

    void updateMove(int m){
        moveCounter = m;
    }

    void updateMove(){
        moveCounter++;
    }
}
