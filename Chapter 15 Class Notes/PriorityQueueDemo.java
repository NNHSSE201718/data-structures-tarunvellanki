import java.util.PriorityQueue;

/**
   This program demonstrates a priority queue of work orders. The
   most important work orders are removed first.
*/
public class PriorityQueueDemo
{
   public static void main(String[] args)
   {
      //create PriorityQueue of WorkOrd er
      PriorityQueue<WorkOrder> q= new PriorityQueue<>();
      //add several WorkOrder
      q.add(new WorkOrder(3, "shampoo carpet"));
      q.add(new WorkOrder(2, "water plants"));
      q.add(new WorkOrder(10, "remove pencil sharpener shavings"));
      q.add(new WorkOrder(1, "Take Chapter 15 practice quiz"));

      //display WrokOrder and you "finish"/remove from the list
      while (q.size() > 0)
      {
          System.out.println(q.remove());
      }
   }
}
