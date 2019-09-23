package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ManageSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		student[] list = new student[n];
		for(int i=0;i<n;i++) {
			String[] input = scanner.nextLine().split(" ");
			student stu = new student();
			stu.name=input[0];
			stu.grade_1=Integer.parseInt(input[1]);
			stu.grade_2=Integer.parseInt(input[2]);
			stu.grade_3=Integer.parseInt(input[3]);
			stu.setSum();
			stu.setAvg();
			list[i]=stu;
		}
		for(int i=0;i<n;i++) {
			if(list[i].unFinished()) {
				System.out.println(list[i].name+" "+list[i].grade_1+" "+list[i].grade_2+" "+list[i].grade_3);
			}
		}
		Arrays.sort(list, new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				return o1.average>o2.average?-1:1;
			}
		});
		System.out.println();
		for(int i=0;i<n;i++) {
				System.out.println(list[i].name+" "+list[i].grade_1+" "+list[i].grade_2+" "+list[i].grade_3);
		}
	}
	
	private static class student{
		String name;
		int grade_1;
		int grade_2;
		int grade_3;
		int sum;
		int average;
		public void setSum() {
			this.sum = grade_1+grade_2+grade_3;
		}
		public void setAvg() {
			this.average = this.sum/3;
		}
		public boolean unFinished() {
			if(grade_1<60||grade_2<60||grade_3<60)
				return true;
			return false;
		}
	}

}
