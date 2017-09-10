package PierwszaPaczka;

public class testString {

	public static void main(String[] args) {
		String hello = "Hello ";
		String world = "World!";
		String powitanie = hello+world+ " You beautiful son of a mother!";
		System.out.println(powitanie);
		
		String czesc = powitanie.substring(0, 6) + "uczniu";
		System.out.println(czesc);

	}

}
