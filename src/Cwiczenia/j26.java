package Cwiczenia;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public class j26 {
	public static void main(String[] args) throws IOException{
		
		Scanner rl = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		System.out.print("Wprowadz pierwsz� liczb� \nx: " );
		
		float x = rl.nextFloat();
		rl.nextLine();
		
		System.out.print("Wprowadz znak dzia�ania matemtycznego ktore chcesz wykona�: " );
		
		String znak = rl.nextLine();
		
		System.out.print("Wprowadz drug� liczb� y: " );
		float y = rl.nextFloat();
		rl.nextLine();
		
		if(znak.equals("/")){
			System.out.println("Wynik x/y=" + (x/y));
		}
		else if (znak.equals("*")) {
			System.out.println("Wynik x*y=" + (x*y));
		}
		else if (znak.equals("+")) {
			System.out.println("Wynik x+y=" + (x+y));
		}
		else if (znak.equals("-")) {
			System.out.println("Wynik x-y=" + (x-y));
		}
		else
			System.out.println("Wprowadziles zly znak");
		rl.close();
	
	}
}