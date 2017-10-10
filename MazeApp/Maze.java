import java.util.Scanner;
/**
 * Write a description of class Maze here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maze
{
    // instance variables - replace the example below with your own
    private Square[][] maze;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean loadMaze(String fname)
    {
        Scanner l= new Scanner(fname);
        int numRows=0;
        int numCols=0;
        this.maze = new Square[numRows][numCols];

        for (int row=0; row < numRows; row++) {
            for (int col=0; col < numCols; col++) {
                maze[row][col] = null;
            }
        }
        return true;
    }
}
