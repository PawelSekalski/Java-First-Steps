package petle;

import java.util.Random;
import java.util.Scanner;

public class j38 {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		Scanner rl = new Scanner(System.in);
		int res = (int)generator.nextInt(100);
		int proba;
		
		do{
			System.out.println("Podaj liczbe");
			proba = rl.nextInt();
			if(res < proba){
				System.out.println("Za duzo");
			} else if(res > proba){
				System.out.println("Za malo");
			} else {
				System.out.println("Gratulacje");
			}
		} while(proba != res);
		
		System.out.println("Szukana liczba to: " + res);
		rl.close();
	}
	
}