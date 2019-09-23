package exam;

import java.util.Scanner;

public class D_2017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T-->0) {
			int n = scanner.nextInt();
			int m =scanner.nextInt();
			int[][] matrix = new int[n][m];
			boolean[][] flag = new boolean[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					matrix[i][j]=scanner.nextInt();
					flag[i][j]=false;
				}
			}
			System.out.println(judgeS(matrix, n, m, 0, 0)?"YES":"NO");
		}

	}
	public static boolean judgeS(int[][] matrix,int n,int m,int i,int j) {
		int x=i;
		int y=j;
		int wed=0;
		int hight=0;
		boolean part1=true;
		boolean part2=true;
		while(matrix[x][y++]==1&&y<m)
			wed++;
		x=i+1;
		for(;x<n;x++) {
			int num=0;
			if(matrix[x][j]==0) {
				part1=false;
				break;
			}
			for(y=j+1;y<j+wed;y++) {
				if(matrix[x][y]==1)
					num++;
			}
			if(num==0)
				hight++;
			else if(num==wed-1)
				break;
			else {
				part1=false;
				break;
			}
		}
		if(x<n-1)
			x=x+1;
		else
			part1=false;
		y=j;
		if(!part1)
			return false;
		for(;x<n;x++) {
			int num=0;
			if(matrix[x][j+wed-1]==0) {
				part2=false;
				break;
			}
			for(y=j;y<j+wed-1;y++) {
				if(matrix[x][y]==1)
					num++;
			}
			if(num==0)
				hight++;
			else if(num==wed-1)
				break;
			else {
				part2=false;
				break;
			}
		}
		return part2;
		
		
		
	}

}
