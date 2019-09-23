package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class NLG_5 {
	static ArrayList<Integer> hight = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] tree = new int[N+1];
		for(int i=1;i<=N;i++) {
			tree[i]=-1;
		}
		for(int i=0;i<N-1;i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			tree[b]=a;
		}
		for(int i=1;i<=N;i++) {
			findroot(i,tree,1);
		}
		int max = Integer.MIN_VALUE;
		for(int i : hight)
			max=Math.max(max, i);
		System.out.println(max);
	}
	
	public static int findroot(int x,int[] tree,int h) {
		if(tree[x]==-1) {
			hight.add(h);
			return x;
		}
		else 
			return findroot(tree[x],tree,++h);
	}

}
