package exam;

import java.util.Scanner;
import java.util.Stack;

public class Expression {
	static Stack<Double> s_num = new Stack<>();
	static Stack<Character> s_str = new Stack<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine()+"#";
		char[] inch = input.toCharArray();
		char ch;
		double a,b;
		op(inch,0);
		while(!s_str.empty()) {
			b=s_num.pop();
			a=s_num.pop();
			ch=s_str.pop();
			s_num.push(operation(a, b, ch));
		}
		System.out.println(s_num.pop());
	}

	public static int op(char[] inch, int i) {
		String num;
		double a, b;
		char ch;
		int index;
		for (;i < inch.length;i++) {
			num="";
			if (inch[i] == ')') {
				ch=s_str.pop();
				while ( ch!= '(') {
					b=s_num.pop();
					a=s_num.pop();
					s_num.push(operation(a,b,ch));
					ch=s_str.pop();
				}
				return i;
			}
			if (Character.isDigit(inch[i])) {
				while (Character.isDigit(inch[i])) {
					num += inch[i];
					i++;
				}
				s_num.push(Double.parseDouble(num));
				i--;
			}
			if (inch[i] == '(') {
				s_str.push(inch[i]);
				i=op(inch, i + 1);
			}
			if (inch[i] == '*' || inch[i] == '/') {
				index=i;
				if (Character.isDigit(inch[i + 1])) {
					i = i + 1;
					while (Character.isDigit(inch[i])) {
						num += inch[i];
						i++;
					}
					i--;
					b = Double.parseDouble(num);
					a=s_num.pop();
					s_num.push(operation(a, b, inch[index]));
				} else {
					s_str.push(inch[i+1]);
					i = op(inch, i+2);
					b=s_num.pop();
					a=s_num.pop();
					s_num.push(operation(a, b, inch[index]));
				}
				
			}
			if(inch[i]=='+'||inch[i]=='-')
				s_str.push(inch[i]);
		}
		return 0;
		
	}

	public static double operation(double a, double b, char op) {
		double result = Integer.MAX_VALUE;
		switch (op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		}
		return result;
	}

}
