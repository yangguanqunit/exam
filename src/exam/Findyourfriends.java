package exam;

import java.util.Scanner;

public class Findyourfriends {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a,b;
		int[] table = new int[100];
		int[] count = new int[100];
		for(int i=0;i<100;i++) {
			count[i]=1;
		}
		while(n-->0) {
			a=scanner.nextInt();
			b=scanner.nextInt();
			a=findroot(a,table);
			b=findroot(b,table);
			if(a!=b) {
				table[a]=b;
				count[b]+=count[a];
			}
		}
//		for(int i=1;i<100;i++) {
//			if(table[i]==0)
//				continue;
//			else
//				count[table[i]]++;
//		}
		System.out.println();
		
		

	}
	public static int findroot(int x,int[] tree) {
		int tmp;
		if(tree[x]==0)
			return x;
		else {
			tmp=findroot(tree[x],tree);
			tree[x]=tmp;
			return tmp;
		}
	}

}
