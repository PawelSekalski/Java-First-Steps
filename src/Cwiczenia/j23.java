package Cwiczenia;

import java.util.Scanner;
import static java.lang.Math.*;

public class j23 {

	public static void main(String[] args){
		
		final double oneDegreeLenght = 111;
		
		Scanner rl = new Scanner(System.in);
		
		System.out.println("Podaj pierwsz¹ wspó³rzedn¹ pierwszego punktu x1: ");
		double x1 = rl.nextFloat();
		rl.nextLine();
		
		System.out.println("Podaj drug¹ wspó³rzêdn¹ pierwszego punktu x2: ");
		double x2 = rl.nextFloat();
		rl.nextLine();
		
		System.out.println("Podaj pierwsz¹ wspó³rzedn¹ drugiego punktu y1: ");
		double y1 = rl.nextFloat();
		rl.nextLine();
		
		System.out.println("Podaj drug¹ wspó³rzêdn¹ drugiego punktu y2: ");
		double y2 = rl.nextFloat();
		rl.nextLine();
		
		double dist = oneDegreeLenght * sqrt(pow((x1-y1),2)+pow((cos((x1*PI)/180)*(x2-y2)), 2));
		
		System.out.println("Odleg³oœæ miêdzy dwoma punktami na ziemi to : " + dist);
	}
}