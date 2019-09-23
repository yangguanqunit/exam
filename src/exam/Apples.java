package exam;

import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] dp = new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			dp[i][0]=0;
		}
		for(int j=1;j<=m;j++)
			dp[0][j]=1;
		dp[0][0]=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j>i)
					dp[i][j]=dp[i][i];
				else {
					dp[i][j]=dp[i][j-1]+dp[i-j][j];
				}
			}
		}
		System.out.println(dp[n][m]);
	}

}
