
/**
 * Write a description of class MazeSolverQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeSolverQueue extends MazeSolver
{
    // instance variables - replace the example below with your own
    private MyQueue<Square> queue;

    /**
     * Constructor for objects of class MazeSolverQueue
     */
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
        queue= new MyQueue<Square>();
        queue.enqueue(maze.getStart());
    }

    public void add(Square sq)
    {
        queue.enqueue(sq);
    }
    public void makeEmpty()
    {
        queue.clear();
    }
    public Square next()
    {
        return queue.front();
    }
    public boolean isEmpty()
    {
        if(queue.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
