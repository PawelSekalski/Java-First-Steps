package j52;

import java.util.ArrayList;

public class Company {
	ArrayList<String> al = new ArrayList<String>();
	Company(ArrayList<String> al){
		this.al = al;
	}
	public void szefInfo(){
		for(String p : al){
			System.out.println(p);
		}
	}	
	public static void main(String[] args) {	
		ArrayList<String> pracownicy = new ArrayList<String>();		
		Employee p1 = new Employee("Adam","Kowalski","1987-02-05",23);
		pracownicy.add(p1.info());
		Employee p2 = new Employee("Jan","Nowak","1987-02-05",23);
		pracownicy.add(p2.info());
		Employee p3 = new Employee("Andrzej","Wilk","1987-02-05",23);
		pracownicy.add(p3.info());
		Employee p4 = new Employee("Marek","Lis","1987-02-05",23);
		pracownicy.add(p4.info());
		Company szef1 = new Company(pracownicy);
		szef1.szefInfo();
	}

}