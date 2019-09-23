package exam;

import java.util.Scanner;

public class A_2013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		node root=null;
		while(n-->0) {
			root=build(root,scanner.nextInt(),root);
		}
	}
	
	public static node build(node root,int value,node parent){
		if(root==null) {
			root=new node();
			root.value=value;
			if(parent==null)
				System.out.println("-1");
			else
				System.out.println(parent.value);
		}
		else if(root.value>value) {
			root.leftchild=build(root.leftchild,value,root);
		}
		else if(root.value<value) {
			root.rightchild=build(root.rightchild,value,root);
		}
		return root;
		
	}
	
	private static class node{
		int value;
		node leftchild;
		node rightchild;
	}

}
