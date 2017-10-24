
/**
 * Write a description of class MazeSolverStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeSolverStack extends MazeSolver
{
    // instance variables - replace the example below with your own
    private MyStack<Square> steck;

    /**
     * Constructor for objects of class MazeSolverStack
     */
    public MazeSolverStack(Maze maze)
    {
        super(maze);
        steck= new MyStack<Square>();
        steck.push(maze.getStart());
    }
    
    public void add(Square sq)
    {
        steck.push(sq);
    }
    
    public void makeEmpty()
    {
        while(!steck.isEmpty())
        {
            steck.pop();
        }
    }
    
    public Square next()
    {
        return steck.top();
    }
    public boolean isEmpty()
    {
        if(steck.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
