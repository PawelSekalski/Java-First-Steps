package Cwiczenia;

import static java.lang.Math.*;

public class j18 {

	public static void main(String[] args){

int a = 5;
		int c = -89;
		float b = 9f;
		float r = 5.8f;
		
		double roun = round((PI*pow(r,2)*1000))/1000d;
		
		System.out.println(roun);
		System.out.println((PI*pow(r,2)));
		System.out.println(sqrt(b));
		System.out.println(pow(b,a));
		System.out.println(abs(c));
		
		System.out.println("Pole ko³a: " + round((PI*pow(r,2)))); //zaokr¹glenie
		System.out.println(roun); // dok³adny
		
		System.out.println("Obwód okrêgu: " + (2*PI*r));
	}
}