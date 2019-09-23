package exam;

import java.util.Scanner;

public class A_2017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T  = scanner.nextInt();
		int n;
		while(T-->0) {
			n=scanner.nextInt();
			int count = 0;
			for(int i=1;i<=Math.sqrt(n)+1;i++) {
				int tmp = i*i*i;
				if(tmp<=n) {
					if(Math.sqrt(tmp)%1.0==0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

}
