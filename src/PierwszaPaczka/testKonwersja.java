package PierwszaPaczka;

public class testKonwersja {

	public static void main(String[] args) {
		
		char letter1 = 'k'; 
		char letter2 = 'o';
		char letter3 = 't';
		
		System.out.println("Bêdne \"sumowanie \' znaków");
		System.out.println((int)letter1);
		System.out.println((int)letter2);
		System.out.println((int)letter3);
		System.out.println(letter1+letter2+letter3);
		
		System.out.println("Tekst jawny");
		System.out.println("" + letter1+letter2+letter3);
		
		letter1++;
		letter2++;
		letter3++;
		
		System.out.println((int)letter1);
		System.out.println((int)letter2);
		System.out.println((int)letter3);
		
		System.out.println("Tekst zaszyfrowany");
		System.out.println("" + letter1+letter2+letter3);
		
		letter1--;
		letter2--;
		letter3--;
		
		System.out.println("Tekst rozszyfrowany");
		System.out.println("" + letter1+letter2+letter3);
		
		int a = 5;
		double b = 5.5;
		
		System.out.println((int)b);
		
		int c = (int)(a/b);
		
		System.out.println(c);
		
	}
}