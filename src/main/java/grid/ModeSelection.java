package grid;

public class ModeSelection {

//fields

    private char mode = 'e';
    private Easy easy = new Easy();
    private Med med = new Med();
    private Hard hard = new Hard();



    ModeSelection(){}

    void setMode (char m){
        mode = m;
    }

    char getMode(){
        return mode;
    }

    int[][] changeDifficulty(char mode){

        if (mode == 'e'){
            return easy.getGrid();
        }
        else if (mode == 'm'){
            return med.getGrid();
        }
        else{
            return hard.getGrid();
        }
    }

    
}
