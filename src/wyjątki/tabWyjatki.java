package wyj�tki;

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
			System.out.println("pppppppoooodaj element tablicy, q - wyj�cie");
			dec = sc.nextLine();
			if(dec.equals("q")) {
				System.out.println("wyj�cie");
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
			System.out.println("nie mo�na wprowadzi� wi�cej element�w tablicy");
			sc.nextLine();
			break;
			}
		}
		while (true) {
			try {
			System.out.println("wybierz element tablicy do wy�wietlenia, q - wyj�cie");
			index = sc.nextInt();
			
			if(index == 0) {
				System.out.println("wyj�cie");
				break;
			}
			if (index > v){
				throw new ArrayIndexOutOfBoundsException();
			}
			System.out.println(liczby[index -1]);
			} catch(InputMismatchException e) {
				System.out.println("nale�y poda� liczb�");
				sc.nextLine();
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("nie ma takiego indeksu");
				sc.nextLine();
			}
			
		}
		sc.close();
		}
	}


