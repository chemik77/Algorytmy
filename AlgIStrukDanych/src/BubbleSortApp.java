class BubbleSort {
	private int maxSize;
	private long[] a;
	private int nElems;
	
	public BubbleSort(int rozmiar) {
		maxSize = rozmiar;
		a = new long[maxSize];
		nElems = 0;
	}
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	public void display() {
		for (int i=0; i<nElems; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public void sort() {
		int out, in;
		for (out=nElems-1; out>1; out--)
			for (in=0; in<out; in++) 
				if (a[in] > a[in+1])
					swap(in, in+1);
	}
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}

public class BubbleSortApp {
	public static void main(String[] args) {
		int rozm = 10;
		BubbleSort arr = new BubbleSort(rozm);
		for (int i=0; i<rozm; i++)
			arr.insert((long)(Math.random()*50));
		arr.display();
		arr.sort();
		arr.display();
	}
}