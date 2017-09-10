package petle;
import java.util.Scanner;

public class j33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj liczbê: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Podaj napis: ");
		String txt  = sc.nextLine();

		for(int i = 0; i<=txt.length()-1; i = i + number ){		
			System.out.print(txt.charAt(i));
		}
		sc.close();
	}

}