package exam;

import java.util.Scanner;

public class B_2014n {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] mem = new int[N+1];
		boolean exist;
		int min;
		for(int i=1;i<=N;i++) {
			mem[i]=scanner.nextInt();
		}
		int M = scanner.nextInt();
		int[] reqList=new int[M];
		for(int i=0;i<M;i++)
			reqList[i]=scanner.nextInt();
		for(int i=0;i<M;i++) {
			int reqest=reqList[i];
			int index=0;
			exist=false;
			min=Integer.MAX_VALUE;
			for(int j=1;j<=N;j++) {
				if(reqest<=mem[j]&&mem[j]<min) {
					exist=true;
					min=mem[j];
					index=j;
				}
			}
			if(exist) {
				System.out.print(min+" ");
				mem[index]=-1;
			}
			else
				System.out.print("NULL ");
		}

	}

}
