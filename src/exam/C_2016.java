package exam;

import java.util.Scanner;

public class C_2016 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int m = scanner.nextInt();
		int count=0;
		for(int i=1;i<=N;i++) {
			if(m%i==0)
				if(m/i<=N)
					count++;
		}
		System.out.println(count);
	}

}
