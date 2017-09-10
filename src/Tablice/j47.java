package Tablice;

public class j47 {

	public static void main(String[] args) {
		
		int[][] tab = new int[3][3];
		int[][] Result = new int[3][3];
		
		// macierz jednostkow¹
		for(int i =0; i<tab.length; i++){
			for(int j = 0; j<3; j++){
				if(i==j){
					tab[i][j] = 1;
		}}}
		for(int i =0; i<3; i++){
			for(int j = 0; j<tab.length; j++){
				Result[i][j] = tab[i][j]+tab[i][j];
				System.out.print("\t" + Result[i][j]);
			}
			System.out.println("");
			}
	}

}	
	