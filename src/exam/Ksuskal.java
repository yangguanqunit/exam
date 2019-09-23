package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ksuskal {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] tree = new int[n+1];
		edge[] list = new edge[m];
		for(int i=0;i<m;i++) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int cost = scanner.nextInt();
			edge e = new edge();
			e.a=a;
			e.b=b;
			e.cost=cost;
			list[i]=e;
		}
		Arrays.sort(list, new Comparator<edge>() {
			@Override
			public int compare(edge o1, edge o2) {
				if(o1==null)
					return 2;
				return o1.cost>o2.cost?1:-1;
			}
		});
		int sum=0;
		for(int i=0;i<m;i++) {
			int a = findroot(list[i].a,tree);
			int b = findroot(list[i].b,tree);
			int c = list[i].cost;
			if(a!=b) {
				tree[a]=b;
				sum+=c;
			}
		}
		System.out.println(sum);
		
		

	}
	public static int findroot(int x,int[] tree) {
		if(tree[x]==0)
			return x;
		else {
			int tmp = findroot(tree[x],tree);
			tree[x]=tmp;
			return tmp;
		}
	}
	private static class edge{
		int a;
		int b;
		int cost;
	}

}
