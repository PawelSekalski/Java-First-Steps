package operacjeNaPlikach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j81 {

	public static void main(String[] args) throws FileNotFoundException {
		File plik = new File("C:\\Users\\PS\\Desktop\\j81.txt"); //nazwa pliku z rozszerzeniem, je¿eli jest w eclipse
		Scanner odczyt = new Scanner(plik);
		
		while(odczyt.hasNextLine()) {
			String line = odczyt.nextLine();
			
			String lc = line.toLowerCase();
			
			int licz1 = 0;
			int licz2 = 0;
			for(int v = 0; v < lc.length(); v++) {
				if(lc.charAt(v) == 'a') {
					licz1++;
				}
				if(lc.charAt(v) == 'o') {
					licz2++;
				}
			}
			if((licz1 >= 3 && licz2 >= 2) || (lc.contains("allow"))) {
				System.out.println(line);
			}
			
		}
		odczyt.close();

	}

}
