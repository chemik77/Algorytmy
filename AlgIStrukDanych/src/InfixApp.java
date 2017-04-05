import java.io.*;
class Stackx {
	private int maxSize;
	private char[] stackArray;
	private int top;
	public Stackx(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	public void push(char ch) {
		stackArray[++top] = ch;
	}
	public char pop() {
		return stackArray[top--];
	}
	public char peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public int size() {
		return (top + 1);
	}
	public char peekN(int n) {
		return (stackArray[n]);
	}
	public void displayStack(String s) {
		System.out.print(s);
		System.out.print("Stos: ");
		for(int i=0; i<=top; i++)
			System.out.print(peekN(i) + " ");
		System.out.println("");
	}
}
class InToPost {
	private Stackx theStack;
	private String input;
	private String output = "";
	public InToPost(String in) {
		input = in;
		int stackSize = input.length();
		theStack = new Stackx(stackSize);
	}
	public String doTrans() {
		return "s";
	}
}



public class InfixApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
