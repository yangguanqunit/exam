package exam;

import java.util.Scanner;

public class TheShortestPath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		boolean[] mark = new boolean[N];
		int[] cost = new int[N];
		edge[][] list = new edge[N][N];
		int k=0;
		while(M-->0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			edge e = new edge();
			e.cost =(int) Math.pow(2, k);
			e.next = b;
			list[a][b]=e;
			e = new edge();
			e.cost = (int) Math.pow(2, k);
			e.next = a;
			list[b][a]=e;
			k++;
		}
		for(int i=0;i<N;i++) {
			cost[i]=-1;
			mark[i]=false;
		}
		int newP = 0;
		cost[newP]=0;
		mark[newP]=true;
		for(int i=1;i<N;i++) {
			for(int j=1;j<N;j++) {
				if(list[newP][j]==null) continue;
				int c = list[newP][j].cost;
				int t = list[newP][j].next;
				if(mark[t]) continue;
				if(cost[t]==-1||cost[newP]+c<cost[t]) {
					cost[t]=cost[newP]+c;
				}
			}
			int min = Integer.MAX_VALUE;
			for(int j=0;j<N;j++) {
				if(cost[j]==-1) continue;
				if(mark[j]) continue;
				if(min>cost[j]) {
					min = cost[j];
					newP = j;
				}
			}
			mark[newP]=true;
		}
		for(int i=1;i<N;i++)
			System.out.println(cost[i]);
	}
	private static class edge{
		int cost;
		int next;
	}

}
