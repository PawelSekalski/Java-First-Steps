package j95;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cT {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);	    

	    double num1 = 0;
	    double num2 = 0;
	    double odp = 0;
		String option;
		
	    while (true){
	    	try {
		    	System.out.println("podaj pierwsz¹ liczbê:");
		    	num1 = sc1.nextInt();
		    	System.out.println("podaj drug¹ liczbê:");
		    	num2 = sc1.nextInt();
		    	sc1.nextLine();
		    	
		    	System.out.println("Wybierz operacjê arytmetyczn¹(+, -, *, /):");
		    	option = sc1.nextLine();
		    	
		    	if(option.equals("+")) {
		    		odp = num1 + num2;
		    		System.out.println(odp);
		    	}
		    	else if(option.equals("-")) {
		    		odp = num1 - num2;
		    		System.out.println(odp);
		    	}
		    	
		    	else if(option.equals("*")) {
		    		odp = num1 * num2;
		    		System.out.println(odp);
		    	}
		    	
		    	else if(option.equals("/")) {
		    		try {
		    		odp = num1 / num2;
		    		
		    		if(num2 == 0) {
		    			throw new ArithmeticException();
		    		}
		    		System.out.println(odp);
		    		} catch(ArithmeticException e) {
		    			System.out.println("b³¹d! dzielenie przez zero");
		    			sc1.nextLine();
		    		} catch(InputMismatchException e) {
		        			System.out.println("b³¹d! z³y typ danych");
		        			sc1.nextLine();
		        			}
		    		
		    	} else {
		    	break;
		    	}
	    	} catch(InputMismatchException e) {
    			System.out.println("b³¹d! z³y typ danych");
    			sc1.nextLine();
    			}
	    	
		}
	    sc1.close();
	} 
	
}