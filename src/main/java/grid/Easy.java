package grid;

public class Easy extends Mode implements Grid {

    Easy() {
        // default constructor
    }

    public int[][] getGrid() { // returns grid for specified levl

        if (getLevel() == 1) {
            return new int[][]{{0, 0, 0, 1, 4},
                {0, 0, 3, 4, 0},
                {1, 0, 0, 0, 0},
                {2, 3, 0, 5, 2},
                {0, 0, 0, 0, 5}
            };

        } else if (getLevel() == 2) {
            return new int[][]{{0, 2, 1, 4, 0},
                {0, 0, 0, 5, 0},
                {0, 0, 5, 0, 0},
                {2, 0, 0, 3, 0},
                {1, 0, 3, 4, 0}
                };

        } else if (getLevel() == 3){
            return new int[][]{{0, 0, 1, 0, 4},
                {0, 0, 0, 0, 2},
                {1, 0, 5, 0, 0},
                {5, 0, 4, 0, 0},
                {0, 0, 0, 0, 2} 
            };
        } else {
            return null;
        }
    }

    public int[][] getAnswerGrid() { // returns grid for specified levl

        if (getLevel() == 1) {
            return new int[][]{{6, 6, 6, 1, 4},
                {6, 8, 3, 4, 9},
                {1, 8, 7, 7, 7},
                {2, 3, 7, 5, 2},
                {7, 7, 7, 10, 5}
            };

        } else if (getLevel() == 2) {
            return new int[][]{{7, 2, 1, 4, 9},
                {7, 6, 6, 5, 9},
                {7, 6, 5, 10, 9},
                {2, 6, 8, 3, 9},
                {1, 6, 3, 4, 9}
            };

        } else if(getLevel() == 3) {
            return new int[][]{{6, 6, 1, 9, 4},
                {6, 10, 10, 9, 2},
                {1, 10, 5, 9, 7},
                {5, 10, 4, 9, 7},
                {10, 10, 9, 9, 2} 
            };
        } else {
            return null;
        }
    }

}
