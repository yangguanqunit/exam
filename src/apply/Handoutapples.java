package apply;

import java.util.Scanner;

public class Handoutapples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			list[i]=scanner.nextInt();
			sum+=list[i];
		}
		if(sum%n!=0) {
			System.out.println(-1);
			System.exit(0);
		}
		int avg = sum/n;
		int count=0;
		for(int a : list) {
			if(a-avg>0) {
				if((a-avg)%2==0)
					count+=(a-avg)/2;
				else {
					System.out.println(-1);
					System.exit(0);
				}
					
			}
		}
		System.out.println(count);
		

	}

}
