package Polimorfizm;

public class Zwierze extends Organizm {

	double liczbaNog = 4;
	
	public String przypiszDna(String DNA){
		super.przypiszDna(DNA);
		return DNA;
	}
	
	public void zmienNogi(double liczbaNog){
		this.liczbaNog = liczbaNog;
	}
	public void eat(Organizm o){
		if(o instanceof Roslina){
		System.out.println("Zwierzak zjada roœlinê");
		}
		if(o instanceof Zwierze){
		System.out.println("Zwierzak walczy ze zwierzakiem");
		}
		
	}
	
	@Override
	public void info() {
		System.out.println("DNA: "+DNA+" liczba nóg: "+liczbaNog);		
	}

}