package exam;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Maya {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String input = scanner.next();
		Queue<String> q = new ArrayBlockingQueue<>(1000);
		if(input.length()<4) {
			System.out.println(-1);
			System.exit(0);
		}
		int times=0;
		q.offer(input);
		while(!q.isEmpty()) {
			String str1 = q.poll();
			if(str1.contains("2012"))
				break;
			char[] str = str1.toCharArray();
			for(int i=0;i<str.length-1;i++) {
				char[] temp = tmp(str);
				char a = temp[i];
				temp[i]=temp[i+1];
				temp[i+1]=a;
				q.offer(String.valueOf(temp));
			}
		}
	}
	public static char[] tmp(char[] ch) {
		char[] a = new char[ch.length];
		for(int i=0;i<ch.length;i++) {
			a[i]=ch[i];
		}
		return a;
	}

}
