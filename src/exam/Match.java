package exam;

import java.util.Scanner;
import java.util.Stack;


public class Match {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> s = new Stack<>(); 
		char[] list = scanner.nextLine().toCharArray();
		int[] judge = new int[list.length];
		for(int i=0;i<list.length;i++) {
			if(list[i]=='(') {
				s.push(i);
			}
			else if(list[i]==')') {
				if(s.isEmpty())
					judge[i]=2;
				else
					s.pop();
			}
		}
		while(!s.empty())
			judge[s.pop()]=1;
		
		for(int i : judge) {
			if(i==1)
				System.out.print('?');
			else if(i==2)
				System.out.print('$');
			else
				System.out.print(' ');
		}

	}

}
