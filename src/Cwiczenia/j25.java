package Cwiczenia;

import java.io.FilterInputStream;
import java.util.Scanner;

public class j25 {

	public static void main(String[] args) {
		
		Scanner rl = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		
		String wyraz;
		
		System.out.println("Podaj ci¹g znaków: ");
		wyraz = rl.nextLine();
		
		System.out.println("W ci¹gu jest " + wyraz.length() + " znaków");
		rl.close();

	}

}