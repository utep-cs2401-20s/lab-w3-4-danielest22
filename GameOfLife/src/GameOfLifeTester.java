
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GameOfLifeTester {
    GameOfLife sol = new GameOfLife();
    int[][] board1 ={{0,0,0,0,0,},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0,},{0,0,0,0,0}};
    int[][] board2 ={{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
    int[][] board3 ={{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0},{0,0,0,1,1,0},{0,0,0,0,0,0}};
    @Test
    public void evolution() {
        GameOfLife sol = new GameOfLife(board1);
        sol.evolution(1);
        assertArrayEquals(board1,sol.getBoard());
    }

    @Test
    public void evolution1() {
        GameOfLife sol = new GameOfLife(board2);
        sol.evolution(3);
        assertArrayEquals(board2,sol.getBoard());

    }
    @Test
    public void evolution2() {
        GameOfLife sol = new GameOfLife(board3);
        sol.evolution(10);
        assertArrayEquals(board3, sol.getBoard());

    }
    @Test
    public void evolution3() {
        GameOfLife sol = new GameOfLife(board1);
        sol.evolution(0);
        assertArrayEquals(board1, sol.getBoard());


    }
    @Test
    public void evolution4() {
        GameOfLife sol = new GameOfLife(board3);
        sol.evolution(30);
        assertArrayEquals(board3, sol.getBoard());
    }
    @Test
    public void oneStep() {
        GameOfLife sol = new GameOfLife(board3);
        sol.oneStep();
        assertArrayEquals(board3, sol.getBoard());

    }
    @Test
    public void oneStep1() {
        GameOfLife sol = new GameOfLife(6);
        sol.oneStep();
    }
    @Test
    public void oneStep2() {
        GameOfLife sol = new GameOfLife(board2);
        sol.oneStep();
        assertArrayEquals(board2, sol.getBoard());
    }
    @Test
    public void oneStep3() {
        GameOfLife sol = new GameOfLife(8);
        sol.oneStep();
    }
    @Test
    public void oneStep4() {
        GameOfLife sol = new GameOfLife(board1);
        sol.oneStep();
        assertArrayEquals(sol.getBoard(),board1);
    }
    @Test
    public void neighbors() {
        GameOfLife sol = new GameOfLife(board1);
        int exN = 1;
        assertEquals(exN,sol.neighbors(1,1));
    }
    @Test
    public void neighbors1() {
        GameOfLife sol = new GameOfLife(board1);
        int exN = 1;
        assertEquals(exN,sol.neighbors(1,1));
    }
    @Test
    public void neighbors2() {
        GameOfLife sol = new GameOfLife(board1);
        int exN = 1;
        assertEquals(exN,sol.neighbors(1,1));
    }
    @Test
    public void neighbors3() {
        GameOfLife sol = new GameOfLife(board1);
        int exN = 2;
        assertEquals(exN,sol.neighbors(4,1));
    }
    @Test
    public void neighbors4() {
        GameOfLife sol = new GameOfLife(board1);
        int exN = 1;
        assertEquals(exN,sol.neighbors(3,3));
    }
    @Test
    public void neighbors5() {
        GameOfLife sol = new GameOfLife(board1);
        int exN = 0;
        assertEquals(exN,sol.neighbors(1,1));
    }

    //Tester for torus version
    @Test
    public void evolutionT() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        sol.evolution(1);
        assertArrayEquals(board1,sol.getBoard());
    }

    @Test
    public void evolution1T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board2);
        sol.evolution(3);
        assertArrayEquals(board2,sol.getBoard());

    }
    @Test
    public void evolution2T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board3);
        sol.evolution(10);
        assertArrayEquals(board3, sol.getBoard());

    }
    @Test
    public void evolution3T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        sol.evolution(0);
        assertArrayEquals(board1, sol.getBoard());


    }
    @Test
    public void evolution4T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board3);
        sol.evolution(30);
        assertArrayEquals(board3, sol.getBoard());
    }
    @Test
    public void oneStepT() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board3);
        sol.oneStep();
        assertArrayEquals(board3, sol.getBoard());

    }
    @Test
    public void oneStep1T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(6);
        sol.oneStep();
    }
    @Test
    public void oneStep2T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board2);
        sol.oneStep();
        assertArrayEquals(board2, sol.getBoard());
    }
    @Test
    public void oneStep3T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(8);
        sol.oneStep();
    }
    @Test
    public void oneStep4T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        sol.oneStep();
        assertArrayEquals(sol.getBoard(),board1);
    }
    @Test
    public void neighborsT() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        int exN = 1;
        assertEquals(exN,sol.neighbors(1,1));
    }
    @Test
    public void neighbors1T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        int exN = 1;
        assertEquals(exN,sol.neighbors(1,1));
    }
    @Test
    public void neighbors2T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        int exN = 1;
        assertEquals(exN,sol.neighbors(1,1));
    }
    @Test
    public void neighbors3T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        int exN = 2;
        assertEquals(exN,sol.neighbors(4,1));
    }
    @Test
    public void neighbors4T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        int exN = 1;
        assertEquals(exN,sol.neighbors(3,3));
    }
    @Test
    public void neighbors5T() {
        GameOfLifeTorus sol = new GameOfLifeTorus(board1);
        int exN = 0;
        assertEquals(exN,sol.neighbors(1,1));
    }
}
