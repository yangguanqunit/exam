package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Freckles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		point[] list = new point[100];
		
		int n=scanner.nextInt();
		int[] tree=new int[100];
		edge[] elist = new edge[n*(n-1)/2];
		for(int i=0;i<n;i++) {
			list[i]=new point();
			list[i].x=scanner.nextDouble();
			list[i].y=scanner.nextDouble();
		}
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				elist[k]=new edge();
				elist[k].a=i;
				elist[k].b=j;
				elist[k].cost=list[i].length(list[j]);
				k++;
			}
		}
		Arrays.sort(elist, new Comparator<edge>() {
			@Override
			public int compare(edge o1, edge o2) {
				if(o1.cost>=o2.cost)
					return 1;
				else
					return -1;
				
			}
		});
		double ans=0;
		for(edge e : elist) {
			if(e==null)
				continue;
			int a,b;
			a=findroot(e.a,tree);
			b=findroot(e.b,tree);
			if(a!=b) {
				tree[a]=b;
				ans+=e.cost;
			}
		}
		System.out.println(String.format("%.2f", ans));
		
		
	}
	public static int findroot(int x,int[] tree) {
		int tmp;
		if(tree[x]==0) {
			return x;
		}
		else {
			tmp=findroot(tree[x],tree);
			tree[x]=tmp;
			return tmp;
		}
			
	}
	
	private static class edge{
		int a;
		int b;
		double cost;
	}
	private static class point{
		double x;
		double y;
		public double length(point a) {
			return Math.sqrt(Math.pow(x-a.x, 2)+Math.pow(y-a.y, 2));
		}
	}

}
