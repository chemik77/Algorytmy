class Queue {
	private int maxSize;
	private int[] a;
	private int nElems;
	private int front;
	private int rear;
	public Queue(int size) {
		maxSize = size;
		a = new int[maxSize];
		nElems = 0;
		front = 0;
		rear = -1;
	}
	public void display() {
		if(isEmpty()==true) {
			System.out.println("Kolejka jest pusta");
			return;
		}
		if(rear>=front) {
			for(int i=front; i<=rear; i++)
				System.out.print(a[i] + " ");
			System.out.println("");
		}
		if(front>rear) {
			for(int i=front; i<a.length; i++)
				System.out.print(a[i] + " ");
			for(int i=rear; i<front; i++)
				System.out.print(a[i] + " ");
			System.out.println("");
		}
	}
	public void insert(int value) {
		if (rear == maxSize-1)
			rear = -1;
		a[++rear] = value;
		nElems++;
	}
	public int remove() {
		if (front == maxSize)
			front = 0;
		int value = a[front++];
		nElems--;
		return value;
	}
	public int peek() {
		return a[front];
	}
	public boolean isFull() {
		return (nElems == maxSize);
	}
	public boolean isEmpty() {
		return (nElems == 0);
	}
	public int size() {
		return nElems;
	}
}
public class QueueApp {
	public static void main(String[] args) {
		int rozmiar = 5;
		Queue queue = new Queue(rozmiar);
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		queue.remove();
		queue.insert(60);
		queue.display();
	}
}