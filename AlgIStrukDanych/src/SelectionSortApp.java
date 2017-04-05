class SelectionSort {
	private int maxSize;
	private long[] a;
	private int nElems;
	public SelectionSort(int rozmiar) {
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
		System.out.println("");
	}
	public void selectionSort() {
		int in, out, min;
		for (out=0; out<nElems-1; out++) {
			min = out;
			for (in=out+1; in<nElems-1; in++)
				if (a[in] < a[min])
					min = in;
			swap(out, min);
		}
	}
	private void swap(int one, int two){
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
public class SelectionSortApp {
	public static void main(String[] args) {
		int rozmiar = 10;
		SelectionSort arr = new SelectionSort(10);
		for (int i=0; i<rozmiar; i++)
			arr.insert((long)(Math.random()*50));
		arr.display();
		System.out.println("------------------------------------------------------");
		arr.selectionSort();
		arr.display();
	}
}