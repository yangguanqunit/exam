package exam;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Huffman {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new PriorityQueue<>();
		int n = scanner.nextInt();
		int a,b;
		int count=0;
		while(n-->0) {
			queue.offer(scanner.nextInt());
		}
		while(queue.size()>1) {
			a=queue.poll();
			b=queue.poll();
			count+=a+b;
			queue.offer(a+b);
		}
		System.out.println(count);
	}

}
