package j65;

import java.util.Scanner;

public class Terminal {
	
	public static void main(String[] args) {
		Magazyn m1 = new Magazyn();
		Scanner menu = new Scanner(System.in);
		
		while(true){
			System.out.println("A-add, D-delete, C-change, L-list, Q-end");
			String m = menu.nextLine();
			if(m.equals("A")){
				m1.dodajProdukt(new Magazyn());
			} 
			if (m.equals("L")){
				m1.stanyProdukty();
			}
			if (m.equals("C")){
				m1.zmienStan();
			}
			if (m.equals("D")){
				m1.usunProdukt(new Magazyn());
			}
			if (m.equals("Q")){
				System.out.println("bye");
				break;
			}
		}
		menu.close();
	}

}