package Lab6;

public class Queue_Array {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(4);
		queue.enQueue(3);
		queue.enQueue(2);
		queue.enQueue(1);
		queue.deQueue();
	}
}

class Queue {
	int front, rear, maxsize;
	int currentSize;
	int array[];

	public Queue(int size) {
		// Initialize values
		array = new int[size];
		maxsize = size;
		front = 0;
		rear = 0;
		currentSize = 0;
	}

	/*
	 * push(int value) we check if the size matches else front++ rear++;
	 */
	public void enQueue(int value) {
		if (!isFull()) {
			array[rear] = value;
			rear++;
			currentSize++;
			System.out.println("value:" + value + " is inserted. size:" + currentSize);
		} else {
			System.out.println("Queue is full!");
		}
	}

	public void deQueue() {
		if (!isEmpty()) {
			front = front + 1;
			currentSize--;
			System.out.println("size:" + currentSize);
		} else {
			System.out.println("Queue is empty");
		}
	}

	public boolean isFull() {
		if (currentSize == maxsize)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (currentSize == 0)
			return true;
		else
			return false;
	}

	public int getFront() {
		return array[front];
	}

	public int getRear() {
		return array[rear];
	}

	public void display() {
		if (!isEmpty()) {
			int i = front;
			System.out.println("Queue is:");
			while (i <= rear) {
				System.out.print(array[i] + ",");
				i++;
			}
		} else {
			System.out.println("Queue is Empty.");
		}
	}
}
