package petle;

import java.util.Scanner;

public class j41 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj jak¹ liczbe ca³kowit¹ wiêksz¹ od zera");
		int liczba = rl.nextInt();
		System.out.println("Liczba " + liczba + " jest podzielna przez: ");
		if(liczba >0){
			for (int i = 1; i<liczba+1; i++){
				if(liczba %i == 0){
					System.out.println(i);
				}
			}
		} else {
		System.out.println("Liczba mniejsza od zera");
		}
	rl.close();
	}
}