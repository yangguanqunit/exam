package exam;

import java.util.Scanner;

public class TheLargestArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] str1 = scanner.nextLine().toCharArray();
		char[] str2 = scanner.nextLine().toCharArray();
		int[][] maxarray = new int[str1.length+1][str2.length+1];
		for(int i=1;i<=str1.length;i++) {
			for(int j=1;j<=str2.length;j++) {
				if(str1[i-1]==str2[j-1]) {
					maxarray[i][j]=maxarray[i-1][j-1]+1;
				}
				else {
					maxarray[i][j]=Math.max(maxarray[i][j-1], maxarray[i-1][j]);
				}
			}
		}
		System.out.println(maxarray[str1.length][str2.length]);

	}

}
