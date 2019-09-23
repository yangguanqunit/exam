package exam;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Scanner;

public class D_2012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		while(T-->0) {
			ArrayList<String> str = new  ArrayList<>();
			String s = scanner.nextLine();
			for(char a : s.toCharArray())
				str.add(a+"");
			int n = scanner.nextInt();
			scanner.nextLine();
			while(n-->0) {
				String cmd = scanner.nextLine();
				if(cmd.contains("INSERT")) {
					str.add(cmd.split(" ")[1]);
				}
				else {
					boolean isfind=false;
					int index = Integer.parseInt(cmd.split(" ")[1]);
					int tmp_1=index;
					int tmp_2=index;
					String targer = str.get(index);
					while(++tmp_1<str.size()) {
						if(targer.endsWith(str.get(tmp_1))) {
							isfind=true;
							break;
						}
					}
					while(--tmp_2>=0) {
						if(targer.endsWith(str.get(tmp_2))) {
							isfind=true;
							break;
						}
					}
					tmp_2=tmp_2<0?Integer.MAX_VALUE:tmp_2;
					tmp_1=tmp_1>=str.size()?Integer.MAX_VALUE:tmp_1;
					System.out.println(isfind?Math.min(tmp_1-index, Math.abs(tmp_2-index)):-1);
				}
			}
			
		}

	}

}
