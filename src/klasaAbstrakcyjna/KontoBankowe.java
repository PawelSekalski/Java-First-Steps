package klasaAbstrakcyjna;

public abstract class KontoBankowe {
	int nrKonta;
	float saldo;
	
	public float addSaldo(float kwota){
		return this.saldo = saldo + kwota;
	}
	public float subSaldo(float kwota){
		return this.saldo = saldo - kwota;
	}
	abstract void addDebit();
	abstract void intrest(int nrKonta,float saldo);
	
}