package exam;

import java.util.Scanner;

public class ImageCondense {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int[][] matrix_1=new int[n][n];
		int[][] matrix_2=new int[n][n];
		int[][] matrix_3=new int[n][n];
		int[][] result=new int[n][n];
		int tmp_r,tmp_l,min=0;
		int large,move;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix_1[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix_2[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrix_1[i][j]==matrix_2[i][j])
					matrix_3[i][j]=1;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(matrix_3[i][j]==1) {
					min=0;
					move=0;
					tmp_r=i;
					for(tmp_l=j;tmp_l<n;tmp_l++) {
						if(matrix_3[tmp_r][tmp_l]==0)
							break;
						min++;
					}
					loop:
					for(tmp_r=i;tmp_r<i+min&&tmp_r<n;tmp_r++) {
						for(tmp_l=j;tmp_l<j+min;tmp_l++) {
							if(matrix_3[tmp_r][tmp_l]==0)
								break loop;
							if(matrix_3[i+move][j+move]==1&&tmp_r==i+move&&tmp_l==j+move)
								result[i][j]++;
						}
						move++;
					}
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				max=Math.max(max, result[i][j]);
			}
		}
		System.out.println(max);
		
	}

}
