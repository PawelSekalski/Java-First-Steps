package dziedziczenie;

public class Punkt3D extends Punkt2D{
	int z;
	
	public void move(int a, int b, int c){
		super.move(a, b);		// wywo�anie metody z klasy nadrz�dnej
		this.z = z + c;
	}
	public void print(){
		System.out.println("Aktualne po�o�enie: ["+x+","+y+","+z+"]");
	}
	public Punkt3D() {
	}
	public Punkt3D(int x, int y, int z) {
		super(x,y);				// wywo�anie konstruktora klasy nadrz�dnej
		this.z = z;
	}
		
	
	
}