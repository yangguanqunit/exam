/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPerationExam;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author yangguanqun
 */
public class Dayofweek {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int day=scanner.nextInt();
		String m=scanner.next();
		int year=scanner.nextInt();
		String[] month=new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int feb;
		int count=0;
		loop:
		while(true) {
			feb=28;
			year++;
			if(year%100!=0&&year%4==0||year%400==0) {
				feb=29;
			}
			for(String mon:month) {
				day=toNum(mon);
				if(feb==29&&mon=="February")
					day=29;
				for(int d=1;d<=day;d++) {
					count++;
					if(year==2018&&mon=="March"&&d==5) {
						break loop;
					}
				}
			}
		}
		System.out.println(count);
		
		
		
		

	}
	public static int toNum(String str) {
		switch(str) {
			case "January":
				return 31;
			case "February":
				return 28;
			case "March":
				return 31;
			case "April":
				return 30;
			case "May":
				return 31;
			case "June":
				return 30;
			case "July":
				return 31;
			case "August":
				return 31;
			case "September":
				return 30;
			case "October":
				return 31;
			case "November":
				return 30;
			case "December":
				return 31;
			default:
				return 0;
		}
	}
    
}
