package exam;

import java.util.Scanner;

public class B_2013 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T-->0) {
			int n = scanner.nextInt();
			System.out.println(Integer.toBinaryString(n));
		}
	}
}
