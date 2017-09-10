package dziedziczenie;

public class Punkt2D {
	int x;
	int y;
	
	public void move(int a, int b){
		this.x = x + a;
		this.y = y + b;
	}
	public void print(){
		System.out.println("Aktualne po³o¿enie: ["+x+","+y+"]");
	}
	public Punkt2D() {
	}
	public Punkt2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}