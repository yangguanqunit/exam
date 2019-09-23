package exam;

import java.util.Scanner;

public class PackageProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int M = scanner.nextInt();
		herb[] list = new herb[M+1];
		int[][] dp = new int[101][1001];
		for(int i=1;i<=M;i++) {
			list[i]=new herb();
			list[i].w=scanner.nextInt();
			list[i].v=scanner.nextInt();
		}
		for(int i=1;i<=M;i++) {
			for(int j=T;j>=list[i].w;j--) {
				dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-list[i].w]+list[i].v);
			}
			for(int j=0;j<list[i].w;j++) {
				dp[i][j]=dp[i-1][j];
			}
		}
		System.out.println(dp[M][T]);
	}
	private static class herb{
		int w;
		int v;
	}

}
