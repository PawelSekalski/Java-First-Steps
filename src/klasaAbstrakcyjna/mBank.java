package klasaAbstrakcyjna;

public class mBank extends KontoBankowe {

	@Override
	void intrest(int nrKonta, float saldo) {
		System.out.println("Dane rachunku: \nnr rachunku: "+nrKonta+"\nsaldo: "+saldo);
		
	}
	@Override
	void addDebit() {
		System.out.println("Uznajemy ka�d� kart�, nawet kfc partner klub");
		
	}

}