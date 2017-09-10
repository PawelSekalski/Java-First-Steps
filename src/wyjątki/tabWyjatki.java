package wyj¹tki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tabWyjatki {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String [] liczby = new String [10];
		String dec;
		int index;
		int v = 0;
				
		while(true) {
			try {
			System.out.println("pppppppoooodaj element tablicy, q - wyjœcie");
			dec = sc.nextLine();
			if(dec.equals("q")) {
				System.out.println("wyjœcie");
				break;
			} else {
				if (v != liczby.length) {
					liczby[v] = dec;
					v ++;
			} 
			if (v == liczby.length) {
				throw new ArrayIndexOutOfBoundsException();
			}
		
		}	
	} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("nie mo¿na wprowadziæ wiêcej elementów tablicy");
			sc.nextLine();
			break;
			}
		}
		while (true) {
			try {
			System.out.println("wybierz element tablicy do wyœwietlenia, q - wyjœcie");
			index = sc.nextInt();
			
			if(index == 0) {
				System.out.println("wyjœcie");
				break;
			}
			if (index > v){
				throw new ArrayIndexOutOfBoundsException();
			}
			System.out.println(liczby[index -1]);
			} catch(InputMismatchException e) {
				System.out.println("nale¿y podaæ liczbê");
				sc.nextLine();
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("nie ma takiego indeksu");
				sc.nextLine();
			}
			
		}
		sc.close();
		}
	}


