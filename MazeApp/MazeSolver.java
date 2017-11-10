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
    Maze maze;

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
        String path="";
        if(this.isEmpty())
        {
            return "No such path exists";
        }
        else{
            while(!this.isSolved())
            {
                path+= this.step().getRow()+","+ this.step().getCol();
            }
            return path;
        }
    }

    public Square step()
    {
        if(this.isEmpty())
        {
            return null;
        }
        else
        {
            if(this.next()== maze.getFinish())
            {
                this.next().finalPath();

            }
            else
            {
                ArrayList<Square> array= maze.getNeighbors(this.next());
                for(int count=0; count<array.size();count++)
                {
                    if(array.get(count).toString().equals("_"))
                    {
                        this.add(array.get(count));
                        array.get(count).onWorkList();
                    }
                }
            }
        }
        return this.next();

    }

    public void solve()
    {
        while(!this.isSolved())
        {
            this.step();
        }
    }
}
