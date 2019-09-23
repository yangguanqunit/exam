package exam;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++)
			num[i]=scanner.nextInt();
		int find = scanner.nextInt();
		boolean isFind=false;
		int count =1;
		int low = 0;
		int high = n-1;
		int middle ;
		while(low<=high) {
			middle = (low+high)/2;
			if(num[middle]==find) {
				isFind=true;
				break;
			}
			if(num[middle]>find) {
				high=middle-1;
			}
			if(num[middle]<find) {
				low = middle+1;
			}
			count++;
		}
		System.out.println(isFind?count:"查找失败");
	}

}
