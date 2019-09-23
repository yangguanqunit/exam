package exam;

import java.util.Scanner;

public class A_2016 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			int m = scanner.nextInt();
			int[] list = new int[m];
			int count = 0;
			for (int i = 0; i < m; i++)
				list[i] = scanner.nextInt();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					for (int k = 0; k < m; k++) {
						if (list[i] + list[j] == list[k])
							count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
