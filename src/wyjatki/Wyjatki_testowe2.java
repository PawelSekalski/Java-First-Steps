package wyjatki;

import java.util.Scanner;

public class Wyjatki_testowe2 {

		public static void main(String[] agrs) throws ArithmeticException{
			int x=10;
			int y;
			Scanner sc = new Scanner(System.in);
			System.out.print("Podaj dzielnik: ");
			y = sc.nextInt();
			if(y==0)
				throw new ArithmeticException("Nie mozna dzieliæ przez 0");
			else
				System.out.println(x/(double)y);
			System.out.println("Poza obs³ug¹");
		}
	}