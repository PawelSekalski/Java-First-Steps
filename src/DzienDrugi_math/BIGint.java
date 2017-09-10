package DzienDrugi_math;

import static java.lang.Math.*;

import java.math.BigInteger;

public class BIGint {
	
	public static void main(String[] args){
		
		int x = 5;
		double y = 9.0;
		long i = 6564566454365546454l;
		long j = 6564566454365546454l;
		
		BigInteger bigIntJ = BigInteger.valueOf(j);
		
		//BigInteger bigBigInt = new BigInteger("54435546546456576576767657576765765765745643543543543");
		BigInteger bigBigInt = new BigInteger("76676575676576576575676575676575675676556666666666666");
		
		System.out.println(bigIntJ.toString());
		
		BigInteger bigIntI = BigInteger.valueOf(i);
		BigInteger temp = bigIntJ.add(bigIntI);
		
		System.out.println(temp.toString());
		System.out.println(bigBigInt.toString());
		
		/*long z = i+j;
		System.out.println(z);*/
		/*double pierwiastek = Math.sqrt(y);
		double potega = Math.pow(y, x);*/
		
		double pierwiastek = sqrt(y);
		
		double potega = pow(y, x);
		
		double gf = abs(x);
		
		System.out.println("Pierwiastek z " + y + "wynosi: " +pierwiastek);
		System.out.println("Liczba " + y + " podniesiona do potêgi " + x + " to: " + potega);
		
		
	}

}