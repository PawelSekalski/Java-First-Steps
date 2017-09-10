package przeciazanie;

public class Przeciazanie {

String imie, imie2, nazwisko, nazwisko2;
	
	public Przeciazanie(String imie, String imie2, String nazwisko, String nazwisko2) {
		super();
		this.imie = imie;
		this.imie2 = imie2;
		this.nazwisko = nazwisko;
		this.nazwisko2 = nazwisko2;
	}
	
	public Przeciazanie(String imie, String imie2, String nazwisko) {
		super();
		this.imie = imie;
		this.imie2 = imie2;
		this.nazwisko = nazwisko;
	}
	
	public Przeciazanie(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public void dodaj(int a, int b){
		System.out.println("wynik1: " + (a + b));
	}
	
	public void dodaj(double a, double b){
		System.out.println("wynik1: " + (a + b));
	}
	
	public static void main(String[] args) {
		
		// Przeci�zanie zmienna liczb� parametr�w
		Przeciazanie p1 = new Przeciazanie("Anna", "Maria", "Nowak", "Kowalska");
		Przeciazanie p2 = new Przeciazanie("Marek", "Janusz", "Jurek");
		Przeciazanie p3 = new Przeciazanie("Jan","Kowalski");
		
		// Przeci��anie zminnym typem parametr�w
		p1.dodaj(2,5);
		p1.dodaj(3.14, 15.22);
		
	}
}