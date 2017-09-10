package Cwiczenia;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class j21 {

	public static void main(String[] args){
		
		Scanner rl = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});

		double x = 0, y = 0;
		
		System.out.println("Podaj x");
		x = rl.nextDouble();
		rl.nextLine();
		
		System.out.println("Podaj y");
		y = rl.nextDouble();
		rl.nextLine();
		
		System.out.println("x==y: " + (x==y));
		System.out.println(x +"==" + y + (x==y));
		System.out.println("x>y: " + (x>y));
		System.out.println("x>=y: " + (x>=y));
		System.out.println("x<=y: " + (x<=y));
		System.out.println("x>y: " + (x<y));
		System.out.println("x!=y: " + (x!=y));
		
		rl.close();
	}
}