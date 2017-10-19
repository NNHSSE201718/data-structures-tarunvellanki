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
    public T pop()
    {
        if(storage.size()>0)
        {
            
        storage.remove(0);
    }
    else
    {
        return new NoSuchElementException();
    }
    }
}
