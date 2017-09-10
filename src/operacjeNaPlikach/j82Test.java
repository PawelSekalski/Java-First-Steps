package operacjeNaPlikach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class j82Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList <j82> myBooks = new ArrayList<>();
		
		File plik = new File("Book.txt");
		Scanner odczyt = new Scanner(plik);
		
		odczyt.useDelimiter(",|\r?\n");
		while(odczyt.hasNextLine()) {
			String odczytNazwa = odczyt.next();
			String odczytAutor = odczyt.next();
			String odczytrW = odczyt.next();
			
			j82 nextBook = new j82 (odczytNazwa, odczytAutor, odczytrW);
			
			myBooks.add(nextBook);
			
		}
		System.out.println("moja ksi¹¿kwistadorystyka: ");
		System.out.println("=================================================\n");
		
		for(j82 b : myBooks) {
			System.out.println("nazwa: "+b.getNazwa()+"\nautor: "+b.getAutor()+"\nrok wydania: "+b.getrW());
			System.out.println("=================================================\n");

		}
		
		odczyt.close();
		
	}

}
