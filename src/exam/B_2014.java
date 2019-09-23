package exam;

import java.util.Scanner;

public class B_2014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix;
		int T = scanner.nextInt();
		int N, M, angle;
		char[] tmp;
		while (T-- > 0) {
			N = scanner.nextInt();
			M = scanner.nextInt();
			matrix = new int[N][M];
			scanner.nextLine();
			for (int i = 0; i < N; i++) {
				tmp = scanner.nextLine().toCharArray();
				for (int j = 0; j < M; j++) {
					matrix[i][j] = Integer.parseInt(tmp[j] + "");
				}
			}
			angle = scanner.nextInt();
			matrix = turn(matrix, angle, N, M);
			for (int[] a : matrix) {
				for (int b : a) {
					System.out.print(b);
				}
				System.out.println();
			}
		}

	}

	public static int[][] turn(int[][] list, int angle, int N, int M) {
		int times = angle / 90;
		int tmp;
		int[][] result = null;
		while (times-- > 0) {
			result = new int[M][N];
			int j = N - 1;
			for (int[] a : list) {
				for (int i = 0; i < M; i++) {
					result[i][j] = a[i];
				}
				j--;
			}
			list = result;
			tmp = N;
			N = M;
			M = tmp;
		}
		return result;
	}

}
