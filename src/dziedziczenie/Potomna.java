package dziedziczenie;

public class Potomna extends Bazowa {
	
	protected void info(){
		System.out.println("info2");
	}
	
	public static void main(String[] args) {
		Potomna p1 = new Potomna();
		System.out.println(p1.liczba);
		p1.info();

	}

}