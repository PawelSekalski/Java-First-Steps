package petle;

import java.util.Scanner;

public class j32 {

	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in);
		
		System.out.print("Podaj sw�j wiek: ");
		if(age.nextInt() >=18){
			System.out.print("Wype�nij sw�j obywatelski obowi�zek! ");
		} else {
			System.out.print("Too young to vote! We DON'T want you!");
		}
		age.close();
	}
}