//-----------------------------------------------------------------------------
// IntegerQueue.java
// Array based implementation of IntegerQueue ADT (with array doubling)
//-----------------------------------------------------------------------------

public class Queue implements QueueInterface{

	 private class Node{
	      Object item;
	      Node next;
	      Node(Object item){
	         this.item = item;
	         this.next = null;
	      }
	   }

	
   private int numItems;      // number of items in this IntegerQueue
   private Node head;
   private Node tail;


   // IntegerQueue()
   // default constructor for the IntegerQueue class
   public Queue(){
      head = null;
      tail = null;
      numItems = 0;
   }

   // isEmpty()
   // pre: none
   // post: returns true if this IntgerQueue is empty, false otherwise
   public boolean isEmpty(){
      return(numItems == 0);
   }
   
   public int length() {
	   return numItems;
   }

   // enqueue()
   // adds x to back of this IntegerQueue
   // pre: none
   // post: !isEmpty()
   public void enqueue(Object O){
       Node N = new Node(O);
       if(numItems == 0)
       {
    	   head = N;
    	   tail = head;
       }
       else {
    	   tail.next = N;
    	   tail = tail.next;
       }
       numItems++;
   }

   // dequeue()
   // deletes and returns item from front of this IntegerQueue
   // pre: !isEmpty()
   // post: this IntegerQueue will have one fewer element
   public Object dequeue() throws QueueEmptyException{
      if( numItems==0 ){
         throw new QueueEmptyException("cannot dequeue() empty queue");
      }
      else
      {
    	  Node N = head;
    	  head = head.next;
    	  numItems--;
    	  return N.item;
    	  
      }
   }

   // peek()
   // pre: !isEmpty()
   // post: returns item at front of Queue
   public Object peek() throws QueueEmptyException{
      if( numItems==0 ){
         throw new QueueEmptyException("cannot peek() empty queue");
      }
      return head.item;
   }

   // dequeueAll()
   // sets this IntegerQueue to the empty state
   // pre: !isEmpty()
   // post: isEmpty()
   public void dequeueAll() throws QueueEmptyException{
      if( numItems==0 ){
         throw new QueueEmptyException("cannot dequeueAll() empty queue");
      }
      else
      {
    	  head = null;
      }
      numItems = 0;
   }

   // toString()
   // overrides Object's toString() method
   public String toString(){
	   if (numItems == 0) {
			return "";
		} else {
			StringBuffer sb = new StringBuffer();
			Node N = head;
			while(N != null) {
				sb.append(N.item.toString() + " ");
				N = N.next;
			}
			return new String(sb);
		}

   }

   
}
