package exam;

import java.util.Scanner;

public class Maxarraysum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		for(int i=0;i<n;i++)
			list[i]=scanner.nextInt();
		int count = 0;
		int max=list[0];
		for(int i=0;i<n;i++) {
			count+=list[i];
			if(count>max)
				max=count;
			if(count<0)
				count=0;
		}
		System.out.println(max);
	}

}
