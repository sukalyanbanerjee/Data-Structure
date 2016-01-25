package datastructure.queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.displayQueue();
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		queue.displayQueue();
		
		queue.insert(60);
		queue.insert(70);
		queue.insert(80);
		queue.insert(90);
		queue.insert(100);
		queue.insert(110);
		queue.displayQueue();
		
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.displayQueue();
		
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		queue.displayQueue();
		
	}

}
