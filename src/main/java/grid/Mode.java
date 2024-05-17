package grid;

public abstract class Mode {

    private int level = 0;
    private int moveCounter = 0;
    private int progress = 33;

    void setLevel(int lvl){
        level = lvl;
    }

    int getLevel(){
        return level;
    }
    
    void setProgress(int p){
        progress = p;
    }

    int getProgress(){
        return progress;
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
