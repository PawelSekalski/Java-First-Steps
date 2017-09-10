package Tablice;

import java.util.Random;

public class j43 {

	public static void main(String[] args) {
		
		int [] randInt = new int[10];
		
		Random generator = new Random();
		
		//losowanie
		for(int i = 0; i<randInt.length; i++){
			randInt[i] = generator.nextInt(21)-10;
		}
		
		//wypisanie i wypisanie odwrotne
		System.out.println("Losowanie ");
		for(int i = 0; i<=randInt.length -1; i++){
			System.out.print(randInt[i]);
			System.out.print(" ");
		}
		
		System.out.println("Wypisane odwrotnie ");
		for(int i = randInt.length -1; i>=0; i--){
			System.out.print(randInt[i]);
			System.out.print(" ");
		}
		
		// max i min
		int tempMax = randInt[0];
		int tempMin = randInt[0];
		for(int i = 1; i<=randInt.length-1; i++){
			if(tempMax < randInt[i]){
				tempMax = randInt[i];
			}
			if(tempMin > randInt[i]){
				tempMin = randInt[i];
			}
		}		
		System.out.print("\nNajmniejszy: "+tempMin+" \nNajwiêkszy: "+tempMax);
		
		//œrednia
		int sum = 0;
		for (int i = 0; i<= randInt.length - 1; i++){
			sum += randInt[i];
		}
		
		float ave=sum/randInt.length;
		System.out.print("\nŒrednia arytmetyczna: "+ave);
		
		//ile elementów wiêkszych, a ile mniejszych od œredniej
		
		int licznikM = 0;
		int licznikW = 0;
		for(int i = 0; i<=randInt.length-1; i++){
			if(randInt[i]>ave){
				licznikW ++;
			}
			if(randInt[i]<ave){
				licznikM ++;
			}
		}
		
		System.out.print("\nLiczba elementów wiêkszych od œredniej: "+licznikW);
		System.out.print("\nLiczba elementów mniejszych od œredniej: "+licznikM);
	
	}

}