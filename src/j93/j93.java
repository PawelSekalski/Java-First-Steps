package j93;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j93 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String path = "";
		boolean error = true;
		while(error){
			try {
				System.out.println("Podaj �cie�k� do wy�wietlenia pliku:"); //C:\Users\PS\Desktop\j81.txt
				path = s.nextLine();
				File testFile = new File (path);
				Scanner sf = new Scanner(testFile);
		
				while(sf.hasNextLine()) {
					System.out.println(sf.nextLine());
		}
		sf.close();
		
		} catch(FileNotFoundException e) {
			System.out.println("Z�a �cie�ka. Again!");
			
		}
		s.close();
	}
	
}
}
