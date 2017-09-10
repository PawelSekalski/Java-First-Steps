package Tablice;

public class tabTest {

public static void main(String[] args) {
		
		int [][] tab = new int [3][3];
		tab [0][0] = 1;
		tab [0][1] = 2;
		
		int [][] tab2 = { {1,2,3,5,6}, {4,5,6,5,6}, {7,8,9,5,6} };
		
		for(int i = 0; i<= tab2.length -1; i++){
			for (int j = 0; j <= tab2[1].length -1; j++){
				System.out.print(tab2[i][j]);
			}
			System.out.println("");
		}
		
		String [][][] tab3 = 	{ 
								{ {"a1","a2"} , {"a3", "a4"} }, 
								{ {"b1", "b2"}, {"b3", "b4"} } 
								};
		
		System.out.println(tab3[1][0][1]);
		System.out.println(tab2[0].length);
		System.out.println(tab2.length);		// d³ugosc pierwszego wymiaru
		System.out.println(tab2[1].length);		// d³ugosc drugiego wymiaru
		
		//------------------------------------------------------------
		String[] firstNames = {"Karol", "Basia", "Kasia"};
		String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};
		String[][] firstLast = {firstNames, lastNames};
		
		int liczba = 10;
		int [] small = new int[liczba];
		
		for (int i = 0; i <= firstNames.length-1; i++){
				System.out.print(firstLast[0][i]);
				System.out.print(" ");
				System.out.print(firstLast[1][i]);
				System.out.println("");
			}
		
	}
}