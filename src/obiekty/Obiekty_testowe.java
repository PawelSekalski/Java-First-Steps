package obiekty;

public class Obiekty_testowe {

static String p = "zmienna globalna";
	
	public static void main(String[] args) {
		int a = 1;
		
		for(int i = 1; i <= 9; i ++){
			// zakres lokalny w pêtli for
			System.out.println("w pêtli (i): "+i );
			a = a + 1;
			System.out.println("w pêtli (a): "+ a);
		}
		// zmienna i nie jest widoczna poza pêtl¹
		// System.out.println(i);
		System.out.println("na zewn¹trz (a): "+a);
		
		// zmienna klasowa jest dostêpna w metodzie 
		System.out.println("w main (p): "+p);
		//wywo³anie metody
		info();
	}
	
	static void info(){
		int b = 2;
		if(true){
			int c = 3;
		}
		System.out.println("Jestem w metodzie info");
		// zmienna klasowa jest dostêpna w metodzie 
		System.out.println("w info (p): "+p);
	}
	

}