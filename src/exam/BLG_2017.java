package exam;

import java.util.Scanner;

public class BLG_2017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str =scanner.nextLine();
		char[] input = str.toCharArray();	
		int[] w = new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		char[] y = new char[] {'1','0','x','9','8','7','6','5','4','3','2'};
		int x=0;
		for(int i=0;i<=16;i++) {
			x+=Integer.parseInt(input[i]+"")*w[i];
		}
		x=x%11;
		if(y[x]==input[17]) {
			System.out.println(str+" 正确");
		}
		else
			System.out.println("应为:"+str.substring(0,str.length()-1)+y[x]);
		
	}

}
