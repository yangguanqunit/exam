package exam;

import java.util.Scanner;

public class BinaryTreeSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		node root=null;
		while(n-->0) {
			root=insert(root,scanner.nextInt());
		}
		preorder(root);
		inorder(root);

	}
	
	public static node insert(node nodes,int value) {
	
		
		if(nodes==null) {
			nodes=new node();
			nodes.value=value;
		}
		
		if(nodes.value>value) {
			nodes.leftchild=insert(nodes.leftchild, value);
		}
		else if(nodes.value<value){
			nodes.rightchild=insert(nodes.rightchild,value);
		}
		return nodes;
	
	}
	
	private static class node{
		int value;
		node leftchild=null;
		node rightchild=null;
	}
	
	public static void preorder(node root) {
		if(root!=null) {
			System.out.print(root.value);
			preorder(root.leftchild);
			preorder(root.rightchild);
		}
	}
	public static void inorder(node root) {
		if(root!=null) {
			inorder(root.leftchild);
			System.out.print(root.value);
			inorder(root.rightchild);
		}
	}

}
