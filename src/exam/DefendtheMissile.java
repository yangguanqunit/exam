package exam;

import java.util.Scanner;

public class DefendtheMissile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n+1];
		int[] result = new int[n+1];
		for(int i=1;i<=n;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=1;i<=n;i++) {
			int tmax=1;
			for(int j=1;j<i;j++) {
				if(array[i]<=array[j])
					tmax=Math.max(tmax, result[j]+1);
			}
			result[i]=tmax;
		}
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			max=Math.max(max, result[i]);
		}
		System.out.println(max);
		

	}

}
