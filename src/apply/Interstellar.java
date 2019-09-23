package apply;

import java.util.Scanner;

public class Interstellar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		for(int i = (int)Math.sqrt(n);;i--) {
			if(Math.pow(i, 2)+i<=n) {
				System.out.println(i);
				break;
			}
		}
	}

}
