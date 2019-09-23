package exam;

import java.util.Scanner;

public class NLG_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();
		char tmp;
		int count=0;
		while(true) {
			boolean unfinish=false;
			for(int i=0;i<input.length-1;i++) {
				if(input[i]=='M'&&input[i+1]=='F') {
					tmp=input[i];
					input[i]=input[i+1];
					input[i+1]=tmp;
					i++;
					unfinish=true;
				}
			}
			if(!unfinish)
				break;
			count++;
		}
		System.out.println(count);
		

	}

}
