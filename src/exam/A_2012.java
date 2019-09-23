package exam;

import java.util.Scanner;

public class A_2012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		scanner.nextLine();
		boolean isYear;
		int mon;
		while(T-->0) {
			String[] input = scanner.nextLine().split("\\:");
			int days=0;
			isYear=false;
			int year = Integer.parseInt(input[0]);
			int month = Integer.parseInt(input[1]);
			int day = Integer.parseInt(input[2]);
			if(year%100!=0&&year%4==0||year%400==0)
				isYear=true;
			loop:
			for(int m=1;m<=12;m++) {
				if(m==1||m==3||m==5||m==8||m==7||m==10||m==12) {
					mon=31;
				}
				else if(m==2) {
					mon=isYear?29:28;
				}
				else
					mon=30;
				for(int d=1;d<=mon;d++) {
					days++;
					if(m==month&&d==day)
						break loop;
				}
			}
			System.out.println(days);
		}

	}

}
