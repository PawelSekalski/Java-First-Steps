package Cwiczenia;

import java.util.Scanner;
import static java.lang.Math.*;

public class j22 {

	public static void main(String[] args){
	
		Scanner rl = new Scanner(System.in);
		double x = 0, y = 0;
		
		System.out.println("Podaj bok szeœciokata");
		x = rl.nextDouble();
		rl.nextLine();
		
		x = (3*pow(x,2)*sqrt(3))/2;
		
		System.out.println("Pole szeœciok¹ta foremnego to: " + x);
		rl.close();
	}
}