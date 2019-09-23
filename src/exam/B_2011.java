package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class B_2011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		ArrayList<complex> list = new ArrayList<>();
		while(T-->0) {
			list.clear();
			int n = scanner.nextInt();
			scanner.nextLine();
			while(n-->0) {
				String cmd = scanner.nextLine();
				if(cmd.contains("Insert")) {
					String data=cmd.split(" ")[1];
					String re = data.split("i")[0];
					complex cp = new complex();
					cp.real = Integer.parseInt(re.substring(0, re.length()-1));
					cp.symbol=re.substring(re.length()-1);
					cp.virtual=Integer.parseInt(data.split("i")[1]);
					cp.cal();
					list.add(cp);
					System.out.println(list.size());
				}
				if(cmd.contains("Pop")) {
					if(list.isEmpty()) {
						System.out.println("EMPTY!");
					}
					else {
						Collections.sort(list, new Comparator<complex>() {

							@Override
							public int compare(complex o1, complex o2) {
								return o1.d>o2.d?1:-1;
							}
						});
						complex tmp = list.remove(list.size()-1);
						System.out.println(tmp.real+"+i"+tmp.virtual);
						System.out.println(list.isEmpty()?"EMPTY!":list.size());
					}
				}
			}
			
		}

	}
	private static class complex{
		int 	real;
		String symbol;
		int virtual;
		double d;
		public void cal() {
			this.d = Math.sqrt(real*real+virtual*virtual);
		}
	}

}
