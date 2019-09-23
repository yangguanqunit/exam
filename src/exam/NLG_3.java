package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NLG_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] tree = new int[n];
		for(int i=0;i<n;i++)
			tree[i]=-1;
		edge[] path = new edge[m];
		for(int i=0;i<m;i++) {
			edge e = new edge();
			e.a=scanner.nextInt();
			e.b=scanner.nextInt();
			e.cost=scanner.nextInt();
			path[i]=e;
		}
		Arrays.sort(path,new Comparator<edge>() {

			@Override
			public int compare(edge o1, edge o2) {
				return o1.cost>o2.cost?1:-1;
			}
		});
		int sum=0;
		for(int i=0;i<m;i++) {
			int a = findroot(path[i].a,tree);
			int b = findroot(path[i].b,tree);
			int c = path[i].cost;
			if(a!=b) {
				sum+=c;
				tree[a]=b;
			}
		}
		int flag=0;
		for(int i=0;i<n;i++) {
			if(tree[i]==0)
				flag++;
		}
		System.out.println(flag>1?-1:sum);
	}
	private static class edge{
		int a,b;
		int cost;
	}
	
	public static int findroot(int x ,int[] tree) {
		if(tree[x]==-1)
			return x;
		else {
			int tmp = findroot(tree[x],tree);
			tree[x]=tmp;
			return tmp;
		}
	}

}
