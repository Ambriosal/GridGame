package main.java.grid;


public class Easy {

    /* FIELDS */

    private int moveCounter = 0;
    private int level = 0;
    private int progress = 33; 
    

    // Grids

    int grid[][] = { { 0, 0, 0, 1, 4 },
            { 0, 0, 3, 4, 0 },
            { 1, 0, 0, 0, 0 },
            { 2, 3, 0, 5, 2 },
            { 0, 0, 0, 0, 5 } };
    int ans[][] = { { 6, 6, 6, 1, 4 },
            { 6, 8, 3, 4, 9 },
            { 1, 8, 7, 7, 7 },
            { 2, 3, 7, 5, 2 },
            { 7, 7, 7, 10, 5 } };
    int reset[][] = { { 0, 0, 0, 1, 4 },
            { 0, 0, 3, 4, 0 },
            { 1, 0, 0, 0, 0 },
            { 2, 3, 0, 5, 2 },
            { 0, 0, 0, 0, 5 } };
    // level one
    int ans1[][] = { { 6, 6, 6, 1, 4 },
            { 6, 8, 3, 4, 9 },
            { 1, 8, 7, 7, 7 },
            { 2, 3, 7, 5, 2 },
            { 7, 7, 7, 10, 5 } };
    int lvl1[][] = { { 0, 0, 0, 1, 4 },
            { 0, 0, 3, 4, 0 },
            { 1, 0, 0, 0, 0 },
            { 2, 3, 0, 5, 2 },
            { 0, 0, 0, 0, 5 } };
    // level two
    int lvl2[][] = { { 0, 2, 1, 4, 0 },
            { 0, 0, 0, 5, 0 },
            { 0, 0, 5, 0, 0 },
            { 2, 0, 0, 3, 0 },
            { 1, 0, 3, 4, 0 } };

    int ans2[][] = { { 7, 2, 1, 4, 9 },
            { 7, 6, 6, 5, 9 },
            { 7, 6, 5, 10, 9 },
            { 2, 6, 8, 3, 9 },
            { 1, 6, 3, 4, 9 } };
    // level three
    int lvl3[][] = { { 0, 0, 1, 0, 4 },
            { 0, 0, 0, 0, 2 },
            { 1, 0, 5, 0, 0 },
            { 5, 0, 4, 0, 0 },
            { 0, 0, 0, 0, 2 } };

    int ans3[][] = { { 6, 6, 1, 9, 4 },
            { 6, 10, 10, 9, 2 },
            { 1, 10, 5, 9, 7 },
            { 5, 10, 4, 9, 7 },
            { 10, 10, 9, 9, 2 } };

            ///methods


    Easy(){
        //default constructor
    }

     void setLevel(int lvl){
        level = lvl;
    }

     int getLevel(){
        return level;

    }

     int[][] getGrid(){ //returns grid for specified levl

        if(level == 1){
            return lvl1;
        }
        else if (level == 2){
            return lvl2;
        }
        else{
            return lvl3;
        }

    }

    void setGrid(int [][] grLvl){
        grid = grLvl;

    }

     void setProgress(int p){
        progress = p;
    }

     int getProgress(){
        return progress;
    }

     int[][] getResetGrid(){
        return reset;
    }

     void setResetGrid(int [][] newR){
        reset = newR;

    }

     int[][] getAnswerGrid(){
        return ans;
    }

     void setAnswerGrid(int [][] newA){
        ans = newA;
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



