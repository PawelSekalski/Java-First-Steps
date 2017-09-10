package operacjeNaPlikach;

public class j82 {
	
	private String nazwa;
	private String autor;
	private String rW;
	
	//G-S
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getrW() {
		return rW;
	}
	public void setrW(String rW) {
		this.rW = rW;
	}
	
	//Constr
	public j82(String nazwa, String autor, String rW) {
		super();
		this.nazwa = nazwa;
		this.autor = autor;
		this.rW = rW;
	}
	
	
	

}
