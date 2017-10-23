import java.util.*;
/**
 * Write a description of class MazeSolver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class MazeSolver
{
    // instance variables - replace the example below with your own
    private Maze maze;

    /**
     * Constructor for objects of class MazeSolver
     */
    public MazeSolver()
    {
        maze= new Maze();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    abstract void makeEmpty();
    abstract boolean isEmpty();
    abstract void add(Square sq);
    abstract Square next();
    public MazeSolver(Maze z)
    {
        maze= z;
    }
    public boolean isSolved()
    {
        if(this.isEmpty())
        {
            return true;
        }
        if(this.next()== maze.getFinish())
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public String getPath()
    {
        if(!this.isSolved())
        {
            return "Maze is not solved";
        }
        else
        {
            if(this.next()== maze.getFinish())
            {
                return this.next().toString();
            }
            else
            {
                ArrayList<Square> array= maze.getNeighbors(this.next());
                for(int count=0; count<array.size();count++)
                {
                    if(array.get(count).toString().equals("_"))
                    {
                        ;
                    }
                }
            }
        }
    }
    public Square step()
    {
        if(this.isEmpty())
        {
            
        }
        else
        {
            
        }
    }
    public void solve()
    {
        if(!this.isSolved())
        {
            this.step();
        }
    }
}
