package dziedziczenie;

public class Apple extends Fruit {
	String type, serie;
	

	public void printInfo(){
		super.printInfo();
		System.out.println("Typ: "+serie);
		System.out.println("Odmiana: "+type);
	}
	public Apple(String type) {
		super();
		this.type = type;
		this.serie = "D¿abko";
	}
	
	
	
}