package petle;

import java.util.Scanner;

public class trening {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		Scanner txt = new Scanner(System.in);
		System.out.println("Podaj ile razy chcesz wypisaæ tekst (max: 10)");
		int liczba = n.nextInt();
		
		String[] teksty = new String[liczba];
		
		for(int i = 0; i <= liczba-1; i++){
			System.out.println("Podaj tekst do wyœwietlenia");
			String text = txt.nextLine();
			teksty[i] = text;		
		}
		txt.close();
		int j = liczba-1;
		System.out.println("Z while");
		while(j >= 0){
			System.out.println(teksty[j]);
			j --;
		}
		System.out.println("Z for each");
		for(String var: teksty){
			System.out.println(var);
		}
		n.close();
		
		int[] liczby = new int[3];
		String[] napisy = new String[3];
		
		System.out.println(liczby[0]);
		System.out.println(napisy[1]);
		
	}
}