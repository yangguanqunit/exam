package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cmds = new ArrayList();
		ArrayList<Integer> numList = new ArrayList();
		int index;
		int m = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<m;i++)
			cmds.add(scanner.nextLine());
		for(String str : cmds) {
			if(str.length()>=7&&str.substring(0, 6).endsWith("append")) {
				numList.add(Integer.parseInt(str.substring(7)));
			}
			else if(str.endsWith("pop")) {
				numList.remove(numList.size()-1);
			}
			else {
				index=Integer.parseInt(str.substring(5));
				if(index>0)
					System.out.println(numList.get(index-1));
				else if(index<0)
					System.out.println(numList.get(numList.size()+index));
			}
		}
		
		

	}

}
