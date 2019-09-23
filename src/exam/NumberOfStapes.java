package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStapes {
	static ArrayList<Integer> l = new ArrayList<>();
	static int min = Integer.MAX_VALUE;
	static boolean find=false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		int num = scanner.nextInt();
		int[] list = new int[num];
		
		for(int i=0;i<num;i++)
			list[i]=scanner.nextInt();
		number(list, 0, 0, sum,list.length-1);
		System.out.println(find?min+1:0);
		
		

	}
	public static void number(int[] list,int count,int num,int sum,int index) {
		for(int i=index;i>=0;i--) {
			if(count+list[i]>sum)
				continue;
			if(count+list[i]==sum){
				find=true;
				min=Math.min(min, l.size());
				return;
			}
			if(list[i]<sum&&i>=0) {
				l.add(list[i]);
				number(list, list[i]+count, ++num, sum,i-1);
				num--;
				l.remove(l.size()-1);
			}
		}
		
		
	}

}
