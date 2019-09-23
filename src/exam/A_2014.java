package exam;

import java.util.Scanner;

public class A_2014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int n,max,index;
		int[] list;
		while(T-->0) {
			index=0;
			max=0;
			n=scanner.nextInt();
			list = new int[n+1];
			for(int i=0;i<n;i++) {
				list[scanner.nextInt()]++;
			}
			for(int i=1;i<=n;i++) {
				if(list[i]>max) {
					max=list[i];
					index=i;
				}
			}
			System.out.println(index);
		}
	}

}
