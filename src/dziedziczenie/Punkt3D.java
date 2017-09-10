package dziedziczenie;

public class Punkt3D extends Punkt2D{
	int z;
	
	public void move(int a, int b, int c){
		super.move(a, b);		// wywo³anie metody z klasy nadrzêdnej
		this.z = z + c;
	}
	public void print(){
		System.out.println("Aktualne po³o¿enie: ["+x+","+y+","+z+"]");
	}
	public Punkt3D() {
	}
	public Punkt3D(int x, int y, int z) {
		super(x,y);				// wywo³anie konstruktora klasy nadrzêdnej
		this.z = z;
	}
		
	
	
}