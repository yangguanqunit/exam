package exam;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

public class D_2010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int value=0;
		Queue<Integer> s = new PriorityBlockingQueue<>(n+1);
		while(n-->0) {
			s.offer(scanner.nextInt());
		}
		while(s.size()>1) {
			int a=s.poll();
			int b=s.poll();
			value+=a+b;
			s.offer(a+b);
		}
		System.out.println(value);

	}

}
