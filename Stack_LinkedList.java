package Lab6;
import java.util.Scanner;

public class Stack_LinkedList {
	public static void main(String[] args) {
		System.out.println("Numbers pushed into stack: ");
		Scanner scan = new Scanner(System.in);
		Stack_Implement_LL stack_Implement = new Stack_Implement_LL();
		stack_Implement.push(20);
		System.out.println(stack_Implement.peek());
		stack_Implement.push(40);
		System.out.println(stack_Implement.peek());
		stack_Implement.push(60);
		System.out.println(stack_Implement.peek());
		stack_Implement.push(80);
		System.out.println(stack_Implement.peek());
		stack_Implement.push(100);
		System.out.println(stack_Implement.peek());
		scan.close();
		stack_Implement.peek();
		stack_Implement.traverse();
	}
}

class Stack_Implement_LL {
	Node top;
	int size;

	public Stack_Implement_LL() {
		top = null;
		size = -1;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int value) {
		Node temp = new Node(value, null);
		if (top == null) {
			top = temp;
		} else {
			temp.setLink(top);
			top = temp;
		}
		size++;
	}
	public int pop() {
		if (this.isEmpty()) {
			Node temp1 = top;
			top = temp1.getLink();
			size--;
			return temp1.getValue();
		} else {
			return 0;
		}
	}

	public void traverse() {
		if (size == 0)
			System.out.println("Stack is empty.");
		else {
			Node ptr = top;
			do {
				System.out.print(ptr.value + ",");
				ptr = ptr.link;
			} while (ptr != null);
		}
	}

	public int peek() {
		if (this.isEmpty()) {
			return -1;
		} else {
			return top.getValue();
		}
	}
}

class Node {
	protected Node link;
	protected int value;

	public Node() {
		link = null;
		value = 0;
	}

	public Node(int v, Node n) {
		value = v;
		link = n;
	}

	public void setLink(Node n) {
		link = n;
	}

	public void setValue(int v) {
		value = v;
	}

	public Node getLink() {
		return link;
	}

	public int getValue() {
		return value;
	}
}