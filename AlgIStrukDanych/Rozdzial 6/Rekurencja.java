class Rekurencja {
	public static int triangle(int n) {
		if(n==0) 
			return 1;
		else {
			System.out.print(n + "+ (");
			return (n * triangle(n-1));
		}
	}
	public static void main(String[] args) {
		int wynik = triangle(5);
		System.out.print(wynik);
	}
}