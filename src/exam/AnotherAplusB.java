package exam;

import java.util.Scanner;

public class AnotherAplusB {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String ab=a+b+"";
		System.out.println(Long.toString(a+b, 2));
	}

}