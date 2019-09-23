package exam;

import java.util.Scanner;

public class ThePrimeCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] ans = new int[n+1];
		ans[1]=1;
		boolean[] hash =new boolean[n+1];
		for(int i=1;i<=n;i++)
			hash[i]=false;
		hash[1]=true;
		DFS(ans,1,n,hash);
		
		

	}
	
	public static void DFS(int[] ans,int num,int n,boolean[] hash) {
		if(num>1) {
			if(!judge(ans[num]+ans[num-1])){
				return ;
			}
		}
		if(num==n) {
			check(ans, n);
			return ;
		}
		for(int i=2;i<=n;i++) {
			if(hash[i])
				continue;
			else {
				hash[i]=true;
				ans[num+1]=i;
				DFS(ans,num+1,n,hash);
				hash[i]=false;
			}
		}
	}
	
	public static boolean judge(int num) {
		for(int i=2;i<=Math.sqrt(num)+1;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void check(int[] ans,int n) {
		if(!judge(ans[n]+ans[1]))
			return;
		for(int i=1;i<=n;i++) {
			System.out.print(ans[i]);
		}
		System.out.println();
	}

}
