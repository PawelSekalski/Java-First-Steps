package specyfikatory;
import obiekty.*;	 //import ca³ej zawartoœci pakietu
//import obiekty.Auto; // import klasy Auto

public class specyfikatoryTestowe {

	public static void main(String[] args) {
		//Auto a1 = new Auto(4,"czarny","bia³y", "czerwony", "Audi", "A4", 500000);
		//a1.bruttoNetto();
		//System.out.println(a1.a);
		//System.out.println(a1.iloscDrzwi);
		//a1.rabat();
		
		GetSet gs1 = new GetSet();
		GetSet gs2 = new GetSet(4, "napis", false);
		
		System.out.println(gs1.getA());
		gs1.setA(15);
		
		System.out.println(gs1.getA());
		gs1.setC(true);
		
		System.out.println(gs1.isC());
		gs1.setZnaczek('A');
		
		System.out.println(gs1.getZnaczek());
	}

}