package datastructure.stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.displayStack();
		
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(110);
		stack.displayStack();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.displayStack();
		
		stack.push(70);
		stack.push(80);
		stack.displayStack();
		
	}

}
