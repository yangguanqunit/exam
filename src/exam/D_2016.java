package exam;

import java.util.Scanner;

public class D_2016 {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] sp;
		String s=input;
		String t="";
		int n = scanner.nextInt();
		scanner.nextLine();
		while(n-->0) {
			sp=scanner.nextLine().split(" ");
			switch(sp[0]) {
			case "COPY":
				t=s.substring(Integer.parseInt(sp[1]),Integer.parseInt(sp[2])+1);
				break;
			case "CUT":
				s=s.substring(0,Integer.parseInt(sp[1]))+s.substring(Integer.parseInt(sp[2])+1);
				t=s.substring(Integer.parseInt(sp[1]),Integer.parseInt(sp[2])+1);
				break;
			case "PASTE":
				s=s.substring(0,Integer.parseInt(sp[1])+1)+t+s.substring(Integer.parseInt(sp[1])+1);
				break;
			}
			System.out.println(s);
		}
	}

}
