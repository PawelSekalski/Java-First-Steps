package obiekty;

public class AutoCar extends Car {

	public AutoCar(String brand, String name, int price) {
		super(brand, name, price);
	}

	public static void main(String[] args) {
		Car c1 = new Car("Opel","Astra",50000);
		System.out.println(c1.info());
		System.out.println(c1.brand);
		c1.brand = "Audi";
		System.out.println(c1.brand);
		c1.drive();
		AutoCar a1 = new AutoCar("xxx","yyy",15000);
		System.out.println(a1.info());
	}

}