package core.java.logical1;

import java.util.Stack;

public class StackUsingArray {

	int[] array = new int[5];
	int top = 0;
	
	private boolean puch(int x) {
		top++;
		array[top] = x;
		System.out.println("Element pushed into the stack = "+x);
		return true;
	}
	
	private int pop(){
		int x = array[top--];
		System.out.println("Element popped from stack = "+x);
		return x;
	}
	
	private int peek() {
		return array[top];
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
	}

}
