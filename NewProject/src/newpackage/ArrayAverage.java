package newpackage;

import java.io.*;

public class ArrayAverage {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		
		String inData;
		int k=1;
		
		int[][] n = new int[4][5];
		for(int i = 0; i < 4; i ++) {
			
			for (int j = 0; j < 5; j++) {
				
				
				System.out.println("Enter number: " );
				
				inData = stdin.readLine();
				int n1 = Integer.parseInt(inData);
				
				n[i][j] = n1;
				k++;
				
			}
			
			
			
		}
		
		System.out.println("");
		System.out.println("=============");
		System.out.println(" ");
		int ave = 0;
		for(int row = 0; row < 4; row++) {
			
			for(int column = 0; column < 5; column++) {
				
				System.out.print(n[row][column] + " ");
				ave = ave+ n[row][column];
				//System.out.print(ave);
			}
			System.out.println(ave/5);
			ave = 0;
			System.out.println();
		}
		
		
				

	}

}
