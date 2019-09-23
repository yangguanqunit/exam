package exam;

import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix;
		int a,b;
		while(scanner.hasNext()) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			matrix=new int[N+1][N+1];
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++)
					matrix[i][j]=-1;
				matrix[i][i]=0;
			}
			while(M-->0) {
				a=scanner.nextInt();
				b=scanner.nextInt();
				matrix[a][b]=scanner.nextInt();
				matrix[b][a]=matrix[a][b];
			}
			for(int k=1;k<=N;k++) {
				for(int i=1;i<=N;i++) {
					for(int j=1;j<=N;j++) {
						if(matrix[i][k]==-1&&matrix[k][j]==-1) continue;
						if(matrix[i][j]==-1||matrix[i][j]>matrix[i][k]+matrix[k][j]) {
							matrix[i][j]=matrix[i][k]+matrix[k][j];
						}
					}
				}
			}
			System.out.println(matrix[1][N]);
		}
	}

}
