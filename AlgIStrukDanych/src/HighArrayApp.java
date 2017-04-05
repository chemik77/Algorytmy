class HighArray {
	private int maxSize;
	private long[] a;
	private int nElems;
	public HighArray(int size) {
		maxSize = size;
		a = new long[maxSize];
		nElems = 0;
	}
	public void insert(long value) {
		if (!isFull()) {
			a[nElems] = value;
			nElems++;
		} else System.out.println("Tablica pelna!");
		
	}
	public void display() {
		for (int i=0; i<nElems; i++) 
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public void find(long searchKey) {
		int i;
		for (i=0; i<nElems; i++)
			if (a[i] == searchKey)
				break;
		if (i == nElems) {
			System.out.println("Nie znaleziono");
			return;
		}
		System.out.println("Znaleziono " + a[i] + " na pozycji " + (i+1));
	}
	public void delete(long value) {
		int i, j;
		for (i=0; i<nElems; i++)
			if (a[i] == value)
				break;
		if (i == nElems) {
			System.out.println("Nie znaleziono");
			return;
		} 
		for (j=i; j<nElems-1; j++) {
			a[j] = a[j+1];
		}
		System.out.println("Usunieto..");
		nElems--;
	}
	public boolean isFull() {
		return nElems == maxSize;
	}
	public boolean isEmpty() {
		return nElems == 0;
	}
}

public class HighArrayApp {
	public static void main(String[] args) {
		int rozmiar = 10;
		HighArray arr = new HighArray(rozmiar);
		
		for (int i=0; i<rozmiar; i++)
			arr.insert((long)(Math.random()*20));
		
		//arr.insert(15);
		arr.display();
		//arr.find(2);
		//arr.delete(14);
		//arr.display();
	}
}