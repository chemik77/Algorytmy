class InsertionSort {
	private int maxSize;
	private long[] a;
	private int nElems;
	InsertionSort(int size) {
		maxSize = size;
		a = new long[maxSize];
		nElems = 0;
	}
	public void display() {
		for(int i=0; i<nElems; i++)
			System.out.print(a[i] + " ");
		System.out.println("");
	}
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	public void sort() {
		int out, in;
		for (out=1; out<nElems; out++) {
			long temp = a[out];
			in = out;
			while (in>0 && a[in-1] >= temp) {
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}
}
public class InsertionSortApp {
	public static void main(String[] args) {
		int rozmiar = 10;
		 InsertionSort arr = new InsertionSort(rozmiar);
		 for (int i=0; i<rozmiar; i++)
		 	arr.insert((long)(Math.random()*20));
		 arr.display();
		 arr.sort();
		 arr.display();
	}
}
