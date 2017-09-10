package obiekty;

public class Car {

	String brand;
	String name;
	int price;

	public Car(String brand, String name, int price){
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	public String info(){
		return "Dane auta: "+ brand + " " + name + " " + price + "z³.";
	}
	
	public void drive(){
		System.out.println("jedziemy");
	}
}

