package exam;

import java.util.Scanner;

public class Integersplit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[1000000];
		num[1]=1;
		num[2]=2;
		for(int i=3;i<=n;i++) {
			
			if(i%2==1){
				num[i]=num[i-1]%1000000000;
			}
			else {
				num[i]=(num[i/2]+num[i-1])%1000000000;
			}
		}
		System.out.println(num[n]);
	}

}
