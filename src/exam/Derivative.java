package exam;

import java.util.Scanner;

public class Derivative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int d=scanner.nextInt();
		int x0=scanner.nextInt();
		int result = (int) (3*a*Math.pow(x0, 2)+2*b*x0+c);
		System.out.println(result);
	}

}
