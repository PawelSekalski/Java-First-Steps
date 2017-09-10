package Cwiczenia;

public class j9_10 {
	
	public static void main(String[] args){
		
		String a = "Ala ";
		String b= "ma ";
		String c = a+b;
		String d = c +"kota";
		
		System.out.println("Zmienna d ma d³ugoœæ: " + d.length());
		
		System.out.println("znak na 2 i 5 indeksie w trzecim ci¹gu to: " + Character.valueOf(c.charAt(2)).charValue() + c.charAt(5));
		
		System.out.println((int)c.charAt(5));
		
		System.out.println("trzeci znak od koñca czwartego ci¹gu to: " + d.charAt(d.length()-3));
		
		System.out.println("Pierwszy i drugi wyraz zmiennej d to: " + d.substring(0,a.length())
		+" "+ d.substring(a.length(),a.length()+b.length()));
	
	}
}
