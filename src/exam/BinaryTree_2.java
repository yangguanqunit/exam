package exam;

import java.util.Scanner;

public class BinaryTree_2 {
	static int index=0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();
		node root = build(input);
		inOrer(root);
		

	}
	
	public static void inOrer(node root) {
		if(root!=null) {
			inOrer(root.leftchild);
			System.out.print(root.value+" ");
			inOrer(root.rightchild);
		}
	}
	public static node build(char[] input) {
		node root=null;
		if(input[index]!='#') {
			root=new node();
			root.value=input[index++];
		}
		else {
			index++;
			return null;
		}
		
		root.leftchild=build(input);
		root.rightchild=build(input);
		return root;
		
		
	}
	private static class node{
		char value;
		node leftchild=null;
		node rightchild=null;
	}

}
