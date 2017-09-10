package j90;

import java.util.Random;

public class j90 {
	
	private class MyException1 extends Exception{}
	private class MyException2 extends Exception{}

	public void losuj() throws MyException1, MyException2, myExceptions {
		Random r = new Random();
		
		switch(r.nextInt(3)) {
		case 0:
			throw new MyException1();
		
		case 1:
			throw new MyException2();

		case 2:
			throw new myExceptions();	
		}	
	}
		
	public static void main(String[] args) {
		j90 test1 = new j90();
		try {
			test1.losuj();
		} catch (MyException1 e) {
			System.out.println("Z³apano wyj¹tek klasy " + e.getClass());
		} catch (MyException2 e) {
			System.out.println("Z³apano wyj¹tek klasy " + e.getClass());
		} catch (myExceptions e) {
			System.out.println("Z³apano wyj¹tek klasy " + e.getClass());
		}
	}

}
