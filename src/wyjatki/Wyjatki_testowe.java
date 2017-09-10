package wyjatki;

import java.util.Scanner;

public class Wyjatki_testowe {
	public static void main(String[] args){
	
		int tab[] = {1,2,3,4,5};
		
		Scanner odczyt = new Scanner(System.in);
		
		int index = -1;
		
		System.out.println("Podaj indeks tablicy, który chcesz zobaczyæ: ");
	
		index = odczyt.nextInt();
		
		try {
			System.out.println(tab[index]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
			}
		}
	}