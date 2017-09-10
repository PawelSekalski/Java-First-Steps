package petle;

import java.util.Scanner;

public class j36 {

	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		System.out.println("Podaj wszystki liczby: ");
		int line = 0;
		int sum = 0;
		boolean hasZERO = false;
		
		do{ 
			line = rl.nextInt();
			if(line != 0 ){
				sum+=line;
			} else{
				hasZERO = true;
			}
		} while(!hasZERO);
			System.out.println("Suma = " +sum);
			rl.close();
			
	}		
}