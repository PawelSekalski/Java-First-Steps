package Polimorfizm;

public class orgTest {

	public static void main(String[] args) {
		Bakteria b1 = new Bakteria();
		b1.przypiszDna("RAKDOWRJGRGH");
		b1.zmienSzkodliwosc("szkodliwa na 6+");
		b1.info();
		
		Zwierze z1 = new Zwierze();
		z1.przypiszDna("SWEFEFRGGRWGGHASDWAD");
		z1.zmienNogi(9.5);
		z1.info();
		
		Roslina r1 = new Roslina();
		r1.przypiszDna("safefeg");
		r1.zmienDl_lodygi(36);
		r1.info();
		
		z1.eat(r1);
		z1.eat(z1);
		
	}

}