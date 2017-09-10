package PierwszaPaczka;

public class testOperatoryLog_II {
	
	public static void main(String[] arg){
		int x = 5;
		int y = 10;
		
		System.out.println("X>Y " + (x>y));
		System.out.println("X<Y " + (x<y));
		System.out.println("X!=Y " + (x!=y));
		System.out.println("X==Y " + (x==y));
		System.out.println(!(x>y));
		System.out.println((x>y)||(x<y));
		System.out.println((x>y)&&(x<y));
		
		int wynik = x>y?x:y;
		
		System.out.println(wynik);
	}
}