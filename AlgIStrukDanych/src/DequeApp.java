class Deque {
	private int maxSize;
	private int[] a;
	private int left;				//frontLeft = rearRight
	private int right;				//frontRight = rearLeft
	public Deque(int maxSize) {
		this.maxSize = maxSize;
		a = new int[maxSize];
		left = -1;
		right = 0;
	}
	public void insertL(int value) {
		a[--left] = value;
	}
	public void insertR(int value) {
		a[++right] = value;
	}
}
public class DequeApp {

	public static void main(String[] args) {
		int rozmiar = 5;
		Deque deque = new Deque(rozmiar);
		deque.insertR(10);
		deque.insertR(20);
		deque.insertR(30);
		deque.insertL(20);
		deque.insertL(10);
		
	}

}
