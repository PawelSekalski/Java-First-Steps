package Cwiczenia;

import java.util.Random;

public class j16 {

	public static void main(String[] args){
		
		Random gen = new Random();
		
		int x = gen.nextInt(10);
		boolean result;
		int y = gen.nextInt(10);
		
		System.out.println("Liczba x =" + x + " liczba y =" + y);
		
		System.out.println("Czy x jest wiêksze od y?: " + (x>y));
		result = (x>y);
		
		System.out.println("Czy x pomno¿one przez 2 jest wiêksze od y?: " + (2*x>y));
		result = (2*x>y);
		
		System.out.println("Czy y jest mniejsze od sumy x+3 i jednoczeœnie wiêksze od x pomniejszonego o 2?: " + ((y<x+3)&&(y>x-2)));
		result = ((y<x+3)&&(y>x-2));
		
		System.out.println("Czy iloczyn liczb x i y jest parzysty?: " + ((x*y)%2==0));
		result = ((x*y)%2==0);
	}
}