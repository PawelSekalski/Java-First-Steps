package operacjeNaPlikach;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class pierwszy {

	public static void main(String[] args) throws FileNotFoundException {
		// Odczyt
		File plik = new File("plikTest.txt");
		Scanner odczyt = new Scanner(plik);
		String text1 = odczyt.nextLine();
		System.out.println(text1);
		String text2 = odczyt.nextLine();
		System.out.println(text2);
		odczyt.close();
		
		// Zapis - nadpisanie ca³ego pliku
		PrintWriter zapis = new PrintWriter(plik);
		zapis.println("zawartoœæ zapisu");
		zapis.close();
		
		
	}

}
