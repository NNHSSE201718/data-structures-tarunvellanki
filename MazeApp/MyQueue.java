import java.util.*;
/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyQueue<T> implements QueueADT<T>
{
    // instance variables - replace the example below with your own
    private LinkedList data; 

    /**
     * Constructor for objects of class Queue
     */
    public MyQueue()
    {
        data= new LinkedList<T>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void clear ()
    {
        data.clear();
    }

    public boolean isEmpty()
    {
        if(data.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int size()
    {
        return data.size();
    }

    public T front() throws NoSuchElementException
    {
        if(data.size()>0)
        {
            return (T)(data.element());
        }
        else
        {
            throw new NoSuchElementException();
        }
    }

    public T dequeue() throws NoSuchElementException
    {
        if(data.size()>0)
        {

            return (T)(data.remove(data.size()-1));
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
        public void enqueue(T t)
    {
        data.add(t);
    }
}
