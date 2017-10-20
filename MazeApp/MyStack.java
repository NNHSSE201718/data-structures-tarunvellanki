import java.util.*;
/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStack<T> implements StackADT<T>
{
    // instance variables - replace the example below with your own
    private ArrayList storage;

    /**
     * Constructor for objects of class MyStack
     */
    public MyStack()
    {
        storage= new ArrayList<T>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void push(T t)
    {
        storage.add(t);
    }

    public T pop() throws NoSuchElementException
    {
        if(storage.size()>0)
        {

            return (T)(storage.remove(storage.size()-1));
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
    public T top() throws NoSuchElementException
    {
        if(storage.size()>0)
        {
            return (T)(storage.get(0));
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
    public void clear()
    {
        storage.clear();
    }
    public boolean isEmpty()
    {
        if(storage.size()>0)
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
        return storage.size();
    }
}
