package obiekty;

public class CarShop extends Auto {

	public static void main(String[] args) {
		System.out.println("Kupujemy auto: ");
		
		Auto bmw = new Auto(4,"bia�y", "z�ote", "chrome", "BMW", "X5", 100000);
		System.out.println("Kupi�e�: "+bmw.marka +" "+bmw.model);
		System.out.println("Do zap�aty: "+bmw.cena);
		/*
		boolean res = bmw instanceof Auto;
		//boolean res2 = bmw instanceof CarShop;
		System.out.println(res+" "+res);
		//System.out.println(res2);
			
		double cena_brutto_rabat = bmw.brutto();
		System.out.println(cena_brutto_rabat);
		bmw.bruttoNetto();
		//System.out.println(bmw.brutto);
		*/
		System.out.println("Po rabacie: "+bmw.rabat());
		System.out.println("Po rabacie2: "+bmw.rabat());
		bmw.bruttoNetto();
		
	}

}