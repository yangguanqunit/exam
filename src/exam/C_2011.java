package exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

public class C_2011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		node[] nodes = new node[n];
		ArrayList<Character> al=  new ArrayList<>();
		scanner.nextLine();
		char[] str = scanner.nextLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			node Node = new node();
			Node.value = str[i];
			nodes[i] = Node;
		}
		while (n-- > 1) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			nodes[a].q.offer(nodes[b]);
			nodes[b].q.offer(nodes[a]);
		}
		
		inOrder(nodes[0], al,'3');
		System.out.println();

	}

	public static void inOrder(node no, ArrayList<Character> al,char parent) {
		if(no.q.contains(parent))
			no.q.remove(parent);
		if (no!=null) {
			node No = no.q.poll();
			inOrder(No, al,no.value);
//			al.add(no.value);
			System.out.println(no.value);
			while (!no.q.isEmpty()) {
				inOrder(no.q.poll(),al,no.value);
			}
		}
	}

	private static class node {
		char value;
		Queue<node> q = new PriorityQueue<>(new Comparator<node>() {
			@Override
			public int compare(node o1, node o2) {
				return o1.value > o2.value ? 1 : -1;

			}
		});
	}

}
