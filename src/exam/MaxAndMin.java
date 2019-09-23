package exam;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int tmp;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			tmp=scanner.nextInt();
			if(max<tmp) {
				max=tmp;
			}
			if(min>tmp) {
				min=tmp;
			}
		}
		System.out.println(max+" "+min);
	}
}
