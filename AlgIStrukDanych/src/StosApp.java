class Stos {
	private int maxSize;
	private int[] stArr;
	private int top;
	
	Stos(int size) {
		maxSize = size;
		stArr = new int[maxSize];
		top = -1;
	}
	public void display() {
		for (int i=0; i<=top; i++)
			System.out.print(stArr[i] + " ");
		System.out.println("");
	}
	public void push(int value) {
		if (isFull() == true) {
			System.out.println("Stos pe³ny!");
			return;
		}
		stArr[++top] = value;
	}
	public int pop() {
		if (isEmpty() == true) {
			System.out.println("Stos pusty!");
			return -1;
		}
		return stArr[top--];
	}
	public int peek() {
		return stArr[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == (maxSize-1));
	}
}
class StosApp {
	public static void main(String[] args) {
		int rozmiar = 5;
		Stos st = new Stos(rozmiar);
		st.push(20);
		st.push(40);
		st.push(60);
		st.push(80);
		st.push(81);
		st.push(82);
		st.display();
		//System.out.println(st.pop());
		
	}
}