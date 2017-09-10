package petle;

import java.util.Scanner;

public class j35 {

	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		System.out.println("Podaj liczbê");
		int liczba = rl.nextInt();
		
		for(int i = 0; i <= liczba; i++){
			System.out.println(Math.pow(2,i));
		}
		rl.close();
	}
}