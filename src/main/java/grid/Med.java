package grid;



public class Med {

    /* FIELDS */

    private int moveCounter = 0;
	private static int level = 0;
	private static int progress = 33;



	// original grid
	int grid[][] = { { 4, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 5, 0 },
			{ 0, 0, 5, 2, 1, 0 },
			{ 0, 2, 0, 1, 0, 0 },
			{ 0, 0, 0, 4, 0, 0 } };
	int ans[][] = { { 4, 9, 9, 9, 9, 9 },
			{ 10, 10, 10, 10, 10, 9 },
			{ 10, 7, 7, 7, 5, 9 },
			{ 10, 7, 5, 2, 1, 9 },
			{ 10, 2, 10, 1, 6, 9 },
			{ 10, 10, 10, 4, 9, 9 } };

	int reset[][] = { { 4, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 5, 0 },
			{ 0, 0, 5, 2, 1, 0 },
			{ 0, 2, 0, 1, 0, 0 },
			{ 0, 0, 0, 4, 0, 0 } };
	// level one of medium
	int lvl1[][] = { { 4, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 5, 0 },
			{ 0, 0, 5, 2, 1, 0 },
			{ 0, 2, 0, 1, 0, 0 },
			{ 0, 0, 0, 4, 0, 0 } };
	int ans1[][] = { { 4, 9, 9, 9, 9, 9 },
			{ 10, 10, 10, 10, 10, 9 },
			{ 10, 7, 7, 7, 5, 9 },
			{ 10, 7, 5, 2, 1, 9 },
			{ 10, 2, 10, 1, 6, 9 },
			{ 10, 10, 10, 4, 9, 9 } };
	// level two of medium
	int lvl2[][] = { { 0, 0, 0, 0, 0, 3 },
			{ 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 2, 0, 0, 0 },
			{ 0, 0, 0, 4, 0, 1 },
			{ 0, 4, 0, 3, 2, 5 },
			{ 0, 0, 0, 5, 0, 0 } };

	int ans2[][] = { { 8, 8, 8, 8, 8, 3 },
			{ 8, 6, 6, 6, 6, 6 },
			{ 8, 1, 2, 7, 7, 6 },
			{ 8, 9, 9, 4, 7, 1 },
			{ 8, 4, 8, 3, 2, 5 },
			{ 8, 8, 8, 5, 10, 10 } };

	// level three of medium
	int lvl3[][] = { { 4, 0, 0, 0, 5, 0 },
			{ 3, 11, 0, 4, 2, 0 },
			{ 0, 1, 0, 11, 0, 0 },
			{ 0, 0, 0, 3, 0, 0 },
			{ 0, 1, 0, 2, 0, 0 },
			{ 0, 0, 0, 5, 0, 0 } };

	int ans3[][] = { { 4, 9, 9, 9, 5, 10 },
			{ 3, 11, 12, 4, 2, 10 },
			{ 8, 1, 12, 11, 7, 10 },
			{ 8, 6, 8, 3, 7, 10 },
			{ 8, 1, 8, 2, 7, 10 },
			{ 8, 8, 8, 5, 10, 10 } };


    Med(){
		//default constructor
    }



	 void setLevel(int lvl){
		level = lvl;
	}
    
	 int getLevel(){
        return level;

    }

	 int[][] getGrid(){

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
