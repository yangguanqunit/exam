package exam;

import java.util.Scanner;

public class C_2014n {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int D = scanner.nextInt();
		int[][] matrix=new int[N][M];
		int[][] flag=new int[N][M];
		int t=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				matrix[i][j]=scanner.nextInt();
				flag[i][j]=-1;
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
					if(flag[i][j]!=-1)
						continue;
					findP(N, M, matrix, flag, i, j, t++, D);
				}
			}
		System.out.println();
	}
	public static void findP(int N,int M,int[][] matrix,int[][] flag,int i,int j,int t,int D) {
		flag[i][j]=t;
		if(i>0&&Math.abs(matrix[i][j]-matrix[i-1][j])<=D&&flag[i-1][j]==-1) {
			findP(N,M,matrix,flag,i-1,j,t,D);
		}
		if(i>0&&j<M-1&&Math.abs(matrix[i][j]-matrix[i-1][j+1])<=D&&flag[i-1][j+1]==-1) {
			findP(N,M,matrix,flag,i-1,j+1,t,D);
		}
		if(j<M-1&&Math.abs(matrix[i][j]-matrix[i][j+1])<=D&&flag[i][j+1]==-1) {
			findP(N,M,matrix,flag,i,j+1,t,D);
		}
		if(i<N-1&&j<M-1&&Math.abs(matrix[i][j]-matrix[i+1][j+1])<=D&&flag[i+1][j+1]==-1) {
			findP(N,M,matrix,flag,i+1,j+1,t,D);
		}
		if(i<N-1&&Math.abs(matrix[i][j]-matrix[i+1][j])<=D&&flag[i+1][j]==-1) {
			findP(N,M,matrix,flag,i+1,j,t,D);
		}
		if(i<N-1&&j>0&&Math.abs(matrix[i][j]-matrix[i+1][j-1])<=D&&flag[i+1][j-1]==-1) {
			findP(N,M,matrix,flag,i+1,j-1,t,D);
		}
		if(j>0&&Math.abs(matrix[i][j]-matrix[i][j-1])<=D&&flag[i][j-1]==-1) {
			findP(N,M,matrix,flag,i,j-1,t,D);
		}
		if(i>0&&j>0&&Math.abs(matrix[i][j]-matrix[i-1][j-1])<=D&&flag[i-1][j-1]==-1) {
			findP(N,M,matrix,flag,i-1,j-1,t,D);
		}
		
	}
	
	

}
