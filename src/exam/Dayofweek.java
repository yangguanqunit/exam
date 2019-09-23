package exam;

import java.util.Scanner;

public class Dayofweek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int day = scanner.nextInt();
			int month = toNum(scanner.next());
			int year = scanner.nextInt();
			int days;
			int count = 0;
			int week;
			boolean isYear;
			loop: while (true) {
				isYear = false;
				if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
					isYear = true;
				}
				for (; month <= 12; month++) {
					if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
							|| month == 12)
						days = 31;
					else if (month == 2)
						days = 28;
					else
						days = 30;
					if (isYear && month == 2)
						days = 29;
					for (; day <= days; day++) {
						count++;
						if (year == 2018 && month == 3 && day == 5)
							break loop;
					}
					day = 1;
				}
				month = 1;

				year++;
			}
			--count;
			week = count % 7;
			switch (week) {
			case 0:
				System.out.println("Monday");
				break;
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Saturday");
				break;
			case 3:
				System.out.println("Friday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Wednesday");
				break;
			case 6:
				System.out.println("Tuesday");
				break;
			}
		}

	}

	public static int toNum(String str) {
		switch (str) {
		case "January":
			return 1;
		case "February":
			return 2;
		case "March":
			return 3;
		case "April":
			return 4;
		case "May":
			return 5;
		case "June":
			return 6;
		case "July":
			return 7;
		case "August":
			return 8;
		case "September":
			return 9;
		case "October":
			return 10;
		case "November":
			return 11;
		case "December":
			return 12;
		default:
			return 0;
		}
	}
}
