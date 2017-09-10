package dziedziczenie;

public class Tyre extends Part{
	int rozmiar;
	int szerokosc;
	int wysokosc;
	
	public Tyre(String nazwa, String model, String seria, int rozmiar, int szerokosc, int wysokosc){
		super(nazwa,model,seria);
		this.rozmiar = rozmiar;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
	}
	

}