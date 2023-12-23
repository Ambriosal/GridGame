package main.java;

public class GameLogic {

    /* FIELDS */

    private char mode = 'e';
    private boolean won = false;


    public GameLogic(){
        //Default constructor
    }

    private char getMode() {
        return mode;
    }
    
    private void setMode (char diff){
        mode = diff;
    }

    private boolean getWon(){
        return won;
    }

    private void isWon(boolean w){
        won = w;
    }

    public void win(){ // win method

        if (mode == 'e'){ //easy mode is selected
            
        }

    }
    
}
