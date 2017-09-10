package Polimorfizm;

public class Roslina extends Organizm{

	int dl_lodygi;
	
	public String przypiszDna(String DNA){
		super.przypiszDna(DNA);
		return DNA;
	}
	public void zmienDl_lodygi(int dl_lodygi){
		this.dl_lodygi = dl_lodygi;
	}
	@Override
	public void info() {
		System.out.println("DNA: "+DNA+" dlugosc lodygi: "+dl_lodygi+"m");		
	}

}