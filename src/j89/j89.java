package j89;

public class j89 {
	
	public static void testString(String s) {

		try {
			System.out.println(s.length());
			
		} catch (NullPointerException e){
			e.printStackTrace();
			System.out.println("Nie mo¿na podaæ d³ugoœci dla napisu - zosta³ przekazany \"null\"");
			
		}
		
	}
	
	public static void main(String[] args) {
		testString("test");
		testString(null);
		
	}

}
