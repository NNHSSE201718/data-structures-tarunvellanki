package LastToFirst;

/**
   Add a method lastToFirst to this implementation of a queue.
   The method moves the element at the tail of the queue
   to the head.
*/
public class LinkedListQueue
{
   private Node head;
   private Node tail;

   /**
      Constructs an empty queue.
   */
   public LinkedListQueue()
   {
      head = null;
      tail = null;
   }

   /**
      Moves the tail of the queue to the head.
   */
   public void lastToFirst()
   {
       Node tmp1 = head;
       Node tmp2 = null;
       while(tmp1.next != null){
           tmp2 = tmp1;
           tmp1 = tmp1.next;
        }
        if(tmp2 == null){
            // Only 1 element, so do nothing
            return;
        }
       Node hold= head;
       head= tail;
       head.next = hold;
       tmp2.next = null;
   }

   /**
      Checks whether this queue is empty.
      @return true if this queue is empty
   */
   public boolean empty()
   {
      return head == null;
   }

   /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
   */
   public void add(Object newElement)
   {
      if (tail == null)  // head must also be null
      {
         Node newNode = new Node();
         newNode.data = newElement;
         newNode.next = null;
         tail = newNode;
         head = newNode;
      }
      else
      {
         Node newNode = new Node();
         newNode.data = newElement;
         newNode.next = null;
         tail.next = newNode;
         tail = newNode;
      }
   }

   /**
      Removes an element from the head of this queue.
      @return the removed element
   */
   public Object remove()
   {
      if (head == null)
         return null;
      Object element = head.data;
      head = head.next;
      if (head == null)  // queue is empty
      {
         tail = null;
      }
      return element;
   }

   class Node
   {
      public Object data;
      public Node next;
   }
}
