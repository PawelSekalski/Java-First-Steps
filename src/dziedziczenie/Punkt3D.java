package dziedziczenie;

public class Punkt3D extends Punkt2D{
	int z;
	
	public void move(int a, int b, int c){
		super.move(a, b);		// wywołanie metody z klasy nadrzędnej
		this.z = z + c;
	}
	public void print(){
		System.out.println("Aktualne położenie: ["+x+","+y+","+z+"]");
	}
	public Punkt3D() {
	}
	public Punkt3D(int x, int y, int z) {
		super(x,y);				// wywołanie konstruktora klasy nadrzędnej
		this.z = z;
	}
		
	
	
}