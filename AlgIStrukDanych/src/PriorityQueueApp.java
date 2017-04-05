import java.util.*;
class PriorityQueue {
	private int maxSize;
	private int[] a;
	private int nElems;
	
	public PriorityQueue(int s) {
		maxSize = s;
		a = new int[maxSize];
		nElems = 0;
	}
	public void insert(int value) {
		int i;
		if(nElems == 0)
			a[nElems++] = value;
		else {
			for(i=nElems-1; i>=0; i--) {
				if(value > a[i])
					a[i+1] = a[i];
				else
					break;
			}
			a[i+1] = value;
			nElems++;
		}
	}
	public void display() {
		for(int i=0; i<nElems; i++)
			System.out.print(a[i] + " ");
		System.out.println("");
	}
	public int remove() {
		return a[--nElems];
	}
	public int peekMin() {
		return a[nElems-1];
	}
	public boolean isEmpty() {
		return (nElems == 0);
	}
	public boolean isFull() {
		return (nElems == maxSize);
	}
}
public class PriorityQueueApp {
	public static void main(String[] args) {
		int rozmiar = 5;
		PriorityQueue queue = new PriorityQueue(rozmiar);
		for(int i=0; i<rozmiar; i++) {
			queue.insert((int)(Math.random()*20));
		}
		queue.display();
		//queue.remove();
		queue.display();
		System.out.println(queue.peekMin());
		System.out.println(queue.isFull());
	}
}