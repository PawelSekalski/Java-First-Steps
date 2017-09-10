package Tablice;

import java.util.Scanner;

public class j46 {
	
	public static void main(String[] args) {
		System.out.println("Podaj liczbê do przekszta³cenia na kod binarny: ");
		Scanner rl = new Scanner(System.in);
		int liczba = rl.nextInt();
		int[] tabl = new int[10];
		
		for(int i=tabl.length - 1; i >= 0 ; i--){
			tabl[i] = liczba % 2;
			liczba /= 2;
		}
		for(int i : tabl){
			System.out.print(i);
		}
		rl.close();
	}
}
/*
do{
	if(liczba % 2 == 0){
		liczba /= 2;
		tabl[licznik++] = 0;
	} else{
		liczba /=2;
		tabl[licznik++] = 1;
	}
} while(liczba > 0);
	System.out.println("Twoja liczba binarnie to: ");
	for(int i = tabl.length-1; i >= 0 ; i-- ){
		if(licznik>=i){
			System.out.print(tabl[i]);
		} else{
			System.out.print(0);
		}
	}*/
	
