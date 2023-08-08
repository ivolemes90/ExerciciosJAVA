package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int M = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int N = sc.nextInt();
		int [][] mat = new int [M][N];
		
		System.out.println();
		for(int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Enter the value you want to find: ");
		int v = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				if (mat[i][j] == v) {					
					System.out.println("Position: " + i + "," + j + ":");
					if (j > 0) {
					System.out.println("Left :" + mat[i][j-1]);
					}
					if (i > 0) {
					System.out.println("Up :" + mat[i-1][j]);
					}
					if (j < N-1) {
					System.out.println("Right :" + mat[i][j+1]);
					}
					if (i < M-1) {
					System.out.println("Down :" + mat[i+1][j]);
					}
				}
			}
		}
		
		
		System.out.println();
		for(int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
