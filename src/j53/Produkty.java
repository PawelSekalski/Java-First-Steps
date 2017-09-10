package j53;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Produkty {
	Scanner rl = new Scanner(System.in);
	HashMap<String, Double> mapa = new HashMap<String, Double>();
	
	Produkty(){
		mapa.put("chleb", 1.23);
		mapa.put("mleko", 2.99);
	}
	public double oblicz(){
		float sum = 0;
		System.out.println("Podaj nazwê produktu: ");
		String rr = rl.nextLine();		
		while( (!rr.equals("end")) && (!rr.equals("END")) ){
			if(mapa.containsKey(rr)){
				sum += mapa.get(rr);
			} else {
				System.out.println("Z³a nazwa produktu: ");
			}
			rr = rl.nextLine();
		}
		System.out.println("Cena za twoje zakupy: " + sum + "z³");
		rl.close();
		return sum;
		}
}