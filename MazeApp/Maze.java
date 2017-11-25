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
                    maze[row][col] = new Square(l.nextInt(), row, col);
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
        for(int x=0; x<maze.length;x++)
        {
            for(int y=0;y<maze[0].length;y++)
            {
                if(maze[x][y].getType()==2)
                {
                    return maze[x][y];
                }
                else
                {
                    return null;
                }
            }
        }
        return null;
    }

    public Square getFinish()
    {
        for(int x=0; x<maze.length;x++)
        {
            for(int y=0;y<maze[0].length;y++)
            {
                if(maze[x][y].getType()==3)
                {
                    return maze[x][y];
                }
                else
                {
                    return null;
                }
            }
        }
        return null;
    }

    public void reset()
    {
        for(int x=0; x<maze.length;x++)
        {
            for (int y=0; y<maze[x].length;y++)
            {
                maze[x][y].reset();
            }
        }

    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for( int x=0; x < maze.length; x++ )
        {
            for (int y=0; y<maze[x].length;y++)
            {
                sb.append(maze[x][y].toString()+" ");
            }
            sb.append("\n");
        }
        String s = new String(sb);
        System.out.println(s);
        return s;
    }
}
