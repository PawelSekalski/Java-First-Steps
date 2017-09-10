package dziedziczenie;

public class PartTestowa {

	public static void main(String[] args) {
		
		Tyre t1 = new Tyre("Letniowa","Michelin","M123",18,60,255);
		System.out.println(t1.NR+" "+t1.nazwa+" "+t1.model+" "+t1.seria+" "+t1.wysokosc+" "+t1.szerokosc);
		
		Wheel w1 = new Wheel("AluFel","BBS","BBS123",18);
		System.out.println(w1.NR+" "+w1.nazwa+" "+w1.model+" "+t1.seria+" "+w1.cale);
		
		ExhaustPart e1 = new ExhaustPart("Remus","xcvb51","rs44",true);
		System.out.println(e1.NR+" "+e1.nazwa+" "+e1.model+" "+e1.seria+" "+e1.stnd);

	}

}