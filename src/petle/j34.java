package petle;

import java.util.Scanner;

public class j34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Podaj liczbê: ");
		int num1 = sc.nextInt();
		
		System.out.print("Podaj liczbê: ");
		int num2  = sc.nextInt();
		int sum = 0;
		int i = 0;
		if(num1 < num2){
		for (i = num1; i<=num2; i++){
		sum += i;
		}
		
		System.out.println("Suma ci¹gu="+sum);
		}
		
		sc.close();
	}

}