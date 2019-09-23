package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sortbygrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int way = scanner.nextInt();
			info[] list = new info[n];
			for (int i = 0; i < n; i++) {
				list[i] = new info();
				list[i].name = scanner.next();
				list[i].grade = scanner.nextInt();
			}
			switch (way) {
			case 0:
				Dscending(list);
				break;
			case 1:
				Ascending(list);
				break;
			}
			for (info a : list) {
				System.out.println(a.name + " " + a.grade);
			}
		}
	}

	public static void Ascending(info[] list) {
		Arrays.sort(list, new Comparator<info>() {

			@Override
			public int compare(info o1, info o2) {
				if (o1.grade > o2.grade)
					return 1;
				else if (o1.grade == o2.grade)
					return 0;
				else
					return -1;
			}
		});
	}

	public static void Dscending(info[] list) {
		Arrays.sort(list, new Comparator<info>() {

			@Override
			public int compare(info o1, info o2) {
				if (o1.grade < o2.grade)
					return 1;
				else if (o1.grade == o2.grade)
					return 0;
				else
					return -1;
			}
		});
	}

	private static class info {
		String name;
		int grade;
	}

}
