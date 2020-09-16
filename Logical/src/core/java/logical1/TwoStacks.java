package core.java.logical1;

public class TwoStacks {

	int size;
	int top1, top2;
	int[] array;

	public TwoStacks(int size) {
		this.size = size;
		array = new int[size];
		top1 = -1;
		top2 = size;
	}

	private void push1(int x) {
		if (top1 < top2) {
			top1++;
			array[top1] = x;

			System.out.println("pushed element into the stack1 = " + x);
		} else {
			System.out.println("stack overflow");
			System.exit(1);
		}
	}

	private void push2(int x) {
		if (top1 < top2 - 1) {
			top2--;
			array[top2] = x;

			System.out.println("pushed element into the stack2 = " + x);
		} else {
			System.out.println("stack overflow");
			System.exit(1);
		}
	}

	private int pop1() {
		if (top1 >= 0) {
			int x = array[top1];
			System.out.println("popped element = " + x);
			top1--;
			return x;
		} else {
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
	}

	private int pop2() {
		if (top2 < size) {
			int x = array[top2];
			System.out.println("popped element = " + x);
			top2--;
			return x;
		} else {
			System.out.println("stack underflow");
			System.exit(1);
		}
		return 0;
	}

	public static void main(String[] args) {
		TwoStacks ts = new TwoStacks(10);
		ts.push1(10);
		ts.push1(20);
		ts.push1(30);
		ts.pop1();

		ts.push2(50);
		ts.push2(60);
		ts.push2(70);
		ts.pop2();
	}
}
