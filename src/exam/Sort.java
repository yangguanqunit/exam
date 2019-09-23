package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		for(int i=0;i<n;i++)
			list[i]=scanner.nextInt();
		Arrays.sort(list);
		for(int i:list)
			System.out.print(i+" ");
	}

}
