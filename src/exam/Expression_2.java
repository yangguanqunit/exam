package exam;

import java.util.Scanner;
import java.util.Stack;

public class Expression_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Character> symbol = new Stack();
		Stack<Double> num = new Stack();
		char tmp;
		char[] input=scanner.nextLine().toCharArray();
		for(int i=0;i<input.length;i++) {
			tmp=input[i];
			if(tmp==' ') continue;
			if(Character.isDigit(tmp)) {
				num.push(Integer.parseInt(tmp+"")+0.0);
				continue;
			}
			if(tmp=='+'||tmp=='-') {
				symbol.push(tmp);
			}
			if(tmp=='*'||tmp=='/') {
				double a=num.pop();
				i=i+2;
				double b=Integer.parseInt(input[i]+"");
				switch(tmp) {
				case '*':
					num.push(a*b);
					break;
				case '/':
					num.push(a/b);
					break;
				}
			}
		}
		while(!symbol.isEmpty()) {
			double b=num.pop();
			double a=num.pop();
			switch(symbol.pop()) {
			case '+':
				num.push(a+b);
				break;
			case '-':
				num.push(a-b);
				
			}
		}
		System.out.println(num.pop());
		
		

	}

}
