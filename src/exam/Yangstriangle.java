package exam;

import java.util.Scanner;

public class Yangstriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] triangle = new int[n][n];
		triangle[0][0]=1;
		triangle[1][0]=triangle[1][1]=1;
		for(int i=0;i<n;i++) {
			int num;
			num=i+1;
			for(int j=0;j<num;j++) {
				if(i<2) {
					System.out.print(triangle[i][j]+" ");
					continue;
				}
				if(j==0||j==num-1) {
					triangle[i][j]=1;
				}
				else {
					triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
				}
				System.out.print(triangle[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
