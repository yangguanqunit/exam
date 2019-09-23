package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class C_2012 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T-->0) {
			int n=scanner.nextInt();
			node root = null;
			String input="";
			ArrayList<String> result = new ArrayList<>();
			while(n-->0) {
				int v=scanner.nextInt();
				root=insert(root,v);
				input+=v+"";
			}
			inOrder(root, result);
			String r="";
			for(String a:result)
				r+=a;
			if(input.endsWith(r)) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}

	}
	
	public static void inOrder(node root,ArrayList<String> result) {
		
		if(root!=null) {
			inOrder(root.leftchild,result);
			result.add(root.value+"");
			inOrder(root.rightchild,result);
		}
		
		
	}
	
	public static node insert(node root,int value) {
		if(root==null) {
			root=new node();
			root.value=value;
		}
		else if(root.value>value) {
			root.leftchild=insert(root.leftchild,value);
		}
		else if(root.value<value) {
			root.rightchild=insert(root.rightchild,value);
		}
		return root;
	}
	
	private static class node{
		int value;
		node leftchild=null;
		node rightchild=null;
	}

}
