package Cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class j19 {

	public static void main(String[] args){
		
		Scanner rl = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		System.out.print("Podaj swoje Imie: ");
		
		String wyraz1 = rl.nextLine();
		
		System.out.print("Witaj " + wyraz1 + " na kursie Java!");
		rl.close(); //zamkniêcie pêtli
	}
}