package dziedziczenie;

public class Part {
	
	static int id;
	final int NR;
	String nazwa, model, seria;
	
	public Part(String nazwa, String model, String seria) {	
		NR = ++id;
		this.nazwa = nazwa;
		this.model = model;
		this.seria = seria;
	}
}