package Cwiczenia;

import java.math.BigDecimal;
import java.math.BigInteger;

public class j17 {
	
	public static void main(String[] args){
		
		BigInteger firstBig = new BigInteger("1241241635172453");
		BigInteger secondBig = new BigInteger("4241241635172452");
		//BigInteger tempBig;// = BigInteger.ZERO;
		

		BigInteger  tempBig = firstBig.add(secondBig); //dodawanie
		System.out.println(tempBig.toString());
		
		tempBig = firstBig.subtract(secondBig); //odejmowanie	
		System.out.println(tempBig.toString());
		
		tempBig = firstBig.multiply(secondBig); //mno¿enie
		System.out.println(tempBig.toString());
		
		tempBig = secondBig.divide(firstBig); //dzielenie	
		System.out.println(tempBig.toString());

	}
}