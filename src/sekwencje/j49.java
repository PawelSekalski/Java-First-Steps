package sekwencje;

import java.util.ArrayList;
import java.util.Scanner;

public class j49 {

	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		System.out.println("Wpisuj kolejne s³owa - \"end\", by wyœwietliæ listê");
		
		ArrayList<String> arrList = new ArrayList<>();
		String rr = rl.nextLine();
			while( (!rr.equals("end")) && (!rr.equals("END")) ){
				arrList.add(rr);
				rr = rl.nextLine();
			}
		
			System.out.print(arrList);
		rl.close();
	}
}