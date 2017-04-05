class LiczbyTroj {
	static int n = 5;
	public static int triangle(int n) {
		System.out.println("Dane wejsciowe: " + n);
		if(n==0) {
			System.out.println(n);
			return 1;
		}
		else {
			int temp = n * triangle(n-1);
			System.out.println("Zwracana wartosc: " + temp);
			return temp;
		}
	}
	public static void main(String[] args) {
		System.out.print("Wartośc liczby trójkatnej: " + triangle(n));
	}
}