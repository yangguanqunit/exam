package exam;

import java.util.Scanner;

public class A_2010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int odd=0;
		int num=0;
		while(n-->0) {
			if(scanner.nextInt()%2==0) {
				num++;
			}
			else
				odd++;
		}
		System.out.println(odd>num?"YES":"NO");

	}

}
