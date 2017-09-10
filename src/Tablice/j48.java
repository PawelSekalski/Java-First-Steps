package Tablice;

public class j48 {

	public static void main(String[] args) {
		int[][] MultiTab = new int[10][10];
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				MultiTab[i][j] = (i+1)*(j+1);
				System.out.print(MultiTab[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}

