package Tablice;

import java.util.Random;

public class j44 {

	public static void main(String[] args) {
		int[] randInt = new int[20];
		Random generator = new Random();
		for(int i = 0; i<randInt.length; i++){
			randInt[i] = generator.nextInt(10)+1;
		}
		for(int i : randInt){
			System.out.print(i +" ");
		}
		System.out.println("");
		for(int i = 1; i<11; i++){
			int counter = 0;
			for(int j = 0; j< randInt.length; j++){
				if(randInt[j] == i){
					counter++;
				}
			}
			if(counter > 0){
				System.out.println(i +" powtarza siê w tablicy " + counter + " razy");
			}
		}
	}

}