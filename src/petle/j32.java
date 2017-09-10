package petle;

import java.util.Scanner;

public class j32 {

	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in);
		
		System.out.print("Podaj swój wiek: ");
		if(age.nextInt() >=18){
			System.out.print("Wype³nij swój obywatelski obowi¹zek! ");
		} else {
			System.out.print("Too young to vote! We DON'T want you!");
		}
		age.close();
	}
}