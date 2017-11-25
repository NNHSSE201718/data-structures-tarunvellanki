
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    // instance variables - replace the example below with your own
    private int row;
    private int col;
    private int type;//0=space, 1=wall, 2=start, 3=exit 
    private int explored;
    private Square previous;

    /**
     * Constructor for objects of class Square
     */
    public Square(int type, int row, int col)
    {
        this.row= row;
        this.col= col;
        this.type= type;
        this.explored=0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
    public int getType()
    {
        return type;
    }
    public String toString()
    {
        if(type==0)
        {
            if(explored==1)
            {
                return "o";
            }
            if(explored==2)
            {
                return".";
            }
            if(explored==3)
            {
                return "x";
            }
            else
            {
                return "_";
            }
            
        }
        if(type==1)
        {
            return "#";
        }
        if(type==2)
        {
            return "S";
        }
        else
        {
            return "F";
        }
    }
    public void onWorkList()
    {
        explored=1;
    }
    public void reset()
    {
        explored=0;
    }
    public void explored()
    {
        explored=2;
    }
    public void finalPath()
    {
        explored=3;
    }
}
