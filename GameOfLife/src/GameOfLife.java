public class GameOfLife {

    int size;
    int[][] board;
    int[][] preBoard;

    //default constructor
    public GameOfLife(){

   }
    //Constructors


    public GameOfLife(int size) {
        this.size = size;
        this.board = new int[size][size];
    }

    public GameOfLife(int[][] array){
      board = array;
      preBoard = new int[size][size];
      size = board.length;
    }
    //Getters
    public int[][] getBoard(){
        return board;
    }

    public void printArray(){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[j].length; j++){
                if(this.board[i][j] == 1){//alive
                    System.out.println("1");
                }
                else if(this.board[i][j] == 0){
                    System.out.println("0");
                }
            }
        }
    }

    //1 = Alive, 0 = Dead
    public void oneStep(){
        int[][] nextBoard = new int[size][size];
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                int alive = neighbors(i, j);
                if(positionCheck(i, j) == 1){
                    if(alive < 2){
                        preBoard[i][j] = 0;//dead in next board
                    }
                    else if(alive>2 && alive<4){
                        preBoard[i][j] = 1;//alive in next board
                    }
                    else if(alive>= 4){
                        preBoard[i][j] = 0;//overpopulation == dead
                    }
                }
                else{
                    if(alive == 3){
                        preBoard[i][j] = 1;//reproduce in next board

                    }

                }
            }
        }
         this.board = preBoard;//update board
         this.board = nextBoard;
    }

    public int neighbors(int i, int j){
        int counter = 0;
        //Check all neighbors surrounding a living cell and count them

        //row 1
        counter += positionCheck(i-1, j-1);
        counter += positionCheck(i+1, j-1);
        counter += positionCheck(i, j-1);
        //row 2 including counted living cell
        counter += positionCheck(i+1, j);
        counter += positionCheck(i+1, j);
        //row 3
        counter += positionCheck(i-1, j+1);
        counter += positionCheck(i, j+1);
        counter += positionCheck(i+1, j+1);


        return counter;
    }

    public void evolution(int n){
        int evoCount = 0;
        while(n<=evoCount){
            oneStep();
            evoCount++;
        }
    }

    //helper method
    //stackoverflow.com
    public int positionCheck(int i, int j){
        if(i<0 || i>= size){
            return 0; //dead cell
        }
        else if(j<0 || j>=size){
            return 0; //dead cell
        }
        else{
            return board[i][j];
        }
    }
}
