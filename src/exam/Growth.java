package exam;

import java.util.Scanner;

public class Growth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] list = new int[N+1];
		int[] dp = new int[N+1];
		for(int i=1;i<=N;i++)
			list[i]=scanner.nextInt();
		for(int i=1;i<=N;i++) {
			int tmax=1;
			for(int j=1;j<i;j++) {
				if(list[j]>=list[i]) {
					tmax=Math.max(tmax, dp[j]+1);
				}
			}
			dp[i]=tmax;
		}
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=N;i++)
			max=Math.max(dp[i], max);
		System.out.println(max);
			
		
			

	}

}
