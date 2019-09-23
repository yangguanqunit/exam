package exam;

import java.util.Scanner;

public class Individe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int[] beDivided=new int[1000];
		int[] divide = new int[1000];
		int intmp;
		for(int i=n;i>=1;i++) {
			intmp=i;
			for(int j=2;j<Math.sqrt(i)+1;j++) {
				while(intmp%j==0) {
					beDivided[j]++;
					intmp/=j;
				}
				if(intmp==1)
					break;
			}
			if(intmp>1)
				beDivided[intmp]++;
		}
	}

}
