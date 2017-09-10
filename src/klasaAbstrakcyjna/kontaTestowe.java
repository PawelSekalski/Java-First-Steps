package klasaAbstrakcyjna;

public class kontaTestowe {

	public static void main(String[] args) {
		mBank m1 = new mBank();
		m1.addDebit();
		m1.addSaldo(1000);
		m1.subSaldo(500);
		m1.intrest(15648, 3000);
		
		PKO p1 = new PKO();
		p1.addDebit();
		p1.addSaldo(1000);
		p1.subSaldo(500);
		p1.intrest(15848, 3000);
		
		

	}

}