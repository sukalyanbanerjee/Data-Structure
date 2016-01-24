package datastructure.stack;

public class Stack {
	
	private int [] ary;
	private int maxSize;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		ary = new int[maxSize];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public void push(int ele) {
		if(isFull()) {
			System.out.println("Stack is Full...");
			return;
		}
		System.out.println("Pushing : " + ele);
		ary[++top] = ele;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
			return -1;
		}
		int ele = ary[top--];
		System.out.println("Poping : " + ele);
		return ele;
	}
	
	public void displayStack() {
		for(int i = 0; i <= top; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
	}
}
