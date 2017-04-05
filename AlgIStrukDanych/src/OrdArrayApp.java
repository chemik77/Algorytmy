class OrdArray {
	private int maxSize;
	private long[] a;
	private int nElems;
	public OrdArray(int size) {
		maxSize = size;
		a = new long[maxSize];
		nElems = 0;
	}
	public void insert(long value) {
		int i;
		for (i=0; i<nElems; i++)
			if (a[i] > value)
				break;
		for (int j=nElems; j>i; j--) 
			a[j] = a[j-1];
		a[i] = value;
		nElems++;
		
	}
	public void display() {
		for (int i=0; i<nElems; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public void find(long searchKey) {
		int currI;
		int lowerI = 0;
		int upperI = nElems-1;
		
		while (true) {
			currI = (lowerI + upperI) / 2;
			if(a[currI] == searchKey) {
				System.out.println("Znaleziono " + a[currI]);
				break;
			} else if (lowerI > upperI) {
				System.out.print("Nie znaleziono");
				break;
			} else {
				if (a[currI] < searchKey)
					lowerI = currI + 1;
				else 
					upperI = currI -1;
			}
		}
	}
	public void delete(long value) {
		int i;
		for (i=0; i<nElems; i++)
			if (a[i] == value)
				break;
		if (i == nElems) {
			System.out.println("Nie znaleziono");
			return;
		}
		for (int j=i; j<nElems-1; j++) {
			a[j] = a[j+1];
		}
		System.out.println("Usuwam");
		nElems--;
	}
}
public class OrdArrayApp {
	public static void main(String[] args) {
		int rozmiar = 10;
		OrdArray arr = new OrdArray(rozmiar);
		for (int i=0; i<rozmiar-1; i++)
			arr.insert((long)(Math.random() * 100) + 1);
		arr.insert(42);
		arr.display();
		arr.delete(42);
		arr.display();
	}
}