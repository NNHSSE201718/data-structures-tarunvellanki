
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
    private int type;//1=space, 2=wall, 3=start, 4=exit

    /**
     * Constructor for objects of class Square
     */
    public Square(int row, int col, int type)
    {
        this.row= row;
        this.col= col;
        this.type= type;
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
            return " ";
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
            return "E";
        }
    }
}
