package exam;

import java.util.Scanner;

public class Dijstra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		edge[][] list=null;
		int a, b;
		int n, m;
		int[] dis;
		boolean[] mark;
		edge e;
		while (scanner.hasNext()) {
			n = scanner.nextInt();
			dis = new int[n+1];
			mark = new boolean[n+1];
			m = scanner.nextInt();
			while (m-- > 0) {
				e = new edge();
				list = new edge[n+1][n+1];
				a = scanner.nextInt();
				b = scanner.nextInt();
				e.cost = scanner.nextInt();
				e.nextnode = b;
				list[a][b] = e;
				e = new edge();
				e.cost = list[a][b].cost;
				e.nextnode = a;
				list[b][a] = e;
			}
			for(int i=1;i<=n;i++) {
				dis[i]=-1;
				mark[i]=false;
			}
			dis[1]=0;
			mark[1]=true;
			int newP=1;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<list[newP].length;j++) {
					if(list[newP][j]==null)
						continue;
					int next = list[newP][j].nextnode;
					int c = list[newP][j].cost;
					if(next==-1) continue;
					if(dis[next]==-1||dis[next]>dis[newP]+c)
						dis[next]=dis[newP]+c;
				}
				int min=Integer.MAX_VALUE;
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
			System.out.println(dis[n]);
		}

	}

	private static class edge {
		int nextnode;
		int cost;
	}

}
