package dziedziczenie;

public class GetSetBazowa {

	public String imie;
	public String nazwisko;
	private int pesel;
	public String getImie() {
		return imie;
	}
	private void infoBaza(){
		System.out.println("Info z bazy");
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public int getPesel() {
		return pesel;
	}
	public void setPesel(int pesel) {
		this.pesel = pesel;
	}
	
	public GetSetBazowa(){}
	
	public GetSetBazowa(String imie, String nazwisko){
		this.imie=imie;
		this.nazwisko = "Anonim";
		
	}
	public GetSetBazowa(String nazwisko){
		this.imie = "Anonim";
		this.nazwisko=nazwisko;
	}
	
	public GetSetBazowa(int pesel) {
		this.pesel = pesel;
	}
	public GetSetBazowa(String imie, int pesel) {
		this.imie = imie;
		this.pesel = pesel;
	}
}