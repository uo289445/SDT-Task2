package exampleProject;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] table = new int[3][3];
		Random rn = new Random();
		for(int i=0;i<table.length;i++) {
			System.out.println();
			for(int j=0;j<table.length;j++) {
				table[i][j] = rn.nextInt(10);
				System.out.print(table[i][j]+" ");
			}
		}
		
	}

}
