package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class B_2012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int a,b;
		while(T-->0) {
			int N = scanner.nextInt();
			int m=N;
			int count=0;
			int[] degree = new int[N];
			int[][] table = new int[N][N];
			while(m-->1) {
				a=scanner.nextInt();
				b=scanner.nextInt();
				degree[a]++;
				degree[b]++;
				table[a][b]=1;
				table[b][a]=1;
				
			}
			for(int i=0;i<N;i++) {
				boolean isP=true;
				for(int j=0;j<N;j++) {
					if(table[i][j]!=1) 
						continue;
					if(degree[j]>degree[i]) {
						isP=false;
						break;
					}
				}
				if(isP)
					count++;
			}
			
			System.out.println(count);
		}

	}
	

}
