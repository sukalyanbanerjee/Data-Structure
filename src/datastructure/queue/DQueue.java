package datastructure.queue;

public class DQueue {
	
	private int maxSize;
	private int[] ary;
	private int left;
	private int right;
	private int nEle;
	
	public DQueue(int size) {
		maxSize = size;
		ary = new int[maxSize];
		left = 0;
		right = 0;
		nEle = 0;
	}
	
	public boolean isEmpty() {
		return nEle == 0;
	}
	
	public boolean isFull() {
		return nEle == maxSize;
	}
	
	public void insertLeft(int ele) {
		if(isFull()) {
			System.out.println("Queue is full...");
			return;
		}
		if(left == -1)
			left = maxSize - 1;
		System.out.println("Inserting : " + ele + " to left : " + left);
		ary[left--] = ele;
		nEle++;
	}
	
	public void insertRight(int ele) {
		if(isFull()) {
			System.out.println("Queue is full...");
			return;
		}
		if(right == maxSize - 1)
			right = 0;
		ary[++right] = ele;
		System.out.println("Inserting : " + ele + " to right : " + right);
		nEle++;
	}
	
	public int removeLeft() {
		if(isEmpty()) {
			System.out.println("Queue is empty...");
			return -1;
		}
		if(left == maxSize - 1) 
			left = 0;
		int ele = ary[++left];
		System.out.println("Removing : " + ele + " from left : " + left);
		nEle--;
		return ele;
	}
	
	public int removeRight() {
		if(isEmpty()) {
			System.out.println("Queue is empty...");
			return -1;
		}
		if(right == 0)
			right = maxSize - 1;
		int ele = ary[right--];
		System.out.println("Removing : " + ele + " from right : " + right);
		return ele;
	}
	
	public void displayDQueue() {
		int loopThreashold = right;
		if(left >= right)
			loopThreashold = maxSize - 1;
		for(int i = left + 1; i <= loopThreashold; i++) {
			System.out.print(ary[i] + " ");
			if(i == maxSize - 1) {
				i = -1;
				loopThreashold = right;
			}
		}
		System.out.println();
	}
}
