package PierwszaPaczka;

public class testKon {

	public static void main(String[] args) {
		
		double number1 = 10.987;
		float number3 = 10.789f;
		int number2 = 5;
		int narrowing = (int)number1;
		double widening = (double)number2;
		
		System.out.println("Narrowing: "+ narrowing);
		System.out.println("Widening: "+ widening);
		
		long c = Math.round(number3);
		
		System.out.println(c);
		
		String ala = "Ala";
		String ala2 = "Ala";
		String al = "Al";
		String a = "a";
		String ala3 = al+a;
		String kot = "Kot";
		System.out.println(ala.equals(ala3));

	}

}