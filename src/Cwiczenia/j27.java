package Cwiczenia;

import java.util.Locale;
import java.util.Scanner;

public class j27 {

	public static void main(String[] args){
		
		Scanner rl = new Scanner(System.in);
		
		System.out.println("Wprowadz liczbê");
		
		rl.useLocale(Locale.US);
		
		float number = rl.nextFloat();
		
		if(number >= 0 && number <= 1){
			System.out.println("Liczba z przedzialu <0,1>");
		}
		else{
			System.out.println("Liczba z poza przedzia³u <0,1>");
		}
		
	}
}