
public class QueueTest {
	public static void main(String[] args)
	{
		Queue test = new Queue();
		//test isEmpty()
		System.out.println("isEmpty() test:");
		System.out.println(test.isEmpty());
		test.enqueue(new String("no longer empty"));
		System.out.println(test.isEmpty());
		//test dequeueAll()
		System.out.println("dequeueAll() test");
		test.enqueue(new String("another string"));
		test.dequeueAll();
		System.out.println(test.isEmpty());
		//testing enqueue and dequeue
		System.out.println("enqueue() and dequeue() test");
		test.enqueue(new String("first test"));
		test.enqueue(new String("second test"));
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.isEmpty());
		//peek test
		System.out.println("peek() test:");
		for(int i = 0; i < 6; i++)
		{
			test.enqueue(new String("item: " + i));
		}
		for(int i = 0; i < 6; i++)
		{
			System.out.println(test.peek());
			test.dequeue();
		}
		
	}
}

