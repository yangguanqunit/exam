package exam;

import java.util.Scanner;

public class Flo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if(n+m==0)
				break;
			int[][] dis = new int[n+1][n+1];
			while(m-->0) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				dis[a][b]=dis[b][a]=scanner.nextInt();
			}
			for(int k=1;k<=n;k++) {
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(dis[i][k]==0||dis[k][j]==0)
							continue;
						if(dis[i][j]==0||dis[i][j]>dis[i][k]+dis[k][j]) {
							dis[i][j]=dis[i][k]+dis[k][j];
						}
					}
				}
			}
			System.out.println(dis[1][n]);
		}
		

	}

}
