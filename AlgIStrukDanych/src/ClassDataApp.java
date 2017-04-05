class Person {
	private String lastName;
	private String firstName;
	private int age;
	public Person(String last, String first, int a) {
		lastName = last;
		firstName = first;
		age = a;
	}
	void display() {
		System.out.println(lastName + " " + firstName + " " + age + " lat.");
	}
	String getLast() {
		return lastName;
	}
}
class ClassDataArray {
	private Person[] a;
	private int nElems;
	ClassDataArray(int max) {
		a = new Person[max];
		nElems = 0;
	}
	public void insert(String last, String first, int age) {
		a[nElems] = new Person(last, first, age);
		nElems++;
	}
	public Person find(String last) {
		int i;
		for (i=0; i<nElems; i++)
			if (a[i].getLast().equals(last))
				break;
		if (i == nElems) {
			System.out.println("Nie znaleziono w bazie");
			return null;
		}
		System.out.print("Znaleziono: ");
		a[i].display();
		return a[i];
		
	}
	public void delete(String last) {
		int i;
		for (i=0; i<nElems; i++)
			if (a[i].getLast().equals(last))
				break;
		if (i == nElems) {
			System.out.println("Nie znaleziono w bazie");
			return;
		}
		System.out.print("Usuwam: ");
		a[i].display();
		for (int j=i; j<nElems; j++)
			a[j] = a[j+1];
		nElems--;
	}
	public void display() {
		for (int i=0; i<nElems; i++)
			a[i].display();
	}
}
public class ClassDataApp {
	public static void main(String[] args) {
		ClassDataArray arr = new ClassDataArray(20);
		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Lorraine", 37);
		arr.insert("Yee", "Tom", 43);
		arr.insert("Adams", "Henry", 63);
		arr.insert("Hashimoto", "Sato", 21);
		arr.insert("Stimson", "Henry", 29);
		arr.insert("Velasquez", "Jose", 72);
		arr.insert("Lamarque", "Henry", 54);
		arr.insert("Vang", "Minh", 22);
		arr.insert("Creswell", "Lucinda", 18);
		arr.display();
		arr.find("Yee");
		arr.delete("Stimson");
		//arr.display();
	}
}