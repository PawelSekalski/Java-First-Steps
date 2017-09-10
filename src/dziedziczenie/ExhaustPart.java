package dziedziczenie;

public class ExhaustPart extends Part {
	
	boolean stnd;
	
	public ExhaustPart(String nazwa, String model, String seria, boolean stnd) {
		super(nazwa, model, seria);
		this.stnd = stnd;
	
	}

}