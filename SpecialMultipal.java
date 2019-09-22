package exam;

import java.util.Scanner;

public class SpecialMultipal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] str1=scanner.next().toCharArray();
		char[] str2=scanner.next().toCharArray();
		int sum=0;
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				sum+=Integer.parseInt(str1[i]+"")*Integer.parseInt(str2[j]+"");
			}
		}
		System.out.println(sum);
	}

}
