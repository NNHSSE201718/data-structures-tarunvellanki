import java.util.LinkedList;
import java.util.ListIterator;

/**
This program demonstrates the LinkedList class.
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff= new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");
        ListIterator<String> iterator= staff.listIterator();

        // | in the comments indicates the iterator position
        // |DHRT
        // D|HRT
        // DH|RT

        // Add more elements after second element

        // DHJ|RT
        // DHJN|RT

        // DHJNR|T

        // Remove last traversed element

        // DHJN|T

        // Print all elements
        iterator.next();
        String name= iterator.next();
        System.out.println(name);
        System.out.println("Expected: Harry");
        iterator.add("Juliet");
        iterator.add("Nina");
        iterator.next();
        iterator.remove();
        System.out.println(staff);
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
        iterator.previous();
        iterator.set("Albert");
        iterator= staff.listIterator();
        while(iterator.hasNext())
        {
            String n= iterator.next();
            if(n.equals("Juliet"))
            {
                iterator.remove();
            }
        }

        for(String n:staff)
        {
            System.out.println( n+" ");    

        }
        System.out.println();
        System.out.println("Expected: ");

    }
}
