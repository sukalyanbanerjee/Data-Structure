package datastructure.queue;

public class Queue {
	
	private int maxSize;
	private int[] ary;
	private int front;
	private int rear;
	private int nEle;
	
	public Queue(int size) {
		this.maxSize = size;
		ary = new int[size];
		front = 0;
		rear = -1;
		nEle = 0;
	}
	
	public boolean isEmpty() {
		return nEle == 0;
	}
	
	public boolean isFull() {
		return nEle == maxSize;
	}
	
	public void insert(int ele) {
		if(isFull()) {
			System.out.println("Queue is Full....");
			return;
		}
		if(rear == maxSize - 1)
			rear = -1; // logic to wrap around
		ary[++rear] = ele;
		System.out.println("Inserted : " + ele + ". Rear = " + rear + ", Front = " + front);
		nEle++;
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty....");
			return -1;
		}
		if(front == maxSize)
			front = 0;
		int ele = ary[front++];
		System.out.println("Removed : " + ele + ". Rear = " + rear + ", Front = " + front);
		nEle--;
		return ele;
	}
	
	// Robert Lafore data structures algorithms programming project answer - 01
	public void displayQueue() {
		int i = front;
		int count = 0;
		while (count < nEle) {
			if(i == maxSize)
				i = 0;
			System.out.print(ary[i++] + " ");
			count++;
		}
		System.out.println();
	}
}
