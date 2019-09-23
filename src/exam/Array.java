package exam;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a0=scanner.nextInt();
		int a1=scanner.nextInt();
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a=new int[k+1];
		a[0]=a0;
		a[1]=a1;
		for(int i=2;i<=k;i++)
			a[i]=(p*a[i-1]+q*a[i-2])%10000;
		System.out.println(a[k]);
	}

}
