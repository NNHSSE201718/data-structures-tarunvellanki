import java.util.ArrayList;
import java.util.List;

/**
   This class implements a red-black tree whose
   nodes hold objects that implement the Comparable
   interface.
*/
public class RedBlackTree
{  
   Node root; // Package access, for testing

   static final int BLACK = 1;
   static final int RED = 0;
   private static final int NEGATIVE_RED = -1;
   private static final int DOUBLE_BLACK = 2;

   /**
      Constructs an empty tree.
   */
   public RedBlackTree()
   {  
      
   }
   
   /**
      Inserts a new node into the tree.
      @param obj the object to insert
   */
   public void add(Comparable obj) 
   {  
      
   }

   /**
      Tries to find an object in the tree.
      @param obj the object to find
      @return true if the object is contained in the tree
   */
   public boolean find(Comparable obj)
   {
      
   }
   
   /**
      Tries to remove an object from the tree. Does nothing
      if the object is not contained in the tree.
      @param obj the object to remove
   */
   public void remove(Comparable obj)
   {
      
   }
   
   /**
      Yields the contents of the tree in sorted order
      @return all data items traversed in inorder, with a space after each item
   */
   public String toString()
   {  
      
   }  

   /**
      Yields the contents of the subtree with the given root in sorted order
      @param parent the root of the subtree
      @return all data items traversed in inorder, with a space after each item
   */
   private static String toString(Node parent)
   {  
      
   }

   /**
      A node of a red-black tree stores a data item and references
      of the child nodes to the left and to the right. The color
      is the "cost" of passing the node; 1 for black or 0 for red.
      Temporarily, it may be set to 2 or -1. 
   */
   static class Node
   {  
      
      
      /**
         Constructs a red node with no data.
      */
      public Node()
      {
      }
      
      /**
         Sets the left child and updates its parent reference.
         @param child the new left child
      */
      public void setLeftChild(Node child)
      {
         
      }
      
      /**
         Sets the right child and updates its parent reference.
         @param child the new right child
      */
      public void setRightChild(Node child)
      {
         
      }
      
      /**
         Inserts a new node as a descendant of this node.
         @param newNode the node to insert
      */
      public void addNode(Node newNode)
      {  
         
   }

   /**
      Updates the parent's and replacement node's links when this node is replaced.
      Also updates the root reference if it is replaced.
      @param toBeReplaced the node that is to be replaced
      @param replacement the node that replaces that node
   */
   private void replaceWith(Node toBeReplaced, Node replacement)
   {
      
   }

   /**
      Restores the tree to a red-black tree after a node has been added.
      @param newNode the node that has been added
   */
   private void fixAfterAdd(Node newNode)
   {
      
   }

   /** 	
     Fixes the tree so that it is a red-black tree after a node has been removed.
     @param toBeRemoved the node that is to be removed
   */
   private void fixBeforeRemove(Node toBeRemoved)
   {
      
   }
   
   /**
      Move a charge from two children of a parent
      @param parent a node with two children, or null (in which case nothing is done)
   */
   private void bubbleUp(Node parent)
   {
      
   }

   /**
      Fixes a negative-red or double-red violation introduced by bubbling up.
      @param child the child to check for negative-red or double-red violations
      @return true if the tree was fixed
   */
   private boolean bubbleUpFix(Node child)
   {
      
   }
   
   /**
      Fixes a "double red" violation.
      @param child the child with a red parent
   */
   private void fixDoubleRed(Node child)
   {
      
   }
   
   /**
      Fixes a "negative red" violation.
      @param negRed the negative red node
   */
   private void fixNegativeRed(Node negRed)
   {	
      
   }
}



