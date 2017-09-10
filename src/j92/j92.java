package j92;

public class j92 {

	void canThrowExc() throws Exception {
		if (new java.util.Random().nextInt(5) == 0)
			throw new Exception();
		}
	
	public static void main(String[] args) {
		j92 z = new j92();
		int v = 1; //zaczynaæ od pierwszego przypadku
		
		try {
			z.canThrowExc();
			v++;
			z.canThrowExc();
			v++;
			z.canThrowExc();
			v++;
			z.canThrowExc();
			v++;
			z.canThrowExc();
			v++;
		  } catch (Exception e) {
			  e.printStackTrace();
			System.out.println("Wyj¹tek wywo³any zosta³ po "+v+" losowaniu");
		}
		if(v == 6) {
			System.out.println("Wyj¹tek nie wyst¹pi³");
		}
		
		}
	}