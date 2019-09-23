package exam;

import java.util.Scanner;

public class C_2014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int N,M;
		int max,index;
		int length;
		int a,b;
		while(T-->0) {
			max=Integer.MAX_VALUE;
			N=scanner.nextInt();
			index=0;
			int[][] nodes=new int[51][51];
			for(int i=1;i<=50;i++) {
				for(int j=1;j<=50;j++) {
					nodes[i][j]=-1;
				}
			}
			M=scanner.nextInt();
			while(M-->0) {
				a=scanner.nextInt();
				b=scanner.nextInt();
				nodes[a][b]=1;
				nodes[b][a]=1;
			}
			for(int k=1;k<=50;k++) {
				for(int i=1;i<=50;i++) {
					for(int j=1;j<=50;j++) {
						if(nodes[i][k]==-1||nodes[k][j]==-1)
							continue;
						if(nodes[i][j]==-1||nodes[i][k]+nodes[k][j]<nodes[i][j]) {
							nodes[i][j]=nodes[i][k]+nodes[k][j];
						}
					}
				}
			}
			for(int i=1;i<=50;i++) {
				length=0;
				for(int j=1;j<=50;j++) {
					if(nodes[i][j]==-1)
						length+=N;
					else
						length+=nodes[i][j];
				}
				if(length<max) {
					index=i;
					max=length;
				}
			}
			System.out.println(index);
			
		}
	}
}
