package Cwiczenia;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;

public class j28 {

	public static void main(String[] args){
		
		Scanner rl = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		System.out.print("Wprowadz liczbê \"x\" z przedzia³u 0-100: " );
		int num = rl.nextInt();
		rl.nextLine();
		
		Random generator = new Random();
		
		int f1 = generator.nextInt(100);
		System.out.println("Pierwsza losowa liczba f1: " + f1);
		
		int f2 = generator.nextInt(100);
		System.out.println("Druga losowa liczba f2: " + f2);
		
		int f3 = generator.nextInt(100);
		System.out.println("Trzecia losowa liczba f3: " + f3);
		
		if(f1>num){
		System.out.println("f1 > wprowadzonej liczby");
		}
		else if(f1<num){
		System.out.println("f1 < wprowadzonej liczby");
		}
		else{
		System.out.println("f1 = wprowadzonej liczbie");
		}
		
		if(f2>num){
		System.out.println("f2 > wprowadzonej liczby");
		}
		else if(f2<num){
		System.out.println("f2 < wprowadzonej liczby");
		}
		else{
		System.out.println("f2 = wprowadzonej liczbie");
		}	
		
		if(f3>num){
		System.out.println("f2 > wprowadzonej liczby");
		}
		else if(f3<num){
		System.out.println("f2 < wprowadzonej liczby");
		}
		else{
		System.out.println("f2 = wprowadzonej liczbie");
		}	
		
	}
}