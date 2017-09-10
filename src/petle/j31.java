package petle;

import java.util.Scanner;

public class j31 {

	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		System.out.print("Podaj ci¹g znaków: ");
		String d = rl.nextLine();
		
		System.out.print("Podaj drugi ci¹g znaków: ");
		String g  = rl.nextLine();
		
		System.out.println(g.length()-3);
		System.out.println(g.charAt(g.length()-3));
		
		String o = String.valueOf(g.charAt(g.length()-3));
		System.out.println(o);
		
		for(String i : d.split(o)){
			System.out.println(i);
		}
		
		rl.close();
	}
	
}