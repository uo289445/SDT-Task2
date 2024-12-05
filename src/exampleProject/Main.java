package exampleProject;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] table = new int[4][3];
		Random rn = new Random();
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table.length;j++) {
				table[i][j] = rn.nextInt(10);
				System.out.print(table[i][j]+"  ");
			}
			System.out.println();
		}
		
		int[] listedTable = new int[table.length*table.length];
        int index = 0;
        for (int[] line : table) {
            for (int num : line) {
            	listedTable[index++] = num;
            }
        }
        
        Arrays.sort(listedTable,0,7); //sorts the first 5 numbers
        
        index = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = listedTable[index++];
            }
        }
       
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
	}

}
