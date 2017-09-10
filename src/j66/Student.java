package j66;

public class Student {

	private String imie, nazwisko;
	private int index;
	public static int id;
	
	public Student(String imie, String nazwisko, int index) {
		id ++;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.index = index;
		System.out.println("Mamy ju¿: "+id+" studentów");
	}
}