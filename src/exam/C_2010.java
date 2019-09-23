package exam;

import java.util.Scanner;

public class C_2010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		int a, b, c, d;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		switch(a) {
		case 1:
			countercircle(matrix, b, c, d);
			break;
		case 2:
			countercircle(matrix, b, c, d);
			countercircle(matrix, b, c, d);
			countercircle(matrix, b, c, d);
			break;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static void countercircle(int[][] matrix, int b, int c, int d) {
		int[][] tmp = new int[5][5];
		for (int i = c - 1; i < c - 1 + b; i++) {
			for (int j = d - 1; j < d - 1 + b; j++) {
				tmp[j][b - i-1] = matrix[i][j];
			}
		}
		for (int i = c - 1; i < c - 1 + b; i++) {
			for (int j = d - 1; j < d - 1 + b; j++) {
				matrix[i][j]=tmp[i][j];
			}

		}
	}

}
