package exam;

import java.util.Scanner;

public class Dij {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		edge[][] list = new edge[n+1][n+1];
		int[] dis = new int[n+1];
		boolean[] mark = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			dis[i]=-1;
			mark[i]=false;
		}
		while(m-->0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			edge e = new edge();
			e.next=b;
			e.cost=c;
			list[a][b]=e;
			e=new edge();
			e.next=a;
			e.cost=c;
			list[b][a]=e;
		}
		mark[1]=true;
		dis[1]=0;
		int newP=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(list[newP][j]==null) continue;
				int next = list[newP][j].next;
				int c = list[newP][j].cost;
				if(mark[next]) continue;
				if(dis[next]==-1||dis[newP]+c<dis[next]) {
					dis[next]=dis[newP]+c;
				}
			}
			int min = Integer.MAX_VALUE;
			for(int j=1;j<=n;j++) {
				if(mark[j]) continue;
				if(dis[j]==-1) continue;
				if(dis[j]<min) {
					min=dis[j];
					newP=j;
				}
			}
			
			mark[newP]=true;
		}
		System.out.println(dis[3]);
		
		
		
	}
	private static class edge{
		int next;
		int cost;
	}

}
