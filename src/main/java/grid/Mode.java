package grid;

public abstract class Mode {

    //Fields
    private static int level = 0;
    private int moveCounter = 0;
    private static int progress = 11;
    private int[][] currentGrid;
    private int size;

    Mode(){
        level = 0;
    }

    void setLevel(int lvl){
        level = lvl;
    }

    int getLevel(){
        return level;
    }

    void setSize(int s){
        size = s;
    }

    int getSize(){
        return size;
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

    void initGrid(){
        currentGrid = new int[size][size];
    }

}
