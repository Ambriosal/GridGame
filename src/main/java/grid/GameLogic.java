package grid;

public class GameLogic {

    /* FIELDS */

    private GridState state = new GridState();
    private boolean won = false;



    public GameLogic(){
        //Default constructor
    }

    private boolean getWon(){
        return won;
    }

    private void isWon(boolean w){
        won = w;
    }

    void win(){ // win method
        int size = state.gridSize();

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(state.getCurrentGrid() == state.AnswerGrid()){
                    System.out.println(" Grid completed.");
                }
            }
        }
    }

    void move(){
        
    }
    
}
