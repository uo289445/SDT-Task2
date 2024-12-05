package exampleProject;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] table = new int[3][3];
		Random rn = new Random();
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table.length;j++) {
				table[i][j] = rn.nextInt(10);
				System.out.print(table[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] squaredTable = table.clone();
		for(int i=0;i<squaredTable.length;i++) {
			for(int j=0;j<squaredTable.length;j++) {
				squaredTable[i][j] = (int) Math.pow(table[i][j],2);
				System.out.print(squaredTable[i][j]+" ");
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
        
        //Arrays.sort(listedTable);
        
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
