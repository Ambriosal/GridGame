package main.java;

public class ModeSelection {

//fields

    private char mode = 'e';
    private Easy easy = new Easy();
    private Med med = new Med();
    private Hard hard = new Hard();

    void setMode (char m){

        mode = m;
    }

    char getMode(){
        return mode;
    }

    void changeDifficulty(char mode){

        if (mode == 'e'){
            easy.getGrid();
        }
        else if (mode == 'm'){
            med.getGrid();
        }
        else{
            hard.getGrid();
        }
    }

    
}
