package operacjeNaPlikach;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class j83 {

	public static void main(String[] args) throws FileNotFoundException{
		
		File plik = new File("plik1.txt");
		Scanner odczyt = new Scanner(System.in);
		PrintWriter zapis = new PrintWriter(plik);
		String out = "";
		System.out.println("Wpisuj kolejne s³owa - \"end\", by wyœwietliæ listê\n");
		
		while(!out.equals("end")) {
			out = odczyt.nextLine();
			if(!out.equals("end")) {
				zapis.println(out);
			}
		}
		zapis.close();
		Scanner odczyt2 = new Scanner (plik);
			while(odczyt2.hasNextLine()) {
				System.out.println(odczyt2.nextLine());
			}
		odczyt.close();
		odczyt2.close();
		zapis.close();
		
	}
	
}
