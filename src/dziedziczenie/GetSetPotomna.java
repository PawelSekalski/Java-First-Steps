package dziedziczenie;

public class GetSetPotomna extends GetSetBazowa {

	int rok = 1900;
	int miesiac;
	public GetSetPotomna(String nazwisko){
		super(nazwisko);
	}
	
	public GetSetPotomna(String imie, int pesel, int rok) {
		super(imie, pesel);	
		this.rok = rok;
		this.miesiac = 8;
		}
	public GetSetPotomna(int pesel, int rok) {
		super(pesel);	
		this.imie = "Anonim";
		this.rok = rok;
		this.miesiac = 8;
		}

	public GetSetPotomna(String imie, String nazwisko) {
		super(imie, nazwisko);
	}

	public static void main(String[] args) {
		
		GetSetPotomna gs1 = new GetSetPotomna("Micha³", 95465232, 2000);
		System.out.println(gs1.getImie()+ " "+gs1.getPesel()+" "+gs1.rok);
		
		//gs1.imie = "abc"; - nie widoczna z klasy potomnej
		gs1.setImie("Adam");
		gs1.setPesel(1);
		gs1.rok = 2001;
		
		System.out.println(gs1.getImie()+ " "+gs1.getPesel()+" "+gs1.rok+" "+gs1.miesiac);
		
		//gs1.infoBaza();
		GetSetPotomna gs2 = new GetSetPotomna(95465232, 2000);
		System.out.println(gs2.getImie()+ " "+gs2.getPesel()+" "+gs2.rok+" "+gs2.miesiac);
		GetSetPotomna gs3 = new GetSetPotomna("Nazwisko");
		GetSetPotomna gs4 = new GetSetPotomna("Imie","");
	
		System.out.println(gs3.getImie()+ " "+gs3.nazwisko);
		System.out.println(gs4.getImie()+ " "+gs4.nazwisko);
		}
}