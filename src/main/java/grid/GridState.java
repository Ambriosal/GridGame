package grid;

public class GridState extends Mode{

    private char mode = 'e';
    private Easy easy = new Easy();
    private Med med = new Med();
    private Hard hard = new Hard();
    private int[][] currentGrid;


    GridState(){}

    void setMode(char m){
        mode = m;
    }

    char getMode(){
        return mode;
    }

    void setCurrentGrid(int[][] current){
        currentGrid = current;
    }

    int[][] getCurrentGrid(){
        return currentGrid;
    }

    int[][] changeGridMode(char modeSelect){

        if (modeSelect == 'e'){
            return easy.getGrid();
        } else if (modeSelect == 'm'){
            return med.getGrid();
        }else{
            return hard.getGrid();
        }
    }

    int[][] AnswerGrid(){
        if (mode == 'e'){
            return easy.getAnswerGrid();
        } else if (mode == 'm'){
            return med.getAnswerGrid();
        }else{
            return hard.getAnswerGrid();
        }
    }

    int gridSize(){

        int size = 0;
        
        if (mode == 'e'){
            size = 5;
        } if(mode == 'm'){
            size = 6;
        } if (mode == 'h'){
            size = 8;
        }
        return size;
    }
    


    
}
