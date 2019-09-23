package exam;

import java.math.BigInteger;
import java.util.Scanner;

public class Bignumber {

	public static void main(String[] args) {
		BigInteger BI = new BigInteger("64");
		System.out.println(BI.gcd(new BigInteger("24")));
		
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		int[] num_1 = new int[1000];
//		int[] num_2 = new int[1000];
//		String input_1=scanner.next();
//		String input_2=scanner.next();
//		cutnum(num_1, input_1);
//		cutnum(num_2, input_2);
//		int times=Math.max(input_1.length(), input_2.length())/4;
//		int remain=0;
//		String result="";
//		for(int i=0;i<times;i++) {
//			int tmp = num_1[i]+num_2[i]+remain;
//			String t = tmp/10000+"";
//		}
//		if(remain!=0){
//			result=remain+result;
//		}
//		System.out.println(result);
//		

	}
	
//	public static void cutnum(int[] num,String input) {
//		int count=0;
//		while(input.length()>4) {
//			num[count++]=Integer.parseInt(input.substring(input.length()-5));
//			input = input.substring(0, input.length()-5);
//		}
//		num[count]=Integer.parseInt(input);
//	}

}
