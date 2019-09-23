package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_2017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] input = new int[n+1];
		for(int i=1;i<=n;i++)
			input[i]=scanner.nextInt();
		scanner.nextLine();
		while(m-->0) {
			String[] cmd=scanner.nextLine().split(" ");
			int l;
			int r;
			int len;
			switch(cmd[0]) {
			case "1":
				l=Integer.parseInt(cmd[1]);
				r=Integer.parseInt(cmd[2]);
				reverse(input, l, r);
				break;
			case "2":
				l=Integer.parseInt(cmd[1]);
				r=Integer.parseInt(cmd[2]);
				len=Integer.parseInt(cmd[3]);
				change(input, l, r, len);
				break;
			case "3":
				l=Integer.parseInt(cmd[1]);
				r=Integer.parseInt(cmd[2]);
				len=Integer.parseInt(cmd[3]);
				replace(input, l, r, len);
				break;
			case "4":
				l=Integer.parseInt(cmd[1]);
				r=Integer.parseInt(cmd[2]);
				postive(input, l, r);
				break;
			case "5":
				l=Integer.parseInt(cmd[1]);
				r=Integer.parseInt(cmd[2]);
				sum(input, l, r);
			}
		}

	}
	public static void reverse(int[] input,int l,int r) {
		int tmp;
		while(l<=r) {
			tmp=input[l];
			input[l]=input[r];
			input[r]=tmp;
			l++;
			r--;
		}
	}
	public static void change(int[] input,int l,int r,int len) {
		int tmp;
		while(len-->0) {
			tmp=input[l];
			input[l]=input[r];
			input[r]=tmp;
			l++;
			r++;
		}
	}
	public static void replace(int[] input,int l,int r,int x) {
		for(;l<=r;l++) {
			input[l]=x;
		}
	}
	public static void postive(int[] input,int l,int r) {
		int[] tmp = new int[r-l+1];
		int index=0;
		for(int i=l;i<=r;i++) {
			tmp[index++]=input[i];
		}
		Arrays.sort(tmp);
		for(int i : tmp) {
			input[l++]=i;
		}
	}
	public static void sum(int[] input,int l,int r) {
		int sum=0;
		for(;l<=r;l++)
			sum+=input[l];
		System.out.println(sum);
	}

}
