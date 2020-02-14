public class GameOfLifeTorus extends GameOfLife {
    //default constructor
    public GameOfLifeTorus(){

    }
    //Constructors


    public GameOfLifeTorus(int size) {
        this.size = size;
        this.board = new int[size][size];
    }

    public GameOfLifeTorus(int[][] array){
        board = array;
        preBoard = new int[size][size];
        size = board.length;
    }
    @Override
    public int neighbors(int i, int j){
        int counter = 0;
        //Check all neighbors surrounding a living cell and count them

        //row 1
        counter += positionCheck(i-1%size, j-1%size);
        counter += positionCheck(i+1%size, j-1%size);
        counter += positionCheck(i%size, j-1%size);
        //row 2 including counted living cell
        counter += positionCheck(i+1%size, j%size);
        counter += positionCheck(i+1%size, j%size);
        //row 3
        counter += positionCheck(i-1%size, j+1%size);
        counter += positionCheck(i%size, j+1%size);
        counter += positionCheck(i+1%size, j+1%size);


        return counter;
    }
}
