package j84;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s1 = new Scanner(System.in);
		Company comp = new Company();
		
		File f1 = new File("firma.txt");
		
		PrintWriter w1 = new PrintWriter(f1);
		
		String end="";
		
		int v = 0;
		
		while(true) {
			System.out.println("(1) - zapis, (2) - idiodczyt, (3)-fin");
			
			end = s1.nextLine();
			
			if(end.equals("1")) {			//zapis
				
				while(v < comp.getPracownicy().length) {
					
					Employee emp = new Employee();
					
					System.out.println("\nPodaj imiê:");
					end = s1.nextLine();
					emp.setImie(end);
					w1.println(end+", ");
					
					System.out.println("\nPodaj nazwisko:");
					end = s1.nextLine();
					emp.setNazwisko(end);
					w1.println(end+", ");
					
					System.out.println("\nPodaj wysokoœæ wynagrodzenia:");
					end = s1.nextLine();
					emp.setWyplata(end);
					w1.println(end);
					
					v++;
				}
				w1.close();
			}
			
			else if(end.equals("2")) {		//odczyt
				Scanner s2 = new Scanner(f1);
				while(s2.hasNextLine()) {
					System.out.println(s2.nextLine());
				}
				s2.close();
			}
			
			else if(end.equals("3")) {		//wyjœcie
				break;
			}
		}
		s1.close();

	}

}
