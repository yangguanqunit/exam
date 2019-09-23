package exam;

import java.util.Scanner;

public class StuHasThesamegrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] hash;
		int n,m;
		while(scanner.hasNext()) {
			 hash = new int[101];
			n=scanner.nextInt();
			if(n==0)
				break;
			for(int i=0;i<n;i++) {
				hash[scanner.nextInt()]++;
			}
			m=scanner.nextInt();
			System.out.println(hash[m]);
		}

	}

}
