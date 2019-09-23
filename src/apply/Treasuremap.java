package apply;

import java.util.Scanner;

public class Treasuremap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] str1 = scanner.nextLine().toCharArray();
		char[] str2 = scanner.nextLine().toCharArray();
		int s1=0;
		int s2=0;
		boolean isSubstr=false;
		while(true) {
			if(str1[s1]==str2[s2]) {
				s1++;
				s2++;
			}
			else {
				s1++;
			}
			if(s2==str2.length) {
				isSubstr=true;
				break;
			}
			if(s1==str1.length)
				break;
		}
		System.out.println(isSubstr?"YES":"NO");
	}

}
