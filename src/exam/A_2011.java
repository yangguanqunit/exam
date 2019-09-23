package exam;

import java.util.Scanner;

public class A_2011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int t = scanner.nextInt();
		while(t-->0) {
			int cmd = scanner.nextInt();
			int i = scanner.nextInt();
			int len = scanner.nextInt();
			switch(cmd) {
			case 0 :
				System.out.println(input=reverse(input, i, len));
				break;
			case 1:
				String subStr = scanner.next();
				System.out.println(input=replace(input, i, len, subStr));
				break;
			}
			
		}
	
	}
	public static String reverse(String input , int i, int len) {
		String head = input.substring(0, i);
		String mid = input.substring(i,i+len);
		String tail = input.substring(i+len);
		return head+new StringBuilder(mid).reverse()+tail;
	}
	public static String replace(String input , int i,int len ,String subStr) {
		String head = input.substring(0, i);
		String tail = input.substring(i+len);
		return head+subStr+tail;
	}

}
