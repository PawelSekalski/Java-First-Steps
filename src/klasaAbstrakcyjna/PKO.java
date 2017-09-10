package klasaAbstrakcyjna;

public class PKO extends KontoBankowe {

	@Override
	void addDebit() {
		System.out.println("Nie uznajemy karty p³ywackiej Morza Czarnego");	
		
	}

	@Override
	void intrest(int nrKonta, float saldo) {
		System.out.println("Dane rachunku: \nnr rachunku: "+nrKonta+"\nsaldo: "+saldo);
		
	}

}