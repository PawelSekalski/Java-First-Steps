package Cwiczenia;


import java.util.Scanner;

public class j24 {

	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		String wyraz;
		
		System.out.println("Podaj jaki� ci�g znak�w ");
		wyraz = rl.nextLine();
		
		StringBuffer bufor = new StringBuffer(wyraz);
		
		System.out.println("Ci�g znak�w odwrotnie to: " + bufor.reverse().toString());
		rl.close();

	}

}