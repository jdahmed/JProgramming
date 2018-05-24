package Lab6;

import java.util.Scanner;

//PUSH(),POP(),isEmpty(),PEEK()
public class Stack_Array {
	public static void main(String[] args) {
		System.out.println("Enter size of stack:");
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		Stack_Implement_Array stack_Implement = new Stack_Implement_Array(max);
		System.out.println(stack_Implement.push(10) ? "Yes pushed 10" : "No");
		System.out.println(stack_Implement.push(20) ? "Yes pushed 20" : "No");
		System.out.println(stack_Implement.push(20) ? "Yes pushed 30" : "No");
		System.out.println(stack_Implement.push(20) ? "Yes pushed 40" : "No");
		System.out.println(stack_Implement.push(20) ? "Yes pushed 50" : "No");
		System.out.println(stack_Implement.pop() ? "Popped " : "No");
		System.out.println(stack_Implement.peek());
	}
}

class Stack_Implement_Array {
	int array[];
	int maxSize;
	int top;

	public Stack_Implement_Array(int max) {
		maxSize = max;
		array = new int[maxSize];
		top = -1;
	}

	boolean push(int a) {
		if (top >= maxSize - 1) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			array[++top] = a;
			return true;
		}
	}

	boolean isEmpty() {
		if (top < 0)
			return false;
		else
			return true;
	}

	boolean pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return false;
		} else {
			int x = array[top--];
			return true;
		}
	}

	int peek() {
		if (top < 0)
			return -1;
		else
			return array[top];
	}
}
