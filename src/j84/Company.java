package j84;

public class Company {
	
	private String[] pracownicy;
	
	public String[] getPracownicy() {
		return pracownicy;
	}
	
	public void sePracownicy(String[] pracownicy) {
		this.pracownicy = pracownicy;
	}
	
	public Company() {
		pracownicy = new String[3];
	}

}
