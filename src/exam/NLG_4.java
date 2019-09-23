package exam;

import java.util.Scanner;

public class NLG_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n+1];
		int[] dp = new int[n+1];
		for(int i=1;i<=n;i++)
			list[i]=scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			int tmax=1;
			for(int j=1;j<i;j++) {
				if(list[j]<list[i]) {
					tmax=Math.max(tmax, dp[j]+1);
				}
			}
			dp[i]=tmax;
		}
		int max = Integer.MIN_VALUE;
		for(int i=1;i<n;i++) {
			max=Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
