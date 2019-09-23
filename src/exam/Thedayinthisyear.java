package exam;

import java.util.Scanner;

public class Thedayinthisyear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int year = Integer.parseInt(input[0]);
		int month = Integer.parseInt(input[1]);
		int day = Integer.parseInt(input[2]);
		int Feb=28;
		int count = 0;
		int days;
		if(year%100!=0&&year%4==0||year%400==0) {
			Feb=29;
		}
		loop:
		for(int m=1;m<=12;m++) {
			if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
				days=31;
			else if(m==2)
				days=Feb;
			else
				days=30;
			for(int d=1;d<=days;d++) {
				count++;
				if(d==day&&m==month)
					break loop;
			}
		}
		System.out.println(count);
	}

}
