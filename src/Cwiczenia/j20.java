package Cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class j20 {
	
	public static void main(String[] args){
		
		Scanner rl = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});

		System.out.print("Podaj liczbe A: ");
		double a = rl.nextDouble();
		
		System.out.print("Podaj liczbe B: ");
		double b = rl.nextDouble();
		
		System.out.print("Podaj liczbe C: ");
		double c = rl.nextDouble();
		
		System.out.print("Œednia: " + ((a+b+c)/3));
		rl.close();
	}
}