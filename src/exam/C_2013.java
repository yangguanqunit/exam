package exam;

import java.util.Scanner;

public class C_2013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int n, k;
		int[][] matrix;
		int[][] tmp;
		int[][] result;
		while (T-- > 0) {
			n = scanner.nextInt();
			k = scanner.nextInt();
			matrix = new int[n][n];
			tmp = new int[n][n];
			result = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = scanner.nextInt();
					tmp[i][j] = matrix[i][j]; 
				}
			}
			while (k-- > 1) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						for(int t=0;t<n;t++) {
							result[i][j]+=tmp[i][t]*matrix[t][j];
						}
					}
				}
				tmp = result;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}

		}
	}

}
