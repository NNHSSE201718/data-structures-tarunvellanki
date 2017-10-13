import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
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
        File file;
        Scanner l;
        try
        {
            file= new File(fname);
            l= new Scanner(file);
            int numRows=l.nextInt();
            int numCols=l.nextInt();
            this.maze = new Square[numRows][numCols];

            for (int row=0; row < numRows; row++) {
                for (int col=0; col < numCols; col++) {
                    maze[row][col] = null;
                }
            }
            return true;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            return false;
        }
    }
    public ArrayList<Square> getNeighbors(Square sq)
    {
        int row= sq.getRow();
        int col= sq.getCol();
        ArrayList <Square> neigh= new ArrayList<>();
        if (maze[row-1][col]!=null)
        {
            neigh.add(maze[row-1][col]);
        }
        if (maze[row][col+1]!=null)
        {
            neigh.add(maze[row][col+1]);
        }
        if (maze[row+1][col]!=null)
        {
            neigh.add(maze[row+1][col]);
        }
        if (maze[row][col-1]!=null)
        {
            neigh.add(maze[row][col-1]);
        }
        return neigh;
    }
    public Square getStart()
    {
        Square squa= new Square(0,0,0);
        for(Square[] x:maze)
        {
            for(Square y:x)
            {
                if(y.getType()==2)
                {
                    squa=y;
                }
            }
        }
        return squa;
    }
    public Square getFinish()
    {
        Square squa= new Square(0,0,0);
        for(Square[] x:maze)
        {
            for(Square y:x)
            {
                if(y.getType()==3)
                {
                    squa=y;
                }
            }
        }
        return squa;
    }
}
