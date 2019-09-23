package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D_2014 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int n;
		String input,name,subStr;
		int value,id;
		Map<String,ArrayList<Integer>> map = new HashMap();
		ArrayList<Integer> list=null;
		while(T-->0) {
			n=scanner.nextInt();
			scanner.nextLine();
			while(n-->0) {
				input = scanner.nextLine();
				if(input.contains("=")) {
					name=input.split("=")[0];
					if(map.containsKey(name)) {
						list=map.get(name);
						list.clear();
					}
					else {
						list=new ArrayList<>();
						map.put(name, list);
					}
				}
				else if(input.contains("append")) {
					subStr=input.split("append")[1];
					value=Integer.parseInt(subStr.substring(1, subStr.length()-1));
					list.add(value);
				}
				else if(input.contains("sort")) {
					Collections.sort(list, new Comparator<Integer>() {

						@Override
						public int compare(Integer o1, Integer o2) {
							return o1.compareTo(o2);
						}
					});
				}
				else {
					subStr=input.split("\\[")[1];
					id=Integer.parseInt(subStr.substring(0,subStr.length()-1));
					if(list.size()<=id) {
						System.out.println("ERROR");
					}
					else
						System.out.println(list.get(id));
				}
				
			}
		}
		
		

	}

}
