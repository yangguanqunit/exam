package exam;

public class PerfectNum {

	public static void main(String[] args) {
		int[] p = new int[60];
		int[] m = new int[60];
		int a=0;
		int b=0;
		for(int i=2;i<=60;i++) {
			int count=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					count+=j;
				}
			}
			if(count==i) {
				p[a++]=i;
			}
			else if(count>i) {
				m[b++]=i;
			}
		}
		System.out.print("E:");
		for(int x:p) {
			if(x==0)
				break;
			else
				System.out.print(" "+x);
		}
		System.out.println();
		System.out.print("G:");
		for(int x:m) {
			if(x==0)
				break;
			else
				System.out.print(" "+x);
		}

	}

}
