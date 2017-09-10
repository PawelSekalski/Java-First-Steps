package j52;

public class Employee {
	String imie, nazwisko, rok;
	int staz;
	
	Employee(String imie, String nazwisko, String rok, int staz){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rok = rok;
		this.staz = staz;
	}
	public String info(){
		return "Pracownik: "+imie+" "+nazwisko+" (rok: "+rok+", sta¿: "+staz+")";
	}
}