package exam;

import java.util.Scanner;

public class Nsteps {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] ways = new int[n+1];
		ways[1]=1;
		ways[2]=2;
		for(int i=3;i<=n;i++) {
			ways[i]=ways[i-1]+ways[i-2];
		}
		System.out.println(ways[n]);

	}

}
