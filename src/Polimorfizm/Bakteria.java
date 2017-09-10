package Polimorfizm;

public class Bakteria extends Organizm {

	String szkodliwosc; 
	
	public String przypiszDna(String DNA){
		super.przypiszDna(DNA);
		return DNA;
	}
	public void zmienSzkodliwosc(String szkodliwosc){
		this.szkodliwosc = szkodliwosc;
	}
	@Override
	public void info() {
		System.out.println("DNA: "+DNA+" szkodliwosc: "+szkodliwosc);		
	}

}