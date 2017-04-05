import java.io.*;
class Stack {
	private int maxSize;
	private char[] a;
	private int top;
	public Stack(int s) {
		maxSize = s;
		a = new char[maxSize];
		top = -1;
	}
	public void push(char j) {					//odklada na stos
		a[++top] = j;
	}
	public char pop() {							//zdejmuje ze stosu
		return a[top--];
	}
	public char peek() {
		return a[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
}
class BracketChecker {
	String input;
	public BracketChecker(String input) {
		this.input = input;
	}
	public void check() {
		Stack stack = new Stack(input.length());
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			switch(ch) {
			case '{':
			case '(':
			case '[':
				stack.push(ch);
				break;
			case '}':
			case ')':
			case ']':
				if(!stack.isEmpty()) {
					char chx = stack.pop();
					if( (ch=='}' && chx!='{') ||
						(ch==')' && chx!='(') ||
						(ch==']' && chx!='[') )
						System.out.println("Błąd: " + ch + " na pozycji " + i);
				} else
					System.out.println("Błąd: " + ch + " na pozycji " + i);
				break;
				default:
					break;
			}
		}
		if( !stack.isEmpty())
			System.out.println("Błąd: brak nawiasu zamykającego");
	}
}
public class BracketsApp {
	public static void main(String[] args) throws IOException {
		String input;
		while(true) {
			System.out.print("Wprowadz napis zawierający nawiasy: ");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			
			BracketChecker checker = new BracketChecker(input);
			checker.check();
		}
	}
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}