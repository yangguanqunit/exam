package exam;

import java.util.Scanner;

public class Symmetricmatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		boolean isSymmetric=true;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		loop:
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(matrix[i][j]!=matrix[j][i]) {
					isSymmetric=false;
					break loop;
				}
			}
		}
		System.out.println(isSymmetric?"YES":"NO");

	}

}
