package exam;

import java.util.Scanner;
import java.util.Stack;

public class SpecialStr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();
		Stack<Character> s = new Stack<>();
		boolean firstO=true;
		for(char ch : input) {
			if(Character.isAlphabetic(ch))
				continue;
			if(Character.digit(ch, 10)==0&&firstO) continue;
			if(Character.isDigit(ch)&&Character.digit(ch, 10)!=0) {
				s.push(ch);
				firstO=false;
				continue;
			}
			s.push(ch);
		}
		firstO=true;
		String tmp="";
		while(!s.isEmpty()) {
			char ch = s.pop();
			if(Character.digit(ch, 10)==0&&firstO) continue;
			if(Character.isDigit(ch))
				firstO=false;
			tmp=ch+tmp;
			if(ch=='+'||ch=='-') {
				System.out.println(tmp);
				tmp="";
			}
		}
	}

}
