package petle;

import java.util.Scanner;

public class j30 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Podaj liczbê ca³kowit¹ wiêksz¹ od zera");
		int lim = num.nextInt();
		
		if (lim > 0){
			for (int i = 1; i<=lim; i++){
					if(i%2 != 0){
						System.out.println(i);
					}
			}
		} else { 
		
			System.out.println("Liczba musi byæ wiêksza od zera!");
		
		}
		
		num.close();
	}
}