package obiekty;

public class Auto {

	private int a = 1;
	protected int iloscDrzwi = 2;
	double cena; 
	
	//double brutto;
	String kolorNadwozia, kolorFelg, kolorOpon, marka, model;
	
	protected double rabat(){
		cena = cena * 0.9;
		return cena;
	}
	
	public double brutto(){
		double brutto = cena * 1.23;
		return brutto;
	}
	public void bruttoNetto(){
		System.out.println("Do zap³aty:");
		System.out.println("cena netto: "+ cena);
		System.out.println("cena brutto: " + cena * 1.23);
	}
	
	public Auto(){}
	public Auto(	int iloscDrzwi, 
			String kolorNadwozia, 
			String kolorFelg, 
			String kolorOpon, 
			String marka, 
			String model,
			double cena ){
		this.iloscDrzwi = iloscDrzwi;
		this.kolorNadwozia = kolorNadwozia;
		this.kolorFelg = kolorFelg;
		this.kolorOpon = kolorOpon;
		this.marka = marka;
		this.model = model;
		this.cena = cena;
	}
	/*
	public static void main(String[] args) {
		Auto garbus1 = new Auto();
		System.out.println("Obiekt garbus1");
		System.out.println(garbus1.iloscDrzwi);
		System.out.println(garbus1.kolorNadwozia);
		System.out.println(garbus1.kolorFelg);
		System.out.println(garbus1.kolorOpon);
		System.out.println(garbus1.marka);
		System.out.println(garbus1.model);
		
		
		Auto garbus = new Auto(4, "niebieski", "czerwony", "czarny", "VW", "Garbus", 10000);
		Auto a4 = new Auto(4, "czarny", "bia³y", "czarny", "Audi", "A4",50000);
		
		garbus.iloscDrzwi = 4;
		garbus.kolorNadwozia = "niebieski";
		garbus.kolorFelg = "czerwony";
		garbus.kolorOpon = "czarny";
		garbus.marka = "VW";
		garbus.model = "Garbus";
		
		System.out.println("Obiekt garbus");
		System.out.println(garbus.iloscDrzwi);
		System.out.println(garbus.kolorNadwozia);
		System.out.println(garbus.kolorFelg);
		System.out.println(garbus.kolorOpon);
		System.out.println(garbus.marka);
		System.out.println(garbus.model);
		System.out.println("Obiekt A4");
		System.out.println(a4.iloscDrzwi);
		System.out.println(a4.kolorNadwozia);
		System.out.println(a4.kolorFelg);
		System.out.println(a4.kolorOpon);
		System.out.println(a4.marka);
		System.out.println(a4.model);
		System.out.println(a4);
		

	}
*/
}
