package exam;

import java.util.Scanner;

public class A_2014n {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int[] input;
		while(T-->0) {
			int n = scanner.nextInt();
			input=new int[n];
			for(int i=0;i<n;i++) {
				input[i]=scanner.nextInt();
			}
			if(n%2!=0) {
				System.out.println(input[n/2]);
			}
			else {
				System.out.println((input[n/2-1]+input[n/2])/2.0);
			}
		}

	}

}
