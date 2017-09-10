package petle;

import java.util.Scanner;

public class j40 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj wysokoœæ choinki: ");
		int wysChoi = rl.nextInt();
		
		for(int w = 0; w <= wysChoi; w++){
			for(int i = 1; i <= wysChoi - w ; i++){
				System.out.print(" ");
			}
			for(int j = wysChoi; j > wysChoi- 2*w+1; j--){
				System.out.print("*");
			}		
			System.out.println();
		}
		for(int k = 0; k < wysChoi - 1; k++ ){
		System.out.print(" ");
		}
		System.out.print("*");
		rl.close();
	}

}