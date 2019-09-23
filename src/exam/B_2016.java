package exam;

import java.util.Scanner;

public class B_2016 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		String[] tmp;
		String result="";
		int n=scanner.nextInt();
		scanner.nextLine();
		while(n-->0) {
			result="";
			input=scanner.nextLine();
			if(input.contains("11111")) {
				tmp=input.split("11111");
				result+=tmp[0];
				for(int i=1;i<tmp.length;i++) {
					result+="11111"+tmp[i].substring(1);
				}
			}
			System.out.println(result);
		}
		

	}

}
