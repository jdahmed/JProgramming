package Lab6;


public class Queue_LinkedList {
	public static void main(String[] args) {
		Queue_L queue = new Queue_L();
		queue.enQueue(5);
		queue.display();
		queue.enQueue(1);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.display();
		queue.enQueue(2);
		queue.display();
		queue.deQueue();
		queue.display();
		queue.search(2);
		queue.display();
		queue.search(5);
	}
}

class Queue_L {
	Node front, rear;

	public Queue_L() {
		front = null;
		rear = null;
	}

	public void enQueue(int value) {
		Node newNode = new Node(value, null);
		if (front == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.setLink(newNode);
			rear = newNode;
		}
	}

	public void deQueue() {
		if (!isEmpty()) {
			Node nextNode = front.getLink();
			front = nextNode;
		}
		if (front == null) {
			rear = null;
		}
	}

	public void display() {
		if (!isEmpty()) {
			Node current = front;
			System.out.println();
			while (current != null) {
				System.out.print(current.getValue() + ",");
				current = current.getLink();
			}
			System.out.println();
		} else {
			System.out.println("Queue is empty.");
		}

	}

	public boolean isEmpty() {
		if (front == null) {
			return true;
		} else
			return false;

	}

	public void search(int value) {
		if (!isEmpty()) {
			Node current = front;
			while (current != null) {
				if (current.getValue() == value) {
					System.out.println("Value exists.");
					return;
				}
				current = current.getLink();
			}
			System.out.println("Value does not exist.");
		} else {
			System.out.println("Queue is empty.");
		}

	}
}

class QNode {
	int key;
	QNode next;

	public QNode(int key) {
		this.key = key;
		this.next = null;
	}
}