public class Anagramy {
	static int size;
	static int count;
	static char[] arrChar = new char[100];
	public static void anagram(int newSize) {
		if(newSize == 1)
			return;
		for(int i=0; i<newSize; i++) {
			anagram(newSize-1);
			if(newSize == 2)
				displayWord();
			rotate(newSize);
		}
	}
	public static void rotate(int newSize) {
		int i;
		int position = size - newSize;
		char temp = arrChar[position];
		for(i=position +1; i<size; i++)
			arrChar[i-1] = arrChar[i];
		arrChar[i-1] = temp;
	}
	public static void displayWord() {
		if(count<99)
			System.out.print(" ");
		if(count<9) 
			System.out.print(" ");
		System.out.print(++count + " ");
		for(int i=0; i<size; i++)
			System.out.println("");
		if(count%6 == 0)
			System.out.println("");
	}
	public static void main(String[] args) {
		String slowo = "rodeo";
		for(int i=0; i<slowo.length(); i++) {
			arrChar[i] = slowo.charAt(i);
		}
		anagram(slowo.length());
	}
}