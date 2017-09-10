package j91;

import java.util.InputMismatchException;
import java.util.Scanner;

public class j91 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num = 0;
		boolean error = true;
		
		while (error) {
			
			System.out.println("Podaj liczbê lub zakoñcz \"q\"");
				try {
				num = s.nextInt();
				System.out.println("Podana liczba: "+num);
				error = false;
				} catch (InputMismatchException e) {
					if(s.hasNext("q")) {
						break;
					}
					System.out.println("Podano niew³aœciw¹ wartoœæ! Spróbuj ponownie...");
					s.nextLine();
				}
				
		}
		s.close();
	}
	
}
