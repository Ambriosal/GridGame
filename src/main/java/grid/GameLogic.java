package main.java.grid;

public class GameLogic {

    /* FIELDS */

    private ModeSelection mode = new ModeSelection();
    private boolean won = false;


    public GameLogic(){
        //Default constructor
    }

    private char getMode() {
        return mode.getMode();
    }
    

    private boolean getWon(){
        return won;
    }

    private void isWon(boolean w){
        won = w;
    }

    public void win(){ // win method
        int row = 0;
        int col = 0;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j ++){

                // if(mode.changeDifficulty(getMode())[i][j] != 3 )

            }
        }


    }
    
}
