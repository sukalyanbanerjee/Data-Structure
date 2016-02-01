package datastructure.queue;

public class DQueueTest {

	public static void main(String[] args) {
		
		DQueue dQueue = new DQueue(10);
		dQueue.removeLeft();
		dQueue.removeRight();
		dQueue.insertLeft(10);
		dQueue.insertLeft(20);
		dQueue.displayDQueue();
		dQueue.insertRight(30);
		dQueue.insertRight(40);
		dQueue.displayDQueue();
		
		dQueue.removeRight();
		dQueue.removeLeft();
		dQueue.displayDQueue();
		
		dQueue.insertLeft(50);
		dQueue.insertLeft(60);
		dQueue.displayDQueue();
		dQueue.insertRight(70);
		dQueue.insertRight(80);
		dQueue.insertRight(90);
		dQueue.insertRight(100);
		dQueue.displayDQueue();
		dQueue.insertRight(110);
		dQueue.insertLeft(120);
		dQueue.displayDQueue();
		dQueue.removeRight();
		dQueue.removeLeft();
		dQueue.displayDQueue();
	}

}
