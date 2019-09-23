package exam;

import java.util.Scanner;

public class B_2010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		location[] list = new location[n];
		for(int i=0;i<n;i++) {
			list[i]=new location();
			list[i].x=scanner.nextInt();
			list[i].y=scanner.nextInt();
		}
		int minx=Integer.MAX_VALUE;
		int miny=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<n;i++) {
			if(minx>list[i].x) {
				index=i;
				minx=list[i].x;
				miny=list[i].y;
			}
			else if(minx==list[i].x) {
				if(miny>list[i].y) {
					index=i;
					minx=list[i].x;
					miny=list[i].y;
				}
			}
		}
		System.out.println(minx+" "+miny);

	}
	private static class location{
		int x;
		int y;
	}

}
