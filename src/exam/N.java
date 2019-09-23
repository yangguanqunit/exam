package exam;

import java.util.Scanner;

public class N {

	public static void main(String[] args) {
		long n = new Scanner(System.in).nextLong();
		long result=1;
		for(;n>=2;n--) {
			result*=n;
		}
		System.out.println(result);
	}

}
