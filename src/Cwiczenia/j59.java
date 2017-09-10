package Cwiczenia;

public class j59 {

	double pierwsze;
	char drugie;
		
	public j59(double pierwsze) {
		super();
		this.pierwsze = pierwsze;
		System.out.println(pierwsze);
	}
	public j59(char drugie) {
		super();
		this.drugie = drugie;
		System.out.println(drugie);
	}
	public j59(double pierwsze, char drugie) {
		super();
		this.pierwsze = pierwsze;
		this.drugie = drugie;
		System.out.println(pierwsze+" "+drugie);
	}
	public j59(char drugie, double pierwsze) {
		super();
		this.pierwsze = pierwsze;
		this.drugie = drugie;
		System.out.println(pierwsze+" "+drugie);
	}

	public static void main(String[] args) {
		j59 test1 = new j59(3.14);
		j59 test2 = new j59(3.14, 'K');
		j59 test3 = new j59('K', 3.14);
		j59 test4 = new j59('K');

	}

}