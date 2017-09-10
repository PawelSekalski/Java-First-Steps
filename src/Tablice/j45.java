package Tablice;

import java.util.Random;

public class j45 {

	public static void main(String[] args) {
		
		int[][] tabl = new int[5][5];
		
		//generowanie
		Random generator = new Random();
		for(int i = 0; i < tabl.length; i++){
			for(int j = 0; j < tabl[i].length; j++){
				tabl[i][j] = generator.nextInt(11)-5;
			}
		}
		
		//wypisywanie
		for(int i = 0; i < tabl.length; i++){
			for(int j = 0; j < tabl[i].length; j++){
				System.out.print(tabl[i][j]+"\t");
			}
			System.out.println("");
		}
		
		//liczymy minima i maksima
		int tempMin = tabl[0][0];
		int tempMax = tabl[0][0];
		int[][] maxMin = new int[2][5];
		for(int j = 0; j<tabl.length; j++){
			
			for(int i = 0; i<tabl[j].length; i++){
			//System.out.print(tabl[i][j]);
			
			if(tempMin>tabl[i][j]){
			tempMin = tabl[i][j];
			}
			if(tempMax<tabl[i][j]){
				tempMax = tabl[i][j];
				}
			}
			
			maxMin[0][j] = tempMax;
			maxMin[1][j] = tempMin;
			tempMax = 0;
			tempMin = 0;
		}
		
		//Wypisywanie
		System.out.println("");
		for(int i = 0; i<maxMin.length; i++){
			for(int j = 0; j<maxMin[i].length; j++){
				System.out.print(maxMin[i][j]+"\t");
			}
			
			System.out.println("");
		
		}
	}
}
